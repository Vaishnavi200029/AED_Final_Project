/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjModel;

import javax.mail.Transport;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import java.util.Properties;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
/**
 *
 * @author Abhishek
 */
public class Email {
    
    public static void sendMail(String text, String recipient) {

        final String username = "hotelmanagementaed@gmail.com";
        final String password = "gsbdywzgjsgvlpuy";

        Properties prop = new Properties();
		prop.put("mail.smtp.host", "smtp.gmail.com");
                prop.put("mail.smtp.ssl.trust", "*");
                prop.put("mail.smtp.ssl.protocols", "TLSv1.2");
        prop.put("mail.smtp.port", "587");
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.starttls.enable", "true"); //TLS
        prop.put("mail.user",username);
        prop.put("mail.password",password);
        
        Session session;
        session = Session.getInstance(prop,
                new javax.mail.Authenticator() {
                    @Override
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
                    }
                });
            System.out.println(recipient);
        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("hotelmanagementaed@gmail.com"));
            message.setRecipients(
                    Message.RecipientType.TO,
                    InternetAddress.parse(recipient,false)
            
            );
            message.setSubject("Hotel Statement");
            message.setText(text);

            Transport.send(message);

            System.out.println("Done");

        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotelmanagementsystem;
import java.awt.*;
import static java.awt.Color.black;
import static java.awt.Color.white;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

/**
 *
 * @author vaishnavi <your.name at your.org>
 */
public class Login extends JFrame   implements ActionListener{
    
    JTextField username , password;
    JButton login, cancel;
    
    JLabel l1,l2;
    JTextField t1;
    JPasswordField t2;
    JButton b1,b2;

    Login(){
        super("Login");
        
        
        getContentPane().setBackground(Color.white);
        
        setLayout(null);
        
        JLabel user = new JLabel("Username");
        user.setBounds(40, 20, 100, 30);
        add(user);
        
        JLabel pass = new JLabel("Password");
        pass.setBounds(40, 70, 100, 30);
        add(pass);
        
        JTextField username = new JTextField();
        username.setBounds (150, 20, 150, 30);
        add(username);
        
        JTextField password = new JTextField();
        password.setBounds (150, 70, 150, 30);
        add(password);
        
        JButton login = new JButton("Login");
        login.setBounds(40, 150, 120,30);
        login.setBackground(Color.black);
        login.setForeground(white);
        login.addActionListener(this);
        add(login);
        
        JButton cancel = new JButton("Cancel");
        cancel.setBounds(180 , 150, 120,30);
        cancel.setBackground(Color.black);
        cancel.setForeground(white);
        cancel.addActionListener(this);
        add(cancel);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/second.jpg"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel (i3);
        image.setBounds(350,10, 200, 200);
        add(image);
        
        
        setBounds(500,200,600,300);
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == login){
            String user = username.getText();
            String pass = password.getText();
            
            try{
                Conn c = new Conn();
                String Query = "Select * from login where username ='" + user + "' add password= '"+ pass+ "'";
                String query = null;
                
                ResultSet rs = c.s.executeQuery(query);
                
                if (rs.next()){
                    setVisible(false);
                    new Dashboard();
                    
                }else {
                    JOptionPane.showMessageDialog(null, "Invalid username or password");
                    setVisible(false);
                }
                
                
                
                
            }catch (Exception e){
                e.printStackTrace();
            }
            
            
        
        }else if (ae.getSource() == cancel){
            setVisible(false);
            
        }
        
        
    }
    public static void main(String[] args){
        new Login();
        
    }
    }

//        super("Login");
//
//        setLayout(null);
//
//        l1 = new JLabel("Username");
//        l1.setBounds(40,20,100,30);
//        add(l1);
//        
//        l2 = new JLabel("Password");
//        l2.setBounds(40,70,100,30);
//        add(l2);
// 
//        t1=new JTextField();
//        t1.setBounds(150,20,150,30);
//        add(t1);
//
//        t2=new JPasswordField();
//        t2.setBounds(150,70,150,30);
//        add(t2);
//        
//        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/second.jpg"));
//        Image i2 = i1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
//        ImageIcon i3 =  new ImageIcon(i2);
//        JLabel l3 = new JLabel(i3);
//        l3.setBounds(350,10,150,150);
//        add(l3);
//
//
//        b1 = new JButton("Login");
//        b1.setBounds(40,140,120,30);
//        b1.setFont(new Font("serif",Font.BOLD,15));
//        b1.addActionListener(this);
//        b1.setBackground(Color.BLACK);
//        b1.setForeground(Color.WHITE);
//        add(b1);
//
//        b2=new JButton("Cancel");
//        b2.setBounds(180,140,120,30);
//        b2.setFont(new Font("serif",Font.BOLD,15));
//        b2.setBackground(Color.BLACK);
//        b2.setForeground(Color.WHITE);
//        add(b2);
//
//        b2.addActionListener(this);
//        
//        
//        getContentPane().setBackground(Color.WHITE);
//
//        setVisible(true);
//        setSize(600,300);
//        setLocation(600,350);
//
//    }
//
//    public void actionPerformed(ActionEvent ae){
//        if(ae.getSource()==b1){
//        try{
//            conn c1 = new conn();
//            String u = t1.getText();
//            String v = t2.getText();
//            
//            String q = "select * from login where username='"+u+"' and password='"+v+"'";
//            
//            ResultSet rs = c1.s.executeQuery(q); 
//            if(rs.next()){ 
//                new Dashboard().setVisible(true);
//                setVisible(false);
//            }else{
//                JOptionPane.showMessageDialog(null, "Invalid login");
//                setVisible(false);
//            }
//        }catch(Exception e){
//            e.printStackTrace();
//        }
//        }else if(ae.getSource()==b2){
//            System.exit(0);
//        }
//    }
//    public static void main(String[] arg){
//        new Login();
//    }
//
//    private static class conn {
//
//        public conn() {
//        }
//    }
//}
//    
//    


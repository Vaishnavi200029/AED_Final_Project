/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hotelmanagementsystem;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author vaishnavi <your.name at your.org>
 */
public class HotelManagementSystem extends JFrame implements ActionListener {
    HotelManagementSystem(){
        setSize(1366,565);
        setLocation(100,100);
        setBounds(100, 100, 1366, 565);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/first.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 1366, 565);
        add(image);
        
        JLabel text = new JLabel("HAPPY HOSPITALITY");
        text.setBounds(20, 430, 1000, 90);
        text.setForeground(Color.white);
        text.setFont(new Font("serif", Font.PLAIN, 50 ));
        image.add(text);
        
        JButton  next = new JButton("Next");
        next.setBounds(1150, 450, 150,50 );
        next.setBackground(Color.white);
        next.setForeground(Color.magenta);
        next.addActionListener(this);
        next.setFont(new Font("serif", Font.PLAIN, 24 ));
        image.add(next);
        setVisible(true);
        
        
        while(true) {
            text.setVisible(false);
            try{
                Thread.sleep(100);
                
            } catch (Exception e){
                e.printStackTrace();
            }  
            text.setVisible(true);
        }
    }
    
    public void actionPerformed (ActionEvent ae){
        setVisible(false);
        new Login();
    }    
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new HotelManagementSystem();
    }

    
}

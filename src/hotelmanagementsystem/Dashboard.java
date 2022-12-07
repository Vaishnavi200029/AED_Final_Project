/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotelmanagementsystem;

import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;


/**
 *
 * @author vaishnavi <your.name at your.org>
 */
public class Dashboard extends JFrame{
    
    public static void main(String[] args){
        new Dashboard().setVisible(true);
    }
    
    Dashboard(){
        super("HAPPY HOSPITALITY");
        
        
        setBounds(0, 0, 1500, 1000);
    
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/third.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1500, 1000, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel (i3);
        image.setBounds(0,0, 1500, 1000);
        add(image);
        
        JLabel text = new JLabel("HAPPY HOSPITALITY WELCOMES YOU");
        text.setBounds(400 , 80, 1000, 50);
        text.setFont(new Font("serif", Font.PLAIN, 45 ));
        text.setForeground(Color.white);
        image.add(text);
        
        JMenuBar mb = new JMenuBar();
        mb.setBounds(0, 0, 1550, 30);
        add(mb);
        
        JMenu hotel = new JMenu("HAPPY HOSPITALITY");
        hotel.setForeground(Color.red);
        mb.add(hotel);    
        
        JMenuItem reception = new JMenuItem("RECEPTION");
        hotel.add(reception);
        
        
        JMenu admin = new JMenu("ADMIN");
        admin.setForeground(Color.blue);
        mb.add(hotel); 
        
        JMenuItem addemployee = new JMenuItem("ADD EMPLOYEE");
        admin.add(addemployee);
        JMenuItem addrooms = new JMenuItem("ADD ROOMS");
        admin.add(addrooms);
        JMenuItem adddrivers = new JMenuItem("ADD DRIVERS");
        admin.add(adddrivers);


        setVisible(true);
    
    }
}
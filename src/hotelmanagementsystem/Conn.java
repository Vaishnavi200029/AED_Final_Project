/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotelmanagementsystem;
import java.sql.*;

/**
 *
 * @author vaishnavi <your.name at your.org>
 */
public class Conn {
    
    
    Connection c;
    Statement s;
    Conn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/happyhospitality", "root", "Madhubala$200029");
            s= c.createStatement();
        
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
        
    
}

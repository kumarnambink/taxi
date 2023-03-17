/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author ELCOT
 */
public class ConnectionProvider {
     public static Connection getCon(){
        try{
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection Con= DriverManager.getConnection("jdbc:mysql://localhost:3306/raju_taxi_srevice?useSSL=false ","root","kumarnambi5665"); //?useSSL=false
                      return Con;
    }
        catch(Exception e){
                     return null;
        
        
        
        }
    }
    
}
    


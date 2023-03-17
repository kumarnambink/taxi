/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;
import java.sql.*;

import javax.swing.JOptionPane;

/**
 *
 * @author ELCOT
 */
public class tables {
    public static void main(String []args){
       
            Connection Con =null;
            Statement st =null;
            try{
                 Con= ConnectionProvider.getCon();
                 st=Con.createStatement();
                 st.executeUpdate("CREATE TABLE  Cars ( name VARCHAR(200),id int(100)  primary key, Email  VARCHAR(100),mobileNumber VARCHAR(15),password  VARCHAR(100))  ");
                 JOptionPane.showMessageDialog(null,"table Create Successfully");
                 
            //if (!msg.equals(""))
            //JOptionPane.showMessageDialog(null, msg);
        }
        catch ( Exception e) {
         
        JOptionPane.showMessageDialog(null,  e ,"Message",JOptionPane.ERROR_MESSAGE);
    }
            
            finally {
                try{
                    Con.close();
                    st.close();
                    }
                catch (Exception e){
                    
                }
                
            }
    }
    
}
  

    


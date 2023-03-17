/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;
import java .sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author ELCOT
 */
public class select { 
    public static ResultSet getData(String query){
          Connection Con=null;
          ResultSet rs=null;
          Statement st=null;
      
          try
          {
                    Con=ConnectionProvider.getCon();
                    st=Con. createStatement();
                    rs=st.executeQuery(query);
          return rs;
          }
         catch ( Exception e) 
         {
         
                    JOptionPane.showMessageDialog(null,  e ,"Message",JOptionPane.ERROR_MESSAGE);
        return null;
         }
    
    
    }
}  
    
    


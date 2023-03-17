package project;

//this code is for showing the list of cars in a table

//import java.proteanit.sql.DbUtils;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class showcars extends javax.swing.JFrame {

    /**
     * Creates new form show_cars
     */
    //public Taxi_Taxi() {
       // initComponents();
        //DisplayTable();
    //}

    private void DisplayTable(){
        try{
           Class.forName("com.mysql.jdbc.Driver");
           Connection Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/raju_taxi_srevice","root","kumarnambi5665");
           String loginTable="SELECT * FROM taxi" ;
           PreparedStatement statement=Con.prepareStatement(loginTable);
           ResultSet rs=statement.executeQuery();
           JOptionPane.showMessageDialog(null, "table create successfully");
           //Taxi.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void initComponents() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

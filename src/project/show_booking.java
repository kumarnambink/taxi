package project;

//this code is for to show the booking list in table

//
//import net.proteanit.sql.DbUtils;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class show_booking extends javax.swing.JFrame {

    /**
     * Creates new form show_booking
     */
    public show_booking() {
        initComponents();
        DisplayTable();
    }

 private void DisplayTable(){
        try{
           Class.forName("com.mysql.jdbc.Driver");
           Connection Con= DriverManager.getConnection("jdbc:mysql://localhost:3306/raju_taxi_srevice","root","kumarname5665");
           String loginTable="SELECT * FROM Booking" ;
           PreparedStatement Statement=Con.prepareStatement(loginTable);
           ResultSet rs=Statement.executeQuery();
          // BookingTable.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void initComponents() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }}

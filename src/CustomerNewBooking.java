/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package rapid_rentals;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;


import javax.swing.JTextField;

/**
 *
 * @author DELL
 */
public class CustomerNewBooking extends javax.swing.JFrame {

    /**
     * Creates new form CustomerNewBooking
     */
    public CustomerNewBooking() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        s = new javax.swing.JLabel();
        BookingName_lbl = new javax.swing.JLabel();
        Tx_Bookingname = new javax.swing.JTextField();
        StartDate_lbl = new javax.swing.JLabel();
        Tx_Startdate = new javax.swing.JTextField();
        EndDate_lbl = new javax.swing.JLabel();
        Tx_Enddate = new javax.swing.JTextField();
        CarName_lbl = new javax.swing.JLabel();
        Tx_Carname = new javax.swing.JTextField();
        kmTravelled_lbl = new javax.swing.JLabel();
        Tx_KM_Travelled = new javax.swing.JTextField();
        EstimatedBill_lbl = new javax.swing.JLabel();
        Tx_Amount = new javax.swing.JTextField();
        ShowBill_bttn = new javax.swing.JToggleButton();
        But_Done = new javax.swing.JToggleButton();
        GoBack_bttn = new javax.swing.JToggleButton();
        LogOut_bttn = new javax.swing.JToggleButton();
        Rate_lbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Rapid Rentals");
        setPreferredSize(new java.awt.Dimension(428, 350));
        getContentPane().setLayout(null);

        BookingName_lbl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BookingName_lbl.setText("BOOKING NAME");
        getContentPane().add(BookingName_lbl);
        BookingName_lbl.setBounds(71, 0, 105, 28);

        Tx_Bookingname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tx_BookingnameActionPerformed(evt);
            }
        });
        getContentPane().add(Tx_Bookingname);
        Tx_Bookingname.setBounds(207, 0, 108, 28);

        StartDate_lbl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        StartDate_lbl.setText("START DATE");
        getContentPane().add(StartDate_lbl);
        StartDate_lbl.setBounds(71, 39, 105, 27);
        getContentPane().add(Tx_Startdate);
        Tx_Startdate.setBounds(207, 39, 108, 27);

        EndDate_lbl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        EndDate_lbl.setText("END DATE");
        getContentPane().add(EndDate_lbl);
        EndDate_lbl.setBounds(71, 72, 105, 29);
        getContentPane().add(Tx_Enddate);
        Tx_Enddate.setBounds(207, 72, 108, 29);

        CarName_lbl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        CarName_lbl.setText("CAR NAME");
        getContentPane().add(CarName_lbl);
        CarName_lbl.setBounds(71, 112, 105, 28);

        Tx_Carname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tx_CarnameActionPerformed(evt);
            }
        });
        getContentPane().add(Tx_Carname);
        Tx_Carname.setBounds(207, 112, 108, 28);

        kmTravelled_lbl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        kmTravelled_lbl.setText("km  TRAVELLED ");
        getContentPane().add(kmTravelled_lbl);
        kmTravelled_lbl.setBounds(71, 146, 105, 23);

        Tx_KM_Travelled.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tx_KM_TravelledActionPerformed(evt);
            }
        });
        getContentPane().add(Tx_KM_Travelled);
        Tx_KM_Travelled.setBounds(207, 146, 108, 28);

        EstimatedBill_lbl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        EstimatedBill_lbl.setText("ESTIMATED BILL");
        getContentPane().add(EstimatedBill_lbl);
        EstimatedBill_lbl.setBounds(18, 209, 105, 28);

        Tx_Amount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tx_AmountActionPerformed(evt);
            }
        });
        getContentPane().add(Tx_Amount);
        Tx_Amount.setBounds(141, 209, 105, 24);

        ShowBill_bttn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ShowBill_bttn.setText("SHOW BILL");
        ShowBill_bttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowBill_bttnActionPerformed(evt);
            }
        });
        getContentPane().add(ShowBill_bttn);
        ShowBill_bttn.setBounds(276, 209, 110, 30);

        But_Done.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        But_Done.setText("DONE");
        But_Done.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                But_DoneActionPerformed(evt);
            }
        });
        getContentPane().add(But_Done);
        But_Done.setBounds(141, 255, 105, 21);

        GoBack_bttn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        GoBack_bttn.setText("GO BACK");
        GoBack_bttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GoBack_bttnActionPerformed(evt);
            }
        });
        getContentPane().add(GoBack_bttn);
        GoBack_bttn.setBounds(0, 270, 105, 21);

        LogOut_bttn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        LogOut_bttn.setText("LOG OUT");
        LogOut_bttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOut_bttnActionPerformed(evt);
            }
        });
        getContentPane().add(LogOut_bttn);
        LogOut_bttn.setBounds(290, 270, 105, 21);

        Rate_lbl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Rate_lbl.setText("          Rate -15 Rupees per km");
        getContentPane().add(Rate_lbl);
        Rate_lbl.setBounds(88, 185, 312, 13);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Tx_CarnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tx_CarnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Tx_CarnameActionPerformed

    private void Tx_KM_TravelledActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tx_KM_TravelledActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Tx_KM_TravelledActionPerformed

    private void GoBack_bttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GoBack_bttnActionPerformed
        // TODO add your handling code here:
        Home obj=new Home();
        this.setVisible(false);
        obj.setVisible(true);
    }//GEN-LAST:event_GoBack_bttnActionPerformed

    private void LogOut_bttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOut_bttnActionPerformed
        // TODO add your handling code here:
          login o=new login();
        this.setVisible(false);
        o.setVisible(true);
    }//GEN-LAST:event_LogOut_bttnActionPerformed

    private void ShowBill_bttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowBill_bttnActionPerformed
        // TODO add your handling code here:
        double a=Double.parseDouble(Tx_KM_Travelled.getText());
        double nt=15*a;
        Tx_Amount.setText(""+nt);
        
        
    }//GEN-LAST:event_ShowBill_bttnActionPerformed

    @SuppressWarnings("UseSpecificCatch")
    private void But_DoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_But_DoneActionPerformed
        String url = "jdbc:mysql://localhost:3306/raju_taxi_srevice";
        String user = "root";
        String password = "kumarnambi5665";
 
        String Bookingname=Tx_Bookingname.getText();
        String StartDate=Tx_Startdate.getText();
        String Enddate=Tx_Enddate.getText();
        String Carname=Tx_Carname.getText();
        String KM_Travelled=Tx_KM_Travelled.getText();
       double Bill_amount=Double.parseDouble(KM_Travelled);
        double nt=15*Bill_amount;
        
        
                 
        try {
            Connection Con = DriverManager.getConnection(url, user, password);
            String query="insert into booking(Bookingname,StartDate,Enddate,Carname,KM_Travelled,Bill_amount)" + "values (?,?,?,?,?,?)";
            
            PreparedStatement statement = Con.prepareStatement(query);
 
              statement.setString(1,Bookingname );
              statement.setString(2,StartDate );
              statement.setString(3, Enddate);
              statement.setString(4, Carname);
              statement.setString(5, KM_Travelled);
              statement.setDouble(6, nt);
              
              
 
            int row = statement.executeUpdate();
            if (row > 0) {
                JOptionPane.showMessageDialog(null,"Booking Done");
            }
            Con.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }       
    }//GEN-LAST:event_But_DoneActionPerformed

    private void Tx_BookingnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tx_BookingnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Tx_BookingnameActionPerformed

    private void Tx_AmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tx_AmountActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_Tx_AmountActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CustomerNewBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerNewBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerNewBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerNewBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerNewBooking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BookingName_lbl;
    private javax.swing.JToggleButton But_Done;
    private javax.swing.JLabel CarName_lbl;
    private javax.swing.JLabel EndDate_lbl;
    private javax.swing.JLabel EstimatedBill_lbl;
    private javax.swing.JToggleButton GoBack_bttn;
    private javax.swing.JToggleButton LogOut_bttn;
    private javax.swing.JLabel Rate_lbl;
    private javax.swing.JToggleButton ShowBill_bttn;
    private javax.swing.JLabel StartDate_lbl;
    private javax.swing.JTextField Tx_Amount;
    private javax.swing.JTextField Tx_Bookingname;
    private javax.swing.JTextField Tx_Carname;
    private javax.swing.JTextField Tx_Enddate;
    private javax.swing.JTextField Tx_KM_Travelled;
    private javax.swing.JTextField Tx_Startdate;
    private javax.swing.JLabel kmTravelled_lbl;
    private javax.swing.JLabel s;
    // End of variables declaration//GEN-END:variables


}
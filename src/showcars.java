/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package rapid.rentals;
//import net.proteanit.sql.DbUtils;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
public class showcars extends javax.swing.JFrame {

    /**
     * Creates new form show_cars
     */
      DefaultTableModel model;
    public showcars() {
        initComponents();
        DisplayTable();
    }

    private void DisplayTable(){
       try{
           Class.forName("com.mysql.jdbc.Driver");
           Connection Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/raju_taxi_srevice","root","kumarnambi5665");
               String query="SELECT * FROM raju_taxi_srevice. taxi" ;
           PreparedStatement Statement=Con.prepareStatement(query);
           ResultSet rs=Statement.executeQuery();
         // DefaultTablemodel model=(DefaultTablemodel) tbldata.
                 // booking.setModel(DbUtils.resultSetToTableModel(rs));
                 while(rs.next()){
                                   String carname=rs.getString("carname");
                                   String carnumber=rs.getString("carnumber");
                                   String brand=rs.getString("brand");
                                   String engine=rs.getString("engine");
                                   String fuel=rs.getString("fuel");
                                   String models=rs.getString("models");
                                   /* String cn=Tx_carname.getText();
        String cap=Tx_capacity.getText();
        String br=Tx_brand.getText();
        String eng=Tx_engine.getText();
        String fue=Tx_fuel.getText();
        String mod=Tx_model.getText();
 
*/
                                    Object[]Obj={carname ,carnumber,brand,engine, fuel ,models };
                                    model=(DefaultTableModel)TBL_shawcar.getModel();
                                    model.addRow(Obj);
                 }
                 
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TBL_shawcar = new javax.swing.JTable();
        logout = new javax.swing.JToggleButton();
        goback = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Rapid Rentals");

        TBL_shawcar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CARNAME", "CARNUMBER", "BRAND", "ENGINE", "FUEL", "MODELS"
            }
        ));
        jScrollPane1.setViewportView(TBL_shawcar);

        logout.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        logout.setText("LOGOUT");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        goback.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        goback.setText("GO BACK");
        goback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gobackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(goback)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logout)))
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logout)
                    .addComponent(goback))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gobackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gobackActionPerformed
        Home obj=new Home();
        this.setVisible(false);
       obj.setVisible(true);
    }//GEN-LAST:event_gobackActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        login obj=new login ();
        this.setVisible(false);
       obj.setVisible(true);
    }//GEN-LAST:event_logoutActionPerformed

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
            java.util.logging.Logger.getLogger(showcars.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(showcars.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(showcars.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(showcars.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new showcars().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TBL_shawcar;
    private javax.swing.JToggleButton goback;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton logout;
    // End of variables declaration//GEN-END:variables
}

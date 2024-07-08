/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hostelfood;

import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author ASUS
 */
public class daily_report extends javax.swing.JFrame {

    /**
     * Creates new form daily_report
     */
    Connection conn=null;
    Statement stmt=null;
    ResultSet rs=null;
    
    public daily_report() {
        initComponents();
        conn=databaseConnection.connection();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        bbtn = new javax.swing.JButton();
        lbtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        stable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        totalpricebox = new javax.swing.JTextField();
        dbtn = new javax.swing.JButton();
        jXDatePicker1 = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Date:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jButton2.setBackground(new java.awt.Color(102, 0, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancel1.png"))); // NOI18N
        jButton2.setText("Exit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 650, 150, 50));

        bbtn.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        bbtn.setText("Breakfast");
        bbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbtnActionPerformed(evt);
            }
        });
        jPanel1.add(bbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 140, 40));

        lbtn.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        lbtn.setText("Lunch");
        lbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbtnActionPerformed(evt);
            }
        });
        jPanel1.add(lbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 140, 40));

        stable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(stable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 890, 470));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Total:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 660, -1, -1));

        totalpricebox.setEditable(false);
        totalpricebox.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jPanel1.add(totalpricebox, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 660, 220, 40));

        dbtn.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        dbtn.setText("Dinner");
        dbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dbtnActionPerformed(evt);
            }
        });
        jPanel1.add(dbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, 140, 40));
        jPanel1.add(jXDatePicker1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 190, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 740));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbtnActionPerformed
        // TODO add your handling code here:
        bbtn.setBackground(Color.yellow);
        lbtn.setBackground(Color.white);
        dbtn.setBackground(Color.white);
        
        Date oDate = jXDatePicker1.getDate();        
        DateFormat oDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String select_date = oDateFormat.format(oDate);
        float total_price=0;
        float one_price=0;
        
        try {
            stmt=conn.createStatement();
            String sql="SELECT * FROM student_food WHERE time='Breakfast' AND date='"+select_date+"' ";
            ResultSet res1 =stmt.executeQuery(sql);
            stable.setModel(DbUtils.resultSetToTableModel(res1));
            ResultSet res2 =stmt.executeQuery(sql);
            
            while(res2.next()){
                one_price=Float.parseFloat(res2.getString("price"));
                total_price += one_price;
               
            }
            
            totalpricebox.setText(Float.toString(total_price));
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            
        }
        
        
    }//GEN-LAST:event_bbtnActionPerformed

    private void lbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbtnActionPerformed
        // TODO add your handling code here:
        lbtn.setBackground(Color.yellow);
        bbtn.setBackground(Color.white);
        dbtn.setBackground(Color.white);
        
        Date oDate = jXDatePicker1.getDate();        
        DateFormat oDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String select_date = oDateFormat.format(oDate);
        float total_price=0;
        float one_price=0;
        
        try {
            stmt=conn.createStatement();
            String sql="SELECT * FROM student_food WHERE time='Lunch' AND date='"+select_date+"' ";
            ResultSet res1 =stmt.executeQuery(sql);
            stable.setModel(DbUtils.resultSetToTableModel(res1));
            ResultSet res2 =stmt.executeQuery(sql);
            
            while(res2.next()){
                one_price=Float.parseFloat(res2.getString("price"));
                total_price += one_price;

            }
            
            totalpricebox.setText(Float.toString(total_price));
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            
        }
    }//GEN-LAST:event_lbtnActionPerformed

    private void dbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dbtnActionPerformed
        // TODO add your handling code here:
        dbtn.setBackground(Color.yellow);
        lbtn.setBackground(Color.white);
        bbtn.setBackground(Color.white);
        
        Date oDate = jXDatePicker1.getDate();        
        DateFormat oDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String select_date = oDateFormat.format(oDate);
        float total_price=0;
        float one_price=0;
        
        try {
            stmt=conn.createStatement();
            String sql="SELECT * FROM student_food WHERE time='Dinner' AND date='"+select_date+"' ";
            ResultSet res1 =stmt.executeQuery(sql);
            stable.setModel(DbUtils.resultSetToTableModel(res1));
            ResultSet res2 =stmt.executeQuery(sql);
            
            while(res2.next()){
                one_price=Float.parseFloat(res2.getString("price"));
                total_price += one_price;
               
            }
            
            totalpricebox.setText(Float.toString(total_price));
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            
        }
    }//GEN-LAST:event_dbtnActionPerformed

    private void jXDatePicker1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jXDatePicker1ActionPerformed
        // TODO add your handling code here:
        dbtn.setBackground(Color.white);
        lbtn.setBackground(Color.white);
        bbtn.setBackground(Color.white);
        totalpricebox.setText("");
        DefaultTableModel dm = (DefaultTableModel)stable.getModel();
        dm.getDataVector().removeAllElements();
    }//GEN-LAST:event_jXDatePicker1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        admin a=new admin();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(daily_report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(daily_report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(daily_report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(daily_report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new daily_report().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bbtn;
    private javax.swing.JButton dbtn;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jXDatePicker1;
    private javax.swing.JButton lbtn;
    private javax.swing.JTable stable;
    private javax.swing.JTextField totalpricebox;
    // End of variables declaration//GEN-END:variables
}
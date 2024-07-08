/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hostelfood;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class add_foods extends javax.swing.JFrame {

    Connection conn=null;
    Statement stmt=null;
    ResultSet rs=null;
    
    public add_foods() {
        initComponents();
        
        conn=databaseConnection.connection();
        displayTable();
    }
    public void displayTable(){
        try {
            stmt=conn.createStatement();
            String sqlone="SELECT food_id,time,type,variation,size,price FROM foods WHERE time='Breakfast' ";
            ResultSet resone =stmt.executeQuery(sqlone);
            breakfastT.setModel(DbUtils.resultSetToTableModel(resone));
            
            String sqltwo="SELECT food_id,time,type,variation,size,price FROM foods WHERE time='Lunch' ";
            ResultSet restwo =stmt.executeQuery(sqltwo);
            lunchT.setModel(DbUtils.resultSetToTableModel(restwo));
            
            String sqlthree="SELECT food_id,time,type,variation,size,price FROM foods WHERE time='Dinner' ";
            ResultSet resthree =stmt.executeQuery(sqlthree);
            dinnerT.setModel(DbUtils.resultSetToTableModel(resthree));
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
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
        jLabel2 = new javax.swing.JLabel();
        timebox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        typebox = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        variationbox = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        sizebox = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        pricebox = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        idbox = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        clearbtn = new javax.swing.JButton();
        submitbtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        dinnerT = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        breakfastT = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        lunchT = new javax.swing.JTable();
        exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 204));
        jLabel1.setText("Add Foods");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, -1, 43));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Time:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        timebox.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        timebox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Breakfast", "Lunch", "Dinner" }));
        timebox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeboxActionPerformed(evt);
            }
        });
        jPanel1.add(timebox, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, -1, 36));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Type:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        typebox.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPanel1.add(typebox, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 230, 36));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Variation:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        variationbox.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPanel1.add(variationbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 230, 36));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Size:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, -1));

        sizebox.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        sizebox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Half", "Full" }));
        sizebox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sizeboxActionPerformed(evt);
            }
        });
        jPanel1.add(sizebox, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 272, -1, 36));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Price:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, -1));

        pricebox.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPanel1.add(pricebox, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 337, 230, 36));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Food Id:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, -1, -1));

        idbox.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPanel1.add(idbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 393, 230, 37));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Food ID Rules:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 149, -1));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(51, 51, 51));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(102, 0, 204));
        jTextArea1.setRows(5);
        jTextArea1.setText("Eg:-BRSF\n\nB-Time\nR-Type\nS-Variation\nF-size");
        jTextArea1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 460, 100, 120));

        clearbtn.setBackground(new java.awt.Color(102, 102, 0));
        clearbtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        clearbtn.setForeground(new java.awt.Color(255, 255, 255));
        clearbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/loading (2).png"))); // NOI18N
        clearbtn.setText("Clear");
        clearbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearbtnActionPerformed(evt);
            }
        });
        jPanel1.add(clearbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 620, 120, 40));

        submitbtn.setBackground(new java.awt.Color(0, 102, 51));
        submitbtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        submitbtn.setForeground(new java.awt.Color(255, 255, 255));
        submitbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sign-check-icon.png"))); // NOI18N
        submitbtn.setText("Submit");
        submitbtn.setMargin(new java.awt.Insets(2, 2, 2, 2));
        submitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitbtnActionPerformed(evt);
            }
        });
        jPanel1.add(submitbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 620, 120, 40));

        dinnerT.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(dinnerT);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 460, 520, 200));

        breakfastT.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(breakfastT);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, 520, 200));

        lunchT.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(lunchT);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 240, 520, 200));

        exit.setBackground(new java.awt.Color(102, 51, 0));
        exit.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        exit.setForeground(new java.awt.Color(255, 255, 255));
        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancel1.png"))); // NOI18N
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jPanel1.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 620, 120, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void timeboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_timeboxActionPerformed

    private void sizeboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sizeboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sizeboxActionPerformed

    private void submitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitbtnActionPerformed
        try {
            String time=(String) timebox.getSelectedItem();
            String type=typebox.getText();
            String variation=variationbox.getText();
            String size=(String) sizebox.getSelectedItem();
            String price=pricebox.getText();
            String id=idbox.getText();
            String empty="";
            
            if(type.equals(empty)){
                JOptionPane.showMessageDialog(null, "Please Enter the type of your Food");
            }else if(variation.equals(empty)){
                JOptionPane.showMessageDialog(null, "Please Enter the Variation of your Food");
            }else if(price.equals(empty)){
                JOptionPane.showMessageDialog(null, "Please Enter the Price of your Food");
            }else if(id.equals(empty)){
                JOptionPane.showMessageDialog(null, "Please Enter the ID of your Food");
            }else{
                stmt=conn.createStatement();
            
                String sql="INSERT INTO foods VALUES('"+id+"','"+time+"','"+type+"','"+variation+"','"+size+"','"+price+"',1);";

                stmt.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Data is successfully Inserted");

                timebox.setSelectedIndex(0);
                typebox.setText("");
                variationbox.setText("");
                sizebox.setSelectedIndex(0);
                pricebox.setText("");
                idbox.setText("");

                displayTable();
            }
            
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_submitbtnActionPerformed

     
    
    private void clearbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearbtnActionPerformed
        timebox.setSelectedIndex(0);
        typebox.setText("");
        variationbox.setText("");
        sizebox.setSelectedIndex(0);
        pricebox.setText("");
        idbox.setText("");
    }//GEN-LAST:event_clearbtnActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        admin a=new admin();
        a.setVisible(true);
        this.dispose();
       
    }//GEN-LAST:event_exitActionPerformed

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
            java.util.logging.Logger.getLogger(add_foods.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(add_foods.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(add_foods.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(add_foods.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new add_foods().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable breakfastT;
    private javax.swing.JButton clearbtn;
    private javax.swing.JTable dinnerT;
    private javax.swing.JButton exit;
    private javax.swing.JTextField idbox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTable lunchT;
    private javax.swing.JTextField pricebox;
    private javax.swing.JComboBox<String> sizebox;
    private javax.swing.JButton submitbtn;
    private javax.swing.JComboBox<String> timebox;
    private javax.swing.JTextField typebox;
    private javax.swing.JTextField variationbox;
    // End of variables declaration//GEN-END:variables
}

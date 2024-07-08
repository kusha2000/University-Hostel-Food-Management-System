/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hostelfood;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class edit_foods extends javax.swing.JFrame {

    /**
     * Creates new form edit_foods
     */
    Connection conn=null;
    Statement stmt=null;
    ResultSet rs=null;
    
    public edit_foods() {
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
        searchidbox = new javax.swing.JTextField();
        clearbtn = new javax.swing.JButton();
        edittbtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        dinnerT = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        breakfastT = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        lunchT = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        SearchT = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        idbox = new javax.swing.JTextField();
        exit = new javax.swing.JButton();
        spricebtn = new javax.swing.JButton();
        sidbtn = new javax.swing.JButton();
        stimebtn = new javax.swing.JButton();
        stypebyn = new javax.swing.JButton();
        svarbtn = new javax.swing.JButton();
        ssizebtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 255));
        jLabel1.setText("Edit Foods");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Time:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, -1));

        timebox.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        timebox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Breakfast", "Lunch", "Dinner" }));
        timebox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeboxActionPerformed(evt);
            }
        });
        jPanel1.add(timebox, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Type:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, -1, -1));

        typebox.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPanel1.add(typebox, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, 230, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Variation:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, -1, -1));

        variationbox.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPanel1.add(variationbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 430, 230, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Size:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 490, -1, -1));

        sizebox.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        sizebox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Half", "Full" }));
        sizebox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sizeboxActionPerformed(evt);
            }
        });
        jPanel1.add(sizebox, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 490, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Price:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 550, -1, -1));

        pricebox.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPanel1.add(pricebox, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 550, 230, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Food Id:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        searchidbox.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPanel1.add(searchidbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 230, 40));

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
        jPanel1.add(clearbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 620, 120, 50));

        edittbtn.setBackground(new java.awt.Color(0, 102, 51));
        edittbtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        edittbtn.setForeground(new java.awt.Color(255, 255, 255));
        edittbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sign-check-icon.png"))); // NOI18N
        edittbtn.setText("Edit");
        edittbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edittbtnActionPerformed(evt);
            }
        });
        jPanel1.add(edittbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 620, 130, 50));

        dinnerT.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
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
        dinnerT.setRowHeight(30);
        jScrollPane2.setViewportView(dinnerT);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 470, 520, 200));

        breakfastT.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
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
        breakfastT.setRowHeight(30);
        jScrollPane3.setViewportView(breakfastT);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 30, 520, 200));

        lunchT.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
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
        lunchT.setRowHeight(30);
        jScrollPane4.setViewportView(lunchT);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 250, 520, 200));

        SearchT.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        SearchT.setModel(new javax.swing.table.DefaultTableModel(
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
        SearchT.setRowHeight(30);
        jScrollPane1.setViewportView(SearchT);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 540, 70));

        jButton1.setBackground(new java.awt.Color(102, 0, 102));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, 130, 40));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Food Id:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        idbox.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPanel1.add(idbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 230, 40));

        exit.setBackground(new java.awt.Color(102, 0, 0));
        exit.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        exit.setForeground(new java.awt.Color(255, 255, 255));
        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancel1.png"))); // NOI18N
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jPanel1.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 620, 130, 50));

        spricebtn.setBackground(new java.awt.Color(0, 51, 102));
        spricebtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        spricebtn.setForeground(new java.awt.Color(255, 255, 255));
        spricebtn.setText("Same Price");
        spricebtn.setMargin(new java.awt.Insets(2, 12, 2, 14));
        spricebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spricebtnActionPerformed(evt);
            }
        });
        jPanel1.add(spricebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 550, 130, 40));

        sidbtn.setBackground(new java.awt.Color(0, 51, 102));
        sidbtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        sidbtn.setForeground(new java.awt.Color(255, 255, 255));
        sidbtn.setText("Same ID");
        sidbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sidbtnActionPerformed(evt);
            }
        });
        jPanel1.add(sidbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, 130, 40));

        stimebtn.setBackground(new java.awt.Color(0, 51, 102));
        stimebtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        stimebtn.setForeground(new java.awt.Color(255, 255, 255));
        stimebtn.setText("Same Time");
        stimebtn.setMargin(new java.awt.Insets(2, 12, 2, 14));
        stimebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stimebtnActionPerformed(evt);
            }
        });
        jPanel1.add(stimebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, 130, 40));

        stypebyn.setBackground(new java.awt.Color(0, 51, 102));
        stypebyn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        stypebyn.setForeground(new java.awt.Color(255, 255, 255));
        stypebyn.setText("Same type");
        stypebyn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stypebynActionPerformed(evt);
            }
        });
        jPanel1.add(stypebyn, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 370, 130, 40));

        svarbtn.setBackground(new java.awt.Color(0, 51, 102));
        svarbtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        svarbtn.setForeground(new java.awt.Color(255, 255, 255));
        svarbtn.setText("Same Variation");
        svarbtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        svarbtn.setMargin(new java.awt.Insets(2, 1, 2, 1));
        svarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                svarbtnActionPerformed(evt);
            }
        });
        jPanel1.add(svarbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 430, 130, 40));

        ssizebtn.setBackground(new java.awt.Color(0, 51, 102));
        ssizebtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ssizebtn.setForeground(new java.awt.Color(255, 255, 255));
        ssizebtn.setText("Same Size");
        ssizebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ssizebtnActionPerformed(evt);
            }
        });
        jPanel1.add(ssizebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 490, 130, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1128, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 692, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void timeboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_timeboxActionPerformed

    private void sizeboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sizeboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sizeboxActionPerformed

    private void clearbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearbtnActionPerformed
        timebox.setSelectedIndex(0);
        typebox.setText("");
        variationbox.setText("");
        sizebox.setSelectedIndex(0);
        pricebox.setText("");
        searchidbox.setText("");
        idbox.setText("");
        
        DefaultTableModel model = (DefaultTableModel) SearchT.getModel();
        model.setRowCount(0);
    }//GEN-LAST:event_clearbtnActionPerformed

    private void edittbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edittbtnActionPerformed
        try {
            String m_id=searchidbox.getText();
            String id=idbox.getText();
            String time=(String) timebox.getSelectedItem();
            String type=typebox.getText();
            String variation=variationbox.getText();
            String size=(String) sizebox.getSelectedItem();
            String price=pricebox.getText();
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

                String sql="UPDATE foods SET food_id='"+id+"',time='"+time+"',type='"+type+"',variation='"+variation+"',size='"+size+"',price='"+price+"' WHERE food_id='"+m_id+"';";

                stmt.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Data is successfully Updated");

                timebox.setSelectedIndex(0);
                typebox.setText("");
                variationbox.setText("");
                sizebox.setSelectedIndex(0);
                pricebox.setText("");
                searchidbox.setText("");
                idbox.setText("");

                displayTable();

                DefaultTableModel model = (DefaultTableModel) SearchT.getModel();
                model.setRowCount(0);
                
            }
            

            

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_edittbtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            
            String searchid = searchidbox.getText();
            
            stmt=conn.createStatement();
            String sql="SELECT food_id,time,type,variation,size,price FROM foods WHERE food_id='"+searchid+"' ";
            ResultSet res =stmt.executeQuery(sql);
            SearchT.setModel(DbUtils.resultSetToTableModel(res));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        admin a=new admin();
        a.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_exitActionPerformed

    private void sidbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sidbtnActionPerformed
        // TODO add your handling code here:
        int column = 0;
        int row = 0;

        String value = SearchT.getModel().getValueAt(row, column).toString();
        idbox.setText(value);
        
    }//GEN-LAST:event_sidbtnActionPerformed

    private void stimebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stimebtnActionPerformed
        // TODO add your handling code here:
        int column = 1;
        int row = 0;

        String value = SearchT.getModel().getValueAt(row, column).toString();
        timebox.setSelectedItem(value);
    }//GEN-LAST:event_stimebtnActionPerformed

    private void stypebynActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stypebynActionPerformed
        // TODO add your handling code here:
         int column = 2;
        int row = 0;

        String value = SearchT.getModel().getValueAt(row, column).toString();
        typebox.setText(value);
    }//GEN-LAST:event_stypebynActionPerformed

    private void svarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_svarbtnActionPerformed
        // TODO add your handling code here:
         int column = 3;
        int row = 0;

        String value = SearchT.getModel().getValueAt(row, column).toString();
        variationbox.setText(value);
    }//GEN-LAST:event_svarbtnActionPerformed

    private void ssizebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ssizebtnActionPerformed
        // TODO add your handling code here:
        int column = 4;
        int row = 0;

        String value = SearchT.getModel().getValueAt(row, column).toString();
        sizebox.setSelectedItem(value);
    }//GEN-LAST:event_ssizebtnActionPerformed

    private void spricebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spricebtnActionPerformed
        // TODO add your handling code here:
         int column = 5;
        int row = 0;

        String value = SearchT.getModel().getValueAt(row, column).toString();
        pricebox.setText(value);
    }//GEN-LAST:event_spricebtnActionPerformed

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
            java.util.logging.Logger.getLogger(edit_foods.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(edit_foods.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(edit_foods.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(edit_foods.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new edit_foods().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable SearchT;
    private javax.swing.JTable breakfastT;
    private javax.swing.JButton clearbtn;
    private javax.swing.JTable dinnerT;
    private javax.swing.JButton edittbtn;
    private javax.swing.JButton exit;
    private javax.swing.JTextField idbox;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JTable lunchT;
    private javax.swing.JTextField pricebox;
    private javax.swing.JTextField searchidbox;
    private javax.swing.JButton sidbtn;
    private javax.swing.JComboBox<String> sizebox;
    private javax.swing.JButton spricebtn;
    private javax.swing.JButton ssizebtn;
    private javax.swing.JButton stimebtn;
    private javax.swing.JButton stypebyn;
    private javax.swing.JButton svarbtn;
    private javax.swing.JComboBox<String> timebox;
    private javax.swing.JTextField typebox;
    private javax.swing.JTextField variationbox;
    // End of variables declaration//GEN-END:variables
}
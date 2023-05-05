
package qlbangiayapp;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class frame_hoadon extends javax.swing.JFrame {

    Connection connection;
    public frame_hoadon() {
        initComponents();
    }
    public frame_hoadon(Connection conn) {
        initComponents();
        connection=conn;
        this.setLocationRelativeTo(null);
        load_data_to_tbl_hoadon();
    }
    private void load_data_to_tbl_hoadon(){
        tbl_hoadon.removeAll();
        try{
            String sql="SELECT H.MAHD , H.MAKH, K.HOTEN, H.NGAYBAN, H.TONGTIEN FROM SYSTEM.HOADON H, SYSTEM.KHACHHANG K WHERE H.MAKH=K.MAKH";
            Statement st= connection.createStatement();
            ResultSet rs = st.executeQuery(sql);
            DefaultTableModel model = new DefaultTableModel();
            model.setColumnIdentifiers(new String[]{"Mã HD", "Mã KH","Họ Tên","Ngày Bán","Tổng Tiền"});
            while(rs.next()){
                String mahd =  rs.getString("MAHD");
                String makh= rs.getString("MAKH");
                String hoten= rs.getString("HOTEN");
                Date ngayban= rs.getDate("NGAYBAN");
                Float tongtien = rs.getFloat("TONGTIEN");
                
                model.addRow(new Object[]{mahd, makh, hoten, ngayban, tongtien});             
            }
            rs.close();
            st.close();
            tbl_hoadon.setModel(model);
        }catch(SQLException e){
                JOptionPane.showMessageDialog(null, e);
                return;
        } 
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_hoadon = new javax.swing.JTable();
        btn_insert_hoadon = new javax.swing.JButton();
        btn_delete_hoadon = new javax.swing.JButton();
        btn_cancel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txt_makh = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_mahd = new javax.swing.JTextField();
        btn_find = new javax.swing.JButton();
        btn_insert_cthoadon = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbl_hoadon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbl_hoadon);

        btn_insert_hoadon.setText("TAO MOI HOADON");
        btn_insert_hoadon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_insert_hoadonActionPerformed(evt);
            }
        });

        btn_delete_hoadon.setText("XOA HOADON");
        btn_delete_hoadon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_delete_hoadonActionPerformed(evt);
            }
        });

        btn_cancel.setText("CANCEL");
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });

        jLabel1.setText("MA KH");

        jLabel2.setText("MA HD");

        txt_mahd.setEnabled(false);

        btn_find.setText("TIM");
        btn_find.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_findActionPerformed(evt);
            }
        });

        btn_insert_cthoadon.setText("THEM CTHOADON");
        btn_insert_cthoadon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_insert_cthoadonActionPerformed(evt);
            }
        });

        btn_clear.setText("CLEAR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                                .addGap(54, 54, 54)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_mahd, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_makh, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_insert_hoadon)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_insert_cthoadon)))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_find)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_delete_hoadon)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
                                .addComponent(btn_clear)
                                .addGap(18, 18, 18)
                                .addComponent(btn_cancel)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_mahd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_makh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_find))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_insert_hoadon)
                    .addComponent(btn_delete_hoadon)
                    .addComponent(btn_cancel)
                    .addComponent(btn_insert_cthoadon)
                    .addComponent(btn_clear))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_insert_hoadonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_insert_hoadonActionPerformed
        String makh= txt_makh.getText().toUpperCase();
        
        try{            
            String sql="{CALL PROC_INSERT_KHACHHANG(?) }";
            CallableStatement cs= connection.prepareCall(sql);
            cs.setString(1,makh);
                        
            int rs = cs.executeUpdate();                     
            if(rs==0){
                JOptionPane.showMessageDialog(null, "Them hoa don thanh cong!");
                load_data_to_tbl_hoadon();
                return;
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
            return;
        }
    }//GEN-LAST:event_btn_insert_hoadonActionPerformed

    private void btn_delete_hoadonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_delete_hoadonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_delete_hoadonActionPerformed

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btn_cancelActionPerformed

    private void btn_findActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_findActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_findActionPerformed

    private void btn_insert_cthoadonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_insert_cthoadonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_insert_cthoadonActionPerformed

    
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
            java.util.logging.Logger.getLogger(frame_hoadon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frame_hoadon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frame_hoadon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frame_hoadon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frame_hoadon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_delete_hoadon;
    private javax.swing.JButton btn_find;
    private javax.swing.JButton btn_insert_cthoadon;
    private javax.swing.JButton btn_insert_hoadon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_hoadon;
    private javax.swing.JTextField txt_mahd;
    private javax.swing.JTextField txt_makh;
    // End of variables declaration//GEN-END:variables
}

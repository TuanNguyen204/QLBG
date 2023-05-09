
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
                
        } 
    }
    
    private void load_data_to_tbl_cthd(){
        tbl_cthd.removeAll();
        int t_mahd= Integer.parseInt(txt_mahd.getText());
        try{
            String sql="SELECT C.MAHD, S.TENGIAY, C.SLG FROM CTHOADON C, SANPHAM S WHERE C.MAGIAY=S.MAGIAY AND C.MAHD="+t_mahd;
            Statement st= connection.createStatement();
            ResultSet rs = st.executeQuery(sql);
            DefaultTableModel model = new DefaultTableModel();
            model.setColumnIdentifiers(new String[]{"Mã HD","Tên giày","Số lượng"});
            while(rs.next()){
                String mahd =  rs.getString("MAHD");
                String tengiay = rs.getString("TENGIAY");
                int slg = rs.getInt("SLG");
                
                model.addRow(new Object[]{mahd, tengiay, slg});             
            }
            rs.close();
            st.close();
            tbl_cthd.setModel(model);
        }catch(SQLException e){
                JOptionPane.showMessageDialog(null, e);                
        } 
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        diaglog_cthd = new javax.swing.JDialog();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_cthd = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
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
        btn_cthoadon = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();
        btn_xem_cthd = new javax.swing.JButton();
        btn_refresh = new javax.swing.JButton();

        tbl_cthd.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tbl_cthd);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("CHI TIET HOA DON");

        javax.swing.GroupLayout diaglog_cthdLayout = new javax.swing.GroupLayout(diaglog_cthd.getContentPane());
        diaglog_cthd.getContentPane().setLayout(diaglog_cthdLayout);
        diaglog_cthdLayout.setHorizontalGroup(
            diaglog_cthdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(diaglog_cthdLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, diaglog_cthdLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(173, 173, 173))
        );
        diaglog_cthdLayout.setVerticalGroup(
            diaglog_cthdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(diaglog_cthdLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

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
        tbl_hoadon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_hoadonMouseClicked(evt);
            }
        });
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

        btn_cthoadon.setText("CTHOADON");
        btn_cthoadon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cthoadonActionPerformed(evt);
            }
        });

        btn_clear.setText("CLEAR");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });

        btn_xem_cthd.setText("XEM CTHD");
        btn_xem_cthd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xem_cthdActionPerformed(evt);
            }
        });

        btn_refresh.setText("REFRESH");
        btn_refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refreshActionPerformed(evt);
            }
        });

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
                                .addComponent(btn_delete_hoadon)))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btn_find, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_cthoadon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_xem_cthd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 155, Short.MAX_VALUE)
                        .addComponent(btn_clear)
                        .addGap(18, 18, 18)
                        .addComponent(btn_cancel))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_refresh)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_refresh)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_mahd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_xem_cthd))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_makh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_find))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_insert_hoadon)
                    .addComponent(btn_delete_hoadon)
                    .addComponent(btn_cancel)
                    .addComponent(btn_clear)
                    .addComponent(btn_cthoadon))
                .addContainerGap(31, Short.MAX_VALUE))
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
                
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
            
        }
    }//GEN-LAST:event_btn_insert_hoadonActionPerformed

    private void btn_delete_hoadonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_delete_hoadonActionPerformed
                
            if(txt_mahd.getText()!=null){
                int t_mahd = Integer.parseInt(txt_makh.getText());
                int a = JOptionPane.showConfirmDialog(this, 
                        "Ban co muon xoa hoa don "+t_mahd+" ?",
                        "Delete",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.WARNING_MESSAGE);
                if(a==JOptionPane.YES_OPTION){
                    try{
                        String sql="{CALL PROC_DELETE_HOADON(?)}";
                        CallableStatement cs= connection.prepareCall(sql);
                        cs.setInt(1,t_mahd);
                        int rs=cs.executeUpdate();
                        if(rs==0){
                            JOptionPane.showMessageDialog(null, "Xoa hoa don thanh cong!");                            
                            return;
                        }
                        load_data_to_tbl_hoadon();
                    }catch(SQLException e){
                        JOptionPane.showMessageDialog(null,e);                        
                    }
                }
            }
    }//GEN-LAST:event_btn_delete_hoadonActionPerformed

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btn_cancelActionPerformed

    private void btn_findActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_findActionPerformed
        String t_makh=  txt_makh.getText();
        if(t_makh!=""){
            try{
            String sql="SELECT H.MAHD , H.MAKH, K.HOTEN, H.NGAYBAN, H.TONGTIEN FROM SYSTEM.HOADON H, SYSTEM.KHACHHANG K WHERE H.MAKH=K.MAKH AND H.MAKH='"+t_makh+"'";
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
               
        } 
        }
    }//GEN-LAST:event_btn_findActionPerformed

    private void btn_cthoadonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cthoadonActionPerformed
        String mahd = txt_mahd.getText();
        
        if(txt_mahd.getText()==null){
            JOptionPane.showMessageDialog(null, "MA HD khong duoc de trong!");
            return;
        }
        else{
            frame_cthd cthd = new frame_cthd(connection, mahd);
            cthd.setVisible(true);
        }              
        
    }//GEN-LAST:event_btn_cthoadonActionPerformed

    private void btn_xem_cthdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xem_cthdActionPerformed
           load_data_to_tbl_cthd();
           diaglog_cthd.setSize(500,250);
           diaglog_cthd.setLocationRelativeTo(null);
           diaglog_cthd.setVisible(true);       
    }//GEN-LAST:event_btn_xem_cthdActionPerformed

    private void tbl_hoadonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_hoadonMouseClicked
        DefaultTableModel model = (DefaultTableModel) tbl_hoadon.getModel();
        
        int index = tbl_hoadon.getSelectedRow();
        if(index==-1){
            return;
        }
        String mahd= (String)model.getValueAt(index, 0);
        String makh = (String) model.getValueAt(index,1);        
        
        txt_mahd.setText(mahd);
        txt_makh.setText(makh);
        
    }//GEN-LAST:event_tbl_hoadonMouseClicked

    private void btn_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refreshActionPerformed
        load_data_to_tbl_hoadon();
    }//GEN-LAST:event_btn_refreshActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        txt_mahd.setText("");
        txt_makh.setText("");
    }//GEN-LAST:event_btn_clearActionPerformed

    
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
    private javax.swing.JButton btn_cthoadon;
    private javax.swing.JButton btn_delete_hoadon;
    private javax.swing.JButton btn_find;
    private javax.swing.JButton btn_insert_hoadon;
    private javax.swing.JButton btn_refresh;
    private javax.swing.JButton btn_xem_cthd;
    private javax.swing.JDialog diaglog_cthd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbl_cthd;
    private javax.swing.JTable tbl_hoadon;
    private javax.swing.JTextField txt_mahd;
    private javax.swing.JTextField txt_makh;
    // End of variables declaration//GEN-END:variables
}

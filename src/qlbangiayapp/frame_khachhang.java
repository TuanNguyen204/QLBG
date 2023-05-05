
package qlbangiayapp;

import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.CallableStatement;
import java.sql.Types;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;



public class frame_khachhang extends javax.swing.JFrame {

    Connection connection;
    public frame_khachhang() {
        initComponents();
    }
    public frame_khachhang(Connection conn) {
        initComponents();
        this.setLocationRelativeTo(null);
        connection=conn;
        load_data_to_tbl_khachhang();
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_create = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txt_makh = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_diachi = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_hoten = new javax.swing.JTextField();
        cbo_gioitinh = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        btn_check = new javax.swing.JButton();
        btn_cancel = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_khachhang = new javax.swing.JTable();
        btn_clear = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_create.setText("CREATE");
        btn_create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_createActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Thong tin khach hang"));

        jLabel5.setText("ID KHACHHANG");

        jLabel4.setText("EMAIL");

        jLabel1.setText("DIA CHI");

        jLabel3.setText("GIOI TINH");

        txt_hoten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_hotenActionPerformed(evt);
            }
        });

        cbo_gioitinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NAM", "NU", "KHAC" }));

        jLabel2.setText("HO TEN");

        btn_check.setText("Check");
        btn_check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_checkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbo_gioitinh, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_hoten, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE)
                    .addComponent(txt_diachi)
                    .addComponent(txt_email)
                    .addComponent(txt_makh))
                .addGap(18, 18, 18)
                .addComponent(btn_check)
                .addContainerGap(194, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_hoten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbo_gioitinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_diachi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_makh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_check))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        btn_cancel.setText("CANCEL");
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });

        btn_update.setText("UPDATE");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        tbl_khachhang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_khachhang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_khachhangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_khachhang);

        btn_clear.setText("CLEAR");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });

        btn_delete.setText("DELETE");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(450, 450, 450)
                            .addComponent(btn_clear)
                            .addGap(207, 207, 207)
                            .addComponent(btn_cancel))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(16, 16, 16)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 799, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btn_create)
                            .addGap(64, 64, 64)
                            .addComponent(btn_update)
                            .addGap(69, 69, 69)
                            .addComponent(btn_delete))
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_create)
                        .addComponent(btn_update)
                        .addComponent(btn_delete))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_cancel)
                        .addComponent(btn_clear)))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_createActionPerformed
        if(txt_makh.getText()!=""){
            insert_khachhang();
            load_data_to_tbl_khachhang();
        }
        else{
            JOptionPane.showMessageDialog(null,"Ma khach hang khong duoc de trong");
        }
    }//GEN-LAST:event_btn_createActionPerformed

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
       this.setVisible(false);
    }//GEN-LAST:event_btn_cancelActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        String makh= txt_makh.getText().toUpperCase();
        String hoten = txt_hoten.getText();
        String gioitinh = (String)cbo_gioitinh.getSelectedItem();
        String diachi = txt_diachi.getText();
        String email = txt_email.getText();
        try{
            String sql_hoten ="UPDATE SYSTEM.KHACHHANG SET HOTEN='"+hoten+"' WHERE MAKH='"+makh+"'";
            String sql_gioitinh ="UPDATE SYSTEM.KHACHHANG SET GIOITINH='"+gioitinh+"' WHERE MAKH='"+makh+"'";
            String sql_diachi ="UPDATE SYSTEM.KHACHHANG SET DIACHI='"+diachi+"' WHERE MAKH='"+makh+"'";
            String sql_email ="UPDATE SYSTEM.KHACHHANG SET EMAIL='"+email+"' WHERE MAKH='"+makh+"'";
            
            
            Statement st= connection.createStatement();
            st.executeUpdate(sql_hoten);
            st.executeUpdate(sql_gioitinh);
            st.executeUpdate(sql_diachi);
            st.executeUpdate(sql_email);
            
            load_data_to_tbl_khachhang();
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
            return;
        }
    }//GEN-LAST:event_btn_updateActionPerformed

    private void txt_hotenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_hotenActionPerformed
        
        try{
            String sql="{? = call FUNC_CREATE_MAKH(?)}";
            CallableStatement cs= connection.prepareCall(sql);
            cs.registerOutParameter(1, Types.CHAR);
            cs.setString(2, txt_hoten.getText().toUpperCase());            
            cs.execute();
            String result = cs.getString(1);
            txt_makh.setText(result);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
                return;
        }
    }//GEN-LAST:event_txt_hotenActionPerformed

    private void btn_checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_checkActionPerformed
        
            try{
            String username = txt_makh.getText().toUpperCase();
            int count=0;
            String sql="SELECT COUNT(*) FROM DBA_USERS WHERE USERNAME ='"+username+"'";
            Statement st = connection.createStatement();
            ResultSet rs= st.executeQuery(sql);
            while(rs.next()){
                count=rs.getInt(1);
            }
            if(count==0){
                JOptionPane.showMessageDialog(null, "Ban co dung username nay!");
                return ;
            }
            else{
                JOptionPane.showMessageDialog(null, "Ban khong the dung username nay!");
                return ;
            }
        }catch(SQLException e){
                JOptionPane.showMessageDialog(null, e);
                return ;
            }
        
        
    }//GEN-LAST:event_btn_checkActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        txt_makh.setText("");
        txt_hoten.setText("");
        txt_diachi.setText("");
        txt_email.setText("");
    }//GEN-LAST:event_btn_clearActionPerformed

    private void tbl_khachhangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_khachhangMouseClicked
        DefaultTableModel model = (DefaultTableModel) tbl_khachhang.getModel();
        
        int index = tbl_khachhang.getSelectedRow();
        if(index==-1){
            return;
        }
        String makh= (String)model.getValueAt(index, 0);
        String hoten = (String) model.getValueAt(index,1);
        String gioitinh = (String) model.getValueAt(index, 2);
        String diachi = (String) model.getValueAt(index,3);
        String email = (String) model.getValueAt(index,4);
        
        txt_makh.setText(makh);
        txt_hoten.setText(hoten);
        cbo_gioitinh.setSelectedItem(gioitinh);
        txt_diachi.setText(diachi);
        txt_email.setText(email);
    }//GEN-LAST:event_tbl_khachhangMouseClicked

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        String makh= txt_makh.getText();        
            if(makh!=""){
                int a = JOptionPane.showConfirmDialog(this, 
                        "Ban co muon xoa "+makh+" ?",
                        "Delete",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.WARNING_MESSAGE);
                if(a==JOptionPane.YES_OPTION){
                    try{
                        String sql="{CALL PROC_DELETE_KHACHHANG(?)}";
                        CallableStatement cs= connection.prepareCall(sql);
                        cs.setString(1,makh);
                        int rs=cs.executeUpdate();
                        if(rs==0){
                            JOptionPane.showMessageDialog(null, "Xoa khach hang thanh cong!");
                            
                            return;
                        }
                        load_data_to_tbl_khachhang();
                    }catch(SQLException e){
                        JOptionPane.showMessageDialog(null,e);
                        return;
                    }
                }
//                else{
//                    JOptionPane.showMessageDialog(null,"Ma khach hang khong duoc de trong");
//                    return;
//                }
            }
        
    }//GEN-LAST:event_btn_deleteActionPerformed
    
    private void insert_khachhang(){
        String makh= txt_makh.getText().toUpperCase();
        String hoten = txt_hoten.getText();
        String gioitinh = (String)cbo_gioitinh.getSelectedItem();
        String diachi = txt_diachi.getText();
        String email = txt_email.getText();
        try{            
            String sql="{CALL PROC_INSERT_KHACHHANG(?,?,?,?,?) }";
            CallableStatement cs= connection.prepareCall(sql);
            cs.setString(1,makh);
            cs.setString(2,hoten);
            cs.setString(3,gioitinh);
            cs.setString(4,diachi);
            cs.setString(5,email);            
            int rs = cs.executeUpdate();                     
            if(rs==0){
                JOptionPane.showMessageDialog(null, "Them khach hang thanh cong!");
                //load_data_to_tbl_khachhang();
                return;
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
            return;
        }
    }
    
    
    
    private void load_data_to_tbl_khachhang(){
        tbl_khachhang.removeAll();
        try{
            String sql="SELECT * FROM SYSTEM.KHACHHANG";
            Statement st= connection.createStatement();
            ResultSet rs = st.executeQuery(sql);
            DefaultTableModel model = new DefaultTableModel();
            model.setColumnIdentifiers(new String[]{"Mã KH", "Họ Tên","Giới Tính","Địa Chỉ","Email","Tổng Tích Lũy"});
            while(rs.next()){
                String makh= rs.getString("MAKH");
                String hoten= rs.getString("HOTEN");
                String gt= rs.getString("GIOITINH");
                String dc= rs.getString("DIACHI");
                String email= rs.getString("EMAIL");
                Float chitieu = rs.getFloat("TONGCHITIEU");
                model.addRow(new Object[]{makh, hoten, gt, dc, email, chitieu});             
            }
            rs.close();
            st.close();
            tbl_khachhang.setModel(model);
        }catch(SQLException e){
                JOptionPane.showMessageDialog(null, e);
                return;
        } 
    }
    
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
            java.util.logging.Logger.getLogger(frame_khachhang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frame_khachhang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frame_khachhang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frame_khachhang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frame_khachhang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_check;
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_create;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_update;
    private javax.swing.JComboBox<String> cbo_gioitinh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_khachhang;
    private javax.swing.JTextField txt_diachi;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_hoten;
    private javax.swing.JTextField txt_makh;
    // End of variables declaration//GEN-END:variables
}

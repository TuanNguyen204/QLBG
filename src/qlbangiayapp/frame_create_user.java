
package qlbangiayapp;

import java.sql.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class frame_create_user extends javax.swing.JFrame {
    Connection connection;
    
    public frame_create_user() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    public frame_create_user(Connection conn) {
        initComponents();
        this.setLocationRelativeTo(null);
        connection=conn;
        load_data_cbo_default_tbs();
        load_data_cbo_profile();
        
    }
    //load data to cbo default tablespace
    private void load_data_cbo_default_tbs(){
        try{
            String sql= "SELECT NAME FROM V$TABLESPACE";
            Statement pst = connection.createStatement();
            ResultSet rs = pst.executeQuery(sql);
            while(rs.next()){
                cbo_default_tbs.addItem(rs.getString("NAME"));
            }        
            pst.close();
            rs.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
                return;
        }
    }
    //load data to cbo profile
    private void load_data_cbo_profile(){
        try{
            String sql= "SELECT DISTINCT PROFILE FROM DBA_PROFILES";
            Statement pst = connection.createStatement();
            ResultSet rs = pst.executeQuery(sql);
             while(rs.next()){
                cbo_profile.addItem(rs.getString("PROFILE"));
            }        
            pst.close();
            rs.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
                return;
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_create = new javax.swing.JButton();
        btn_cancel = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        chk_change_pass = new javax.swing.JCheckBox();
        chk_change_tbs = new javax.swing.JCheckBox();
        chk_change_profile = new javax.swing.JCheckBox();
        chk_change_quota = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        cbo_default_tbs = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cbo_profile = new javax.swing.JComboBox<>();
        cbo_quota = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_username = new javax.swing.JTextField();
        txt_password = new javax.swing.JTextField();
        btn_update = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_create.setText("Create");
        btn_create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_createActionPerformed(evt);
            }
        });

        btn_cancel.setText("Cancel");
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Check for Update", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(102, 102, 102))); // NOI18N

        chk_change_pass.setText("Change Password");

        chk_change_tbs.setText("Change Tablespace");

        chk_change_profile.setText("Change Profile");

        chk_change_quota.setText("Change Quota");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chk_change_pass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chk_change_tbs, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                    .addComponent(chk_change_profile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chk_change_quota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(chk_change_pass)
                .addGap(18, 18, 18)
                .addComponent(chk_change_tbs)
                .addGap(18, 18, 18)
                .addComponent(chk_change_profile)
                .addGap(18, 18, 18)
                .addComponent(chk_change_quota)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Create new User", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(102, 102, 102))); // NOI18N

        jLabel5.setText("Quota");

        jLabel6.setText("Default Tablespace");

        jLabel7.setText("Profile");

        cbo_quota.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1M", "5M", "10M", "20M", "50M", "100M", "UNLIMITED" }));

        jLabel1.setText("Username");

        jLabel2.setText("Password");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbo_profile, 0, 290, Short.MAX_VALUE)
                    .addComponent(txt_username)
                    .addComponent(txt_password)
                    .addComponent(cbo_quota, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbo_default_tbs, javax.swing.GroupLayout.Alignment.TRAILING, 0, 290, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cbo_default_tbs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cbo_profile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addComponent(cbo_quota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_update.setText("Update");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_create)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_update)
                        .addGap(81, 81, 81)
                        .addComponent(btn_cancel))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_create)
                    .addComponent(btn_update)
                    .addComponent(btn_cancel))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //button cancel
    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btn_cancelActionPerformed
    //button create
    private void btn_createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_createActionPerformed
        String name = txt_username.getText();
        String pass= txt_password.getText();
        String tbs= (String)cbo_default_tbs.getSelectedItem();
        String profile = (String) cbo_profile.getSelectedItem();
        String quota = (String) cbo_quota.getSelectedItem();
        try{
            String create= "CREATE USER "+name+" IDENTIFIED BY "+pass+" DEFAULT TABLESPACE "+tbs+" TEMPORARY TABLESPACE TEMP QUOTA "+quota+" ON "+tbs+" PROFILE "+profile ;           
            String grant= "GRANT CONNECT, CREATE SESSION, RESOURCE TO "+ name;
            Statement st = connection.createStatement();
            int rs1 = st.executeUpdate(create);
            if(rs1==0){
                JOptionPane.showMessageDialog(null, "Create User Complete");
            }
            int rs2= st.executeUpdate(grant);
            if(rs2==0){
                JOptionPane.showMessageDialog(null, "Grant User Complete");
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
                return;
        }
    }//GEN-LAST:event_btn_createActionPerformed
    //button update
    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        String name = txt_username.getText();
        String pass= txt_password.getText();
        String tbs= (String)cbo_default_tbs.getSelectedItem();
        String profile = (String) cbo_profile.getSelectedItem();
        String quota = (String) cbo_quota.getSelectedItem();
        try{
            Statement st = connection.createStatement();
            String update1 = "alter user "+name+" identified by "+pass;
            String update2 = "alter user "+name+" default tablespace "+tbs;
            String update3 = "alter user "+name+" profile "+profile;
            String update4 = "alter user "+name+" quota "+quota+" on "+tbs;
            if(chk_change_pass.isSelected()){
                int rs1 = st.executeUpdate(update1);
                if(rs1==0){JOptionPane.showMessageDialog(null, "Change Password Success");}
            }
            if(chk_change_tbs.isSelected()){
                int rs2 = st.executeUpdate(update2);
                if(rs2==0){JOptionPane.showMessageDialog(null, "Change Tablespace Success");}
            }
            if(chk_change_profile.isSelected()){
                int rs3 = st.executeUpdate(update3);
                if(rs3==0){JOptionPane.showMessageDialog(null, "Change Profile Success");}
            }
            if(chk_change_quota.isSelected()&& !chk_change_tbs.isSelected()){
                JOptionPane.showMessageDialog(null,"No Tablespace To Change Quota!");
            }
            if(chk_change_quota.isSelected() && chk_change_tbs.isSelected()){
                int rs4= st.executeUpdate(update4);
                if(rs4==0){JOptionPane.showMessageDialog(null, "Change Quota On Tablespace "+tbs+" Success");}
            }
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
                return;
        }
    }//GEN-LAST:event_btn_updateActionPerformed

    
    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(frame_create_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frame_create_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frame_create_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frame_create_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frame_create_user().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_create;
    private javax.swing.JButton btn_update;
    private javax.swing.JComboBox<String> cbo_default_tbs;
    private javax.swing.JComboBox<String> cbo_profile;
    private javax.swing.JComboBox<String> cbo_quota;
    private javax.swing.JCheckBox chk_change_pass;
    private javax.swing.JCheckBox chk_change_profile;
    private javax.swing.JCheckBox chk_change_quota;
    private javax.swing.JCheckBox chk_change_tbs;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txt_password;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}

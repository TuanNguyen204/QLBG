
package qlbangiayapp;



import java.sql.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.ListModel;



public class frame_grant_revoke extends javax.swing.JFrame {
    Connection connection;
    DefaultListModel model_role_1 = new DefaultListModel();
    DefaultListModel model_role_2= new DefaultListModel();
    DefaultListModel model_privs_2= new DefaultListModel();
    public frame_grant_revoke() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    public frame_grant_revoke(Connection conn) {        
        connection=conn;
        initComponents();
        load_data_to_list_1();
        this.setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        panel_role = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_name = new javax.swing.JTextField();
        panel_granted_role = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        list_role_2 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        list_role_1 = new javax.swing.JList<>();
        btn_choice_1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn_refresh_1 = new javax.swing.JButton();
        btn_delete_value_1 = new javax.swing.JButton();
        panel_privs = new javax.swing.JPanel();
        btn_choice_2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        list_privs_2 = new javax.swing.JList<>();
        jScrollPane6 = new javax.swing.JScrollPane();
        list_privs_1 = new javax.swing.JList<>();
        btn_refresh_2 = new javax.swing.JButton();
        cbo_table = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        btn_grant = new javax.swing.JButton();
        btn_revoke = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel_role.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        jLabel1.setText("Role Name or User Name");

        javax.swing.GroupLayout panel_roleLayout = new javax.swing.GroupLayout(panel_role);
        panel_role.setLayout(panel_roleLayout);
        panel_roleLayout.setHorizontalGroup(
            panel_roleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_roleLayout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(196, 196, 196))
        );
        panel_roleLayout.setVerticalGroup(
            panel_roleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_roleLayout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addGroup(panel_roleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(185, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Role Name", panel_role);

        panel_granted_role.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        jScrollPane1.setViewportView(list_role_2);

        jScrollPane2.setViewportView(list_role_1);

        btn_choice_1.setText(">");
        btn_choice_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_choice_1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Role Name");

        jLabel3.setText("Grant or Revoke");

        btn_refresh_1.setText("Refresh");
        btn_refresh_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refresh_1ActionPerformed(evt);
            }
        });

        btn_delete_value_1.setText("Delete a Choice");
        btn_delete_value_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_delete_value_1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_granted_roleLayout = new javax.swing.GroupLayout(panel_granted_role);
        panel_granted_role.setLayout(panel_granted_roleLayout);
        panel_granted_roleLayout.setHorizontalGroup(
            panel_granted_roleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_granted_roleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_granted_roleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(btn_choice_1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(panel_granted_roleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_granted_roleLayout.createSequentialGroup()
                        .addComponent(btn_delete_value_1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(btn_refresh_1))
                    .addGroup(panel_granted_roleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panel_granted_roleLayout.setVerticalGroup(
            panel_granted_roleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_granted_roleLayout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(btn_choice_1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_granted_roleLayout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(panel_granted_roleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(panel_granted_roleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_granted_roleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_refresh_1)
                    .addComponent(btn_delete_value_1))
                .addGap(12, 12, 12))
        );

        jTabbedPane1.addTab("Granted Role", panel_granted_role);

        panel_privs.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        btn_choice_2.setText(">");
        btn_choice_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_choice_2ActionPerformed(evt);
            }
        });

        jLabel6.setText("Role Name");

        jLabel7.setText("Grant or Revoke");

        jScrollPane5.setViewportView(list_privs_2);

        list_privs_1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "SELECT", "UPDATE", "INSERT", "DELETE" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane6.setViewportView(list_privs_1);

        btn_refresh_2.setText("Refresh");
        btn_refresh_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refresh_2ActionPerformed(evt);
            }
        });

        cbo_table.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "KHACHHANG", "THUONGHIEU", "SANPHAM", "HOADON", "CTHOADON", "PHIEUNHAP", "CTPHIEUNHAP" }));

        jLabel4.setText("Table");

        javax.swing.GroupLayout panel_privsLayout = new javax.swing.GroupLayout(panel_privs);
        panel_privs.setLayout(panel_privsLayout);
        panel_privsLayout.setHorizontalGroup(
            panel_privsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_privsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_privsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_privsLayout.createSequentialGroup()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(panel_privsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_refresh_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_choice_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_privsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(panel_privsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbo_table, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );
        panel_privsLayout.setVerticalGroup(
            panel_privsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_privsLayout.createSequentialGroup()
                .addContainerGap(121, Short.MAX_VALUE)
                .addGroup(panel_privsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addGroup(panel_privsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(jLabel4)))
                .addGap(18, 18, 18)
                .addGroup(panel_privsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbo_table, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_privsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(panel_privsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panel_privsLayout.createSequentialGroup()
                            .addComponent(btn_choice_2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_refresh_2))))
                .addGap(129, 129, 129))
        );

        jTabbedPane1.addTab("Table Privilege", panel_privs);

        btn_grant.setText("Grant");
        btn_grant.setPreferredSize(new java.awt.Dimension(100, 30));
        btn_grant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_grantActionPerformed(evt);
            }
        });

        btn_revoke.setText("Revoke");
        btn_revoke.setPreferredSize(new java.awt.Dimension(100, 30));
        btn_revoke.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_revokeActionPerformed(evt);
            }
        });

        jButton1.setText("Cancel");
        jButton1.setPreferredSize(new java.awt.Dimension(100, 30));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btn_grant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(btn_revoke, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_grant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_revoke, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //button choice_1 role
    private void btn_choice_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_choice_1ActionPerformed
        String str = list_role_1.getSelectedValue();        
        model_role_2.addElement(str);
        list_role_2.setModel(model_role_2);
    }//GEN-LAST:event_btn_choice_1ActionPerformed
    //button refresh_1
    private void btn_refresh_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refresh_1ActionPerformed
        model_role_2.removeAllElements();
        list_role_2.setModel(model_role_2);
    }//GEN-LAST:event_btn_refresh_1ActionPerformed
    //button delete a role choie
    private void btn_delete_value_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_delete_value_1ActionPerformed
        int value = list_role_2.getSelectedIndex();
        model_role_2.removeElementAt(value);
        list_role_2.setModel(model_role_2);
    }//GEN-LAST:event_btn_delete_value_1ActionPerformed
    //button choice_2 privilege
    private void btn_choice_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_choice_2ActionPerformed
        String str = list_privs_1.getSelectedValue();        
        model_privs_2.addElement(str);
        list_privs_2.setModel(model_privs_2);
    }//GEN-LAST:event_btn_choice_2ActionPerformed
    //button grant
    private void btn_grantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_grantActionPerformed
        grant_role();
        grant_privs();
    }//GEN-LAST:event_btn_grantActionPerformed
    //button refresh_2
    private void btn_refresh_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refresh_2ActionPerformed
        model_privs_2.removeAllElements();
        list_privs_2.setModel(model_privs_2);
    }//GEN-LAST:event_btn_refresh_2ActionPerformed
    //button revoke
    private void btn_revokeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_revokeActionPerformed
        revoke_role();
        revoke_privs();
    }//GEN-LAST:event_btn_revokeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    //load data to jlist 1
    private void load_data_to_list_1(){
        
        try{
            String sql= "SELECT ROLE FROM DBA_ROLES ORDER BY ROLE ASC";
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                String role= rs.getString(1);
                model_role_1.addElement(role);
                list_role_1.setModel(model_role_1);
            }     
            st.close();
            rs.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
                return;
        }
    }
    //grant role 
    private void grant_role(){
        ListModel<String> model = list_role_2.getModel();
        int n = model.getSize();        
        String name= txt_name.getText().toUpperCase();
        ArrayList<String> list = new ArrayList<String>();
        if(list_role_2!=null){
            try{
            Statement st = connection.createStatement();
            for(int i=0;i<n;i++){
                String role = model.getElementAt(i);
                String sql="GRANT "+role+" TO "+name;
                int rs = st.executeUpdate(sql);
                if(rs==0){
                    list.add(role);
                    JOptionPane.showMessageDialog(null,"Grant "+list+" to "+name+" Success" );
                }
            }            
                            
            }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
                return;
            }
        }        
    }
    //grant privilege 
    private void grant_privs(){
        ListModel<String> model = list_privs_2.getModel();
        int n = model.getSize();        
        String name= txt_name.getText().toUpperCase();
        String table= (String)cbo_table.getSelectedItem();
        ArrayList<String> list = new ArrayList<String>();
        if(list_privs_2!=null){
            try{
            Statement st = connection.createStatement();
            for(int i=0;i<n;i++){
                String priv = model.getElementAt(i);
                String sql="GRANT "+priv+" ON SYSTEM."+table+" TO "+name;
                int rs = st.executeUpdate(sql);
                if(rs==0){
                    list.add(priv);
                    JOptionPane.showMessageDialog(null,"Grant "+list+" on "+table+" to "+name+" Success" );
                }
            }            
                            
            }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
                return;
            }
        }   
    }
    //revoke role
    private void revoke_role(){
        ListModel<String> model = list_role_2.getModel();
        int n = model.getSize();        
        String name= txt_name.getText().toUpperCase();
        ArrayList<String> list = new ArrayList<String>();
        if(list_role_2!=null){
            try{
                Statement st = connection.createStatement();
                for(int i=0;i<n;i++){
                    String role = model.getElementAt(i);
                    String sql="REVOKE "+role+" FROM "+name;
                    int rs = st.executeUpdate(sql);
                    if(rs==0){
                        list.add(role);
                        JOptionPane.showMessageDialog(null,"Revoke "+list+" Success" );
                    }
                }
                if(list!=null){
                    
                }                            
            }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
                return;
            }
        }   
    }
    //revoke privs
    private void revoke_privs(){
        ListModel<String> model = list_privs_2.getModel();
        int n = model.getSize();        
        String name= txt_name.getText().toUpperCase();
        String table= (String)cbo_table.getSelectedItem();
        ArrayList<String> list = new ArrayList<String>();
        if(list_privs_2!=null){
            try{
                Statement st = connection.createStatement();
                for(int i=0;i<n;i++){
                    String priv = model.getElementAt(i);
                    String sql="REVOKE "+priv+" ON SYSTEM."+table+" FROM "+name;
                    int rs = st.executeUpdate(sql);
                    if(rs==0){
                        list.add(priv);
                    }
                }
                if(list!=null){
                    JOptionPane.showMessageDialog(null,"Revoke "+list+" on "+table+" to "+name+" Success" );
                }                            
            }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
                return;
            }
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
            java.util.logging.Logger.getLogger(frame_grant_revoke.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frame_grant_revoke.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frame_grant_revoke.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frame_grant_revoke.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frame_grant_revoke().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_choice_1;
    private javax.swing.JButton btn_choice_2;
    private javax.swing.JButton btn_delete_value_1;
    private javax.swing.JButton btn_grant;
    private javax.swing.JButton btn_refresh_1;
    private javax.swing.JButton btn_refresh_2;
    private javax.swing.JButton btn_revoke;
    private javax.swing.JComboBox<String> cbo_table;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JList<String> list_privs_1;
    private javax.swing.JList<String> list_privs_2;
    private javax.swing.JList<String> list_role_1;
    private javax.swing.JList<String> list_role_2;
    private javax.swing.JPanel panel_granted_role;
    private javax.swing.JPanel panel_privs;
    private javax.swing.JPanel panel_role;
    private javax.swing.JTextField txt_name;
    // End of variables declaration//GEN-END:variables
}

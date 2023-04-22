
package qlbangiayapp;

import java.io.File;
import java.sql.*;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
/**
 *
 * @author tuann
 */
public class frame_create_tbs extends javax.swing.JFrame {
    Connection connection;
    /**
     * Creates new form frame_create_tbs
     */
    public frame_create_tbs() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    public frame_create_tbs(Connection conn) {
        initComponents();
        connection=conn;
        this.setLocationRelativeTo(null);
        //this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txt_tbs_name = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_data_name = new javax.swing.JTextField();
        txt_size = new javax.swing.JTextField();
        btn_chooser = new javax.swing.JButton();
        btn_create_tbs = new javax.swing.JButton();
        btn_cancel = new javax.swing.JButton();
        btn_add_tbs = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Tablespace Name");

        jLabel2.setText("Datafile");

        jLabel3.setText("Size");

        btn_chooser.setText("...");
        btn_chooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_chooserActionPerformed(evt);
            }
        });

        btn_create_tbs.setText("Create");
        btn_create_tbs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_create_tbsActionPerformed(evt);
            }
        });

        btn_cancel.setText("Cancel");
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });

        btn_add_tbs.setText("Add");
        btn_add_tbs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_add_tbsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_create_tbs)
                        .addGap(44, 44, 44)
                        .addComponent(btn_add_tbs)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_cancel))
                    .addComponent(txt_tbs_name)
                    .addComponent(txt_size, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
                    .addComponent(txt_data_name))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_chooser)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_tbs_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_data_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_chooser))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_size, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_create_tbs)
                    .addComponent(btn_add_tbs)
                    .addComponent(btn_cancel))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //button choose file
    private void btn_chooserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_chooserActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int value = chooser.showOpenDialog(this);
        if(value==JFileChooser.APPROVE_OPTION){
            File f = chooser.getSelectedFile();
            String path = f.getAbsolutePath();
            txt_data_name.setText(path);
        }
    }//GEN-LAST:event_btn_chooserActionPerformed
    //button cancel
    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        
            this.setVisible(false);
    }//GEN-LAST:event_btn_cancelActionPerformed
    //button create
    private void btn_create_tbsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_create_tbsActionPerformed
        try{                      
              String sql= "CREATE TABLESPACE " + txt_tbs_name.getText() + " DATAFILE '" + txt_data_name.getText() + "' SIZE " + txt_size.getText();
                Statement stmt = connection.createStatement();
                int result = stmt.executeUpdate(sql);
                if(result==0){
                    JOptionPane.showMessageDialog(null, "Create Tablespace Success");
                }
                stmt.close();
                
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
            return;
        }
    }//GEN-LAST:event_btn_create_tbsActionPerformed
    //button add datafile
    private void btn_add_tbsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_add_tbsActionPerformed
        try{
            String sql= "ALTER TABLESPACE " + txt_tbs_name.getText() + " ADD DATAFILE '" + txt_data_name.getText() + "' SIZE " + txt_size.getText();
                Statement stmt = connection.createStatement();
                int result = stmt.executeUpdate(sql); 
                if(result==0){
                    JOptionPane.showMessageDialog(null, "Alter Tablespace Success");
                }
                stmt.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
            return;
        }
    }//GEN-LAST:event_btn_add_tbsActionPerformed

    
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
            java.util.logging.Logger.getLogger(frame_create_tbs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frame_create_tbs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frame_create_tbs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frame_create_tbs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frame_create_tbs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add_tbs;
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_chooser;
    private javax.swing.JButton btn_create_tbs;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txt_data_name;
    private javax.swing.JTextField txt_size;
    private javax.swing.JTextField txt_tbs_name;
    // End of variables declaration//GEN-END:variables
}

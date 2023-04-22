
package qlbangiayapp;

import java.sql.*;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frame_sanpham extends javax.swing.JFrame {

    Connection connection;
    
    public frame_sanpham() {
        initComponents();
    }

    public frame_sanpham(Connection conn) {
        initComponents();
        initComponents();
        this.setLocationRelativeTo(null);
        connection=conn;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cbo_thuoghieu = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_sanpham = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Thuong hieu");

        cbo_thuoghieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_thuoghieuActionPerformed(evt);
            }
        });

        tbl_sanpham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbl_sanpham);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 797, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbo_thuoghieu, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbo_thuoghieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(150, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbo_thuoghieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_thuoghieuActionPerformed
        String tenth =(String) cbo_thuoghieu.getSelectedItem();
        try{
            String sql= "SELECT * FROM SYSTEM.SANPHAM WHERE MATH=(SELECT MATH FROM SYSTEM.THUONGHIEU WHERE TENTH='"+tenth+"')";
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(sql);
            DefaultTableModel model = new DefaultTableModel();
            model.setColumnIdentifiers(new String[]{"MAGIAY","TEN GIAY","TON","GIA","SIZE","CHAT LIEU","TH"});
            while(rs.next()){
                String magiay = rs.getString("MAGIAY");
                String ten= rs.getString("TENGIAY");
                int ton= rs.getInt("SLGTON");
                double gia= rs.getDouble("GIA");
                int size = rs.getInt("SIZEGIAY");
                String chatlieu = rs.getString("CHATLIEU");
                String th= rs.getString("MATH");
                model.addRow(new Object[]{magiay, ten, ton, gia, size, chatlieu, th});
                
            }        
            st.close();
            rs.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
            return;
        }
    }//GEN-LAST:event_cbo_thuoghieuActionPerformed

    private void load_thuonghieu(){
        try{
            String sql="select * from SYSTEM.THUONGHIEU";
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                
                cbo_thuoghieu.addItem(rs.getString("TENTH"));
            }        
            st.close();
            rs.close();
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
            java.util.logging.Logger.getLogger(frame_sanpham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frame_sanpham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frame_sanpham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frame_sanpham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frame_sanpham().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbo_thuoghieu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_sanpham;
    // End of variables declaration//GEN-END:variables
}

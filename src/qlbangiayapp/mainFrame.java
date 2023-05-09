
package qlbangiayapp;

import java.sql.*;
import java.sql.Connection;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import oracle.sql.TIMESTAMP;


public class mainFrame extends javax.swing.JFrame {
    Connection connection;
    //contructor
    public mainFrame() {
        initComponents();
        this.setLocationRelativeTo(null);  
        
    }
    public mainFrame(String username, String password, Connection conn) {
        connection=conn;
        initComponents();
        this.setLocationRelativeTo(null);
        userLabel.setText(username);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        init_blank();        
        set_label_last_login(username);
        txt_username.setText(username);       
    }
    //init blank
    private void init_blank(){
        panel_system.setVisible(false);
        panel_user.setVisible(false);
        panel_audit.setVisible(false);
        panel_role.setVisible(false);        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialog_create_role = new javax.swing.JDialog();
        jLabel9 = new javax.swing.JLabel();
        txt_role_name = new javax.swing.JTextField();
        btn_create_role_2 = new javax.swing.JButton();
        dialog_kill_session = new javax.swing.JDialog();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_sid = new javax.swing.JTextField();
        txt_serial = new javax.swing.JTextField();
        btn_kill = new javax.swing.JButton();
        dialog_doimk = new javax.swing.JDialog();
        txt_username = new javax.swing.JTextField();
        txt_password = new javax.swing.JTextField();
        btn_doimk_2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        panel_main = new javax.swing.JPanel();
        panel_title = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        panel_menu = new javax.swing.JPanel();
        userLabel = new javax.swing.JLabel();
        lbl_1 = new javax.swing.JLabel();
        lbl_lastlogin = new javax.swing.JLabel();
        menu_panel_admin = new javax.swing.JPanel();
        btn_system = new javax.swing.JButton();
        btn_user = new javax.swing.JButton();
        btn_role = new javax.swing.JButton();
        btn_audit = new javax.swing.JButton();
        menu_panel_table = new javax.swing.JPanel();
        btn_tbl_khachhang = new javax.swing.JButton();
        btn_tbl_sanpham = new javax.swing.JButton();
        btn_tbl_hoadon = new javax.swing.JButton();
        btn_tbl_phieunhap = new javax.swing.JButton();
        btn_logout = new javax.swing.JButton();
        btn_doimk = new javax.swing.JButton();
        panel_work = new javax.swing.JPanel();
        panel_system = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableHethong = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lbl_instance = new javax.swing.JLabel();
        lbl_database = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btn_datafile = new javax.swing.JButton();
        btn_controlfile = new javax.swing.JButton();
        btn_sga = new javax.swing.JButton();
        btn_session = new javax.swing.JButton();
        btn_tbs = new javax.swing.JButton();
        btn_create_tbs = new javax.swing.JButton();
        btn_kill_session = new javax.swing.JButton();
        panel_user = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        cbo_user = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_user = new javax.swing.JTable();
        btn_lock_user = new javax.swing.JButton();
        btn_delete_user = new javax.swing.JButton();
        btn_create_user = new javax.swing.JButton();
        btn_unlock_user = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        cbo_profile = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        table_profiles = new javax.swing.JTable();
        btn_desc_profile = new javax.swing.JButton();
        btn_user_in_profile = new javax.swing.JButton();
        btn_delete_profilr = new javax.swing.JButton();
        btn_create_profile = new javax.swing.JButton();
        panel_audit = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        table_audit = new javax.swing.JTable();
        btn_audit_log = new javax.swing.JButton();
        btn_audit_hoadon = new javax.swing.JButton();
        btn_audit_cthoadon = new javax.swing.JButton();
        btn_audit_sanpham = new javax.swing.JButton();
        panel_role = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cbo_role = new javax.swing.JComboBox<>();
        cbo_user_2 = new javax.swing.JComboBox<>();
        btn_granted_role_role = new javax.swing.JButton();
        btn_privs_role = new javax.swing.JButton();
        btn_granted_role_user = new javax.swing.JButton();
        btn_privs_user = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        table_privs = new javax.swing.JTable();
        btn_create_new_role = new javax.swing.JButton();
        btn_grant_revoke = new javax.swing.JButton();
        btn_delete_role = new javax.swing.JButton();
        btn_tblprivs_role = new javax.swing.JButton();
        btn_tblprivs_user = new javax.swing.JButton();

        dialog_create_role.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        dialog_create_role.setTitle("Create New Role");
        dialog_create_role.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        dialog_create_role.setMinimumSize(new java.awt.Dimension(350, 130));
        dialog_create_role.setModal(true);

        jLabel9.setText("Role Name");

        btn_create_role_2.setText("Create");
        btn_create_role_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_create_role_2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dialog_create_roleLayout = new javax.swing.GroupLayout(dialog_create_role.getContentPane());
        dialog_create_role.getContentPane().setLayout(dialog_create_roleLayout);
        dialog_create_roleLayout.setHorizontalGroup(
            dialog_create_roleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialog_create_roleLayout.createSequentialGroup()
                .addGroup(dialog_create_roleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dialog_create_roleLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(txt_role_name, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dialog_create_roleLayout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(btn_create_role_2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        dialog_create_roleLayout.setVerticalGroup(
            dialog_create_roleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialog_create_roleLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(dialog_create_roleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txt_role_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_create_role_2)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        dialog_kill_session.setMinimumSize(new java.awt.Dimension(300, 150));

        jLabel5.setText("SID");

        jLabel6.setText("Serial");

        btn_kill.setText("Kill");
        btn_kill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_killActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dialog_kill_sessionLayout = new javax.swing.GroupLayout(dialog_kill_session.getContentPane());
        dialog_kill_session.getContentPane().setLayout(dialog_kill_sessionLayout);
        dialog_kill_sessionLayout.setHorizontalGroup(
            dialog_kill_sessionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialog_kill_sessionLayout.createSequentialGroup()
                .addGroup(dialog_kill_sessionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dialog_kill_sessionLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(dialog_kill_sessionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(dialog_kill_sessionLayout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txt_serial))
                            .addGroup(dialog_kill_sessionLayout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txt_sid, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(dialog_kill_sessionLayout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(btn_kill)))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        dialog_kill_sessionLayout.setVerticalGroup(
            dialog_kill_sessionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialog_kill_sessionLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(dialog_kill_sessionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_sid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(dialog_kill_sessionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_serial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(btn_kill)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        txt_username.setEnabled(false);

        btn_doimk_2.setText("Change");
        btn_doimk_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_doimk_2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Username");

        jLabel12.setText("Password");

        javax.swing.GroupLayout dialog_doimkLayout = new javax.swing.GroupLayout(dialog_doimk.getContentPane());
        dialog_doimk.getContentPane().setLayout(dialog_doimkLayout);
        dialog_doimkLayout.setHorizontalGroup(
            dialog_doimkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialog_doimkLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dialog_doimkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dialog_doimkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_username)
                    .addComponent(txt_password, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE))
                .addGap(15, 15, 15))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialog_doimkLayout.createSequentialGroup()
                .addContainerGap(140, Short.MAX_VALUE)
                .addComponent(btn_doimk_2)
                .addGap(88, 88, 88))
        );
        dialog_doimkLayout.setVerticalGroup(
            dialog_doimkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialog_doimkLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(dialog_doimkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(26, 26, 26)
                .addGroup(dialog_doimkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(28, 28, 28)
                .addComponent(btn_doimk_2)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 640));

        panel_main.setPreferredSize(new java.awt.Dimension(1050, 640));

        panel_title.setBackground(new java.awt.Color(51, 51, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("HỆ THỐNG QUẢN LÝ DỮ LIỆU SHOP BÁN GIÀY");

        javax.swing.GroupLayout panel_titleLayout = new javax.swing.GroupLayout(panel_title);
        panel_title.setLayout(panel_titleLayout);
        panel_titleLayout.setHorizontalGroup(
            panel_titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_titleLayout.createSequentialGroup()
                .addContainerGap(480, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(155, 155, 155))
        );
        panel_titleLayout.setVerticalGroup(
            panel_titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_titleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        panel_menu.setBackground(new java.awt.Color(0, 153, 153));
        panel_menu.setMaximumSize(new java.awt.Dimension(250, 500));
        panel_menu.setPreferredSize(new java.awt.Dimension(210, 495));

        userLabel.setText("username");

        lbl_1.setText("Last Login :");

        lbl_lastlogin.setText("jLabel7");

        menu_panel_admin.setBackground(new java.awt.Color(0, 153, 153));
        menu_panel_admin.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)), "Administrator"));

        btn_system.setText("System");
        btn_system.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_systemActionPerformed(evt);
            }
        });

        btn_user.setText("User & Profile");
        btn_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_userActionPerformed(evt);
            }
        });

        btn_role.setText("Role");
        btn_role.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_roleActionPerformed(evt);
            }
        });

        btn_audit.setText("Audit");
        btn_audit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_auditActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menu_panel_adminLayout = new javax.swing.GroupLayout(menu_panel_admin);
        menu_panel_admin.setLayout(menu_panel_adminLayout);
        menu_panel_adminLayout.setHorizontalGroup(
            menu_panel_adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_panel_adminLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menu_panel_adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_audit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_system, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_user, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_role, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        menu_panel_adminLayout.setVerticalGroup(
            menu_panel_adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_panel_adminLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(btn_system)
                .addGap(18, 18, 18)
                .addComponent(btn_user)
                .addGap(18, 18, 18)
                .addComponent(btn_role)
                .addGap(18, 18, 18)
                .addComponent(btn_audit)
                .addContainerGap())
        );

        menu_panel_table.setBackground(new java.awt.Color(0, 153, 153));
        menu_panel_table.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)), "Table"));

        btn_tbl_khachhang.setText("KHACHHANG");
        btn_tbl_khachhang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tbl_khachhangActionPerformed(evt);
            }
        });

        btn_tbl_sanpham.setText("THUONGHIEU & SANPHAM");
        btn_tbl_sanpham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tbl_sanphamActionPerformed(evt);
            }
        });

        btn_tbl_hoadon.setText("HOADON");
        btn_tbl_hoadon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tbl_hoadonActionPerformed(evt);
            }
        });

        btn_tbl_phieunhap.setText("PHIEU NHAP");

        javax.swing.GroupLayout menu_panel_tableLayout = new javax.swing.GroupLayout(menu_panel_table);
        menu_panel_table.setLayout(menu_panel_tableLayout);
        menu_panel_tableLayout.setHorizontalGroup(
            menu_panel_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_panel_tableLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menu_panel_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_tbl_khachhang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_tbl_sanpham, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                    .addComponent(btn_tbl_hoadon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_tbl_phieunhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        menu_panel_tableLayout.setVerticalGroup(
            menu_panel_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_panel_tableLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_tbl_khachhang)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_tbl_sanpham)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_tbl_hoadon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_tbl_phieunhap)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        btn_logout.setText("Log Out");
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });

        btn_doimk.setText("Doi MK");
        btn_doimk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_doimkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_menuLayout = new javax.swing.GroupLayout(panel_menu);
        panel_menu.setLayout(panel_menuLayout);
        panel_menuLayout.setHorizontalGroup(
            panel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_menuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_menuLayout.createSequentialGroup()
                        .addComponent(userLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(78, 78, 78))
                    .addComponent(lbl_lastlogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panel_menuLayout.createSequentialGroup()
                        .addComponent(lbl_1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(menu_panel_admin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menu_panel_table, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(panel_menuLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(panel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_doimk)
                    .addComponent(btn_logout))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_menuLayout.setVerticalGroup(
            panel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_menuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(userLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(menu_panel_admin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(menu_panel_table, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_doimk)
                .addGap(18, 18, 18)
                .addComponent(btn_logout)
                .addGap(18, 18, 18)
                .addComponent(lbl_1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_lastlogin)
                .addGap(14, 14, 14))
        );

        panel_work.setPreferredSize(new java.awt.Dimension(800, 500));

        panel_system.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)), "System"));
        panel_system.setPreferredSize(new java.awt.Dimension(800, 500));

        tableHethong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tableHethong);

        jLabel10.setText("Instance         :");

        jLabel11.setText("Database       :");

        lbl_instance.setText("jLabel12");

        lbl_database.setText("jLabel13");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)), "Function"));

        btn_datafile.setText("Datafile");
        btn_datafile.setPreferredSize(new java.awt.Dimension(100, 25));
        btn_datafile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_datafileActionPerformed(evt);
            }
        });

        btn_controlfile.setText("Controlfile");
        btn_controlfile.setPreferredSize(new java.awt.Dimension(100, 25));
        btn_controlfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_controlfileActionPerformed(evt);
            }
        });

        btn_sga.setText("SGA");
        btn_sga.setMaximumSize(new java.awt.Dimension(80, 30));
        btn_sga.setMinimumSize(new java.awt.Dimension(80, 30));
        btn_sga.setPreferredSize(new java.awt.Dimension(100, 25));
        btn_sga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sgaActionPerformed(evt);
            }
        });

        btn_session.setText("Session");
        btn_session.setPreferredSize(new java.awt.Dimension(100, 25));
        btn_session.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sessionActionPerformed(evt);
            }
        });

        btn_tbs.setText("Tablespace");
        btn_tbs.setPreferredSize(new java.awt.Dimension(100, 25));
        btn_tbs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tbsActionPerformed(evt);
            }
        });

        btn_create_tbs.setText("Create TBS");
        btn_create_tbs.setPreferredSize(new java.awt.Dimension(100, 25));
        btn_create_tbs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_create_tbsActionPerformed(evt);
            }
        });

        btn_kill_session.setText("KIll Session");
        btn_kill_session.setPreferredSize(new java.awt.Dimension(100, 25));
        btn_kill_session.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kill_sessionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_sga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_datafile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_controlfile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_session, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_tbs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_create_tbs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_kill_session, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(222, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_session, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_tbs, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_controlfile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_sga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_datafile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_create_tbs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_kill_session, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panel_systemLayout = new javax.swing.GroupLayout(panel_system);
        panel_system.setLayout(panel_systemLayout);
        panel_systemLayout.setHorizontalGroup(
            panel_systemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_systemLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_systemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(panel_systemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_instance, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                    .addComponent(lbl_database, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel_systemLayout.setVerticalGroup(
            panel_systemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_systemLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_systemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(lbl_instance))
                .addGap(18, 18, 18)
                .addGroup(panel_systemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(lbl_database))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(144, 144, 144))
        );

        panel_user.setPreferredSize(new java.awt.Dimension(780, 500));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)), "User"));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("User");

        cbo_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_userActionPerformed(evt);
            }
        });

        table_user.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(table_user);

        btn_lock_user.setText("Lock");
        btn_lock_user.setPreferredSize(new java.awt.Dimension(120, 25));
        btn_lock_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_lock_userActionPerformed(evt);
            }
        });

        btn_delete_user.setText("Delete User");
        btn_delete_user.setPreferredSize(new java.awt.Dimension(120, 25));
        btn_delete_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_delete_userActionPerformed(evt);
            }
        });

        btn_create_user.setText("Create User");
        btn_create_user.setName(""); // NOI18N
        btn_create_user.setPreferredSize(new java.awt.Dimension(120, 25));
        btn_create_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_create_userActionPerformed(evt);
            }
        });

        btn_unlock_user.setText("Unlock");
        btn_unlock_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_unlock_userActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbo_user, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btn_create_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82)
                        .addComponent(btn_lock_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_unlock_user, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 171, Short.MAX_VALUE)
                        .addComponent(btn_delete_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbo_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btn_delete_user, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_lock_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_unlock_user)))
                    .addComponent(btn_create_user, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)), "Profile"));

        jLabel8.setText("Profiles");

        table_profiles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(table_profiles);

        btn_desc_profile.setText("Decribe Profile");
        btn_desc_profile.setPreferredSize(new java.awt.Dimension(120, 25));
        btn_desc_profile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_desc_profileActionPerformed(evt);
            }
        });

        btn_user_in_profile.setText("User in Profile");
        btn_user_in_profile.setPreferredSize(new java.awt.Dimension(120, 25));
        btn_user_in_profile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_user_in_profileActionPerformed(evt);
            }
        });

        btn_delete_profilr.setText("Delete Profile");
        btn_delete_profilr.setPreferredSize(new java.awt.Dimension(120, 25));
        btn_delete_profilr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_delete_profilrActionPerformed(evt);
            }
        });

        btn_create_profile.setText("Create Profile");
        btn_create_profile.setPreferredSize(new java.awt.Dimension(120, 25));
        btn_create_profile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_create_profileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbo_profile, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btn_desc_profile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_user_in_profile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_create_profile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_delete_profilr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cbo_profile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_desc_profile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_user_in_profile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_create_profile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_delete_profilr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout panel_userLayout = new javax.swing.GroupLayout(panel_user);
        panel_user.setLayout(panel_userLayout);
        panel_userLayout.setHorizontalGroup(
            panel_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_userLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panel_userLayout.setVerticalGroup(
            panel_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_userLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        panel_audit.setPreferredSize(new java.awt.Dimension(780, 500));

        table_audit.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(table_audit);

        btn_audit_log.setText("LOG");
        btn_audit_log.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_audit_logActionPerformed(evt);
            }
        });

        btn_audit_hoadon.setText("HOADON");
        btn_audit_hoadon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_audit_hoadonActionPerformed(evt);
            }
        });

        btn_audit_cthoadon.setText("CTHOADON");
        btn_audit_cthoadon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_audit_cthoadonActionPerformed(evt);
            }
        });

        btn_audit_sanpham.setText("SANPHAM");
        btn_audit_sanpham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_audit_sanphamActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_auditLayout = new javax.swing.GroupLayout(panel_audit);
        panel_audit.setLayout(panel_auditLayout);
        panel_auditLayout.setHorizontalGroup(
            panel_auditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_auditLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_auditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4)
                    .addGroup(panel_auditLayout.createSequentialGroup()
                        .addGap(0, 300, Short.MAX_VALUE)
                        .addComponent(btn_audit_log)
                        .addGap(57, 57, 57)
                        .addComponent(btn_audit_hoadon)
                        .addGap(53, 53, 53)
                        .addComponent(btn_audit_cthoadon)
                        .addGap(35, 35, 35)
                        .addComponent(btn_audit_sanpham)))
                .addContainerGap())
        );
        panel_auditLayout.setVerticalGroup(
            panel_auditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_auditLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(panel_auditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_audit_log)
                    .addComponent(btn_audit_hoadon)
                    .addComponent(btn_audit_cthoadon)
                    .addComponent(btn_audit_sanpham))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        panel_role.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)), "Roles & Privileges"));
        panel_role.setPreferredSize(new java.awt.Dimension(800, 500));

        jLabel4.setText("Role");

        jLabel7.setText("User");

        btn_granted_role_role.setText("Granted Role of Role");
        btn_granted_role_role.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_granted_role_roleActionPerformed(evt);
            }
        });

        btn_privs_role.setText("Privilege of Role");
        btn_privs_role.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_privs_roleActionPerformed(evt);
            }
        });

        btn_granted_role_user.setText("Granted Role of User");
        btn_granted_role_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_granted_role_userActionPerformed(evt);
            }
        });

        btn_privs_user.setText("Privilege of User");
        btn_privs_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_privs_userActionPerformed(evt);
            }
        });

        table_privs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane5.setViewportView(table_privs);

        btn_create_new_role.setText("Create New Role");
        btn_create_new_role.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_create_new_roleActionPerformed(evt);
            }
        });

        btn_grant_revoke.setText("Grant/Revoke");
        btn_grant_revoke.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_grant_revokeActionPerformed(evt);
            }
        });

        btn_delete_role.setText("Delete Role");
        btn_delete_role.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_delete_roleActionPerformed(evt);
            }
        });

        btn_tblprivs_role.setText("Table Privs of Role");
        btn_tblprivs_role.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tblprivs_roleActionPerformed(evt);
            }
        });

        btn_tblprivs_user.setText("Table Privs of User");
        btn_tblprivs_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tblprivs_userActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_roleLayout = new javax.swing.GroupLayout(panel_role);
        panel_role.setLayout(panel_roleLayout);
        panel_roleLayout.setHorizontalGroup(
            panel_roleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_roleLayout.createSequentialGroup()
                .addGroup(panel_roleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_roleLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane5))
                    .addGroup(panel_roleLayout.createSequentialGroup()
                        .addGroup(panel_roleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_roleLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(panel_roleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(panel_roleLayout.createSequentialGroup()
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(cbo_user_2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(panel_roleLayout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(cbo_role, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(29, 29, 29)
                                .addGroup(panel_roleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_granted_role_role)
                                    .addComponent(btn_granted_role_user))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel_roleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panel_roleLayout.createSequentialGroup()
                                        .addComponent(btn_privs_role)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_tblprivs_role))
                                    .addGroup(panel_roleLayout.createSequentialGroup()
                                        .addComponent(btn_privs_user)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_tblprivs_user))))
                            .addGroup(panel_roleLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btn_create_new_role)
                                .addGap(32, 32, 32)
                                .addComponent(btn_grant_revoke)
                                .addGap(30, 30, 30)
                                .addComponent(btn_delete_role)))
                        .addGap(0, 77, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panel_roleLayout.setVerticalGroup(
            panel_roleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_roleLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(panel_roleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbo_role, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_granted_role_role)
                    .addComponent(btn_privs_role)
                    .addComponent(btn_tblprivs_role))
                .addGap(19, 19, 19)
                .addGroup(panel_roleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cbo_user_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_granted_role_user)
                    .addComponent(btn_privs_user)
                    .addComponent(btn_tblprivs_user))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(panel_roleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_create_new_role)
                    .addComponent(btn_grant_revoke)
                    .addComponent(btn_delete_role))
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout panel_workLayout = new javax.swing.GroupLayout(panel_work);
        panel_work.setLayout(panel_workLayout);
        panel_workLayout.setHorizontalGroup(
            panel_workLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_system, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panel_workLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panel_user, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE))
            .addGroup(panel_workLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_workLayout.createSequentialGroup()
                    .addComponent(panel_audit, javax.swing.GroupLayout.DEFAULT_SIZE, 794, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(panel_workLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_workLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panel_role, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        panel_workLayout.setVerticalGroup(
            panel_workLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_system, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE)
            .addGroup(panel_workLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panel_user, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE))
            .addGroup(panel_workLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_workLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panel_audit, javax.swing.GroupLayout.DEFAULT_SIZE, 507, Short.MAX_VALUE)))
            .addGroup(panel_workLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_workLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panel_role, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout panel_mainLayout = new javax.swing.GroupLayout(panel_main);
        panel_main.setLayout(panel_mainLayout);
        panel_mainLayout.setHorizontalGroup(
            panel_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panel_mainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_menu, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_work, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panel_mainLayout.setVerticalGroup(
            panel_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_mainLayout.createSequentialGroup()
                .addComponent(panel_title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_mainLayout.createSequentialGroup()
                        .addComponent(panel_work, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 79, Short.MAX_VALUE))
                    .addGroup(panel_mainLayout.createSequentialGroup()
                        .addComponent(panel_menu, javax.swing.GroupLayout.DEFAULT_SIZE, 586, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //panel menu
    //button he thong
    private void btn_systemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_systemActionPerformed
        panel_system.setVisible(true);
        panel_user.setVisible(false);
        panel_audit.setVisible(false);
        panel_role.setVisible(false);  
        set_label_instance();
        set_label_database();
    }//GEN-LAST:event_btn_systemActionPerformed
    
    //button user
    private void btn_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_userActionPerformed
        panel_system.setVisible(false);
        panel_user.setVisible(true);
        panel_audit.setVisible(false);
        panel_role.setVisible(false);
        
        
        cbo_user.removeAllItems();
        cbo_profile.removeAllItems();
        load_data_to_cbouser();
        load_data_to_cbo_profile();        
    }//GEN-LAST:event_btn_userActionPerformed
    
    //button audit
    private void btn_auditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_auditActionPerformed
        panel_system.setVisible(false);
        panel_user.setVisible(false);
        panel_audit.setVisible(true);
        panel_role.setVisible(false);        
    }//GEN-LAST:event_btn_auditActionPerformed
    
    //button role
    private void btn_roleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_roleActionPerformed
        panel_system.setVisible(false);
        panel_user.setVisible(false);
        panel_audit.setVisible(false);
        panel_role.setVisible(true);        
        
        cbo_role.removeAllItems();
        cbo_user_2.removeAllItems();
        load_data_to_cbo_role();
        load_data_to_cbo_user_2();
    }//GEN-LAST:event_btn_roleActionPerformed
	
    //panel system
    //button sga
    private void btn_sgaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sgaActionPerformed
        
        try{
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("select name, value from v$sga");
            DefaultTableModel model = new DefaultTableModel();
            model.setColumnIdentifiers(new String[]{"Name", "Value"});
            while(rs.next()){
                String name = rs.getString("NAME");
                long value = rs.getLong("VALUE");
                model.addRow(new Object[]{name, value});             
            }
            rs.close();
            stmt.close();
            tableHethong.setModel(model);
       }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
            return;
        }
        
    }//GEN-LAST:event_btn_sgaActionPerformed

    //button datafile
    private void btn_datafileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_datafileActionPerformed
        try{
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("select tablespace_name,file_name from dba_data_files ");
            DefaultTableModel model = new DefaultTableModel();
            model.setColumnIdentifiers(new String[]{"Tablespace","Datafile"});
            while(rs.next()){
                String tbs_name = rs.getString("TABLESPACE_NAME");
                String df_name = rs.getString("FILE_NAME");                
                model.addRow(new Object[]{tbs_name,df_name});             
            }
            rs.close();
            stmt.close();
            tableHethong.setModel(model);
       }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
            return;
        }
    }//GEN-LAST:event_btn_datafileActionPerformed
    
    //button controlfile
    private void btn_controlfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_controlfileActionPerformed
        try{
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("select name from v$controlfile");
            DefaultTableModel model = new DefaultTableModel();
            model.setColumnIdentifiers(new String[]{"Controlfile"});
            while(rs.next()){
                String name = rs.getString("NAME");                
                model.addRow(new Object[]{name});             
            }
            rs.close();
            stmt.close();
            tableHethong.setModel(model);
       }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
            return;
        }
    }//GEN-LAST:event_btn_controlfileActionPerformed
    
    //button session
    private void btn_sessionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sessionActionPerformed
        try{
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("select sid, serial#, username, program from v$session where type!='BACKGROUND'");
            DefaultTableModel model = new DefaultTableModel();
            model.setColumnIdentifiers(new String[]{"sid", "serial","username","program"});
            while(rs.next()){
                int sid= rs.getInt("SID");
                int serial = rs.getInt("SERIAL#");
                String username = rs.getString("USERNAME");
                String program = rs.getString("PROGRAM");
                model.addRow(new Object[]{sid,serial,username,program});             
            }
            rs.close();
            stmt.close();
            tableHethong.setModel(model);
       }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
            return;
        }
    }//GEN-LAST:event_btn_sessionActionPerformed
    
    //button kill session
    private void btn_kill_sessionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kill_sessionActionPerformed
        dialog_kill_session.setSize(350,150);
        dialog_kill_session.setLocationRelativeTo(null);
        dialog_kill_session.setVisible(true);
    }//GEN-LAST:event_btn_kill_sessionActionPerformed
    
    //button tablespace
    private void btn_tbsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tbsActionPerformed
        try{
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("select name from v$tablespace");
            DefaultTableModel model = new DefaultTableModel();
            model.setColumnIdentifiers(new String[]{"Tablespace Name"});
            while(rs.next()){
                String name = rs.getString("NAME");                
                model.addRow(new Object[]{name});             
            }
            rs.close();
            stmt.close();
            tableHethong.setModel(model);
       }catch(SQLException e){
                JOptionPane.showMessageDialog(null, e);
                return;
        }
    }//GEN-LAST:event_btn_tbsActionPerformed
    
    //button create tablespace
    private void btn_create_tbsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_create_tbsActionPerformed
        frame_create_tbs create = new frame_create_tbs(connection);
        create.setVisible(true);        
    }//GEN-LAST:event_btn_create_tbsActionPerformed
    
    //panel user
    // cbo_user index change
    private void cbo_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_userActionPerformed
        try{
            Statement st = connection.createStatement();
            String value = (String)cbo_user.getSelectedItem();
            String sql= "select username, created, expiry_date, account_status, last_login, profile, default_tablespace from dba_users where username='"+value+"'";
            ResultSet rs = st.executeQuery(sql);
            DefaultTableModel model = new DefaultTableModel();
            model.setColumnIdentifiers(new String[]{"Username","Created","Expiry Date","Status","Last Login","Profile","Tablespace"});
            while(rs.next()){
                String username = rs.getString("USERNAME");
                Date created = rs.getDate("CREATED"); 
                Date expiry_date = rs.getDate("EXPIRY_DATE");
                String status = rs.getString("ACCOUNT_STATUS");
                Timestamp lastlogin = rs.getTimestamp("LAST_LOGIN");
                String profile = rs.getString("PROFILE");
                String tablespace = rs.getString("DEFAULT_TABLESPACE");
                model.addRow(new Object[]{username, created, expiry_date, status, lastlogin, profile,tablespace});             
            }
            rs.close();
            st.close();
            table_user.setModel(model);
        }catch(SQLException e){
                JOptionPane.showMessageDialog(null, e);
                return;
        }
    }//GEN-LAST:event_cbo_userActionPerformed
    
    //button create user
    private void btn_create_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_create_userActionPerformed
        frame_create_user create = new frame_create_user(connection);
        create.setVisible(true);
    }//GEN-LAST:event_btn_create_userActionPerformed
    
    //btn_delete_user
    private void btn_delete_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_delete_userActionPerformed
        String username = (String)cbo_user.getSelectedItem();
        int result = JOptionPane.showConfirmDialog(null, "Do you want to delete "+username+" ?","Delete",JOptionPane.WARNING_MESSAGE,JOptionPane.YES_NO_OPTION);
        if(result==JOptionPane.YES_OPTION){
            try{
                String drop = "drop user "+username+" cascade";
                Statement st= connection.createStatement();
                int rs = st.executeUpdate(drop);
                if(rs==0){
                    JOptionPane.showMessageDialog(null, "Drop User Success!");
                    cbo_user.removeAllItems();
                    load_data_to_cbouser();
                }
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, e);
                return;
            }
        }
        else{
            return;
        }
    }//GEN-LAST:event_btn_delete_userActionPerformed

    
    //button create profile
    private void btn_create_profileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_create_profileActionPerformed
       frame_create_profile create =  new frame_create_profile(connection);
       create.setVisible(true);
    }//GEN-LAST:event_btn_create_profileActionPerformed

	//button lock user    
	private void btn_lock_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lock_userActionPerformed
        try{
            String user=(String)cbo_user.getSelectedItem();
            String sql="alter user "+user+" account lock";
            Statement st = connection.createStatement();
            int result = JOptionPane.showConfirmDialog(null, "Do you want to lock "+user+" ?","Lock User",JOptionPane.WARNING_MESSAGE,JOptionPane.YES_NO_OPTION);
            if(result==JOptionPane.YES_OPTION){
                int rs = st.executeUpdate(sql);
                if(rs==0){JOptionPane.showMessageDialog(null,"Lock "+user+ " Success!");}
            }
        }catch(SQLException e){
                JOptionPane.showMessageDialog(null, e);
                return;
        }
    }//GEN-LAST:event_btn_lock_userActionPerformed
	
    //button unlock user
    private void btn_unlock_userActionPerformed(java.awt.event.ActionEvent evt) {                                                
        try{
            String user=(String)cbo_user.getSelectedItem();
            String sql="alter user "+user+" account unlock";
            Statement st = connection.createStatement();
            int result = JOptionPane.showConfirmDialog(null, "Do you want to unlock "+user+" ?","Unlock User",JOptionPane.WARNING_MESSAGE,JOptionPane.YES_NO_OPTION);
            if(result==JOptionPane.YES_OPTION){
                int rs = st.executeUpdate(sql);
                if(rs==0){JOptionPane.showMessageDialog(null,"Unlock "+user+ " Success!");}
            }
        }catch(SQLException e){
                JOptionPane.showMessageDialog(null, e);
                return;
        }
    }                                                
	
    //button delete profile
    private void btn_delete_profilrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_delete_profilrActionPerformed
        String profile = (String)cbo_profile.getSelectedItem();
        int result = JOptionPane.showConfirmDialog(null, "Do you want to delete "+profile+" ?","Delete",JOptionPane.WARNING_MESSAGE,JOptionPane.YES_NO_OPTION);
        if(result==JOptionPane.YES_OPTION){
            if(profile=="DEFAULT"){
                JOptionPane.showMessageDialog(null, "Cannot Drop DEFAULT PROFILE!");
            }
            else{
                try{
                String drop = "drop profile "+profile;
                Statement st= connection.createStatement();
                int rs = st.executeUpdate(drop);
                if(rs==0){
                    JOptionPane.showMessageDialog(null, "Drop Profile Success!");
                    cbo_profile.removeAllItems();
                    load_data_to_cbo_profile();
                }
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, e);
                return;
            }
            }            
        }
        else{
            return;
        }
    }//GEN-LAST:event_btn_delete_profilrActionPerformed

   //button user in profile
    private void btn_user_in_profileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_user_in_profileActionPerformed
        try{
            Statement st = connection.createStatement();
            String value = (String)cbo_profile.getSelectedItem();
            String sql= "select USERNAME from DBA_USERS  where PROFILE ='"+value+"'";
            ResultSet rs = st.executeQuery(sql);
            DefaultTableModel model = new DefaultTableModel();
            model.setColumnIdentifiers(new String[]{"Username"});
            while(rs.next()){
                String name= rs.getString("USERNAME");
                
                model.addRow(new Object[]{name});             
            }
            rs.close();
            st.close();
            table_profiles.setModel(model);
        }catch(SQLException e){
                JOptionPane.showMessageDialog(null, e);
                return;
        }
    }//GEN-LAST:event_btn_user_in_profileActionPerformed
    
    //button describe profile
    private void btn_desc_profileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_desc_profileActionPerformed
        try{
            Statement st = connection.createStatement();
            String value = (String)cbo_profile.getSelectedItem();
            String sql= "select RESOURCE_NAME, RESOURCE_TYPE, LIMIT from DBA_PROFILES  where PROFILE ='"+value+"'";
            ResultSet rs = st.executeQuery(sql);
            DefaultTableModel model = new DefaultTableModel();
            model.setColumnIdentifiers(new String[]{"Resource Name","Resource Type","Limit"});
            while(rs.next()){
                String name= rs.getString("RESOURCE_NAME");
                String type= rs.getString("RESOURCE_TYPE");
                String limit =rs.getString("LIMIT");
                model.addRow(new Object[]{name, type, limit});             
            }
            rs.close();
            st.close();
            table_profiles.setModel(model);
        }catch(SQLException e){
                JOptionPane.showMessageDialog(null, e);
                return;
        }
    }//GEN-LAST:event_btn_desc_profileActionPerformed

    //panel role
    //button granted role of role
    private void btn_granted_role_roleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_granted_role_roleActionPerformed
        String grantee = (String) cbo_role.getSelectedItem();
        try{
            Statement st = connection.createStatement();            
            String sql= "select GRANTED_ROLE from DBA_ROLE_PRIVS where GRANTEE='"+grantee+"'";
            ResultSet rs = st.executeQuery(sql);
            DefaultTableModel model = new DefaultTableModel();
            model.setColumnIdentifiers(new String[]{"Role Name"});
            while(rs.next()){
                
                String granted= rs.getString("GRANTED_ROLE");                
                model.addRow(new Object[]{granted});             
            }
            rs.close();
            st.close();
            table_privs.setModel(model);
        }catch(SQLException e){
                JOptionPane.showMessageDialog(null, e);
                return;
        }
    }//GEN-LAST:event_btn_granted_role_roleActionPerformed
    
    //button privilege of a role
    private void btn_privs_roleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_privs_roleActionPerformed
        String grantee = (String)cbo_role.getSelectedItem();
        try{
            Statement st = connection.createStatement();            
            String sql= "select PRIVILEGE from DBA_SYS_PRIVS where GRANTEE='"+grantee+"'";
            ResultSet rs = st.executeQuery(sql);
            DefaultTableModel model = new DefaultTableModel();
            model.setColumnIdentifiers(new String[]{"Privilege"});
            while(rs.next()){
                
                String privilege = rs.getString("PRIVILEGE");                
                model.addRow(new Object[]{privilege});             
            }
            rs.close();
            st.close();
            table_privs.setModel(model);
        }catch(SQLException e){
                JOptionPane.showMessageDialog(null, e);
                return;
        }
    }//GEN-LAST:event_btn_privs_roleActionPerformed
    
    //button granted role of a user
    private void btn_granted_role_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_granted_role_userActionPerformed
        String user = (String) cbo_user_2.getSelectedItem();
        try{
            Statement st = connection.createStatement();            
            String sql= "select GRANTED_ROLE from DBA_ROLE_PRIVS where GRANTEE='"+user+"'";
            ResultSet rs = st.executeQuery(sql);
            DefaultTableModel model = new DefaultTableModel();
            model.setColumnIdentifiers(new String[]{"Role Name"});
            while(rs.next()){                
                String granted= rs.getString("GRANTED_ROLE");                
                model.addRow(new Object[]{granted});             
            }
            rs.close();
            st.close();
            table_privs.setModel(model);
        }catch(SQLException e){
                JOptionPane.showMessageDialog(null, e);
                return;
        }
    }//GEN-LAST:event_btn_granted_role_userActionPerformed
    
    //button privilege of a user
    private void btn_privs_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_privs_userActionPerformed
        String user = (String)cbo_user_2.getSelectedItem();
        try{
            Statement st = connection.createStatement();            
            String sql= "select PRIVILEGE from DBA_SYS_PRIVS where GRANTEE='"+user+"'";
            ResultSet rs = st.executeQuery(sql);
            DefaultTableModel model = new DefaultTableModel();
            model.setColumnIdentifiers(new String[]{"Privilege"});
            while(rs.next()){                
                String privilege = rs.getString("PRIVILEGE");                
                model.addRow(new Object[]{privilege});             
            }
            rs.close();
            st.close();
            table_privs.setModel(model);
        }catch(SQLException e){
                JOptionPane.showMessageDialog(null, e);
                return;
        }
    }//GEN-LAST:event_btn_privs_userActionPerformed
    
    //button create new role
    private void btn_create_new_roleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_create_new_roleActionPerformed
        dialog_create_role.setSize(350, 150);
        dialog_create_role.setLocationRelativeTo(null);
        dialog_create_role.setVisible(true);
    }//GEN-LAST:event_btn_create_new_roleActionPerformed
    
    //button create role in dialog
    private void btn_create_role_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_create_role_2ActionPerformed
        try{
            String sql="create role "+txt_role_name.getText();
            Statement st = connection.createStatement();
            int rs= st.executeUpdate(sql);
            if(rs==0){
                JOptionPane.showMessageDialog(null,"Create New Role Success!");
                cbo_role.removeAllItems();
                load_data_to_cbo_role();
            }
        }catch(SQLException e){
                JOptionPane.showMessageDialog(null, e);
                return;
        }
    }//GEN-LAST:event_btn_create_role_2ActionPerformed
    
    //button grant_revoke
    private void btn_grant_revokeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_grant_revokeActionPerformed
        frame_grant_revoke frame = new frame_grant_revoke(connection);
        frame.setVisible(true);
    }//GEN-LAST:event_btn_grant_revokeActionPerformed
    
    //button delete role
    private void btn_delete_roleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_delete_roleActionPerformed
        
    }//GEN-LAST:event_btn_delete_roleActionPerformed
    
    //button table privilege of role
    private void btn_tblprivs_roleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tblprivs_roleActionPerformed
        String grantee = (String) cbo_role.getSelectedItem();
        try{
            Statement st = connection.createStatement();            
            String sql= "select TABLE_NAME, PRIVILEGE from DBA_TAB_PRIVS where GRANTEE='"+grantee+"'";
            ResultSet rs = st.executeQuery(sql);
            DefaultTableModel model = new DefaultTableModel();
            model.setColumnIdentifiers(new String[]{"Table Name", "Privilege"});
            while(rs.next()){                
                String table= rs.getString("TABLE_NAME");
                String priv = rs.getString("PRIVILEGE");
                model.addRow(new Object[]{table,priv});             
            }
            rs.close();
            st.close();
            table_privs.setModel(model);
        }catch(SQLException e){
                JOptionPane.showMessageDialog(null, e);
                return;
        }
    }//GEN-LAST:event_btn_tblprivs_roleActionPerformed
    
    //button table privilege of user
    private void btn_tblprivs_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tblprivs_userActionPerformed
        String grantee = (String) cbo_user_2.getSelectedItem();
        try{
            Statement st = connection.createStatement();            
            String sql= "select TABLE_NAME, PRIVILEGE from DBA_TAB_PRIVS where GRANTEE='"+grantee+"'";
            ResultSet rs = st.executeQuery(sql);
            DefaultTableModel model = new DefaultTableModel();
            model.setColumnIdentifiers(new String[]{"Table Name", "Privilege"});
            while(rs.next()){                
                String table= rs.getString("TABLE_NAME");
                String priv = rs.getString("PRIVILEGE");
                model.addRow(new Object[]{table,priv});             
            }
            rs.close();
            st.close();
            table_privs.setModel(model);
        }catch(SQLException e){
                JOptionPane.showMessageDialog(null, e);
                return;
        }
    }//GEN-LAST:event_btn_tblprivs_userActionPerformed
 
    // button table sanpham
    private void btn_tbl_sanphamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tbl_sanphamActionPerformed
        frame_sanpham sanpham = new frame_sanpham(connection);
        sanpham.setVisible(true);
    }//GEN-LAST:event_btn_tbl_sanphamActionPerformed
  
    //button table khachhang
    private void btn_tbl_khachhangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tbl_khachhangActionPerformed
        frame_khachhang khachhang = new frame_khachhang(connection);
        khachhang.setVisible(true);
    }//GEN-LAST:event_btn_tbl_khachhangActionPerformed
    
    //button table hoadon
    private void btn_tbl_hoadonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tbl_hoadonActionPerformed
        frame_hoadon hoadon = new frame_hoadon(connection);
        hoadon.setVisible(true);
    }//GEN-LAST:event_btn_tbl_hoadonActionPerformed

    private void btn_audit_logActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_audit_logActionPerformed
        try{
            Statement st = connection.createStatement();            
            String sql= "select * from audit_log";
            ResultSet rs = st.executeQuery(sql);
            DefaultTableModel model = new DefaultTableModel();
            model.setColumnIdentifiers(new String[]{"OPERATION","USERNAME","DATE_LOG"});
            while(rs.next()){                
                String operation = rs.getString("OPERATION");
                String username = rs.getString("USERNAME");
                Date time= rs.getDate("DATE_LOG");
                model.addRow(new Object[]{operation, username, time});             
            }
            rs.close();
            st.close();
            table_audit.setModel(model);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
            return;
        }
    }//GEN-LAST:event_btn_audit_logActionPerformed

    private void btn_audit_hoadonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_audit_hoadonActionPerformed
        try{
            Statement st = connection.createStatement();            
            String sql= "select * from audit_hoadon";
            ResultSet rs = st.executeQuery(sql);
            DefaultTableModel model = new DefaultTableModel();
            model.setColumnIdentifiers(new String[]{"OPERATION","USERNAME","TIME","MAHD","MAKH_NEW","MAKH_OLD","NGAYBAN_NEW","NGAYBAN_OLD","TONGTIEN_NEW","TONGTIEN_OLD"});
            while(rs.next()){                
                String operation = rs.getString("OPERATION");
                String username = rs.getString("USERNAME");
                Date time= rs.getDate("ACTION_TIME");
                String mahd=rs.getString("MAHD");
                String makh_new = rs.getString("MAKH_NEW");
                String makh_old= rs.getString("MAKH_OLD");
                Date ngayban_new = rs.getDate("NGAYBAN_NEW");
                Date ngayban_old= rs.getDate("NGAYBAN_OLD");
                Double tongtien_new= rs.getDouble("TONGTIEN_NEW");
                Double tongtien_old= rs.getDouble("TONGTIEN_OLD");
                
                model.addRow(new Object[]{operation, username, time, mahd, makh_new, makh_old, ngayban_new, ngayban_old, tongtien_new, tongtien_old});             
            }
            rs.close();
            st.close();
            table_audit.setModel(model);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
            return;
        }
    }//GEN-LAST:event_btn_audit_hoadonActionPerformed

    private void btn_audit_cthoadonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_audit_cthoadonActionPerformed
        try{
            Statement st = connection.createStatement();            
            String sql= "select * from audit_cthoadon";
            ResultSet rs = st.executeQuery(sql);
            DefaultTableModel model = new DefaultTableModel();
            model.setColumnIdentifiers(new String[]{"OPERATION","USERNAME","TIME","MAHD","MAGIAY_NEW","MAGIAY_OLD","SLG_NEW","SLG_OLD"});
            while(rs.next()){                
                String operation = rs.getString("OPERATION");
                String username = rs.getString("USERNAME");
                Date time= rs.getDate("ACTION_TIME");
                String mahd= rs.getString("MAHD");
                String magiay_new= rs.getString("MAGIAY_NEW");
                String magiay_old= rs.getString("MAGIAY_OLD");
                int slg_new= rs.getInt("SLG_NEW");
                int slg_old=rs.getInt("SLG_old");
                
                model.addRow(new Object[]{operation, username, time, mahd, magiay_new, magiay_old, slg_new, slg_old});             
            }
            rs.close();
            st.close();
            table_audit.setModel(model);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
            return;
        }
    }//GEN-LAST:event_btn_audit_cthoadonActionPerformed

    private void btn_audit_sanphamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_audit_sanphamActionPerformed
        try{
            Statement st = connection.createStatement();            
            String sql= "select * from audit_sanpham";
            ResultSet rs = st.executeQuery(sql);
            DefaultTableModel model = new DefaultTableModel();
            model.setColumnIdentifiers(new String[]{"OPERATION","USERNAME","TIME","MAGIAY","TENGIAY_NEW","TENGIAY_OLD","SLGTON_NEW","SLGTON_OLD","GIA_NEW","GIA_OLD",
                                                    "SIZEGIAY_NEW","SIZEGIAY_OLD","CHATLIEU_NEW","CHATLIEU_OLD","MATH_NEW","MATH_OLD"});
            while(rs.next()){                
                String operation = rs.getString("OPERATION");
                String username = rs.getString("USERNAME");
                Date time= rs.getDate("ACTION_TIME");
                String magiay= rs.getString("MAGIAY");
                String tengiay_new= rs.getString("TENGIAY_NEW");
                String tengiay_old=rs.getString("TENGIAY_OLD");
                int slgton_new= rs.getInt("SLGTON_NEW");
                int slgton_old= rs.getInt("SLGTON_OLD");
                double gia_new= rs.getDouble("GIA_NEW");
                double gia_old= rs.getDouble("GIA_OLD");
                int sizegiay_new = rs.getInt("SIZEGIAY_NEW");
                int sizegiay_old=  rs.getInt("SIZEGIAY_OLD");
                String chatlieu_new= rs.getString("CHATLIEU_NEW");
                String chatlieu_old= rs.getString("CHATLIEU_OLD");
                String math_new=rs.getString("MATH_NEW");
                String math_old= rs.getString("MATH_OLD");
                
                model.addRow(new Object[]{operation, username, time, magiay, tengiay_new, tengiay_old, slgton_new, slgton_old, gia_new, gia_old, sizegiay_new, sizegiay_old, chatlieu_new, chatlieu_old, math_new, math_old});             
            }
            rs.close();
            st.close();
            table_audit.setModel(model);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
            return;
        }
    }//GEN-LAST:event_btn_audit_sanphamActionPerformed

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        this.dispose();
        loginFrame login = new loginFrame();
        login.setVisible(true);
    }//GEN-LAST:event_btn_logoutActionPerformed

    private void btn_killActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_killActionPerformed
        String sid = txt_sid.getText();
        String serial = txt_serial.getText();
        try{
            String sql="ALTER SYSTEM KILL SESSION '?,?' IMEEDIATE";
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1,sid);
            pst.setString(2, serial);
            int result = pst.executeUpdate();
            if(result==0){
                JOptionPane.showMessageDialog(null,"Kill session completed!");
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);            
        }
    }//GEN-LAST:event_btn_killActionPerformed

    private void btn_doimk_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_doimk_2ActionPerformed
        String username = txt_username.getText();
        String password = txt_password.getText();
        try{
            Statement st = connection.createStatement();            
            String sql= "ALTER USER "+username+" IDENTIFIED BY "+password;
            int rs = st.executeUpdate(sql);
            if(rs==0){
                JOptionPane.showMessageDialog(null,"Doi mat khau thanh cong!");
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);            
        }
    }//GEN-LAST:event_btn_doimk_2ActionPerformed

    private void btn_doimkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_doimkActionPerformed
        dialog_doimk.setSize(330,200);
        dialog_doimk.setLocationRelativeTo(null);
        dialog_doimk.setVisible(true);
    }//GEN-LAST:event_btn_doimkActionPerformed

    

    //label instance
    private void set_label_instance(){
        try{
            Statement st= connection.createStatement();
            String instance = "select instance_name from v$instance";        
            ResultSet rs= st.executeQuery(instance);
            while(rs.next()){
                String ins =rs.getString("INSTANCE_NAME");
                lbl_instance.setText(ins);
                }       
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
            return;
        }        
    }
    
    //label database
    private void set_label_database(){
        try{
            Statement st= connection.createStatement();
            String database="select name from v$database";        
            ResultSet rs= st.executeQuery(database);
            while(rs.next()){
                String db =rs.getString("NAME");
                lbl_database.setText(db);
                }       
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
            return;
        }
    }
    
    //set label last login
    private void set_label_last_login(String username){
        try{
            Statement st= connection.createStatement();
            
            String last="SELECT LAST_LOGIN FROM SYS.VIEW_LAST_LOGIN WHERE USERNAME='"+username.toUpperCase()+"'";        
            ResultSet rs= st.executeQuery(last);
            while(rs.next()){
                Timestamp lastlogin = rs.getTimestamp("LAST_LOGIN");
                SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
                String last_format = format.format(lastlogin);
                lbl_lastlogin.setText(last_format);
                }       
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
            return;
        }
    }
    
    //load data to cbo_user
    private void load_data_to_cbouser(){
        try{
            String sql= "SELECT USERNAME FROM DBA_USERS ORDER BY USERNAME ASC";
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                cbo_user.addItem(rs.getString("username"));
            }        
            st.close();
            rs.close();
        }catch(SQLException e){
                JOptionPane.showMessageDialog(null, e);
                return;
        }        
    }
    
    //load data to cbo_profile
    private void load_data_to_cbo_profile(){
        try{
            String sql= "SELECT DISTINCT PROFILE FROM DBA_PROFILES";
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(sql);
             while(rs.next()){
                cbo_profile.addItem(rs.getString("PROFILE"));
            }        
            st.close();
            rs.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
                return;
        }
    }
    
    //load data to cbo_role
    private void load_data_to_cbo_role(){
        try{
            String sql= "SELECT ROLE FROM DBA_ROLES ORDER BY ROLE ASC";
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                cbo_role.addItem(rs.getString("ROLE"));
            }        
            st.close();
            rs.close();
        }catch(SQLException e){
                JOptionPane.showMessageDialog(null, e);
                return;
        }
    }
    
    //load data to cbo_user_2
    private void load_data_to_cbo_user_2(){
        try{
            String sql= "SELECT USERNAME FROM DBA_USERS ORDER BY USERNAME ASC";
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                cbo_user_2.addItem(rs.getString("username"));
            }        
            st.close();
            rs.close();
        }catch(SQLException e){
                JOptionPane.showMessageDialog(null, e);
                return;
        } 
    }  
    
    
    
    
    //main
    public static void main(String args[]) {
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_audit;
    private javax.swing.JButton btn_audit_cthoadon;
    private javax.swing.JButton btn_audit_hoadon;
    private javax.swing.JButton btn_audit_log;
    private javax.swing.JButton btn_audit_sanpham;
    private javax.swing.JButton btn_controlfile;
    private javax.swing.JButton btn_create_new_role;
    private javax.swing.JButton btn_create_profile;
    private javax.swing.JButton btn_create_role_2;
    private javax.swing.JButton btn_create_tbs;
    private javax.swing.JButton btn_create_user;
    private javax.swing.JButton btn_datafile;
    private javax.swing.JButton btn_delete_profilr;
    private javax.swing.JButton btn_delete_role;
    private javax.swing.JButton btn_delete_user;
    private javax.swing.JButton btn_desc_profile;
    private javax.swing.JButton btn_doimk;
    private javax.swing.JButton btn_doimk_2;
    private javax.swing.JButton btn_grant_revoke;
    private javax.swing.JButton btn_granted_role_role;
    private javax.swing.JButton btn_granted_role_user;
    private javax.swing.JButton btn_kill;
    private javax.swing.JButton btn_kill_session;
    private javax.swing.JButton btn_lock_user;
    private javax.swing.JButton btn_logout;
    private javax.swing.JButton btn_privs_role;
    private javax.swing.JButton btn_privs_user;
    private javax.swing.JButton btn_role;
    private javax.swing.JButton btn_session;
    private javax.swing.JButton btn_sga;
    private javax.swing.JButton btn_system;
    private javax.swing.JButton btn_tbl_hoadon;
    private javax.swing.JButton btn_tbl_khachhang;
    private javax.swing.JButton btn_tbl_phieunhap;
    private javax.swing.JButton btn_tbl_sanpham;
    private javax.swing.JButton btn_tblprivs_role;
    private javax.swing.JButton btn_tblprivs_user;
    private javax.swing.JButton btn_tbs;
    private javax.swing.JButton btn_unlock_user;
    private javax.swing.JButton btn_user;
    private javax.swing.JButton btn_user_in_profile;
    private javax.swing.JComboBox<String> cbo_profile;
    private javax.swing.JComboBox<String> cbo_role;
    private javax.swing.JComboBox<String> cbo_user;
    private javax.swing.JComboBox<String> cbo_user_2;
    private javax.swing.JDialog dialog_create_role;
    private javax.swing.JDialog dialog_doimk;
    private javax.swing.JDialog dialog_kill_session;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lbl_1;
    private javax.swing.JLabel lbl_database;
    private javax.swing.JLabel lbl_instance;
    private javax.swing.JLabel lbl_lastlogin;
    private javax.swing.JPanel menu_panel_admin;
    private javax.swing.JPanel menu_panel_table;
    private javax.swing.JPanel panel_audit;
    private javax.swing.JPanel panel_main;
    private javax.swing.JPanel panel_menu;
    private javax.swing.JPanel panel_role;
    private javax.swing.JPanel panel_system;
    private javax.swing.JPanel panel_title;
    private javax.swing.JPanel panel_user;
    private javax.swing.JPanel panel_work;
    private javax.swing.JTable tableHethong;
    private javax.swing.JTable table_audit;
    private javax.swing.JTable table_privs;
    private javax.swing.JTable table_profiles;
    private javax.swing.JTable table_user;
    private javax.swing.JTextField txt_password;
    private javax.swing.JTextField txt_role_name;
    private javax.swing.JTextField txt_serial;
    private javax.swing.JTextField txt_sid;
    private javax.swing.JTextField txt_username;
    private javax.swing.JLabel userLabel;
    // End of variables declaration//GEN-END:variables
}

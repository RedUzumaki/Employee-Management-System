
package ems;

import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class Add extends javax.swing.JFrame {
    Connection con = null;
    PreparedStatement pst = null;
    public Add() throws ClassNotFoundException, SQLException {
        initComponents();
         Class.forName("com.mysql.cj.jdbc.Driver");
         con=DriverManager.getConnection("jdbc:mysql://localhost/ems_database", "enrollment", "enrollment");
        Image icon = new ImageIcon(this.getClass().getResource("ems.png")).getImage();
        this.setIconImage(icon);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        genderGrp = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jUpdateBtn = new javax.swing.JToggleButton();
        jAddBtn = new javax.swing.JToggleButton();
        jDeleteBtn = new javax.swing.JToggleButton();
        jShowBtn = new javax.swing.JToggleButton();
        jLogoutBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtFName = new javax.swing.JTextField();
        txtLName = new javax.swing.JTextField();
        txtDesignation = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        rbMale = new javax.swing.JRadioButton();
        rbFemale = new javax.swing.JRadioButton();
        rbOthers = new javax.swing.JRadioButton();
        txtEmail = new javax.swing.JTextField();
        txtSalary = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jConfirmBtn = new javax.swing.JButton();
        refreshActionBtn = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        BackgroundImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(900, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jUpdateBtn.setBackground(new java.awt.Color(255, 255, 255));
        jUpdateBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jUpdateBtn.setSelected(true);
        jUpdateBtn.setText("Update Employee");
        jUpdateBtn.setBorder(null);
        jUpdateBtn.setFocusPainted(false);
        jUpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jUpdateBtnActionPerformed(evt);
            }
        });
        jPanel1.add(jUpdateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 240, 60));

        jAddBtn.setBackground(new java.awt.Color(255, 255, 255));
        jAddBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jAddBtn.setText("Add Employee");
        jAddBtn.setBorder(null);
        jAddBtn.setFocusPainted(false);
        jAddBtn.setFocusable(false);
        jAddBtn.setRequestFocusEnabled(false);
        jAddBtn.setRolloverEnabled(false);
        jAddBtn.setVerifyInputWhenFocusTarget(false);
        jAddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAddBtnActionPerformed(evt);
            }
        });
        jPanel1.add(jAddBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 240, 60));

        jDeleteBtn.setBackground(new java.awt.Color(255, 255, 255));
        jDeleteBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jDeleteBtn.setSelected(true);
        jDeleteBtn.setText("Delete Employee");
        jDeleteBtn.setBorder(null);
        jDeleteBtn.setFocusPainted(false);
        jDeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDeleteBtnActionPerformed(evt);
            }
        });
        jPanel1.add(jDeleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 240, 60));

        jShowBtn.setBackground(new java.awt.Color(255, 255, 255));
        jShowBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jShowBtn.setSelected(true);
        jShowBtn.setText("Show Employee");
        jShowBtn.setBorder(null);
        jShowBtn.setFocusPainted(false);
        jShowBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jShowBtnActionPerformed(evt);
            }
        });
        jPanel1.add(jShowBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 240, 60));

        jLogoutBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLogoutBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ems/logout_2.png"))); // NOI18N
        jLogoutBtn.setText("Logout");
        jLogoutBtn.setFocusPainted(false);
        jLogoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLogoutBtnActionPerformed(evt);
            }
        });
        jPanel1.add(jLogoutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 200, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Last Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 80, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Gender");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 170, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("First Name");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, -1, -1));

        txtFName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFNameActionPerformed(evt);
            }
        });
        jPanel1.add(txtFName, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 240, 40));
        jPanel1.add(txtLName, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 110, 240, 40));
        jPanel1.add(txtDesignation, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, 240, 40));

        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });
        jPanel1.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, 530, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Address");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Email");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 350, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Salary");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 350, -1, -1));

        genderGrp.add(rbMale);
        rbMale.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rbMale.setText("Male ");
        rbMale.setContentAreaFilled(false);
        rbMale.setFocusPainted(false);
        rbMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMaleActionPerformed(evt);
            }
        });
        jPanel1.add(rbMale, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 210, -1, -1));

        genderGrp.add(rbFemale);
        rbFemale.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rbFemale.setText("Female");
        rbFemale.setContentAreaFilled(false);
        rbFemale.setFocusPainted(false);
        rbFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbFemaleActionPerformed(evt);
            }
        });
        jPanel1.add(rbFemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 210, -1, -1));

        genderGrp.add(rbOthers);
        rbOthers.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rbOthers.setText("Others");
        rbOthers.setContentAreaFilled(false);
        rbOthers.setFocusPainted(false);
        rbOthers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbOthersActionPerformed(evt);
            }
        });
        jPanel1.add(rbOthers, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 210, -1, -1));
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 380, 240, 40));
        jPanel1.add(txtSalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 380, 240, 40));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Designation");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ems/SplashScreen/Assets/profile1.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText(" Admin");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, -1, -1));

        jConfirmBtn.setBackground(new java.awt.Color(56, 149, 255));
        jConfirmBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jConfirmBtn.setForeground(new java.awt.Color(255, 255, 255));
        jConfirmBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ems/check_2.png"))); // NOI18N
        jConfirmBtn.setText("Confirm");
        jConfirmBtn.setFocusPainted(false);
        jConfirmBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConfirmBtnActionPerformed(evt);
            }
        });
        jPanel1.add(jConfirmBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 510, 130, 40));

        refreshActionBtn.setBackground(new java.awt.Color(55, 178, 255));
        refreshActionBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        refreshActionBtn.setForeground(new java.awt.Color(255, 255, 255));
        refreshActionBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ems/refresh_1.png"))); // NOI18N
        refreshActionBtn.setText("Refresh");
        refreshActionBtn.setFocusPainted(false);
        refreshActionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionBtnActionPerformed(evt);
            }
        });
        jPanel1.add(refreshActionBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 510, 130, 40));

        filler1.setBackground(new java.awt.Color(255, 255, 255));
        filler1.setOpaque(true);
        jPanel1.add(filler1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 660, 600));

        BackgroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ems/SplashScreen/Assets/bg_add.png"))); // NOI18N
        jPanel1.add(BackgroundImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jDeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDeleteBtnActionPerformed
        // TODO add your handling code here:
        dispose();
        Delete dlt = new Delete();
        dlt.show();
    }//GEN-LAST:event_jDeleteBtnActionPerformed

    private void jShowBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jShowBtnActionPerformed
        // TODO add your handling code here:
        dispose();
        Show sh = new Show();
        sh.show();
    }//GEN-LAST:event_jShowBtnActionPerformed

    private void jUpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUpdateBtnActionPerformed
        // TODO add your handling code here:
        dispose();
        Update up = new Update();
        up.show();
    }//GEN-LAST:event_jUpdateBtnActionPerformed

    private void jLogoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLogoutBtnActionPerformed
        // TODO add your handling code here:
        dispose();
        LoginJframe lgJframe = new LoginJframe();
        lgJframe.show();
    }//GEN-LAST:event_jLogoutBtnActionPerformed

    private void jAddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAddBtnActionPerformed
        // TODO add your handling code here:
        jAddBtn.setEnabled(false);
    }//GEN-LAST:event_jAddBtnActionPerformed

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void txtFNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFNameActionPerformed

    private void jConfirmBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConfirmBtnActionPerformed
        if(txtFName.getText().isEmpty() || txtLName.getText().trim().isEmpty() || txtDesignation.getText().isEmpty() || gender=="" ||
                txtAddress.getText().isEmpty() || txtEmail.getText().isEmpty() || txtSalary.getText().isEmpty())
            JOptionPane.showMessageDialog(this, "Please fill all fields");
        else {
            try{
            pst = con.prepareStatement("INSERT INTO emp_info VALUES (NULL, ?, ?, ?, ?, ?, ?, ?)");
            pst.setString(1, txtFName.getText());
            pst.setString(2, txtLName.getText());
            pst.setString(3, txtDesignation.getText());
            pst.setString(4, gender);
            pst.setString(5, txtAddress.getText());
            pst.setString(6, txtEmail.getText());
            pst.setInt(7, Integer.parseInt(txtSalary.getText()));
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Employee Added Successfully");
} catch (SQLException ex) {
            Logger.getLogger(Show.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }//GEN-LAST:event_jConfirmBtnActionPerformed

    String gender="";
    private void rbFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbFemaleActionPerformed
        // TODO add your handling code here:
        gender = rbFemale.getText();
    }//GEN-LAST:event_rbFemaleActionPerformed

    private void rbMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMaleActionPerformed
        // TODO add your handling code here:
        gender = rbMale.getText();
    }//GEN-LAST:event_rbMaleActionPerformed

    private void rbOthersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbOthersActionPerformed
        // TODO add your handling code here:
        gender = rbOthers.getText();
    }//GEN-LAST:event_rbOthersActionPerformed

    private void refreshActionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionBtnActionPerformed
        try {
            dispose();
            Add add = new Add();
            add.show();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Add.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_refreshActionBtnActionPerformed

    public static void main(String args[]) {}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackgroundImage;
    private javax.swing.Box.Filler filler1;
    private javax.swing.ButtonGroup genderGrp;
    private javax.swing.JToggleButton jAddBtn;
    private javax.swing.JButton jConfirmBtn;
    private javax.swing.JToggleButton jDeleteBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton jLogoutBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton jShowBtn;
    private javax.swing.JToggleButton jUpdateBtn;
    private javax.swing.JRadioButton rbFemale;
    private javax.swing.JRadioButton rbMale;
    private javax.swing.JRadioButton rbOthers;
    private javax.swing.JButton refreshActionBtn;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtDesignation;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFName;
    private javax.swing.JTextField txtLName;
    private javax.swing.JTextField txtSalary;
    // End of variables declaration//GEN-END:variables
}

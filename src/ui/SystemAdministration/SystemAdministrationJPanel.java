package ui.SystemAdministration;

import java.awt.Color;
import ProjModel.SystemAdmin;

public class SystemAdministrationJPanel extends javax.swing.JPanel {

    SystemAdmin systems;
    private Runnable callOnCreateMethod1;
    private Runnable callOnCreateMethod2;
    private Runnable callOnCreateMethod3;
    private Runnable callOnCreateMethod4;

    public SystemAdministrationJPanel(SystemAdmin systems, Runnable callOnCreateMethod1, Runnable callOnCreateMethod2, Runnable callOnCreateMethod3, Runnable callOnCreateMethod4) {
        initComponents();
        this.systems = systems;
        this.callOnCreateMethod1 = callOnCreateMethod1;
        this.callOnCreateMethod2 = callOnCreateMethod2;
        this.callOnCreateMethod3 = callOnCreateMethod3;
        this.callOnCreateMethod4 = callOnCreateMethod4;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnmanageFranchise = new javax.swing.JButton();
        enterpriseBtn = new javax.swing.JButton();
        btnmanagecustomers = new javax.swing.JButton();
        lblsysadmin = new javax.swing.JLabel();
        btnmanagemanagers = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setLayout(null);

        btnmanageFranchise.setBackground(new java.awt.Color(247, 247, 247));
        btnmanageFranchise.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btnmanageFranchise.setForeground(new java.awt.Color(20, 20, 64));
        btnmanageFranchise.setText("MANAGE FRANCHISE");
        btnmanageFranchise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmanageFranchiseActionPerformed(evt);
            }
        });
        add(btnmanageFranchise);
        btnmanageFranchise.setBounds(430, 390, 219, 117);

        enterpriseBtn.setBackground(new java.awt.Color(247, 247, 247));
        enterpriseBtn.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        enterpriseBtn.setForeground(new java.awt.Color(20, 20, 64));
        enterpriseBtn.setText("MANAGE SERVICES");
        enterpriseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterpriseBtnActionPerformed(evt);
            }
        });
        add(enterpriseBtn);
        enterpriseBtn.setBounds(840, 390, 230, 117);

        btnmanagecustomers.setBackground(new java.awt.Color(247, 247, 247));
        btnmanagecustomers.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btnmanagecustomers.setForeground(new java.awt.Color(20, 20, 64));
        btnmanagecustomers.setText("MANAGE CUSTOMERS");
        btnmanagecustomers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmanagecustomersActionPerformed(evt);
            }
        });
        add(btnmanagecustomers);
        btnmanagecustomers.setBounds(840, 600, 230, 118);

        lblsysadmin.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblsysadmin.setForeground(new java.awt.Color(255, 255, 255));
        lblsysadmin.setText("SYSTEM ADMINISTRATOR");
        add(lblsysadmin);
        lblsysadmin.setBounds(510, 270, 475, 44);

        btnmanagemanagers.setBackground(new java.awt.Color(247, 247, 247));
        btnmanagemanagers.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btnmanagemanagers.setForeground(new java.awt.Color(20, 20, 64));
        btnmanagemanagers.setText("MANAGE MANAGERS");
        btnmanagemanagers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmanagemanagersActionPerformed(evt);
            }
        });
        add(btnmanagemanagers);
        btnmanagemanagers.setBounds(430, 600, 219, 110);

        jLabel1.setForeground(new java.awt.Color(242, 242, 242));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/SystemAdministration/vector-OCT-2020-116_generated.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1);
        jLabel1.setBounds(0, -10, 1620, 1130);
    }// </editor-fold>//GEN-END:initComponents

    private void btnmanagecustomersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmanagecustomersActionPerformed
        callOnCreateMethod4.run();
    }//GEN-LAST:event_btnmanagecustomersActionPerformed

    private void btnmanagemanagersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmanagemanagersActionPerformed
        callOnCreateMethod3.run();
    }//GEN-LAST:event_btnmanagemanagersActionPerformed

    private void btnmanageFranchiseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmanageFranchiseActionPerformed
        callOnCreateMethod1.run();
    }//GEN-LAST:event_btnmanageFranchiseActionPerformed

    private void enterpriseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterpriseBtnActionPerformed
        callOnCreateMethod2.run();
    }//GEN-LAST:event_enterpriseBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnmanageFranchise;
    private javax.swing.JButton btnmanagecustomers;
    private javax.swing.JButton btnmanagemanagers;
    private javax.swing.JButton enterpriseBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblsysadmin;
    // End of variables declaration//GEN-END:variables
}

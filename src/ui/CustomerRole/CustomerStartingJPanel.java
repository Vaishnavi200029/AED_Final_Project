package ui.CustomerRole;

import ProjModel.SystemAdmin;
import javax.swing.ImageIcon;

public class CustomerStartingJPanel extends javax.swing.JPanel {

    private SystemAdmin systemAdmin;
    private Runnable callOnCreateMethod1;
    private Runnable callOnCreateMethod2;
    private String user;

    public CustomerStartingJPanel(SystemAdmin systemAdmin, Runnable callOnCreateMethod1, Runnable callOnCreateMethod2) {
        initComponents();
        this.systemAdmin = systemAdmin;
        this.callOnCreateMethod1 = callOnCreateMethod1;
        this.callOnCreateMethod2 = callOnCreateMethod2;
        backBtn.setOpaque(true);
        backBtn.setIcon(new ImageIcon(ClassLoader.getSystemResource("icons/back.png")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        roombookButton = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        manageBooking = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CUSTOMER PANEL ");
        add(jLabel1);
        jLabel1.setBounds(570, 150, 346, 44);

        roombookButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        roombookButton.setText("BOOK ROOMS & SERVICES");
        roombookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roombookButtonActionPerformed(evt);
            }
        });
        add(roombookButton);
        roombookButton.setBounds(350, 280, 343, 100);

        backBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        add(backBtn);
        backBtn.setBounds(62, 21, 90, 41);

        manageBooking.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        manageBooking.setText("MANAGE BOOKING");
        manageBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageBookingActionPerformed(evt);
            }
        });
        add(manageBooking);
        manageBooking.setBounds(820, 280, 335, 100);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/CustomerRole/vecteezy_abstract-background-dark-purple-and-triangle-shape_7463701.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        add(jLabel2);
        jLabel2.setBounds(0, 0, 1981, 1067);
    }// </editor-fold>//GEN-END:initComponents

    private void manageBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageBookingActionPerformed
        callOnCreateMethod2.run();
    }//GEN-LAST:event_manageBookingActionPerformed

    private void roombookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roombookButtonActionPerformed
        callOnCreateMethod1.run();
    }//GEN-LAST:event_roombookButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton manageBooking;
    private javax.swing.JButton roombookButton;
    // End of variables declaration//GEN-END:variables
}

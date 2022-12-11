package ui.CustomerRole;

import java.util.Date;
import java.util.function.Consumer;
import ProjModel.Booking;
import ProjModel.SystemAdmin;
import javax.swing.ImageIcon;

public class ViewServiceDetailsPanel extends javax.swing.JPanel {

    private SystemAdmin systems;
    private Runnable callOnCreateMethod1;
    private String username;
    private Booking booking;

    public ViewServiceDetailsPanel(SystemAdmin systems, Runnable callOnCreateMethod1, String username, Booking booking) {
        initComponents();
        this.systems = systems;
        this.callOnCreateMethod1 = callOnCreateMethod1;
        this.username = username;
        this.booking = booking;
        populatePanel();
        bookingDetails.setColumns(19);
        bookingDetails.setRows(7);
        backBtn.setOpaque(true);
        backBtn.setIcon(new ImageIcon(ClassLoader.getSystemResource("icons/back.png")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        bookingDetails = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        checkout = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        checkin = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setLayout(null);

        bookingDetails.setBackground(new java.awt.Color(204, 255, 255));
        bookingDetails.setColumns(20);
        bookingDetails.setRows(5);
        jScrollPane1.setViewportView(bookingDetails);

        add(jScrollPane1);
        jScrollPane1.setBounds(327, 213, 675, 573);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CHECK-IN ");
        add(jLabel1);
        jLabel1.setBounds(344, 108, 91, 24);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CHECK-OUT");
        add(jLabel2);
        jLabel2.setBounds(327, 155, 108, 24);

        checkout.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        add(checkout);
        checkout.setBounds(610, 154, 249, 29);

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("VIEW ORDER DETAILS");
        add(jLabel3);
        jLabel3.setBounds(487, 47, 290, 48);

        backBtn.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn);
        backBtn.setBounds(42, 6, 84, 47);

        checkin.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        checkin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkinActionPerformed(evt);
            }
        });
        add(checkin);
        checkin.setBounds(610, 107, 249, 29);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/CustomerRole/vecteezy_abstract-background-dark-purple-and-triangle-shape_7463701.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        add(jLabel4);
        jLabel4.setBounds(0, -3, 1981, 1070);
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        callOnCreateMethod1.run();
    }//GEN-LAST:event_backBtnActionPerformed

    private void checkinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkinActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JTextArea bookingDetails;
    private javax.swing.JTextField checkin;
    private javax.swing.JTextField checkout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void populatePanel() {
        checkin.setText(booking.getCheckin().toString());
        checkout.setText(booking.getCheckout().toString());
        bookingDetails.setText(booking.prettyPrint());
    }
}

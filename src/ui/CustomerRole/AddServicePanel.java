package ui.CustomerRole;

import java.util.function.Consumer;
import ProjModel.Booking;
import ProjModel.SystemAdmin;
import javax.swing.ImageIcon;

public class AddServicePanel extends javax.swing.JPanel {

    private SystemAdmin systems;
    private Consumer<Booking> callOnEventBooking;
    private Consumer<Booking> callOnOrderBooking;
    private Consumer<Booking> callOnHealthClubBooking;
    private Consumer<Booking> callOnHotelServiceBooking;
    private Runnable backButton4;
    private String username;
    private String hotelName;
    private Booking booking;

    public AddServicePanel(SystemAdmin systems, Consumer<Booking> callOnEventBooking, Consumer<Booking> callOnOrderBooking,
            Consumer<Booking> callOnHealthClubBooking, Consumer<Booking> callOnHotelServiceBooking, Runnable backButton, String username, Booking booking) {
        initComponents();
        this.systems = systems;
        this.callOnEventBooking = callOnEventBooking;
        this.callOnOrderBooking = callOnOrderBooking;
        this.callOnHealthClubBooking = callOnHealthClubBooking;
        this.callOnHotelServiceBooking = callOnHotelServiceBooking;
        this.backButton4 = backButton;
        this.username = username;
        this.booking = booking;
        backBtn.setOpaque(true);
        backBtn.setIcon(new ImageIcon(ClassLoader.getSystemResource("icons/back.png")));
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        eventBtn = new javax.swing.JButton();
        orderBtn = new javax.swing.JButton();
        healthClubBtn = new javax.swing.JButton();
        otherService = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ADD SERVICES ");
        add(jLabel1);
        jLabel1.setBounds(643, 110, 278, 47);

        backBtn.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn);
        backBtn.setBounds(38, 27, 80, 40);

        eventBtn.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        eventBtn.setText("BUSINESS EVENTS ");
        eventBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eventBtnActionPerformed(evt);
            }
        });
        add(eventBtn);
        eventBtn.setBounds(630, 207, 308, 38);

        orderBtn.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        orderBtn.setText("PLACE ORDER ");
        orderBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderBtnActionPerformed(evt);
            }
        });
        add(orderBtn);
        orderBtn.setBounds(630, 298, 308, 42);

        healthClubBtn.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        healthClubBtn.setText("HEALTH CLUB ");
        healthClubBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                healthClubBtnActionPerformed(evt);
            }
        });
        add(healthClubBtn);
        healthClubBtn.setBounds(630, 391, 308, 42);

        otherService.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        otherService.setText("OTHER SERVICES");
        otherService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otherServiceActionPerformed(evt);
            }
        });
        add(otherService);
        otherService.setBounds(630, 492, 308, 38);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/CustomerRole/vecteezy_abstract-background-dark-purple-and-triangle-shape_7463701.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        add(jLabel2);
        jLabel2.setBounds(-9, -200, 1981, 1330);
    }// </editor-fold>//GEN-END:initComponents

    private void eventBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eventBtnActionPerformed
        callOnEventBooking.accept(booking);
    }//GEN-LAST:event_eventBtnActionPerformed

    private void orderBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderBtnActionPerformed
        callOnOrderBooking.accept(booking);
    }//GEN-LAST:event_orderBtnActionPerformed

    private void healthClubBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_healthClubBtnActionPerformed
        callOnHealthClubBooking.accept(booking);
    }//GEN-LAST:event_healthClubBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        backButton4.run();
    }//GEN-LAST:event_backBtnActionPerformed

    private void otherServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otherServiceActionPerformed
        callOnHotelServiceBooking.accept(booking);
    }//GEN-LAST:event_otherServiceActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton eventBtn;
    private javax.swing.JButton healthClubBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton orderBtn;
    private javax.swing.JButton otherService;
    // End of variables declaration//GEN-END:variables
}

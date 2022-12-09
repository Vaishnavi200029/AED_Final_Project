package ui.CustomerRole;

import java.util.function.Consumer;
import ProjectModel.Booking;
import ProjectModel.SystemAdmin;

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
        setBackground(new java.awt.Color(255, 204, 204));
        backBtn.setBackground(new java.awt.Color(244, 120, 140));
        backBtn.setOpaque(true);
        eventBtn.setBackground(new java.awt.Color(244, 120, 140));
        eventBtn.setOpaque(true);
        orderBtn.setBackground(new java.awt.Color(244, 120, 140));
        orderBtn.setOpaque(true);
        healthClubBtn.setBackground(new java.awt.Color(244, 120, 140));
        healthClubBtn.setOpaque(true);
        otherService.setBackground(new java.awt.Color(244, 120, 140));
        otherService.setOpaque(true);
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

        setBackground(new java.awt.Color(110, 153, 238));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setText("ADD SERVICES ");

        backBtn.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        backBtn.setText("BACK");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        eventBtn.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        eventBtn.setText("BUSINESS EVENTS ");
        eventBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eventBtnActionPerformed(evt);
            }
        });

        orderBtn.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        orderBtn.setText("PLACE ORDER ");
        orderBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderBtnActionPerformed(evt);
            }
        });

        healthClubBtn.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        healthClubBtn.setText("HEALTH CLUB ");
        healthClubBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                healthClubBtnActionPerformed(evt);
            }
        });

        otherService.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        otherService.setText("OTHER SERVICES");
        otherService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otherServiceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(301, 301, 301))
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(healthClubBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eventBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 145, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(orderBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(otherService, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(96, 96, 96))
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(orderBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eventBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(healthClubBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(otherService, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(243, 243, 243))
        );
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
    private javax.swing.JButton orderBtn;
    private javax.swing.JButton otherService;
    // End of variables declaration//GEN-END:variables
}

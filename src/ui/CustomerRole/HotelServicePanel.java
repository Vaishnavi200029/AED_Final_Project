package ui.CustomerRole;

import java.util.Date;
import java.util.function.Consumer;
import javax.swing.JOptionPane;
import ProjModel.Booking;
import ProjModel.SystemAdmin;
import ProjectModel.services.HotelService;
import javax.swing.ImageIcon;
import ui.main.DateUtils;

public class HotelServicePanel extends javax.swing.JPanel {

    private SystemAdmin systems;
    private Consumer<Booking> callOnCreateMethod1;
    private String username;
    private Booking booking;

    public HotelServicePanel(SystemAdmin systems, Consumer<Booking> callOnCreateMethod1, String username, Booking booking) {
        initComponents();
        this.systems = systems;
        this.callOnCreateMethod1 = callOnCreateMethod1;
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
        laundaryBtn = new javax.swing.JRadioButton();
        transportationBtn = new javax.swing.JRadioButton();
        placeRequest = new javax.swing.JButton();
        dateField = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("HOTEL SERVICE PANEL");
        add(jLabel1);
        jLabel1.setBounds(226, 77, 421, 47);

        backBtn.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn);
        backBtn.setBounds(32, 16, 100, 40);

        laundaryBtn.setBackground(new java.awt.Color(153, 0, 153));
        laundaryBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        laundaryBtn.setForeground(new java.awt.Color(255, 255, 255));
        laundaryBtn.setText("LAUNDARY SERVICE ($10)");
        add(laundaryBtn);
        laundaryBtn.setBounds(312, 301, 317, 29);

        transportationBtn.setBackground(new java.awt.Color(153, 0, 153));
        transportationBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        transportationBtn.setForeground(new java.awt.Color(255, 255, 255));
        transportationBtn.setText("TRANSPORTATION SERVICE ($20)");
        add(transportationBtn);
        transportationBtn.setBounds(312, 392, 344, 29);

        placeRequest.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        placeRequest.setText("PLACE REQUEST");
        placeRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placeRequestActionPerformed(evt);
            }
        });
        add(placeRequest);
        placeRequest.setBounds(310, 490, 231, 47);
        add(dateField);
        dateField.setBounds(312, 190, 223, 39);

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("DATE");
        add(jLabel3);
        jLabel3.setBounds(182, 199, 75, 24);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/CustomerRole/vecteezy_abstract-background-dark-purple-and-triangle-shape_7463701.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        add(jLabel2);
        jLabel2.setBounds(0, 0, 1974, 1067);
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        callOnCreateMethod1.accept(booking);
    }//GEN-LAST:event_backBtnActionPerformed

    private void placeRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placeRequestActionPerformed
        boolean laundaryBtnSelected = laundaryBtn.isSelected();
        boolean transportationBtnSelected = transportationBtn.isSelected();
        Date date = DateUtils.formatDate(dateField.getDate());
        Date checkin = booking.getCheckin();
        Date checkout = booking.getCheckout();
        if (date.compareTo(checkin) < 0 || date.compareTo(checkout) > 0) {
            JOptionPane.showMessageDialog(this, "Selected date should be within check-in date (" + checkin
                    + ") and checkout date (" + checkout + ")");
            return;
        }

        HotelService hotelService = booking.getHotelService();
        if (laundaryBtnSelected) {
            hotelService.addService(HotelService.HotelServiceType.LAUNDARY);
        }
        if (transportationBtnSelected) {
            hotelService.addService(HotelService.HotelServiceType.TRANSPORTATION);
        }

        hotelService.setDate(date);
        JOptionPane.showMessageDialog(this, "Your hotel services are been added.");
        callOnCreateMethod1.accept(booking);
    }//GEN-LAST:event_placeRequestActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private com.toedter.calendar.JDateChooser dateField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton laundaryBtn;
    private javax.swing.JButton placeRequest;
    private javax.swing.JRadioButton transportationBtn;
    // End of variables declaration//GEN-END:variables
}

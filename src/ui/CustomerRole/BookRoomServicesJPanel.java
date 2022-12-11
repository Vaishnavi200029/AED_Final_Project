package ui.CustomerRole;

import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import ProjModel.Booking;
import ProjModel.Customer;
import ProjModel.Hotel;
import ProjModel.Franchise;
import ProjModel.Room;
import ProjModel.Room.RoomType;
import ProjModel.SystemAdmin;
import javax.swing.ImageIcon;
import ui.main.DateUtils;

public class BookRoomServicesJPanel extends javax.swing.JPanel {

    private SystemAdmin systems;
    private Runnable callOnCreateMethod1;
    private String username;

    public BookRoomServicesJPanel(SystemAdmin systems, Runnable callOnCreateMethod1, String username) {
        initComponents();
        this.systems = systems;
        this.callOnCreateMethod1 = callOnCreateMethod1;
        this.username = username;
        for (Franchise network : systems.getListOfNetwork()) {
            cityCombo.addItem(network.getName());
        }
        for (RoomType type : RoomType.values()) {
            roomtypeComboBox.addItem(type);
        }
        backBtn.setOpaque(true);
        backBtn.setIcon(new ImageIcon(ClassLoader.getSystemResource("icons/back.png")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backBtn = new javax.swing.JButton();
        lbldate = new javax.swing.JLabel();
        lblcity = new javax.swing.JLabel();
        lblhotel = new javax.swing.JLabel();
        priceField = new javax.swing.JTextField();
        btnnoofpeople = new javax.swing.JLabel();
        lblroom = new javax.swing.JLabel();
        bookRoomBtn = new javax.swing.JButton();
        lblbookservices = new javax.swing.JLabel();
        peopleField = new javax.swing.JTextField();
        roomField = new javax.swing.JTextField();
        checkin = new com.toedter.calendar.JDateChooser();
        hotelCombo = new javax.swing.JComboBox<>();
        checkout = new com.toedter.calendar.JDateChooser();
        cityCombo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        roomtypeComboBox = new javax.swing.JComboBox<>();
        priceBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setLayout(null);

        backBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn);
        backBtn.setBounds(42, 18, 90, 50);

        lbldate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbldate.setForeground(new java.awt.Color(255, 255, 255));
        lbldate.setText("CHECK-IN & CHECK-OUT");
        add(lbldate);
        lbldate.setBounds(169, 147, 203, 22);

        lblcity.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblcity.setForeground(new java.awt.Color(255, 255, 255));
        lblcity.setText("CITY");
        add(lblcity);
        lblcity.setBounds(169, 207, 121, 22);

        lblhotel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblhotel.setForeground(new java.awt.Color(255, 255, 255));
        lblhotel.setText("HOTELS");
        add(lblhotel);
        lblhotel.setBounds(169, 272, 121, 22);
        add(priceField);
        priceField.setBounds(502, 595, 101, 37);

        btnnoofpeople.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnnoofpeople.setForeground(new java.awt.Color(255, 255, 255));
        btnnoofpeople.setText("NO OF PEOPLE");
        add(btnnoofpeople);
        btnnoofpeople.setBounds(169, 361, 121, 22);

        lblroom.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblroom.setForeground(new java.awt.Color(255, 255, 255));
        lblroom.setText("NO OF ROOMS");
        add(lblroom);
        lblroom.setBounds(170, 501, 120, 22);

        bookRoomBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bookRoomBtn.setText("BOOK ROOM");
        bookRoomBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookRoomBtnActionPerformed(evt);
            }
        });
        add(bookRoomBtn);
        bookRoomBtn.setBounds(500, 710, 151, 45);

        lblbookservices.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblbookservices.setForeground(new java.awt.Color(255, 255, 255));
        lblbookservices.setText("BOOK ROOMS AND SERVICES");
        add(lblbookservices);
        lblbookservices.setBounds(350, 60, 353, 29);

        peopleField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                peopleFieldActionPerformed(evt);
            }
        });
        add(peopleField);
        peopleField.setBounds(498, 348, 342, 35);
        add(roomField);
        roomField.setBounds(502, 488, 334, 35);
        add(checkin);
        checkin.setBounds(502, 134, 171, 35);

        hotelCombo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        hotelCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a hotel" }));
        add(hotelCombo);
        hotelCombo.setBounds(498, 269, 346, 32);
        add(checkout);
        checkout.setBounds(703, 134, 153, 35);

        cityCombo.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        cityCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select city" }));
        cityCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityComboActionPerformed(evt);
            }
        });
        add(cityCombo);
        cityCombo.setBounds(498, 194, 346, 31);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ROOM TYPE ");
        add(jLabel1);
        jLabel1.setBounds(170, 425, 120, 24);

        roomtypeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomtypeComboBoxActionPerformed(evt);
            }
        });
        add(roomtypeComboBox);
        roomtypeComboBox.setBounds(498, 419, 334, 35);

        priceBtn.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        priceBtn.setText("TOTAL PRICE");
        priceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceBtnActionPerformed(evt);
            }
        });
        add(priceBtn);
        priceBtn.setBounds(231, 597, 164, 34);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/CustomerRole/vecteezy_abstract-background-dark-purple-and-triangle-shape_7463701.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        add(jLabel2);
        jLabel2.setBounds(0, 0, 1981, 1067);
    }// </editor-fold>//GEN-END:initComponents

    private void bookRoomBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookRoomBtnActionPerformed
        Date checkinDate = checkin.getDate();
        Date checkoutdate = checkout.getDate();
        String city = cityCombo.getSelectedItem().toString();
        int roomCount = Integer.parseInt(roomField.getText());
        RoomType roomType = (RoomType) roomtypeComboBox.getSelectedItem();

        if (checkinDate.compareTo(DateUtils.now()) < 0 || checkoutdate.compareTo(DateUtils.now()) < 0) {
            JOptionPane.showMessageDialog(this, "Checkin and checkout dates cannot be in the past.");
            return;
        }

        if (checkinDate.compareTo(checkoutdate) > 0) {
            JOptionPane.showMessageDialog(this, "Checkout date should be after checkin date.");
            return;
        }

        Franchise network = systems.findNetwork(city);

        Hotel hotel = network.getEnterpriseDirectory().findHotel(hotelCombo.getSelectedItem().toString());
        List<Room> availableRooms = hotel.availableRooms(checkinDate, checkoutdate, roomType);
        if (availableRooms.size() < roomCount) {
            JOptionPane.showMessageDialog(this, "Rooms not available for the specified date.");
            return;
        }

        hotel.bookRooms(checkinDate, checkoutdate, roomCount, roomType);
        Customer customer = systems.getCustomerDirec().findCustomerUsername(username);
        Booking booking = customer.addBooking(hotel, network);  //add bookings in customer class
        booking.getHotelService().getRoomlist().createRoom(roomType);     // add rooms in booking class 
        booking.setCheckin(checkinDate);
        booking.setCheckout(checkoutdate);
        booking.setStatus("Booked");
        booking.setCost(roomType.getRate());

        JOptionPane.showMessageDialog(this, "Room booked successfully. The total cost for your booking is "
                + (roomCount * roomType.getRate()) + "$");
        callOnCreateMethod1.run();
    }//GEN-LAST:event_bookRoomBtnActionPerformed

    private void cityComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityComboActionPerformed
        String city = cityCombo.getSelectedItem().toString();
        Franchise network = systems.findNetwork(city);
        hotelCombo.removeAllItems();
        if (network != null) {
            for (Hotel hotel : network.getEnterpriseDirectory().getListOfHotel()) {  //populate all hotel in that city
                hotelCombo.addItem(hotel.getName());
            }
        }
    }//GEN-LAST:event_cityComboActionPerformed

    private void roomtypeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomtypeComboBoxActionPerformed

    }//GEN-LAST:event_roomtypeComboBoxActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        callOnCreateMethod1.run();
    }//GEN-LAST:event_backBtnActionPerformed

    private void priceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceBtnActionPerformed
        final String roomNum = roomField.getText();
        if (roomNum != null && !roomNum.isEmpty()) {
            int roomCount = Integer.parseInt(roomNum);
            RoomType selectType = (RoomType) roomtypeComboBox.getSelectedItem();
            priceField.setText(selectType.getRate() * roomCount + "$");
        } else {
            JOptionPane.showMessageDialog(this, "Please provide number of rooms to calculate price.");
        }
    }//GEN-LAST:event_priceBtnActionPerformed

    private void peopleFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_peopleFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_peopleFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton bookRoomBtn;
    private javax.swing.JLabel btnnoofpeople;
    private com.toedter.calendar.JDateChooser checkin;
    private com.toedter.calendar.JDateChooser checkout;
    private javax.swing.JComboBox<String> cityCombo;
    private javax.swing.JComboBox<String> hotelCombo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblbookservices;
    private javax.swing.JLabel lblcity;
    private javax.swing.JLabel lbldate;
    private javax.swing.JLabel lblhotel;
    private javax.swing.JLabel lblroom;
    private javax.swing.JTextField peopleField;
    private javax.swing.JButton priceBtn;
    private javax.swing.JTextField priceField;
    private javax.swing.JTextField roomField;
    private javax.swing.JComboBox<RoomType> roomtypeComboBox;
    // End of variables declaration//GEN-END:variables
}

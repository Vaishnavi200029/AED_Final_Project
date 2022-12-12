package ui.RestaurantManagerRole;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import ProjModel.Booking;
import ProjModel.Customer;
import ProjModel.CustomerDirectory;
import ProjModel.DeliverymanOrg;
import ProjModel.Organization;
import ProjModel.Restaurant;
import ProjModel.SystemAdmin;
import ProjectModel.services.BusinessEventService;
import ProjectModel.services.RestaurantService;
import ProjectModel.services.Service;
import javax.swing.ImageIcon;

public class ViewTaskPanelRestaurant extends javax.swing.JPanel {

    private SystemAdmin systemAdmin;
    private Runnable callOnCreateMethod;
    private String user;
    private String type;
    private Restaurant restaurant;

    public ViewTaskPanelRestaurant(SystemAdmin systemAdmin, Runnable callOnCreateMethod, String user, String type, Restaurant restaurant) {
        initComponents();
        this.systemAdmin = systemAdmin;
        this.callOnCreateMethod = callOnCreateMethod;
        this.user = user;
        this.type = type;
        this.restaurant = restaurant;
        populateComboBox();
        populateTable();
        backBtn.setOpaque(true);
        backBtn.setIcon(new ImageIcon(ClassLoader.getSystemResource("icons/back.png")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        deliveryOrg = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        acceptBtn = new javax.swing.JButton();
        denyBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setLayout(null);

        jTable1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ORDER ID", "CUSTOMER NAME", "ORDER DETAIL", "ADDRESS", "STATUS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1);
        jScrollPane1.setBounds(270, 400, 990, 220);

        deliveryOrg.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        add(deliveryOrg);
        deliveryOrg.setBounds(850, 670, 261, 30);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SELECT A ORGANIZATION FOR DELIVERYMAN");
        add(jLabel1);
        jLabel1.setBounds(400, 670, 420, 24);

        acceptBtn.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        acceptBtn.setText("ACCEPT ORDER");
        acceptBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptBtnActionPerformed(evt);
            }
        });
        add(acceptBtn);
        acceptBtn.setBounds(550, 750, 200, 42);

        denyBtn.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        denyBtn.setText("DENY ORDER");
        denyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                denyBtnActionPerformed(evt);
            }
        });
        add(denyBtn);
        denyBtn.setBounds(830, 750, 176, 42);

        backBtn.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn);
        backBtn.setBounds(22, 22, 72, 60);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("VIEW ORDER DETAILS FOR RESTAURANT");
        add(jLabel2);
        jLabel2.setBounds(460, 320, 511, 32);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/RestaurantManagerRole/stock-photo-assorted-of-different-asian-food-chinese-japanese-and-thai-cuisine-noodles-dumplings-gedza-1900062550-transformed.jpeg"))); // NOI18N
        add(jLabel3);
        jLabel3.setBounds(0, 0, 1500, 1162);
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        callOnCreateMethod.run();
    }//GEN-LAST:event_backBtnActionPerformed

    private void acceptBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptBtnActionPerformed
        int selectRowIndex = jTable1.getSelectedRow();
        if (selectRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a booking to assign request.");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Booking booking = (Booking) model.getValueAt(selectRowIndex, 0);

        RestaurantService resService = null;
        for (Service service : booking.getServices()) {
            if (restaurant.getName().equals(service.getEnterprise().getName())) {
                resService = (RestaurantService) service;
                break;
            }
        }

        if (resService == null) {
            throw new RuntimeException("Restaurant service not found, something went wrong.");
        }

        if (!resService.getStatus().equals(Service.Status.PENDING)) {
            JOptionPane.showMessageDialog(this, String.format("Booking '%s' should be 'PENDING' state to be accepted.",
                    booking.getId()));
            return;
        }

        DeliverymanOrg delivery = (DeliverymanOrg) deliveryOrg.getSelectedItem();
        if (delivery == null) {
            JOptionPane.showMessageDialog(this, "Please select delivery organization to be assinged.");
            return;
        }

        resService.addOrganization(delivery);
        resService.setStatus(Service.Status.CONFIRMED);

        JOptionPane.showMessageDialog(this, String.format("Booking %s is assigned to delivery ord '%s'",
                booking.getId(), delivery));

        populateTable();
    }//GEN-LAST:event_acceptBtnActionPerformed

    private void denyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_denyBtnActionPerformed
        int selectRowIndex = jTable1.getSelectedRow();
        if (selectRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a booking to deny request.");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Booking booking = (Booking) model.getValueAt(selectRowIndex, 0);

        RestaurantService resService = null;
        for (Service service : booking.getServices()) {
            if (service instanceof RestaurantService) {
                resService = (RestaurantService) service;
                break;
            }
        }

        if (resService == null) {
            throw new RuntimeException("Restaurant service not found, something went wrong.");
        }
        if (!resService.getStatus().equals(Service.Status.PENDING)) {
            JOptionPane.showMessageDialog(this, String.format("Booking '%s' should be 'PENDING' state to be accepted.",
                    booking.getId()));
            return;
        }

        resService.setStatus(Service.Status.REJECTED);
        JOptionPane.showMessageDialog(this, String.format("Booking '%s' is denied.", booking.getId()));
        populateTable();
    }//GEN-LAST:event_denyBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acceptBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JComboBox<DeliverymanOrg> deliveryOrg;
    private javax.swing.JButton denyBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);

        Object row[] = new Object[10];
        CustomerDirectory customerDirec = systemAdmin.getCustomerDirec(); //get all customers
        for (Customer customer : customerDirec.getListOfCustomer()) {
            for (Booking booking : customer.getBookingList()) {      //get booking details each customer
                for (Service service : booking.getServices()) {       //get services under booking
                    if (service.getEnterprise().getName().equals(restaurant.getName())) {
                        RestaurantService restaurantService = (RestaurantService) service;
                        row[0] = booking;
                        row[1] = customer;
                        row[2] = booking.getStatus();
                        row[3] = customer.getAddress();
                        row[4] = restaurantService.getStatus();
                        model.addRow(row);
                    }
                }
            }
        }

    }

    private void populateComboBox() {
        deliveryOrg.addItem(null);
        for (DeliverymanOrg delivery : restaurant.getListOfDeliveryManOrg()) {
            if (delivery != null) {
                deliveryOrg.addItem(delivery);
            }
        }
    }
}

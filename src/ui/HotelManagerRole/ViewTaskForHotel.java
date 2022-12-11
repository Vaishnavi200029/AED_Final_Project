package ui.HotelManagerRole;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import ProjModel.Booking;
import ProjModel.Customer;
import ProjModel.CustomerDirectory;
import ProjModel.Hotel;
import ProjModel.LaundaryOrg;
import ProjModel.Organization;
import ProjModel.SystemAdmin;
import ProjModel.TransportationOrg;
import ProjectModel.services.HotelService;
import ProjectModel.services.Service;
import javax.swing.ImageIcon;

public class ViewTaskForHotel extends javax.swing.JPanel {

    private SystemAdmin systemAdmin;
    private Runnable callOnCreateMethod;
    private String user;
    private String type;
    private Hotel hotel;

    public ViewTaskForHotel(SystemAdmin systemAdmin, Runnable callOnCreateMethod, String user, String type, Hotel hotel) {
        initComponents();
        this.systemAdmin = systemAdmin;
        this.callOnCreateMethod = callOnCreateMethod;
        this.user = user;
        this.type = type;
        this.hotel = hotel;
        populateComboBox();
        populateTable();
        backButton.setOpaque(true);
        backButton.setIcon(new ImageIcon(ClassLoader.getSystemResource("icons/back.png")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        laundaryOrg = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        transportationOrg = new javax.swing.JComboBox<>();
        viewTask = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setLayout(null);

        jTable1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ORDER ID", "CUSTOMER NAME", "STATUS", "LAUNDARY", "TRANSPORTATION"
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
        jScrollPane1.setBounds(100, 230, 1243, 195);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SELECT A LAUNDARY ORG");
        add(jLabel1);
        jLabel1.setBounds(410, 480, 242, 24);

        laundaryOrg.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        laundaryOrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                laundaryOrgActionPerformed(evt);
            }
        });
        add(laundaryOrg);
        laundaryOrg.setBounds(410, 530, 202, 29);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("SELECT A TRANSPORTATION ORG");
        add(jLabel2);
        jLabel2.setBounds(750, 480, 304, 24);

        transportationOrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transportationOrgActionPerformed(evt);
            }
        });
        add(transportationOrg);
        transportationOrg.setBounds(750, 520, 216, 35);

        viewTask.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        viewTask.setText("ASSIGN AND CONFIRM TASK");
        viewTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewTaskActionPerformed(evt);
            }
        });
        add(viewTask);
        viewTask.setBounds(560, 630, 272, 46);

        backButton.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton);
        backButton.setBounds(60, 30, 102, 39);

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("VIEW ORDER DETAILS FOR HOTEL");
        add(jLabel3);
        jLabel3.setBounds(500, 120, 614, 47);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/HotelManagerRole/vector-jan-2021-19_generated.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        add(jLabel4);
        jLabel4.setBounds(-40, -20, 1690, 1100);
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        callOnCreateMethod.run();
    }//GEN-LAST:event_backButtonActionPerformed

    private void viewTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewTaskActionPerformed
        int selectedRowIndex = jTable1.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a booking to assign tasks.");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Booking booking = (Booking) model.getValueAt(selectedRowIndex, 0);

        HotelService hotelService = null;
        for (Service service : booking.getServices()) {
            if (hotel.getName().equals(service.getEnterprise().getName())) {
                hotelService = (HotelService) service;
                break;
            }
        }

        if (hotelService == null) {
            JOptionPane.showMessageDialog(this, "Cannot find hotel");
            return;
        }

        if (!hotelService.getStatus().equals(Service.Status.PENDING)) {
            JOptionPane.showMessageDialog(this, String.format("Booking '%s' should be 'PENDING' state to be accepted.",
                    booking.getId()));
            return;
        }

        LaundaryOrg laundary = (LaundaryOrg) laundaryOrg.getSelectedItem();
        TransportationOrg transportation = (TransportationOrg) transportationOrg.getSelectedItem();

        List<Organization> organizations = new ArrayList<>();
        for (HotelService.HotelServiceType type : hotelService.getHotelServices()) {
            switch (type) {
                case LAUNDARY:
                    if (laundary == null) {
                        JOptionPane.showMessageDialog(this, "Please select laundary organization to be assinged for the booking.");
                        return;
                    } else {
                        organizations.add(laundary);
                    }
                    break;
                case TRANSPORTATION:
                    if (transportation == null) {
                        JOptionPane.showMessageDialog(this, "Please select transportation organization to be assinged for the booking.");
                        return;
                    } else {
                        organizations.add(transportation);
                    }
                    break;
            }
        }

        for (Organization organization : organizations) {
            hotelService.addOrganization(organization);
        }
        hotelService.setStatus(Service.Status.CONFIRMED);
        JOptionPane.showMessageDialog(this, "Assigned all hotel services to the booking: " + booking.getId());
        populateTable();
    }//GEN-LAST:event_viewTaskActionPerformed

    private void laundaryOrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_laundaryOrgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_laundaryOrgActionPerformed

    private void transportationOrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transportationOrgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_transportationOrgActionPerformed

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);

        CustomerDirectory customerDirec = systemAdmin.getCustomerDirec(); //get all customers
        for (Customer customer : customerDirec.getListOfCustomer()) {
            for (Booking booking : customer.getBookingList()) {      //get booking details each customer
                for (Service service : booking.getServices()) {       //get services under booking
                    System.out.println("Enterprise : " + service.getEnterprise());
                    if (hotel.getName().equals(service.getEnterprise().getName())) {
                        HotelService hotelService = (HotelService) service;

                        Object row[] = new Object[10];
                        row[0] = booking;
                        row[1] = customer;
                        row[2] = hotelService.getStatus();
                        row[3] = "NO";
                        row[4] = "NO";

                        for (HotelService.HotelServiceType type : hotelService.getHotelServices()) {
                            switch (type) {
                                case LAUNDARY:
                                    row[3] = "YES";
                                    break;
                                case TRANSPORTATION:
                                    row[4] = "YES";
                                    break;
                            }
                        }
                        model.addRow(row);
                    }
                }
            }
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<LaundaryOrg> laundaryOrg;
    private javax.swing.JComboBox<TransportationOrg> transportationOrg;
    private javax.swing.JButton viewTask;
    // End of variables declaration//GEN-END:variables

    private void populateComboBox() {
        laundaryOrg.addItem(null);
        transportationOrg.addItem(null);

        for (LaundaryOrg laundary : hotel.getLaundaryOrg()) {
            if (laundary != null) {
                laundaryOrg.addItem(laundary);
            }
        }
        for (TransportationOrg transportation : hotel.getTransportationOrgList()) {
            if (transportation != null) {
                transportationOrg.addItem(transportation);
            }
        }
    }
}

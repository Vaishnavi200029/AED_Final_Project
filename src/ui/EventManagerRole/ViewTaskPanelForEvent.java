package ui.EventManagerRole;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import ProjModel.Booking;
import ProjModel.BusinessEvent;
import ProjModel.CateringService;
import ProjModel.Customer;
import ProjModel.CustomerDirectory;
import ProjModel.DecorServices;
import ProjModel.Organization;
import ProjModel.PhotographyService;
import ProjModel.SystemAdmin;
import ProjectModel.services.BusinessEventService;
import ProjectModel.services.Service;
import javax.swing.ImageIcon;

public class ViewTaskPanelForEvent extends javax.swing.JPanel {

    private SystemAdmin systemAdmin;
    private Runnable callOnCreateMethod;
    private String user;
    private String type;
    private BusinessEvent businessEvent;

    public ViewTaskPanelForEvent(SystemAdmin systemAdmin, Runnable callOnCreateMethod, String user, String type, BusinessEvent businessEvent) {
        initComponents();
        this.systemAdmin = systemAdmin;
        this.callOnCreateMethod = callOnCreateMethod;
        this.user = user;
        this.type = type;
        this.businessEvent = businessEvent;
        populateComboBox();
        populateTable();
        backBtn.setOpaque(true);
        backBtn.setIcon(new ImageIcon(ClassLoader.getSystemResource("icons/back.png")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cateringOrg = new javax.swing.JComboBox<>();
        decorOrg = new javax.swing.JComboBox<>();
        photographyOrg = new javax.swing.JComboBox<>();
        confirmBtn = new javax.swing.JButton();
        denyButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setLayout(null);

        backBtn.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn);
        backBtn.setBounds(27, 17, 89, 50);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("VIEW ORDER DETAILS FOR EVENTS");
        add(jLabel1);
        jLabel1.setBounds(470, 114, 457, 32);

        jTable1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BOOKING ID", "NAME", "STATUS", "CATERING", "DECOR", "PHOTOGRAPHY"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1);
        jScrollPane1.setBounds(196, 164, 1055, 261);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("SELECT A CATERING ORG");
        add(jLabel2);
        jLabel2.setBounds(310, 468, 212, 25);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("SELECT A DECOR ORG");
        add(jLabel3);
        jLabel3.setBounds(584, 471, 207, 25);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("SELECT A PHOTOGRAPHY ORG");
        add(jLabel4);
        jLabel4.setBounds(879, 468, 248, 25);

        add(cateringOrg);
        cateringOrg.setBounds(310, 514, 202, 35);

        add(decorOrg);
        decorOrg.setBounds(584, 514, 196, 35);

        add(photographyOrg);
        photographyOrg.setBounds(879, 514, 193, 35);

        confirmBtn.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        confirmBtn.setText("CONFIRM REQUEST");
        confirmBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmBtnActionPerformed(evt);
            }
        });
        add(confirmBtn);
        confirmBtn.setBounds(146, 779, 210, 41);

        denyButton.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        denyButton.setText("DENY REQUEST");
        denyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                denyButtonActionPerformed(evt);
            }
        });
        add(denyButton);
        denyButton.setBounds(438, 779, 189, 41);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/EventManagerRole/vector-jan-2021-19_generated.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        add(jLabel5);
        jLabel5.setBounds(0, 0, 1610, 1020);
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        callOnCreateMethod.run();
    }//GEN-LAST:event_backBtnActionPerformed

    private void confirmBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmBtnActionPerformed
        int selectedRowIndex = jTable1.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a booking to assign tasks.");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Booking booking = (Booking) model.getValueAt(selectedRowIndex, 0);

        BusinessEventService eventService = null;
        for (Service service : booking.getServices()) {
            if (businessEvent.getName().equals(service.getEnterprise().getName())) {
                eventService = (BusinessEventService) service;
                break;
            }
        }

        if (eventService == null) {
            JOptionPane.showMessageDialog(this, "Cannot find business event");
            return;
        }

        if (!eventService.getStatus().equals(Service.Status.PENDING)) {
            JOptionPane.showMessageDialog(this, String.format("Booking '%s' should be 'PENDING' state to be accepted.",
                    booking.getId()));
            return;
        }

        CateringService cateringService = (CateringService) cateringOrg.getSelectedItem();
        PhotographyService photographyService = (PhotographyService) photographyOrg.getSelectedItem();
        DecorServices decorService = (DecorServices) decorOrg.getSelectedItem();

        List<Organization> organizations = new ArrayList<>();
        for (BusinessEventService.BusinessEventServiceType type : eventService.getBusinessEventServiceTypes().keySet()) {
            switch (type) {
                case CATERING:
                    if (cateringService == null) {
                        JOptionPane.showMessageDialog(this, "Please select catering organization to be assinged for the booking.");
                        return;
                    } else {
                        organizations.add(cateringService);
                    }
                    break;
                case DECOR:
                    if (decorService == null) {
                        JOptionPane.showMessageDialog(this, "Please decor catering organization to be assinged for the booking.");
                        return;
                    } else {
                        organizations.add(decorService);
                    }
                    break;
                case PHOTOGRAPHY:
                    if (photographyService == null) {
                        JOptionPane.showMessageDialog(this, "Please select photography organization to be assinged for the booking.");
                        return;
                    } else {
                        organizations.add(photographyService);
                    }
                    break;
            }
        }

        for (Organization organization : organizations) {
            eventService.addOrganization(organization);
        }
        eventService.setStatus(Service.Status.CONFIRMED);
        JOptionPane.showMessageDialog(this, "Assigned all event services to the booking: " + booking.getId());
        populateTable();
    }//GEN-LAST:event_confirmBtnActionPerformed

    private void denyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_denyButtonActionPerformed
        int selectedRowIndex = jTable1.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a booking to deny request.");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Booking booking = (Booking) model.getValueAt(selectedRowIndex, 0);

        BusinessEventService eventService = null;
        for (Service service : booking.getServices()) {
            if (businessEvent.getName().equals(service.getEnterprise().getName())) {
                eventService = (BusinessEventService) service;
                break;
            }
        }

        if (eventService == null) {
            JOptionPane.showMessageDialog(this, "Cannot find business event");
            return;
        }

        if (!eventService.getStatus().equals(Service.Status.PENDING)) {
            JOptionPane.showMessageDialog(this, String.format("Booking '%s' should be 'PENDING' state to be denied.",
                    booking.getId()));
            return;
        }

        eventService.setStatus(Service.Status.REJECTED);
        JOptionPane.showMessageDialog(this, "Denied booking request with id: " + booking.getId());
        populateTable();
    }//GEN-LAST:event_denyButtonActionPerformed

    private void populateTable() {

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);

        CustomerDirectory customerDirec = systemAdmin.getCustomerDirec(); //get all customers
        for (Customer customer : customerDirec.getListOfCustomer()) {
            for (Booking booking : customer.getBookingList()) {      //get booking details each customer
                for (Service service : booking.getServices()) {       //get services under booking

                    if (service.getEnterprise().getName().equals(businessEvent.getName())) {

                        BusinessEventService businessEventService = (BusinessEventService) service;
                        Object row[] = new Object[10];
                        row[0] = booking;
                        row[1] = customer;
                        row[2] = businessEventService.getStatus();
                        row[3] = "NO";
                        row[4] = "NO";
                        row[5] = "NO";

                        for (BusinessEventService.BusinessEventServiceType type : businessEventService.getBusinessEventServiceTypes().keySet()) {
                            switch (type) {
                                case CATERING:
                                    row[3] = "YES";
                                    break;
                                case DECOR:
                                    row[4] = "YES";
                                    break;
                                case PHOTOGRAPHY:
                                    row[5] = "YES";
                                    break;
                            }
                        }
                        model.addRow(row);
                    }
                }
            }
        }

    }

    private void populateComboBox() {
        cateringOrg.removeAllItems();
        decorOrg.removeAllItems();
        photographyOrg.removeAllItems();

        cateringOrg.addItem(null);
        decorOrg.addItem(null);
        photographyOrg.addItem(null);

        for (CateringService catering : businessEvent.getListOfCatering()) {
            if (catering != null) {
                cateringOrg.addItem(catering);
            }
        }
        for (DecorServices decor : businessEvent.getListOfDecors()) {
            if (decor != null) {
                decorOrg.addItem(decor);
            }
        }
        for (PhotographyService photography : businessEvent.getListOfPhotographyServices()) {
            if (photography != null) {
                photographyOrg.addItem(photography);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JComboBox<CateringService> cateringOrg;
    private javax.swing.JButton confirmBtn;
    private javax.swing.JComboBox<ProjModel.DecorServices> decorOrg;
    private javax.swing.JButton denyButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<ProjModel.PhotographyService> photographyOrg;
    // End of variables declaration//GEN-END:variables
}

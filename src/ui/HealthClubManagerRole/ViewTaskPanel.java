package ui.HealthClubManagerRole;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import ProjModel.Booking;
import ProjModel.Customer;
import ProjModel.CustomerDirectory;
import ProjModel.HealthClub;
import ProjModel.Organization;
import ProjModel.PhysicianOrg;
import ProjModel.SystemAdmin;
import ProjModel.TherapistOrg;
import ProjModel.TrainerOrg;
import ProjectModel.services.HealthClubService;
import ProjectModel.services.Service;
import javax.swing.ImageIcon;

public class ViewTaskPanel extends javax.swing.JPanel {

    private SystemAdmin systemAdmin;
    private Runnable callOnCreateMethod;
    private String user;
    private String type;
    private HealthClub healthClub;

    public ViewTaskPanel(SystemAdmin systemAdmin, Runnable callOnCreateMethod, String user, String type, HealthClub healthClub) {
        initComponents();
        this.systemAdmin = systemAdmin;
        this.callOnCreateMethod = callOnCreateMethod;
        this.user = user;
        this.type = type;
        this.healthClub = healthClub;
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
        therapistOrg = new javax.swing.JComboBox<>();
        physicianOrg = new javax.swing.JComboBox<>();
        trainerOrg = new javax.swing.JComboBox<>();
        assignWork = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setLayout(null);

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ORDER ID", "NAME", "STATUS", "THERAPIST", "PHYSICIAN", "TRAINER"
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
        jScrollPane1.setBounds(119, 97, 1225, 320);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setText("VIEW ORDER DETAILS");
        add(jLabel1);
        jLabel1.setBounds(570, 50, 334, 28);

        therapistOrg.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(therapistOrg);
        therapistOrg.setBounds(283, 502, 252, 28);

        physicianOrg.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(physicianOrg);
        physicianOrg.setBounds(937, 502, 246, 28);

        trainerOrg.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(trainerOrg);
        trainerOrg.setBounds(614, 502, 238, 28);

        assignWork.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        assignWork.setText("ASSIGN AND CONFIRM TASK");
        assignWork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignWorkActionPerformed(evt);
            }
        });
        add(assignWork);
        assignWork.setBounds(610, 610, 256, 44);

        backButton.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton);
        backButton.setBounds(119, 17, 72, 41);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel2.setText("SELECT A THERAPIST ORG");
        add(jLabel2);
        jLabel2.setBounds(283, 450, 252, 37);

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel3.setText("SELECT A PHYSICIAN ORG");
        add(jLabel3);
        jLabel3.setBounds(937, 456, 246, 24);

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel4.setText("SELECT A TRAINER ORG");
        add(jLabel4);
        jLabel4.setBounds(614, 456, 238, 24);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/HealthClubManagerRole/VECTOR_BACKGROUND_1_cleanup.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        add(jLabel5);
        jLabel5.setBounds(0, 0, 1610, 1010);
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        callOnCreateMethod.run();
    }//GEN-LAST:event_backButtonActionPerformed

    private void assignWorkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignWorkActionPerformed
        int selectedRowIndex = jTable1.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a booking to assign tasks.");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Booking booking = (Booking) model.getValueAt(selectedRowIndex, 0);

        HealthClubService healthClubService = null;
        for (Service service : booking.getServices()) {
            if (healthClub.getName().equals(service.getEnterprise().getName())) {
                healthClubService = (HealthClubService) service;
                break;
            }
        }

        if (healthClubService == null) {
            JOptionPane.showMessageDialog(this, "Cannot find health club");
            return;
        }
        if (!healthClubService.getStatus().equals(Service.Status.PENDING)) {
            JOptionPane.showMessageDialog(this, String.format("Booking '%s' should be 'PENDING' state to be accepted.",
                    booking.getId()));
            return;
        }

        TherapistOrg therapist = (TherapistOrg) therapistOrg.getSelectedItem();
        PhysicianOrg physician = (PhysicianOrg) physicianOrg.getSelectedItem();
        TrainerOrg trainer = (TrainerOrg) trainerOrg.getSelectedItem();

        List<Organization> organizations = new ArrayList<>();
        for (HealthClubService.HealthClubServiceType type : healthClubService.getHealthClubServices()) {
            switch (type) {
                case THERAPIST:
                    if (therapist == null) {
                        JOptionPane.showMessageDialog(this, "Please select therapist organization to be assinged for the booking.");
                        return;
                    } else {
                        organizations.add(therapist);
                    }
                    break;
                case PHYSICIAN:
                    if (physician == null) {
                        JOptionPane.showMessageDialog(this, "Please select physician organization to be assinged for the booking.");
                        return;
                    } else {
                        organizations.add(physician);
                    }
                    break;
                case TRAINER:
                    if (trainer == null) {
                        JOptionPane.showMessageDialog(this, "Please select trainer organization to be assinged for the booking.");
                        return;
                    } else {
                        organizations.add(trainer);
                    }
                    break;
            }
        }

        for (Organization organization : organizations) {
            healthClubService.addOrganization(organization);
        }
        healthClubService.setStatus(Service.Status.CONFIRMED);
        JOptionPane.showMessageDialog(this, "Assigned all healthclub services to the booking: " + booking.getId());

        return;

    }//GEN-LAST:event_assignWorkActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignWork;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<PhysicianOrg> physicianOrg;
    private javax.swing.JComboBox<TherapistOrg> therapistOrg;
    private javax.swing.JComboBox<TrainerOrg> trainerOrg;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);

        Object row[] = new Object[10];
        CustomerDirectory customerDirec = systemAdmin.getCustomerDirec(); //get all customers
        for (Customer customer : customerDirec.getListOfCustomer()) {
            for (Booking booking : customer.getBookingList()) {      //get booking details each customer
                for (Service service : booking.getServices()) {       //get services under booking

                    if (service.getEnterprise().getName().equals(healthClub.getName())) {

                        HealthClubService healthClubService = (HealthClubService) service;

                        row[0] = booking;
                        row[1] = customer;
                        row[2] = healthClubService.getStatus();
                        row[3] = "NO";
                        row[4] = "NO";
                        row[5] = "NO";

                        for (HealthClubService.HealthClubServiceType type : healthClubService.getHealthClubServices()) {
                            switch (type) {
                                case THERAPIST:
                                    row[3] = "YES";
                                    break;
                                case PHYSICIAN:
                                    row[4] = "YES";
                                    break;
                                case TRAINER:
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
        therapistOrg.addItem(null);
        physicianOrg.addItem(null);
        trainerOrg.addItem(null);

        for (TherapistOrg therapist : healthClub.getListOfTherapistOrg()) {
            if (therapist != null) {
                therapistOrg.addItem(therapist);
            }
        }
        for (PhysicianOrg physician : healthClub.getListOfPhysicianOrg()) {
            if (physician != null) {
                physicianOrg.addItem(physician);
            }
        }
        for (TrainerOrg trainer : healthClub.getListOfTrainerOrg()) {
            if (trainer != null) {
                trainerOrg.addItem(trainer);
            }
        }
    }

}

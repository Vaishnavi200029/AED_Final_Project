package ui.HealthClubManagerRole;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import ProjModel.ServicesDirectory;
import ProjModel.HealthClub;
import ProjModel.Franchise;
import ProjModel.PhysicianOrg;
import ProjModel.SystemAdmin;
import ProjModel.TherapistOrg;
import ProjModel.TrainerOrg;
import javax.swing.ImageIcon;

public class ManageOrganizationPanel extends javax.swing.JPanel {

    private SystemAdmin systemAdmin;
    private Runnable callOnCreateMethod;
    private String user;
    private Franchise network;

    public ManageOrganizationPanel(SystemAdmin systemAdmin, Runnable callOnCreateMethod, String user, Franchise network) {
        initComponents();
        this.systemAdmin = systemAdmin;
        this.callOnCreateMethod = callOnCreateMethod;
        this.user = user;
        this.network = network;
        cityNameTextField.setText(network.getName());
        cityNameTextField.setEditable(false);
        populateTable();
        backButton.setOpaque(true);
        backButton.setIcon(new ImageIcon(ClassLoader.getSystemResource("icons/back.png")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        orgCombo = new javax.swing.JComboBox<>();
        deleteBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        contactField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        cityNameTextField = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        nameField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        orgCombo1 = new javax.swing.JComboBox<>();
        deleteBtn1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        addButton1 = new javax.swing.JButton();
        updateButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        contactField1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        backButton1 = new javax.swing.JButton();
        cityNameTextField1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setLayout(null);

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ORGANIZATION TYPE", "NAME", "CONTACT", "CITY"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1);
        jScrollPane1.setBounds(35, 230, 1071, 276);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("NAME ");
        add(jLabel2);
        jLabel2.setBounds(393, 615, 53, 22);

        nameField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(nameField);
        nameField.setBounds(620, 614, 218, 23);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("CONTACT");
        add(jLabel3);
        jLabel3.setBounds(393, 672, 189, 22);

        orgCombo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        orgCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a organization", "Physician", "Trainer", "Therapist" }));
        orgCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orgComboActionPerformed(evt);
            }
        });
        add(orgCombo);
        orgCombo.setBounds(620, 552, 218, 23);

        deleteBtn.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        deleteBtn.setText("DELETE");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        add(deleteBtn);
        deleteBtn.setBounds(810, 810, 110, 40);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("CITY");
        add(jLabel6);
        jLabel6.setBounds(393, 731, 145, 22);

        addButton.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        addButton.setText("ADD");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        add(addButton);
        addButton.setBounds(411, 811, 110, 40);

        updateButton.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        updateButton.setText("UPDATE");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        add(updateButton);
        updateButton.setBounds(620, 811, 110, 40);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("MANAGE ORGANIZATION FOR HEALTH CLUB");
        add(jLabel1);
        jLabel1.setBounds(298, 153, 561, 29);

        contactField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        contactField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactFieldActionPerformed(evt);
            }
        });
        add(contactField);
        contactField.setBounds(620, 671, 218, 23);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("ORGANIZATION TYPE ");
        add(jLabel7);
        jLabel7.setBounds(393, 557, 189, 22);

        backButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton);
        backButton.setBounds(35, 19, 72, 36);
        add(cityNameTextField);
        cityNameTextField.setBounds(620, 724, 218, 22);

        jPanel1.setLayout(null);

        jTable2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ORGANIZATION TYPE", "NAME", "CONTACT", "CITY"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(35, 230, 1071, 276);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("NAME ");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(393, 615, 53, 22);

        nameField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(nameField1);
        nameField1.setBounds(620, 614, 218, 23);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("CONTACT");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(393, 672, 189, 22);

        orgCombo1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        orgCombo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a organization", "Physician", "Trainer", "Therapist" }));
        orgCombo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orgCombo1ActionPerformed(evt);
            }
        });
        jPanel1.add(orgCombo1);
        orgCombo1.setBounds(620, 552, 218, 28);

        deleteBtn1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        deleteBtn1.setText("DELETE");
        deleteBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtn1ActionPerformed(evt);
            }
        });
        jPanel1.add(deleteBtn1);
        deleteBtn1.setBounds(830, 820, 93, 28);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("CITY");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(393, 731, 145, 22);

        addButton1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        addButton1.setText("ADD");
        addButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(addButton1);
        addButton1.setBounds(393, 811, 128, 40);

        updateButton1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        updateButton1.setText("UPDATE");
        updateButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(updateButton1);
        updateButton1.setBounds(620, 811, 97, 40);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setText("MANAGE ORGANIZATION FOR HEALTH CLUB");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(298, 153, 561, 29);

        contactField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        contactField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactField1ActionPerformed(evt);
            }
        });
        jPanel1.add(contactField1);
        contactField1.setBounds(620, 671, 218, 23);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("ORGANIZATION TYPE ");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(393, 557, 189, 22);

        backButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        backButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(backButton1);
        backButton1.setBounds(35, 19, 100, 50);
        jPanel1.add(cityNameTextField1);
        cityNameTextField1.setBounds(620, 724, 218, 22);

        jLabel11.setText("jLabel11");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(767, 487, 43, 16);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/HealthClubManagerRole/VECTOR_BACKGROUND_1_cleanup.jpg"))); // NOI18N
        jLabel12.setText("jLabel12");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(0, 0, 1610, 1010);

        add(jPanel1);
        jPanel1.setBounds(0, 0, 0, 0);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/HealthClubManagerRole/VECTOR_BACKGROUND_1_cleanup.jpg"))); // NOI18N
        jLabel13.setText("jLabel13");
        add(jLabel13);
        jLabel13.setBounds(0, 0, 1630, 1020);
    }// </editor-fold>//GEN-END:initComponents

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int selectedRowIndex = jTable1.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to delete");
            return;
        }
        String OrgType = (String) model.getValueAt(selectedRowIndex, 0);
        String OrgName = (String) model.getValueAt(selectedRowIndex, 1);
        ServicesDirectory enterpriseDirec = network.getEnterpriseDirectory();
        for (HealthClub club : enterpriseDirec.getListOfHealthClub()) {
            if (club.findManager(user) != null) {
                if (OrgType.equals("Physician") && club.getListOfPhysicianOrg() != null) {
                    for (PhysicianOrg physician : club.getListOfPhysicianOrg()) {
                        if (physician.getName().equals(OrgName)) {
                            club.deletePhysician(physician);
                            JOptionPane.showMessageDialog(this, "Deleted successfully");
                            populateTable();
                        }
                    }
                } else if (OrgType.equals("Trainer") && club.getListOfTrainerOrg() != null) {
                    for (TrainerOrg trainer : club.getListOfTrainerOrg()) {
                        if (trainer.getName().equals(OrgName)) {
                            club.deleteTrainer(trainer);
                            JOptionPane.showMessageDialog(this, "Deleted successfully");
                            populateTable();
                        }
                    }
                } else if (OrgType.equals("Therapist") && club.getListOfTherapistOrg() != null) {
                    for (TherapistOrg therapist : club.getListOfTherapistOrg()) {
                        if (therapist.getName().equals(OrgName)) {
                            club.deleteTherapist(therapist);
                            JOptionPane.showMessageDialog(this, "Deleted successfully");
                            populateTable();
                        }
                    }
                } else {
                    return;
                }

            }
        }

    }//GEN-LAST:event_deleteBtnActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        callOnCreateMethod.run();
    }//GEN-LAST:event_backButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        String networkName = network.getName();  //find the network 
        String name = nameField.getText();

        if (name == null || name.length() < 2) {
            JOptionPane.showMessageDialog(this, "Organization name should be at least 2 characters long.");
            return;
        }

        String contact = contactField.getText();
        String orgType1 = orgCombo.getSelectedItem().toString();
        ServicesDirectory enterpriseDirc = network.getEnterpriseDirectory();
        List<HealthClub> healthClub = enterpriseDirc.getListOfHealthClub();
        for (int i = 0; i < healthClub.size(); i++) {
            healthClub.get(i).findManager(user);      //find healthclub for which manager is working for
            if (orgType1.equals("Physician")) {
                healthClub.get(i).addPhysicianOrg(name, contact, networkName);
                JOptionPane.showMessageDialog(this, "Physician Organisation added successfully");
            } else if (orgType1.equals("Trainer")) {
                healthClub.get(i).addTraineOrg(name, contact, networkName);
                JOptionPane.showMessageDialog(this, "Trainer Organisation successfully");
            } else {
                healthClub.get(i).addTherapistOrg(name, contact, networkName);
                JOptionPane.showMessageDialog(this, "Therapist Organisation added successfully");
            }
        }
        populateTable();
    }//GEN-LAST:event_addButtonActionPerformed

    private void contactFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactFieldActionPerformed

    private void orgComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orgComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_orgComboActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        if (jTable1.getSelectedRowCount() != 1) {
            JOptionPane.showMessageDialog(this, "Please select a row to update.");
        }

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        String orgType = orgCombo.getSelectedItem().toString();
        String orgname = model.getValueAt(jTable1.getSelectedRow(), 1).toString();

        ServicesDirectory enterpriseDirec = network.getEnterpriseDirectory();
        for (HealthClub club : enterpriseDirec.getListOfHealthClub()) {
            if (orgType.equals("Physician") && club.getListOfPhysicianOrg() != null) {
                for (PhysicianOrg phy : club.getListOfPhysicianOrg()) {
                    if (phy.getName().equals(orgname)) {
                        phy.setName(nameField.getText());
                        phy.setContact(contactField.getText());
                        JOptionPane.showMessageDialog(this, "Updated successfully");
                        populateTable();
                        return;
                    }
                }
            } else if (orgType.equals("Therapist") && club.getListOfTherapistOrg() != null) {
                for (TherapistOrg therapist : club.getListOfTherapistOrg()) {
                    if (therapist.getName().equals(orgname)) {
                        therapist.setName(nameField.getText());
                        therapist.setContact(contactField.getText());
                        JOptionPane.showMessageDialog(this, "Updated successfully");
                        populateTable();
                        return;
                    }
                }
            } else if (orgType.equals("Trainer") && club.getListOfTrainerOrg() != null) {
                for (TrainerOrg trainer : club.getListOfTrainerOrg()) {
                    if (trainer.getName().equals(orgname)) {
                        trainer.setName(nameField.getText());
                        trainer.setContact(contactField.getText());
                        JOptionPane.showMessageDialog(this, "Updated successfully");
                        populateTable();
                        return;
                    }
                }
            }

        }
    }//GEN-LAST:event_updateButtonActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        if (jTable1.getSelectedRowCount() != 1) {
            return;
        }

        String orgType = model.getValueAt(jTable1.getSelectedRow(), 0).toString();
        String orgName = model.getValueAt(jTable1.getSelectedRow(), 1).toString();
        String orgContact = model.getValueAt(jTable1.getSelectedRow(), 2).toString();
        String orgCity = model.getValueAt(jTable1.getSelectedRow(), 3).toString();

        nameField.setText(orgName);
        contactField.setText(orgContact);
        cityNameTextField.setText(orgCity);
        orgCombo.setSelectedItem(orgType);
        cityNameTextField.setEnabled(false);
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable2MouseClicked

    private void orgCombo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orgCombo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_orgCombo1ActionPerformed

    private void deleteBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteBtn1ActionPerformed

    private void addButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addButton1ActionPerformed

    private void updateButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateButton1ActionPerformed

    private void contactField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactField1ActionPerformed

    private void backButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_backButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton addButton1;
    private javax.swing.JButton backButton;
    private javax.swing.JButton backButton1;
    private javax.swing.JTextField cityNameTextField;
    private javax.swing.JTextField cityNameTextField1;
    private javax.swing.JTextField contactField;
    private javax.swing.JTextField contactField1;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton deleteBtn1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextField nameField1;
    private javax.swing.JComboBox<String> orgCombo;
    private javax.swing.JComboBox<String> orgCombo1;
    private javax.swing.JButton updateButton;
    private javax.swing.JButton updateButton1;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        Object row[] = new Object[10];
        String orgType1 = orgCombo.getSelectedItem().toString();
        Franchise network1 = systemAdmin.findNetwork(network.getName());
        ServicesDirectory enterpriseDirec = network1.getEnterpriseDirectory();
        for (HealthClub health : enterpriseDirec.getListOfHealthClub()) {
            if (health.findManager(user) != null) {
                if (health.getListOfPhysicianOrg() != null) {
                    row[0] = "Physician";
                    for (PhysicianOrg physician : health.getListOfPhysicianOrg()) {
                        row[0] = "Physician";
                        row[1] = physician.getName();
                        row[2] = physician.getContact();
                        row[3] = network1.getName();
                        model.addRow(row);
                    }
                }
                if (health.getListOfTherapistOrg() != null) {
                    row[0] = "Therapist";
                    for (TherapistOrg therapist : health.getListOfTherapistOrg()) {
                        row[0] = "Therapist";
                        row[1] = therapist.getName();
                        row[2] = therapist.getContact();
                        row[3] = network.getName();
                        model.addRow(row);
                    }
                }
                if (health.getListOfTrainerOrg() != null) {
                    row[0] = "Trainer";
                    for (TrainerOrg trainer : health.getListOfTrainerOrg()) {
                        row[0] = "Trainer";
                        row[1] = trainer.getName();
                        row[2] = trainer.getContact();
                        row[3] = network.getName();
                        model.addRow(row);
                    }
                }

            }
        }
    }

}

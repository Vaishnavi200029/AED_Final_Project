package ui.EventManagerRole;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import ProjModel.BusinessEvent;
import ProjModel.CateringService;
import ProjModel.DecorServices;
import ProjModel.ServicesDirectory;
import ProjModel.Franchise;
import ProjModel.PhotographyService;
import ProjModel.SystemAdmin;
import javax.swing.ImageIcon;

public class ManageOrganisationForEvents extends javax.swing.JPanel {

    private SystemAdmin systemAdmin;
    private Runnable callOnCreateMethod;
    private String type;
    private String user;
    private Franchise network;

    public ManageOrganisationForEvents(SystemAdmin systemAdmin, Runnable callOnCreateMethod, String user, String type, Franchise network) {
        initComponents();
        this.systemAdmin = systemAdmin;
        this.callOnCreateMethod = callOnCreateMethod;
        this.user = user;
        this.type = type;
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
        backButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        orgCombo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        contactField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        addBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        cityNameTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setLayout(null);

        jTable1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ORGANISATION TYPE", "NAME", "CONTACT", "CITY"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
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
        jScrollPane1.setBounds(190, 220, 1116, 290);

        backButton.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton);
        backButton.setBounds(31, 19, 108, 40);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MANAGE ORGANISATION FOR EVENTS ");
        add(jLabel1);
        jLabel1.setBounds(540, 140, 591, 32);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ORGANISATION TYPE");
        add(jLabel2);
        jLabel2.setBounds(590, 620, 196, 24);

        orgCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a organisation", "Decor", "Catering", "Photography" }));
        add(orgCombo);
        orgCombo.setBounds(830, 610, 210, 35);

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NAME");
        add(jLabel3);
        jLabel3.setBounds(590, 680, 119, 24);
        add(nameField);
        nameField.setBounds(830, 680, 210, 35);

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CONTACT");
        add(jLabel4);
        jLabel4.setBounds(590, 750, 119, 24);
        add(contactField);
        contactField.setBounds(830, 750, 210, 35);

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CITY");
        add(jLabel5);
        jLabel5.setBounds(590, 820, 98, 24);

        addBtn.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        addBtn.setText("ADD");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        add(addBtn);
        addBtn.setBounds(590, 910, 107, 37);

        deleteBtn.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        deleteBtn.setText("DELETE");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        add(deleteBtn);
        deleteBtn.setBounds(920, 910, 117, 39);

        updateBtn.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        updateBtn.setText("UPDATE");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });
        add(updateBtn);
        updateBtn.setBounds(750, 910, 119, 37);

        cityNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityNameTextFieldActionPerformed(evt);
            }
        });
        add(cityNameTextField);
        cityNameTextField.setBounds(830, 810, 210, 35);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/EventManagerRole/vector-jan-2021-19_generated.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
        add(jLabel6);
        jLabel6.setBounds(-10, -80, 1630, 1140);
    }// </editor-fold>//GEN-END:initComponents

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Object row[] = new Object[20];
        String networkName = network.getName();
        String name = nameField.getText();
        String contact = contactField.getText();

        if (name == null || name.length() < 2) {
            JOptionPane.showMessageDialog(this, "Organization name should be at least 2 characters long.");
            return;
        }

        String orgType1 = orgCombo.getSelectedItem().toString();      // org-type (physician org)     
        ServicesDirectory enterpriseDirc = network.getEnterpriseDirectory();
        List<BusinessEvent> events = enterpriseDirc.getListOfEvents();
        for (int i = 0; i < events.size(); i++) {
            events.get(i).findManager(user);      //find healthclub for which manager is working for
            if (orgType1.equals("Catering")) {
                events.get(i).addCateringService(name, contact, networkName);
                row[0] = orgType1;
                row[1] = name;
                row[2] = contact;
                row[3] = networkName;
                model.addRow(row);
                JOptionPane.showMessageDialog(this, "Catering Organisation added successfully");
                return;
            } else if (orgType1.equals("Decor")) {
                events.get(i).addDecorService(name, contact, networkName);
                row[0] = orgType1;
                row[1] = name;
                row[2] = contact;
                row[3] = networkName;
                model.addRow(row);
                JOptionPane.showMessageDialog(this, "Decor Organisation successfully");
                return;
            } else {
                events.get(i).addPhotographyService(name, contact, networkName);
                row[0] = orgType1;
                row[1] = name;
                row[2] = contact;
                row[3] = networkName;
                model.addRow(row);
                JOptionPane.showMessageDialog(this, "Photography Organisation added successfully");
                return;
            }
        }
    }//GEN-LAST:event_addBtnActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        callOnCreateMethod.run();
    }//GEN-LAST:event_backButtonActionPerformed

    private void cityNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cityNameTextFieldActionPerformed

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
        for (BusinessEvent event : enterpriseDirec.getListOfEvents()) {
            if (event.findManager(user) != null) {
                if (OrgType.equals("Catering") && event.getListOfCatering() != null) {
                    for (CateringService catering : event.getListOfCatering()) {
                        if (catering.getName().equals(OrgName)) {
                            event.deleteCatering(catering);
                            JOptionPane.showMessageDialog(this, "Deleted successfully");
                            populateTable();
                        }
                    }
                } else if (OrgType.equals("Photography") && event.getListOfPhotographyServices() != null) {
                    for (PhotographyService photo : event.getListOfPhotographyServices()) {
                        if (photo.getName().equals(OrgName)) {
                            event.deletePhotography(photo);
                            JOptionPane.showMessageDialog(this, "Deleted successfully");
                            populateTable();
                        }
                    }
                } else if (OrgType.equals("Decor") && event.getListOfDecors() != null) {
                    for (DecorServices decor : event.getListOfDecors()) {
                        if (decor.getName().equals(OrgName)) {
                            event.deleteDecor(decor);
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

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed

        if (jTable1.getSelectedRowCount() != 1) {
            JOptionPane.showMessageDialog(this, "Please select a row to update.");
        }

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        String orgType = orgCombo.getSelectedItem().toString();
        String orgname = model.getValueAt(jTable1.getSelectedRow(), 1).toString();

        ServicesDirectory enterpriseDirec = network.getEnterpriseDirectory();
        for (BusinessEvent event : enterpriseDirec.getListOfEvents()) {
            if (orgType.equals("Catering") && event.getListOfCatering() != null) {
                for (CateringService catering : event.getListOfCatering()) {
                    if (catering.getName().equals(orgname)) {
                        catering.setName(nameField.getText());
                        catering.setContact(contactField.getText());
                        JOptionPane.showMessageDialog(this, "Updated successfully");
                        populateTable();
                        return;
                    }
                }
            } else if (orgType.equals("Decor") && event.getListOfDecors() != null) {
                for (DecorServices decor : event.getListOfDecors()) {
                    if (decor.getName().equals(orgname)) {
                        decor.setName(nameField.getText());
                        decor.setContact(contactField.getText());
                        JOptionPane.showMessageDialog(this, "Updated successfully");
                        populateTable();
                        return;
                    }
                }
            } else if (orgType.equals("Photography") && event.getListOfPhotographyServices() != null) {
                for (PhotographyService photo : event.getListOfPhotographyServices()) {
                    if (photo.getName().equals(orgname)) {
                        photo.setName(nameField.getText());
                        photo.setContact(contactField.getText());
                        JOptionPane.showMessageDialog(this, "Updated successfully");
                        populateTable();
                        return;
                    }
                }
            }

        }
    }//GEN-LAST:event_updateBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton backButton;
    private javax.swing.JTextField cityNameTextField;
    private javax.swing.JTextField contactField;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nameField;
    private javax.swing.JComboBox<String> orgCombo;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        Object row[] = new Object[10];
        String orgType1 = orgCombo.getSelectedItem().toString();
        Franchise network1 = systemAdmin.findNetwork(network.getName());
        ServicesDirectory enterpriseDirec = network1.getEnterpriseDirectory();
        if (enterpriseDirec == null) {
            return;
        }
        for (BusinessEvent event : enterpriseDirec.getListOfEvents()) {
            if (event.findManager(user) != null) {
                if (event.getListOfCatering() != null) {
                    row[0] = "Catering";
                    for (CateringService catering : event.getListOfCatering()) {
                        row[0] = "Catering";
                        row[1] = catering.getName();
                        row[2] = catering.getContact();
                        row[3] = network1.getName();
                        model.addRow(row);
                    }
                }
                if (event.getListOfDecors() != null) {
                    row[0] = "Decor";
                    for (DecorServices decor : event.getListOfDecors()) {
                        row[0] = "Decor";
                        row[1] = decor.getName();
                        row[2] = decor.getContact();
                        row[3] = network.getName();
                        model.addRow(row);
                    }
                }
                if (event.getListOfPhotographyServices() != null) {
                    row[0] = "Photography";
                    for (PhotographyService photo : event.getListOfPhotographyServices()) {
                        row[0] = "Photography";
                        row[1] = photo.getName();
                        row[2] = photo.getContact();
                        row[3] = network.getName();
                        model.addRow(row);
                    }
                }

            }
        }
    }
}

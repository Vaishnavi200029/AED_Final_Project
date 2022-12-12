package ui.HealthClubManagerRole;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import ProjModel.ServicesDirectory;
import ProjModel.HealthClub;
import ProjModel.Manager;
import ProjModel.Franchise;
import ProjModel.PhysicianOrg;
import ProjModel.SystemAdmin;
import ProjModel.TherapistOrg;
import ProjModel.TrainerOrg;
import javax.swing.ImageIcon;
import ui.main.Validator;

public class OrganizationAdminPanel extends javax.swing.JPanel {

    private SystemAdmin systemAdmin;
    private Runnable callOnCreateMethod;
    private String user;
    private String type;
    private Franchise network;

    public OrganizationAdminPanel(SystemAdmin systemAdmin, Runnable callOnCreateMethod, String user, String type, Franchise network) {
        initComponents();
        this.systemAdmin = systemAdmin;
        this.callOnCreateMethod = callOnCreateMethod;
        this.user = user;
        this.type = type;
        this.network = network;
        networkName.setText(network.getName());
        networkName.setEditable(false);
        populateTable();
        backButton.setOpaque(true);
        backButton.setIcon(new ImageIcon(ClassLoader.getSystemResource("icons/back.png")));
    }

    public boolean validateName() {
        if (nameField.getText().matches("[a-zA-Z]{2,19}") && nameField.getText() != null) {
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "Invalid input : name should contain only alphabets");
            return false;
        }
    }

    public boolean PasswordName() {
        if (passwordField.getText().matches("[a-zA-Z]{3,}") && passwordField.getText() != null) {
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "Invalid input : password should contain more than 3 or more letters");
            return false;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        orgCombo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        passwordField = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        orgName = new javax.swing.JComboBox<>();
        updateButton = new javax.swing.JButton();
        networkName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setLayout(null);

        jTable1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NETWORK", "ORGNANIZATION TYPE", "ORGANIZATION NAME", "NAME", "USERNAME", "PASSWORD"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true, true
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
        jScrollPane1.setBounds(244, 138, 882, 164);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("ORGANIZATION TYPE");
        add(jLabel1);
        jLabel1.setBounds(274, 432, 192, 24);

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 1, 32)); // NOI18N
        jLabel9.setText("Organization Admin");
        add(jLabel9);
        jLabel9.setBounds(510, 60, 340, 42);

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel6.setText("NETWORK");
        add(jLabel6);
        jLabel6.setBounds(274, 363, 101, 24);

        orgCombo.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        orgCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Physician", "Trainer", "Therapist" }));
        orgCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orgComboActionPerformed(evt);
            }
        });
        add(orgCombo);
        orgCombo.setBounds(490, 431, 199, 30);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel2.setText("NAME");
        add(jLabel2);
        jLabel2.setBounds(826, 363, 67, 24);

        nameField.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        add(nameField);
        nameField.setBounds(948, 362, 183, 25);

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel3.setText("USERNAME");
        add(jLabel3);
        jLabel3.setBounds(826, 432, 104, 24);
        add(usernameField);
        usernameField.setBounds(948, 426, 183, 22);

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel4.setText("PASSWORD");
        add(jLabel4);
        jLabel4.setBounds(826, 496, 104, 24);
        add(passwordField);
        passwordField.setBounds(948, 490, 186, 22);

        addButton.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        addButton.setText("ADD");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        add(addButton);
        addButton.setBounds(596, 611, 155, 40);

        deleteButton.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        deleteButton.setText("DELETE");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        add(deleteButton);
        deleteButton.setBounds(960, 610, 110, 40);

        backButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton);
        backButton.setBounds(39, 15, 100, 50);

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel5.setText("ORGANIZATION NAME ");
        add(jLabel5);
        jLabel5.setBounds(274, 496, 195, 24);

        orgName.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        add(orgName);
        orgName.setBounds(487, 495, 202, 25);

        updateButton.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        updateButton.setText("UPDATE");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        add(updateButton);
        updateButton.setBounds(785, 611, 122, 40);

        networkName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkNameActionPerformed(evt);
            }
        });
        add(networkName);
        networkName.setBounds(491, 357, 190, 22);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/HealthClubManagerRole/VECTOR_BACKGROUND_1_cleanup.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        add(jLabel7);
        jLabel7.setBounds(0, -20, 1610, 1040);

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel8.setText("NETWORK");
        add(jLabel8);
        jLabel8.setBounds(274, 363, 101, 24);
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        callOnCreateMethod.run();
    }//GEN-LAST:event_backButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Object row[] = new Object[20];
        String orgType = orgCombo.getSelectedItem().toString();
        String orgName1 = orgName.getSelectedItem().toString();
        String name = nameField.getText();
        String username = usernameField.getText();
        String password = passwordField.getText();

        if (!Validator.validateName(this, name) || !Validator.validateUserName(this, username)
                || !Validator.validatePassword(this, password)) {
            return;
        }

        if (!systemAdmin.userExistsInSystem(username)) {

            ServicesDirectory enterpriseDirec = network.getEnterpriseDirectory();
            List<HealthClub> list = enterpriseDirec.getListOfHealthClub();

            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).findManager(user) != null) {    //if health club manager found in network
                    if (orgType.equals("Physician")) {
                        List<PhysicianOrg> org1 = list.get(i).getListOfPhysicianOrg();
                        for (int j = 0; j < org1.size(); j++) {
                            if (org1.get(j).getName().equals(orgName1)) {
                                org1.get(j).addManager(name, network.getName(), username, password); //add managers for each org (eg:physiican org)
                                row[0] = network.getName();
                                row[1] = orgType;
                                row[2] = orgName1;
                                row[3] = name;
                                row[4] = username;
                                row[5] = password;
                                model.addRow(row);
                                systemAdmin.addUser(username, password, "Physician");
                                JOptionPane.showMessageDialog(this, "Successfully added Physician organization");
                                return;
                            }
                        }
                    } else if (orgType.equals("Trainer")) {
                        List<TrainerOrg> org2 = list.get(i).getListOfTrainerOrg();
                        for (int j = 0; j < org2.size(); j++) {
                            if (org2.get(j).getName().equals(orgName1)) {
                                org2.get(j).addManager(name, network.getName(), username, password);
                                row[0] = network.getName();
                                row[1] = orgType;
                                row[2] = orgName1;
                                row[3] = name;
                                row[4] = username;
                                row[5] = password;
                                model.addRow(row);
                                systemAdmin.addUser(username, password, "Trainer");
                                JOptionPane.showMessageDialog(this, "Successfully added Trainer organization");
                                return;
                            }
                        }
                    } else {
                        List<TherapistOrg> org3 = list.get(i).getListOfTherapistOrg();
                        for (int j = 0; j < org3.size(); j++) {
                            if (org3.get(j).getName().equals(orgName1)) {
                                org3.get(j).addManager(name, network.getName(), username, password);
                                row[0] = network.getName();
                                row[1] = orgType;
                                row[2] = orgName1;
                                row[3] = name;
                                row[4] = username;
                                row[5] = password;
                                model.addRow(row);
                                systemAdmin.addUser(username, password, "Therapist");
                                JOptionPane.showMessageDialog(this, "Successfully added Therapist organization");
                                return;
                            }
                        }
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, " username already exits");
        }
    }//GEN-LAST:event_addButtonActionPerformed

    private void orgComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orgComboActionPerformed
        orgName.removeAllItems();
        String orgType = orgCombo.getSelectedItem().toString();

        ServicesDirectory enterpriseDirec = network.getEnterpriseDirectory();
        List<HealthClub> list = enterpriseDirec.getListOfHealthClub();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).findManager(user) != null) {
                if (orgType.equals("Physician")) {
                    List<PhysicianOrg> org1 = list.get(i).getListOfPhysicianOrg();
                    for (int j = 0; j < org1.size(); j++) {
                        orgName.addItem(org1.get(j).getName());
                    }
                } else if (orgType.equals("Trainer")) {
                    List<TrainerOrg> org2 = list.get(i).getListOfTrainerOrg();
                    for (int j = 0; j < org2.size(); j++) {
                        orgName.addItem(org2.get(j).getName());
                    }
                } else {
                    List<TherapistOrg> org3 = list.get(i).getListOfTherapistOrg();
                    for (int j = 0; j < org3.size(); j++) {
                        orgName.addItem(org3.get(j).getName());
                    }
                }
                return;
            }
        }

    }//GEN-LAST:event_orgComboActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int selectedRowIndex = jTable1.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to delete");
            return;
        }
        String orgType = (String) model.getValueAt(selectedRowIndex, 1);
        String OrgName = (String) model.getValueAt(selectedRowIndex, 2);
        String selectedUser = (String) model.getValueAt(selectedRowIndex, 4);
        ServicesDirectory enterpriseDirec = network.getEnterpriseDirectory();
        for (HealthClub club : enterpriseDirec.getListOfHealthClub()) {
            if (club.findManager(user) != null) {
                if (orgType.equals("Therapist") && club.getListOfTherapistOrg() != null) {
                    for (TherapistOrg therapist : club.getListOfTherapistOrg()) {
                        if (therapist.getName().equals(OrgName)) {
                            for (Manager man : therapist.getListOfManager()) {
                                if (man.getUsername().equals(selectedUser)) {
                                    therapist.deleteManager(man);
                                    JOptionPane.showMessageDialog(this, " Organisation Manager added successfully");
                                    populateTable();
                                    return;
                                }
                            }
                        }
                    }
                } else if (orgType.equals("Physician") && club.getListOfPhysicianOrg() != null) {
                    for (PhysicianOrg physician : club.getListOfPhysicianOrg()) {
                        if (physician.getName().equals(OrgName)) {
                            for (Manager man : physician.getListOfManager()) {
                                if (man.getUsername().equals(selectedUser)) {
                                    physician.deleteManager(man);
                                    JOptionPane.showMessageDialog(this, " Organisation Manager added successfully");
                                    populateTable();
                                    return;
                                }
                            }
                        }
                    }
                } else {
                    for (TrainerOrg trainer : club.getListOfTrainerOrg()) {
                        if (trainer.getName().equals(OrgName)) {
                            for (Manager man : trainer.getListOfManager()) {
                                if (man.getUsername().equals(selectedUser)) {
                                    trainer.deleteManager(man);
                                    JOptionPane.showMessageDialog(this, " Organisation Manager added successfully");
                                    populateTable();
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        String city = model.getValueAt(jTable1.getSelectedRow(), 0).toString();
        String orgType = model.getValueAt(jTable1.getSelectedRow(), 1).toString();
        String oName = model.getValueAt(jTable1.getSelectedRow(), 2).toString();
        String managerName = model.getValueAt(jTable1.getSelectedRow(), 3).toString();
        String managerUsername = model.getValueAt(jTable1.getSelectedRow(), 4).toString();
        String managerPassword = model.getValueAt(jTable1.getSelectedRow(), 5).toString();

        nameField.setText(managerName);
        usernameField.setText(managerUsername);
        passwordField.setText(managerPassword);
        usernameField.setEnabled(false);
        orgCombo.setSelectedItem(orgType);
        orgName.setSelectedItem(oName);
    }//GEN-LAST:event_jTable1MouseClicked

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        if (jTable1.getSelectedRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to update");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        if (jTable1.getSelectedRowCount() == 1) {

            String orgType = orgCombo.getSelectedItem().toString();
            String orgname = orgName.getSelectedItem().toString();
            String userName = usernameField.getText();
            String password = passwordField.getText();

            ServicesDirectory enterpriseDirec = network.getEnterpriseDirectory();
            for (HealthClub club : enterpriseDirec.getListOfHealthClub()) {
                if (orgType.equals("Physician") && club.getListOfPhysicianOrg() != null) {
                    for (PhysicianOrg phy : club.getListOfPhysicianOrg()) {
                        for (Manager man : phy.getListOfManager()) {
                            if (man.getUsername().equals(usernameField.getText())) {
                                man.setName(nameField.getText());
                                man.setPassword(passwordField.getText());
                                systemAdmin.updateUser(userName, password);
                                JOptionPane.showMessageDialog(this, "Updated successfully");
                                populateTable();
                                return;
                            }
                        }
                    }
                } else if (orgType.equals("Therapist") && club.getListOfTherapistOrg() != null) {
                    for (TherapistOrg thera : club.getListOfTherapistOrg()) {
                        for (Manager man : thera.getListOfManager()) {
                            if (man.getUsername().equals(usernameField.getText())) {
                                man.setName(nameField.getText());
                                man.setPassword(passwordField.getText());
                                systemAdmin.updateUser(userName, password);
                                JOptionPane.showMessageDialog(this, "Updated successfully");
                                populateTable();
                                return;
                            }
                        }
                    }
                } else if (orgType.equals("Trainer") && club.getListOfTrainerOrg() != null) {
                    for (TrainerOrg trainer : club.getListOfTrainerOrg()) {
                        for (Manager man : trainer.getListOfManager()) {
                            if (man.getUsername().equals(usernameField.getText())) {
                                man.setName(nameField.getText());
                                man.setPassword(passwordField.getText());
                                systemAdmin.updateUser(userName, password);
                                JOptionPane.showMessageDialog(this, "Updated successfully");
                                populateTable();
                                return;
                            }
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Invalid organization");
                }
            }
        }
    }//GEN-LAST:event_updateButtonActionPerformed

    private void networkNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networkNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_networkNameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton backButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextField networkName;
    private javax.swing.JComboBox<String> orgCombo;
    private javax.swing.JComboBox<String> orgName;
    private javax.swing.JTextField passwordField;
    private javax.swing.JButton updateButton;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        Object row[] = new Object[10];
        String orgType1 = orgCombo.getSelectedItem().toString();
        Franchise network1 = systemAdmin.findNetwork(network.getName());
        ServicesDirectory enterpriseDirec = network.getEnterpriseDirectory();
        if (enterpriseDirec == null) {
            return;
        }
        for (HealthClub health : enterpriseDirec.getListOfHealthClub()) {
            if (health.findManager(user) != null) {
                if (health.getListOfPhysicianOrg() != null) {
                    row[0] = "Physician";
                    for (PhysicianOrg physician : health.getListOfPhysicianOrg()) {
                        for (Manager manager : physician.getListOfManager()) {       //add manager 
                            row[0] = network1.getName();
                            row[1] = "Physician";
                            row[2] = physician.getName();
                            row[3] = manager.getName();
                            row[4] = manager.getUsername();
                            row[5] = manager.getPassword();
                            model.addRow(row);
                        }
                    }
                }
                if (health.getListOfTherapistOrg() != null) {
                    row[0] = "Therapist";
                    for (TherapistOrg therapist : health.getListOfTherapistOrg()) {
                        for (Manager manager : therapist.getListOfManager()) {       //add manager 
                            row[0] = network1.getName();
                            row[1] = "Therapist";
                            row[2] = therapist.getName();
                            row[3] = manager.getName();
                            row[4] = manager.getUsername();
                            row[5] = manager.getPassword();
                            model.addRow(row);
                        }
                    }
                }
                if (health.getListOfTrainerOrg() != null) {
                    row[0] = "Trainer";
                    for (TrainerOrg trainer : health.getListOfTrainerOrg()) {
                        for (Manager manager : trainer.getListOfManager()) {       //add manager 
                            row[0] = network1.getName();
                            row[1] = "Trainer";
                            row[2] = trainer.getName();
                            row[3] = manager.getName();
                            row[4] = manager.getUsername();
                            row[5] = manager.getPassword();
                            model.addRow(row);
                        }
                    }
                }

            }
        }
    }
}

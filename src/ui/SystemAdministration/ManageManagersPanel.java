package ui.SystemAdministration;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import ProjModel.BusinessEvent;
import ProjModel.ServicesDirectory;
import ProjModel.HealthClub;
import ProjModel.Hotel;
import ProjModel.Manager;
import ProjModel.Franchise;
import ProjModel.Restaurant;
import ProjModel.SystemAdmin;
import javax.swing.ImageIcon;
import ui.main.Validator;

public class ManageManagersPanel extends javax.swing.JPanel {

    private SystemAdmin systemAdmin;
    private Runnable callOnCreateMethod;

    public ManageManagersPanel(SystemAdmin systemAdmin, Runnable callOnCreateMethod) {
        initComponents();
        this.systemAdmin = systemAdmin;
        this.callOnCreateMethod = callOnCreateMethod;
        for (Franchise network : systemAdmin.getListOfNetwork()) {
            networkType.addItem(network.getName());
        }
        populateTable();
        backButton.setOpaque(true);
        backButton.setIcon(new ImageIcon(ClassLoader.getSystemResource("icons/back.png")));

    }

    public boolean validateName() {
        if (nameField.getText().matches("[a-zA-Z]{2,19}")) {
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "Invalid input : name should contain only alphabets");
            return false;
        }
    }

    public boolean PasswordName() {
        if (passwordField.getText().matches("[a-zA-Z]{3}")) {
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "Invalid input : password should contain only 3 inputs");
            return false;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backButton = new javax.swing.JButton();
        lblsysadmin = new javax.swing.JLabel();
        deleteBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        addButton = new javax.swing.JButton();
        nameField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        networkType = new javax.swing.JComboBox<>();
        updateBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        passwordField = new javax.swing.JTextField();
        enterpriseType = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        enterpriseName = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();

        setLayout(null);

        backButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton);
        backButton.setBounds(44, 13, 108, 40);

        lblsysadmin.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblsysadmin.setForeground(new java.awt.Color(255, 255, 255));
        lblsysadmin.setText("MANAGE SERVICE MANAGERS");
        add(lblsysadmin);
        lblsysadmin.setBounds(560, 110, 362, 29);

        deleteBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        deleteBtn.setText("DELETE");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        add(deleteBtn);
        deleteBtn.setBounds(870, 770, 108, 39);

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "FRANCHISE NAME", "SERVICE TYPE", "SERVICE NAME", "NAME", "USERNAME", "PASSWORD"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
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
        jScrollPane1.setBounds(220, 170, 1070, 260);

        addButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        addButton.setText("ADD");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        add(addButton);
        addButton.setBounds(470, 770, 121, 38);

        nameField.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });
        add(nameField);
        nameField.setBounds(730, 590, 194, 29);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SERVICE");
        add(jLabel1);
        jLabel1.setBounds(560, 490, 161, 22);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("FRANCHISE");
        add(jLabel2);
        jLabel2.setBounds(560, 440, 102, 22);

        networkType.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        networkType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a franchise" }));
        networkType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkTypeActionPerformed(evt);
            }
        });
        add(networkType);
        networkType.setBounds(730, 440, 194, 34);

        updateBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        updateBtn.setText("UPDATE");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });
        add(updateBtn);
        updateBtn.setBounds(670, 770, 112, 38);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("MANAGER NAME");
        add(jLabel3);
        jLabel3.setBounds(560, 590, 151, 22);

        usernameField.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        add(usernameField);
        usernameField.setBounds(730, 640, 194, 29);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("USERNAME");
        add(jLabel4);
        jLabel4.setBounds(560, 640, 102, 22);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("PASSWORD");
        add(jLabel5);
        jLabel5.setBounds(560, 690, 102, 22);

        passwordField.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        add(passwordField);
        passwordField.setBounds(730, 690, 194, 29);

        enterpriseType.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        enterpriseType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a service", "Health Club", "Restaurant", "Hotel", "Business Event" }));
        enterpriseType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterpriseTypeActionPerformed(evt);
            }
        });
        add(enterpriseType);
        enterpriseType.setBounds(730, 490, 194, 34);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("SERVICE NAME");
        add(jLabel7);
        jLabel7.setBounds(560, 540, 173, 22);

        enterpriseName.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        enterpriseName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecte name of service" }));
        add(enterpriseName);
        enterpriseName.setBounds(730, 540, 194, 34);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/SystemAdministration/vector-OCT-2020-116_generated.jpg"))); // NOI18N
        add(jLabel6);
        jLabel6.setBounds(0, -120, 1610, 1600);
    }// </editor-fold>//GEN-END:initComponents

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        int selectedRowIndex = jTable1.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to delete");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        String networkName = (String) model.getValueAt(selectedRowIndex, 0);
        String enterpriseType = (String) model.getValueAt(selectedRowIndex, 1);
        String enterpriseName = (String) model.getValueAt(selectedRowIndex, 2);
        String selectedUser = (String) model.getValueAt(selectedRowIndex, 4);
        Franchise network = systemAdmin.findNetwork(networkName);
        ServicesDirectory enterpriseDirec = network.getEnterpriseDirectory();
        if (enterpriseType.equals("Business Event")) {
            for (BusinessEvent event : enterpriseDirec.getListOfEvents()) {
                for (Manager man : event.getListOfManager()) {
                    if (man.getName().equals(selectedUser)) {
                        event.deleteManager(man);
                        JOptionPane.showMessageDialog(this, "Deleted successfully");
                        populateTable();
                    }
                }
            }
        } else if (enterpriseType.equals("Restaurant")) {
            for (Restaurant res : enterpriseDirec.getListOfRestaurants()) {
                for (Manager man : res.getListOfManager()) {
                    if (man.getName().equals(selectedUser)) {
                        res.deleteManager(man);
                        JOptionPane.showMessageDialog(this, "Deleted successfully");
                        populateTable();
                    }
                }
            }
        } else if (enterpriseType.equals("Hotel")) {
            for (Hotel hotel : enterpriseDirec.getListOfHotel()) {
                for (Manager man : hotel.getListOfManager()) {
                    if (man.getName().equals(selectedUser)) {
                        hotel.deleteManager(man);
                        JOptionPane.showMessageDialog(this, "Deleted successfully");
                        populateTable();
                    }
                }
            }
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed

    }//GEN-LAST:event_nameFieldActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Object row[] = new Object[10];
        String name = nameField.getText();
        String userName = usernameField.getText();
        String password = passwordField.getText();
        String networkName = networkType.getSelectedItem().toString();
        String enterpriseType1 = enterpriseType.getSelectedItem().toString();   //type of enterprises eg:healthclub
        String enterpriseName1 = enterpriseName.getSelectedItem().toString();

        if (!Validator.validateName(this, name) || !Validator.validateUserName(this, userName)
                || !Validator.validatePassword(this, password)) {
            return;
        }

        if (!systemAdmin.userExistsInSystem(userName)) {
            Franchise network = systemAdmin.findNetwork(networkName);  //finiding network
            ServicesDirectory enterpriseDirec = network.getEnterpriseDirectory();
            if (enterpriseType1.equals("Health Club") && enterpriseDirec != null) {
                HealthClub healthclubName1 = enterpriseDirec.findHealthClub(enterpriseName1);
                healthclubName1.addManager(name, userName, password);
                systemAdmin.getUserNamePasswordMap();
                systemAdmin.addUser(userName, password, "Health Club");
                row[0] = networkName;
                row[1] = "Health Club";
                row[2] = enterpriseName1;
                row[3] = name;
                row[4] = userName;
                row[5] = password;
                model.addRow(row);
                return;
            } else if (enterpriseType1.equals("Business Event") && enterpriseDirec != null) {
                BusinessEvent event1 = enterpriseDirec.findEvent(enterpriseName1);
                event1.addManager(name, userName, password);
                systemAdmin.addUser(userName, password, "Business Event");
                row[0] = networkName;
                row[1] = "BusinessEvent";
                row[2] = enterpriseName1;
                row[3] = name;
                row[4] = userName;
                row[5] = password;
                model.addRow(row);
            } else if (enterpriseType1.equals("Restaurant") && enterpriseDirec != null) {
                Restaurant res1 = enterpriseDirec.findRestaurant(enterpriseName1);
                res1.addManager(userName, userName, password);
                systemAdmin.addUser(userName, password, "Restaurant");

                row[0] = networkName;
                row[1] = "Restaurant";
                row[2] = enterpriseName1;
                row[3] = name;
                row[4] = userName;
                row[5] = password;
                model.addRow(row);
            } else if (enterpriseType1.equals("Hotel") && enterpriseDirec != null) {
                Hotel hotel1 = enterpriseDirec.findHotel(enterpriseName1);
                hotel1.addManager(name, userName, password);
                systemAdmin.addUser(userName, password, "Hotel");
                row[0] = networkName;
                row[1] = "Hotel";
                row[2] = enterpriseName1;
                row[3] = name;
                row[4] = userName;
                row[5] = password;
                model.addRow(row);
            }
        } else {
            JOptionPane.showMessageDialog(this, String.format("This username '%s' already exists", userName));
        }
        JOptionPane.showMessageDialog(this, "Manager added successfully");
        nameField.setText("");
        usernameField.setText("");
        passwordField.setText("");
        enterpriseName.setSelectedIndex(0);
        enterpriseType.setSelectedIndex(0);
        networkType.setSelectedIndex(0);
    }//GEN-LAST:event_addButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        callOnCreateMethod.run();
    }//GEN-LAST:event_backButtonActionPerformed

    private void networkTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networkTypeActionPerformed

    }//GEN-LAST:event_networkTypeActionPerformed

    private void enterpriseTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterpriseTypeActionPerformed
        enterpriseName.removeAllItems();
        String networkName = networkType.getSelectedItem().toString();
        Franchise network = systemAdmin.findNetwork(networkName);
        ServicesDirectory enterpriseDirec = network.getEnterpriseDirectory();
        String enterpriseType1 = enterpriseType.getSelectedItem().toString();
        if (enterpriseType1.equals("Health Club")) {
            for (HealthClub club : enterpriseDirec.getListOfHealthClub()) {
                enterpriseName.addItem(club.getName());
            }
        } else if (enterpriseType1.equals("Business Event")) {
            for (BusinessEvent event : enterpriseDirec.getListOfEvents()) {
                enterpriseName.addItem(event.getName());
            }
        } else if (enterpriseType1.equals("Restaurant")) {
            for (Restaurant res : enterpriseDirec.getListOfRestaurants()) {
                enterpriseName.addItem(res.getName());
            }
        } else if (enterpriseType1.equals("Hotel")) {
            for (Hotel hotel : enterpriseDirec.getListOfHotel()) {
                enterpriseName.addItem(hotel.getName());
            }
        } else {
            return;
        }

    }//GEN-LAST:event_enterpriseTypeActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed

        if (jTable1.getSelectedRowCount() != 1) {
            JOptionPane.showMessageDialog(this, "Please select a row to update.");
        }

        String networkName = networkType.getSelectedItem().toString();
        String enterpriseType1 = enterpriseType.getSelectedItem().toString();
        String enterpriseName1 = enterpriseName.getSelectedItem().toString();
        String managerUserName = usernameField.getText();

        String password = passwordField.getText();
        String name = nameField.getText();

        Franchise network = systemAdmin.findNetwork(networkName);  //finiding network
        ServicesDirectory enterpriseDirec = network.getEnterpriseDirectory();

        if (enterpriseType1.equals("Health Club")) {
            HealthClub healthclubName1 = enterpriseDirec.findHealthClub(enterpriseName1);
            for (Manager man : healthclubName1.getListOfManager()) {
                if (man.getUsername().equals(managerUserName)) {

                    man.setName(name);
                    man.setPassword(password);

                    systemAdmin.updateUser(managerUserName, password);
                    populateTable();
                    JOptionPane.showMessageDialog(this, " Updated successfully ");
                    return;
                }
            }
        } else if (enterpriseType1.equals("Business Event")) {
            BusinessEvent event1 = enterpriseDirec.findEvent(enterpriseName1);
            for (Manager man : event1.getListOfManager()) {
                if (man.getUsername().equals(managerUserName)) {

                    man.setName(name);
                    man.setPassword(password);

                    systemAdmin.updateUser(managerUserName, password);
                    populateTable();
                    JOptionPane.showMessageDialog(this, " Updated successfully ");
                    return;
                }
            }
        } else if (enterpriseType1.equals("Hotel")) {
            Hotel hotel = enterpriseDirec.findHotel(enterpriseName1);
            for (Manager man : hotel.getListOfManager()) {
                if (man.getUsername().equals(managerUserName)) {

                    man.setName(name);
                    man.setPassword(password);

                    systemAdmin.updateUser(managerUserName, password);
                    populateTable();
                    JOptionPane.showMessageDialog(this, " Updated successfully ");
                    return;
                }
            }
        } else if (enterpriseType1.equals("Restaurant")) {
            Restaurant res = enterpriseDirec.findRestaurant(enterpriseName1);
            for (Manager man : res.getListOfManager()) {
                if (man.getUsername().equals(managerUserName)) {
                    man.setName(name);
                    man.setPassword(password);

                    systemAdmin.updateUser(managerUserName, password);

                    populateTable();
                    JOptionPane.showMessageDialog(this, "Updated successfully ");
                    return;
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Invalid enterprise [" + enterpriseType1 + "]");
        }

    }//GEN-LAST:event_updateBtnActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        if (jTable1.getSelectedRowCount() != 1) {
            return;
        }

        String networkName = model.getValueAt(jTable1.getSelectedRow(), 0).toString();

        String eType = model.getValueAt(jTable1.getSelectedRow(), 1).toString();
        String eName = model.getValueAt(jTable1.getSelectedRow(), 2).toString();

        String managerName = model.getValueAt(jTable1.getSelectedRow(), 3).toString();
        String managerUserName = model.getValueAt(jTable1.getSelectedRow(), 4).toString();
        String managerPassword = model.getValueAt(jTable1.getSelectedRow(), 5).toString();

        nameField.setText(managerName);
        usernameField.setText(managerUserName);
        passwordField.setText(managerPassword);

        networkType.setSelectedItem(networkName);
        enterpriseName.setSelectedItem(eName);
        enterpriseType.setSelectedItem(eType);
    }//GEN-LAST:event_jTable1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton backButton;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JComboBox<String> enterpriseName;
    private javax.swing.JComboBox<String> enterpriseType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblsysadmin;
    private javax.swing.JTextField nameField;
    private javax.swing.JComboBox<String> networkType;
    private javax.swing.JTextField passwordField;
    private javax.swing.JButton updateBtn;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        Object row[] = new Object[10];
        for (Franchise network : systemAdmin.getListOfNetwork()) {        //populate network
            row[0] = network.getName();
            ServicesDirectory enterpriseDirec = network.getEnterpriseDirectory();  //populate enterpirse name
            for (BusinessEvent event : enterpriseDirec.getListOfEvents()) {   //poplulate events enterprise
                row[1] = "Business Event";
                row[2] = event.getName();
                for (Manager manager : event.getListOfManager()) {
                    row[0] = network.getName();
                    row[1] = "Business Event";
                    row[2] = event.getName();
                    row[3] = manager.getName();
                    row[4] = manager.getUsername();
                    row[5] = manager.getPassword();
                    model.addRow(row);
                }
            }
            for (Restaurant res : enterpriseDirec.getListOfRestaurants()) {   //poplulate restauarant enterprise
                row[1] = "Restaurant";
                row[2] = res.getName();
                for (Manager manager : res.getListOfManager()) {
                    row[0] = network.getName();
                    row[1] = "Restaurant";
                    row[2] = res.getName();
                    row[3] = manager.getName();
                    row[4] = manager.getUsername();
                    row[5] = manager.getPassword();
                    model.addRow(row);
                }
            }
            for (Hotel hotel : enterpriseDirec.getListOfHotel()) {   //poplulate hotel enterprise
                row[1] = "Hotel";
                row[2] = hotel.getName();
                for (Manager manager : hotel.getListOfManager()) {
                    row[0] = network.getName();
                    row[1] = "Hotel";
                    row[2] = hotel.getName();
                    row[3] = manager.getName();
                    row[4] = manager.getUsername();
                    row[5] = manager.getPassword();
                    model.addRow(row);
                }
            }
            for (HealthClub health : enterpriseDirec.getListOfHealthClub()) {   //poplulate hotel enterprise
                row[1] = "Health Club";
                row[2] = health.getName();
                for (Manager manager : health.getListOfManager()) {
                    row[0] = network.getName();
                    row[1] = "Health Club";
                    row[2] = health.getName();
                    row[3] = manager.getName();
                    row[4] = manager.getUsername();
                    row[5] = manager.getPassword();
                    model.addRow(row);
                }
            }

        }
    }

}

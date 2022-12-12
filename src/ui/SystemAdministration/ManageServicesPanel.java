package ui.SystemAdministration;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import ProjModel.BusinessEvent;
import ProjModel.Services;
import ProjModel.ServicesDirectory;
import ProjModel.HealthClub;
import ProjModel.Hotel;
import ProjModel.Franchise;
import ProjModel.Restaurant;
import ProjModel.SystemAdmin;
import javax.swing.ImageIcon;
import ui.main.Validator;

public class ManageServicesPanel extends javax.swing.JPanel {

    private SystemAdmin systemAdmin;
    private Runnable callOnCreateMethod;

    public ManageServicesPanel(SystemAdmin systemAdmin, Runnable callOnCreateMethod) {
        initComponents();
        this.systemAdmin = systemAdmin;
        this.callOnCreateMethod = callOnCreateMethod;
        for (Franchise franchise : systemAdmin.getListOfNetwork()) {      //populate items in franchise combobox
            networkType.addItem(franchise.getName());
        }
        for (Franchise franchise : systemAdmin.getListOfNetwork()) {
            networkCombo.addItem(franchise.getName());
        }
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

    public boolean validateContactNum() {
        if (contactField.getText().matches("[0-9]{10}")) {
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "Invalid contcat: contact should contain only 10 digits");
            return false;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblsysadmin = new javax.swing.JLabel();
        updateBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        addBtn = new javax.swing.JButton();
        nameField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        networkType = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        enterpriseType = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        contactField = new javax.swing.JTextField();
        networkCombo = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        viewBtn = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setLayout(null);

        lblsysadmin.setFont(new java.awt.Font("Tahoma", 1, 32)); // NOI18N
        lblsysadmin.setForeground(new java.awt.Color(255, 255, 255));
        lblsysadmin.setText("MANAGE SERVICES");
        add(lblsysadmin);
        lblsysadmin.setBounds(520, 70, 370, 60);

        updateBtn.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        updateBtn.setText("UPDATE");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });
        add(updateBtn);
        updateBtn.setBounds(680, 810, 160, 38);

        deleteBtn.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        deleteBtn.setText("DELETE");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        add(deleteBtn);
        deleteBtn.setBounds(920, 810, 160, 41);

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "FRANCHISE NAME", "SERVICE ", "SERVICE TYPE", "CONTACT"
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
        jScrollPane1.setBounds(150, 230, 1120, 260);

        addBtn.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        addBtn.setText("ADD");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        add(addBtn);
        addBtn.setBounds(440, 810, 160, 38);

        nameField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(nameField);
        nameField.setBounds(720, 650, 180, 32);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SERVICE TYPE");
        add(jLabel1);
        jLabel1.setBounds(530, 590, 140, 22);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("FRANCHISE");
        add(jLabel2);
        jLabel2.setBounds(530, 520, 102, 22);

        networkType.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        networkType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select any one" }));
        networkType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkTypeActionPerformed(evt);
            }
        });
        add(networkType);
        networkType.setBounds(720, 510, 180, 32);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("SERVICE NAME");
        add(jLabel3);
        jLabel3.setBounds(530, 650, 174, 29);

        enterpriseType.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        enterpriseType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select any one", "Business Event", "Hotel", "Restaurant", "Health Club" }));
        enterpriseType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterpriseTypeActionPerformed(evt);
            }
        });
        add(enterpriseType);
        enterpriseType.setBounds(720, 580, 180, 32);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("CONTACT");
        add(jLabel6);
        jLabel6.setBounds(530, 720, 166, 22);

        contactField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(contactField);
        contactField.setBounds(720, 720, 180, 32);

        networkCombo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        networkCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select any one " }));
        add(networkCombo);
        networkCombo.setBounds(558, 180, 190, 30);

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("SELECT A FRANCHISE");
        add(jLabel7);
        jLabel7.setBounds(360, 180, 194, 27);

        viewBtn.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        viewBtn.setText("View");
        viewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBtnActionPerformed(evt);
            }
        });
        add(viewBtn);
        viewBtn.setBounds(780, 180, 108, 30);

        backButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        backButton.setForeground(new java.awt.Color(255, 255, 255));
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton);
        backButton.setBounds(43, 25, 108, 50);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/SystemAdministration/vector-OCT-2020-116_generated.jpg"))); // NOI18N
        add(jLabel5);
        jLabel5.setBounds(0, -20, 1590, 1030);
    }// </editor-fold>//GEN-END:initComponents

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        int selectedRowIndex = jTable1.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to delete");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        String networkName = (String) model.getValueAt(selectedRowIndex, 0);
        String enterpriseType = (String) model.getValueAt(selectedRowIndex, 2);
        String enterpriseName = (String) model.getValueAt(selectedRowIndex, 1);
        Franchise network = systemAdmin.findNetwork(networkName);
        ServicesDirectory enterpriseDirec = network.getEnterpriseDirectory();
        if (enterpriseType.equals("Business Event") && enterpriseDirec.getListOfEvents() != null) {
            for (BusinessEvent event : enterpriseDirec.getListOfEvents()) {
                if (event.getName().equals(enterpriseName)) {
                    enterpriseDirec.deleteEnterpriseEvent(event);
                    JOptionPane.showMessageDialog(this, "Enterprise deleted successfully");
                    populateTable();
                }
            }
        } else if (enterpriseType.equals("Hotel") && enterpriseDirec.getListOfHotel() != null) {
            for (Hotel hotel : enterpriseDirec.getListOfHotel()) {
                if (hotel.getName().equals(enterpriseName)) {
                    enterpriseDirec.deleteEnterpriseHotel(hotel);
                    JOptionPane.showMessageDialog(this, "Enterprise deleted successfully");
                    populateTable();
                }
            }
        } else if (enterpriseType.equals("Restaurant") && enterpriseDirec.getListOfRestaurants() != null) {
            for (Restaurant res : enterpriseDirec.getListOfRestaurants()) {
                if (res.getName().equals(enterpriseName)) {
                    enterpriseDirec.deleteEnterpriseRestaurant(res);
                    JOptionPane.showMessageDialog(this, "Enterprise deleted successfully");
                    populateTable();
                }
            }
        } else if (enterpriseType.equals("Health Club") && enterpriseDirec.getListOfHealthClub() != null) {
            for (HealthClub club : enterpriseDirec.getListOfHealthClub()) {
                if (club.getName().equals(enterpriseName)) {
                    enterpriseDirec.deleteEnterpriseHealthClub(club);
                    JOptionPane.showMessageDialog(this, "Enterprise deleted successfully");
                    populateTable();
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "not found");
        }


    }//GEN-LAST:event_deleteBtnActionPerformed

    private void enterpriseTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterpriseTypeActionPerformed

    }//GEN-LAST:event_enterpriseTypeActionPerformed

    private void networkTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networkTypeActionPerformed

    }//GEN-LAST:event_networkTypeActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        String contact = contactField.getText();
        String name = nameField.getText();
        String networkName = networkType.getSelectedItem().toString();
        String enterpriseType1 = enterpriseType.getSelectedItem().toString();
        Franchise network = systemAdmin.findNetwork(networkName);
       
        if (!Validator.validatePhone(this, contact)){
            return;
        }

        if (name == null || name.length() < 2) {
            JOptionPane.showMessageDialog(this, "Invalid input: Enterprise name should be atleast 2 characters long.");
            return;
        }

        ServicesDirectory enterpriseDirec = network.getEnterpriseDirectory();
        if (enterpriseType1.equals("Health Club") && enterpriseDirec != null) {
            enterpriseDirec.addHealthClub(name, contact);
            JOptionPane.showMessageDialog(this, "Enterprise added successfully");
            return;
        } else if (enterpriseType1.equals("Restaurant") && enterpriseDirec != null) {
            enterpriseDirec.addRestaurant(name, contact);
            JOptionPane.showMessageDialog(this, "Enterprise added successfully");

            return;
        } else if (enterpriseType1.equals("Business Event") && enterpriseDirec != null) {
            enterpriseDirec.addBusinessEvent(name, contact);
            JOptionPane.showMessageDialog(this, "Enterprise added successfully");

            return;
        } else if (enterpriseType1.equals("Hotel") && enterpriseDirec != null) {
            enterpriseDirec.addHotel(name, contact);
            JOptionPane.showMessageDialog(this, "Enterprise added successfully");
            return;
        }
        nameField.setText("");
        contactField.setText("");
    }//GEN-LAST:event_addBtnActionPerformed

    private void viewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBtnActionPerformed
        populateTable();
    }//GEN-LAST:event_viewBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        if (jTable1.getSelectedRowCount() != 1) {
            JOptionPane.showMessageDialog(this, "Please select 1 row to update");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        String networkName = networkType.getSelectedItem().toString();
        String enterpriseType1 = enterpriseType.getSelectedItem().toString();
        String enterpriseName = model.getValueAt(jTable1.getSelectedRow(), 1).toString();

        Franchise network = systemAdmin.findNetwork(networkName);
        ServicesDirectory enterpriseDirec = network.getEnterpriseDirectory();

        Services enterpriseToUpdate = null;
        if (enterpriseType1.equals("Health Club") && enterpriseDirec != null) {

            for (HealthClub list : enterpriseDirec.getListOfHealthClub()) {
                if (list.getName().equals(enterpriseName)) {  //if enterprise name matches 
                    enterpriseToUpdate = list;
                }
            }
            JOptionPane.showMessageDialog(this, "Enterprise updated successfully");
            return;
        } else if (enterpriseType1.equals("Business Event") && enterpriseDirec != null) {
            for (BusinessEvent list : enterpriseDirec.getListOfEvents()) {
                if (list.getName().equals(enterpriseName)) {
                    enterpriseToUpdate = list;
                }
            }
        } else if (enterpriseType1.equals("Hotel") && enterpriseDirec != null) {
            for (Hotel list : enterpriseDirec.getListOfHotel()) {
                if (list.getName().equals(enterpriseName)) {           //if enterprise name matches 
                    enterpriseToUpdate = list;
                }
            }
        } else if (enterpriseType1.equals("Business Event") && enterpriseDirec != null) {
            for (Restaurant list : enterpriseDirec.getListOfRestaurants()) {
                if (list.getName().equals(enterpriseName)) {           //if enterprise name matches 
                    enterpriseToUpdate = list;
                }
            }
        }

        if (enterpriseToUpdate == null) {
            JOptionPane.showMessageDialog(this, "Unknown enterprise.");
            return;
        }

        enterpriseToUpdate.setName(nameField.getText());
        enterpriseToUpdate.setContact(contactField.getText());
        populateTable();
    }//GEN-LAST:event_updateBtnActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        if (jTable1.getSelectedRowCount() != 1) {
            return;
        }

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        String networkName = model.getValueAt(jTable1.getSelectedRow(), 0).toString();
        String enterpriseName = model.getValueAt(jTable1.getSelectedRow(), 1).toString();
        String enterpriseType1 = model.getValueAt(jTable1.getSelectedRow(), 2).toString();
        String enterpriseContact = model.getValueAt(jTable1.getSelectedRow(), 3).toString();

        networkType.setSelectedItem(networkName);
        enterpriseType.setSelectedItem(enterpriseType1);
        nameField.setText(enterpriseName);
        contactField.setText(enterpriseContact);
    }//GEN-LAST:event_jTable1MouseClicked

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        callOnCreateMethod.run();
    }//GEN-LAST:event_backButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton backButton;
    private javax.swing.JTextField contactField;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JComboBox<String> enterpriseType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblsysadmin;
    private javax.swing.JTextField nameField;
    private javax.swing.JComboBox<String> networkCombo;
    private javax.swing.JComboBox<String> networkType;
    private javax.swing.JButton updateBtn;
    private javax.swing.JButton viewBtn;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        Object row[] = new Object[10];
        String networkItem = networkCombo.getSelectedItem().toString();
        Franchise network = systemAdmin.findNetwork(networkItem);

        List<BusinessEvent> eventList = network.getEnterpriseDirectory().getListOfEvents();
        if (eventList != null) {
            for (int i = 0; i < eventList.size(); i++) {
                row[0] = networkItem;
                row[1] = eventList.get(i).getName();
                row[2] = "Business Event";
                row[3] = eventList.get(i).getContact();
                model.addRow(row);
            }
        }

        List<Restaurant> restaurantList = network.getEnterpriseDirectory().getListOfRestaurants();
        if (restaurantList != null) {
            for (int i = 0; i < restaurantList.size(); i++) {
                row[0] = networkItem;
                row[1] = restaurantList.get(i).getName();
                row[2] = "Restaurant";
                row[3] = restaurantList.get(i).getContact();
                model.addRow(row);
            }
        }

        List<HealthClub> healthclubList = network.getEnterpriseDirectory().getListOfHealthClub();
        if (healthclubList != null) {
            for (int i = 0; i < healthclubList.size(); i++) {
                row[0] = networkItem;
                row[1] = healthclubList.get(i).getName();
                row[2] = "Health Club";
                row[3] = healthclubList.get(i).getContact();
                model.addRow(row);
            }
        }

        List<Hotel> hotelList = network.getEnterpriseDirectory().getListOfHotel();
        if (hotelList != null) {
            for (int i = 0; i < hotelList.size(); i++) {
                row[0] = networkItem;
                row[1] = hotelList.get(i).getName();
                row[2] = "Hotel";
                row[3] = hotelList.get(i).getContact();
                model.addRow(row);
            }
        }

    }
}

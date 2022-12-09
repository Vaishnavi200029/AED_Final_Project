package ui.SystemAdministration;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import ProjectModel.BusinessEvent;
import ProjectModel.Services;
import ProjectModel.ServicesDirectory;
//import ProjectModel.HealthClub;
//import ProjectModel.Hotel;
import ProjectModel.Franchise;
import ProjectModel.Restaurant;
import ProjectModel.SystemAdmin;

public class ManageServicesPanel extends javax.swing.JPanel {

    private SystemAdmin systemAdmin;
    private Runnable callOnCreateMethod;

    public ManageServicesPanel(SystemAdmin systemAdmin, Runnable callOnCreateMethod) {
        initComponents();
        this.systemAdmin = systemAdmin;
        this.callOnCreateMethod = callOnCreateMethod;
        for (Franchise franchise : systemAdmin.getListOfFranchise()) {      //populate items in franchise combobox
            franchiseType.addItem(franchise.getName());
        }
        for (Franchise franchise : systemAdmin.getListOfFranchise()) {
            franchiseCombo.addItem(franchise.getName());
        }
        setBackground(new java.awt.Color(255, 204, 204));
        deleteBtn.setBackground(new java.awt.Color(244, 120, 140));
        deleteBtn.setOpaque(true);
        addBtn.setBackground(new java.awt.Color(244, 120, 140));
        addBtn.setOpaque(true);
        updateBtn.setBackground(new java.awt.Color(244, 120, 140));
        updateBtn.setOpaque(true);
        backButton.setBackground(new java.awt.Color(244, 120, 140));
        backButton.setOpaque(true);
        viewBtn.setBackground(new java.awt.Color(244, 120, 140));
        viewBtn.setOpaque(true);
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
        franchiseType = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        serviceType = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        contactField = new javax.swing.JTextField();
        franchiseCombo = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        viewBtn = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

        lblsysadmin.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        lblsysadmin.setText("MANAGE SERVICES");

        updateBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        updateBtn.setText("UPDATE");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        deleteBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        deleteBtn.setText("DELETE");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NETWORK NAME", "ENTERPRISE ", "ENTERPRISE TYPE", "CONTACT"
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

        addBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        addBtn.setText("ADD");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        nameField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("SERVICE TYPE");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("FRANCHISE");

        franchiseType.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        franchiseType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select any one" }));
        franchiseType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                franchiseTypeActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("SERVICE NAME");

        serviceType.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        serviceType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select any one", "Business Event", "Hotel", "Restaurant", "Health Club" }));
        serviceType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serviceTypeActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("CONTACT");

        contactField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        franchiseCombo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        franchiseCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select any one " }));

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel7.setText("SELECT A FRANCHISE");

        viewBtn.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        viewBtn.setText("View");
        viewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBtnActionPerformed(evt);
            }
        });

        backButton.setBackground(new java.awt.Color(0, 0, 0));
        backButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        backButton.setForeground(new java.awt.Color(255, 255, 255));
        backButton.setText("BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(deleteBtn)
                .addGap(123, 123, 123))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(340, 340, 340)
                        .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(serviceType, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(franchiseType, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(nameField, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(contactField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(12, 12, 12)
                                .addComponent(franchiseCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(viewBtn))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 935, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(290, 290, 290)
                        .addComponent(lblsysadmin)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblsysadmin)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(franchiseCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewBtn))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(franchiseType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(serviceType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(contactField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        int selectedRowIndex = jTable1.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to delete");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        String franchiseName = (String) model.getValueAt(selectedRowIndex, 0);
        String serviceType = (String) model.getValueAt(selectedRowIndex, 2);
        String serviceName = (String) model.getValueAt(selectedRowIndex, 1);
        Franchise franchise = systemAdmin.findFranchise(franchiseName);
        ServicesDirectory serviceDirec = franchise.getServiceDirectory();
        if (serviceType.equals("Business Event") && serviceDirec.getListOfEvents() != null) {
            for (BusinessEvent event : serviceDirec.getListOfEvents()) {
                if (event.getName().equals(serviceName)) {
                    serviceDirec.deleteServiceEvent(event);
                    JOptionPane.showMessageDialog(this, "Service deleted successfully");
                    populateTable();
                }
            }
        } 
//        else if (serviceType.equals("Hotel") && serviceDirec.getListOfHotel() != null) {
//            for (Hotel hotel : serviceDirec.getListOfHotel()) {
//                if (hotel.getName().equals(serviceName)) {
//                    serviceDirec.deleteServiceHotel(hotel);
//                    JOptionPane.showMessageDialog(this, "Service deleted successfully");
//                    populateTable();
//                }
//            }
//        } else 
                if (serviceType.equals("Restaurant") && serviceDirec.getListOfRestaurants() != null) {
                for (Restaurant res : serviceDirec.getListOfRestaurants()) {
                    if (res.getName().equals(serviceName)) {
                        serviceDirec.deleteServiceRestaurant(res);
                        JOptionPane.showMessageDialog(this, "Service deleted successfully");
                        populateTable();
                }
            }
        } 
//              else if (serviceType.equals("Health Club") && serviceDirec.getListOfHealthClub() != null) {
//            for (HealthClub club : serviceDirec.getListOfHealthClub()) {
//                if (club.getName().equals(serviceName)) {
//                    serviceDirec.deleteServiceHealthClub(club);
//                    JOptionPane.showMessageDialog(this, "Service deleted successfully");
//                    populateTable();
//                }
//            }
//        } 
        else {
            JOptionPane.showMessageDialog(this, "not found");
        }


    }//GEN-LAST:event_deleteBtnActionPerformed

    private void serviceTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serviceTypeActionPerformed

    }//GEN-LAST:event_serviceTypeActionPerformed

    private void franchiseTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_franchiseTypeActionPerformed

    }//GEN-LAST:event_franchiseTypeActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        String contact = contactField.getText();
        String name = nameField.getText();
        String franchiseName = franchiseType.getSelectedItem().toString();
        String serviceType1 = serviceType.getSelectedItem().toString();
        Franchise franchise = systemAdmin.findFranchise(franchiseName);

        if (name == null || name.length() < 2) {
            JOptionPane.showMessageDialog(this, "Invalid input: Service name should be atleast 2 characters long.");
            return;
        }

        ServicesDirectory serviceDirec = franchise.getServiceDirectory();
//        if (serviceType1.equals("Health Club") && serviceDirec != null) {
//            serviceDirec.addHealthClub(name, contact);
//            JOptionPane.showMessageDialog(this, "Service added successfully");
//            return;
//        } else
            if (serviceType1.equals("Restaurant") && serviceDirec != null) {
            serviceDirec.addRestaurant(name, contact);
            JOptionPane.showMessageDialog(this, "Service added successfully");

            return;
        } 
          else
            if (serviceType1.equals("Business Event") && serviceDirec != null) {
            serviceDirec.addBusinessEvent(name, contact);
            JOptionPane.showMessageDialog(this, "Service added successfully");

            return;
        } 
//            else if (serviceType1.equals("Hotel") && serviceDirec != null) {
//            serviceDirec.addHotel(name, contact);
//            JOptionPane.showMessageDialog(this, "Service added successfully");
//            return;
//        }
        nameField.setText("");
        contactField.setText("");
    }//GEN-LAST:event_addBtnActionPerformed

    private void viewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBtnActionPerformed
        populateTable();
    }//GEN-LAST:event_viewBtnActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        callOnCreateMethod.run();
    }//GEN-LAST:event_backButtonActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        if (jTable1.getSelectedRowCount() != 1) {
            JOptionPane.showMessageDialog(this, "Please select 1 row to update");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        String franchiseName = franchiseType.getSelectedItem().toString();
        String serviceType1 = serviceType.getSelectedItem().toString();
        String serviceName = model.getValueAt(jTable1.getSelectedRow(), 1).toString();

        Franchise franchise = systemAdmin.findFranchise(franchiseName);
        ServicesDirectory serviceDirec = franchise.getServiceDirectory();

        Services serviceToUpdate = null;
//        if (serviceType1.equals("Health Club") && serviceDirec != null) {
//
//            for (HealthClub list : serviceDirec.getListOfHealthClub()) {
//                if (list.getName().equals(serviceName)) {  //if service name matches 
//                    serviceToUpdate = list;
//                }
//            }
//            JOptionPane.showMessageDialog(this, "Service updated successfully");
//            return;
//        } else 
            if (serviceType1.equals("Business Event") && serviceDirec != null) {
            for (BusinessEvent list : serviceDirec.getListOfEvents()) {
                if (list.getName().equals(serviceName)) {
                    serviceToUpdate = list;
                }
            }
        } 
//            else if (serviceType1.equals("Hotel") && serviceDirec != null) {
//            for (Hotel list : serviceDirec.getListOfHotel()) {
//                if (list.getName().equals(serviceName)) {           //if service name matches 
//                    serviceToUpdate = list;
//                }
//            }
//        } else if (serviceType1.equals("Business Event") && serviceDirec != null) {
//            for (Restaurant list : serviceDirec.getListOfRestaurants()) {
//                if (list.getName().equals(serviceName)) {           //if service name matches 
//                    serviceToUpdate = list;
//                }
//            }
//        }

        if (serviceToUpdate == null) {
            JOptionPane.showMessageDialog(this, "Unknown service.");
            return;
        }

        serviceToUpdate.setName(nameField.getText());
        serviceToUpdate.setContact(contactField.getText());
        populateTable();
    }//GEN-LAST:event_updateBtnActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        if (jTable1.getSelectedRowCount() != 1) {
            return;
        }

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        String franchiseName = model.getValueAt(jTable1.getSelectedRow(), 0).toString();
        String serviceName = model.getValueAt(jTable1.getSelectedRow(), 1).toString();
        String serviceType1 = model.getValueAt(jTable1.getSelectedRow(), 2).toString();
        String serviceContact = model.getValueAt(jTable1.getSelectedRow(), 3).toString();

        franchiseType.setSelectedItem(franchiseName);
        serviceType.setSelectedItem(serviceType1);
        nameField.setText(serviceName);
        contactField.setText(serviceContact);
    }//GEN-LAST:event_jTable1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton backButton;
    private javax.swing.JTextField contactField;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JComboBox<String> franchiseCombo;
    private javax.swing.JComboBox<String> franchiseType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblsysadmin;
    private javax.swing.JTextField nameField;
    private javax.swing.JComboBox<String> serviceType;
    private javax.swing.JButton updateBtn;
    private javax.swing.JButton viewBtn;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        Object row[] = new Object[10];
        String franchiseItem = franchiseCombo.getSelectedItem().toString();
        Franchise franchise = systemAdmin.findFranchise(franchiseItem);

        List<BusinessEvent> eventList = franchise.getServiceDirectory().getListOfEvents();
        if (eventList != null) {
            for (int i = 0; i < eventList.size(); i++) {
                row[0] = franchiseItem;
                row[1] = eventList.get(i).getName();
                row[2] = "Business Event";
                row[3] = eventList.get(i).getContact();
                model.addRow(row);
            }
        }

        List<Restaurant> restaurantList = franchise.getServiceDirectory().getListOfRestaurants();
        if (restaurantList != null) {
            for (int i = 0; i < restaurantList.size(); i++) {
                row[0] = franchiseItem;
                row[1] = restaurantList.get(i).getName();
                row[2] = "Restaurant";
                row[3] = restaurantList.get(i).getContact();
                model.addRow(row);
            }
        }
//
//        List<HealthClub> healthclubList = franchise.getServiceDirectory().getListOfHealthClub();
//        if (healthclubList != null) {
//            for (int i = 0; i < healthclubList.size(); i++) {
//                row[0] = franchiseItem;
//                row[1] = healthclubList.get(i).getName();
//                row[2] = "Health Club";
//                row[3] = healthclubList.get(i).getContact();
//                model.addRow(row);
//            }
//        }
//
//        List<Hotel> hotelList = franchise.getServiceDirectory().getListOfHotel();
//        if (hotelList != null) {
//            for (int i = 0; i < hotelList.size(); i++) {
//                row[0] = franchiseItem;
//                row[1] = hotelList.get(i).getName();
//                row[2] = "Hotel";
//                row[3] = hotelList.get(i).getContact();
//                model.addRow(row);
//            }
//        }

    }
}

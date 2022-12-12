package ui.SystemAdministration;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import ProjModel.BusinessEvent;
import ProjModel.Services;
import ProjModel.ServicesDirectory;
import ProjModel.Manager;
import ProjModel.Franchise;
import ProjModel.SystemAdmin;
import javax.swing.ImageIcon;

public class ManageFranchisePanel extends javax.swing.JPanel {

    private SystemAdmin systemAdmin;
    private Runnable callOnCreateMethod;

    public ManageFranchisePanel(SystemAdmin systemAdmin, Runnable callOnCreateMethod) {
        this.callOnCreateMethod = callOnCreateMethod;
        this.systemAdmin = systemAdmin;
        initComponents();
        populateTable();
        backButton.setOpaque(true);
        backButton.setIcon(new ImageIcon(ClassLoader.getSystemResource("icons/back.png")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTabel = new javax.swing.JTable();
        addButton = new javax.swing.JButton();
        lblsysadmin = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        backButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setLayout(null);

        jTabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "FRANCHISE NAME"
            }
        ));
        jScrollPane1.setViewportView(jTabel);

        add(jScrollPane1);
        jScrollPane1.setBounds(330, 200, 810, 208);

        addButton.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        addButton.setText("ADD");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        add(addButton);
        addButton.setBounds(760, 460, 147, 39);

        lblsysadmin.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblsysadmin.setForeground(new java.awt.Color(255, 255, 255));
        lblsysadmin.setText("MANAGE FRANCHISES");
        add(lblsysadmin);
        lblsysadmin.setBounds(510, 100, 407, 44);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("FRANCHISE");
        add(jLabel1);
        jLabel1.setBounds(350, 470, 121, 22);

        nameField.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        add(nameField);
        nameField.setBounds(490, 470, 190, 30);

        backButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        backButton.setForeground(new java.awt.Color(255, 255, 255));
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton);
        backButton.setBounds(40, 23, 72, 50);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/SystemAdministration/vector-OCT-2020-116_generated.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        add(jLabel2);
        jLabel2.setBounds(0, -10, 1961, 1358);
    }// </editor-fold>//GEN-END:initComponents
    public boolean validateName() {
        if (nameField.getText().matches("[a-zA-Z]{2,19}")) {
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "Invalid input: name should contain only alphabets");
            return false;
        }
    }


    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        String name = nameField.getText();
        if (validateName()) {
            systemAdmin.addNetwork(name);
            JOptionPane.showMessageDialog(this, "Network added successfully");
            nameField.setText("");
            populateTable();
        }
    }//GEN-LAST:event_addButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        callOnCreateMethod.run();
    }//GEN-LAST:event_backButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabel;
    private javax.swing.JLabel lblsysadmin;
    private javax.swing.JTextField nameField;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) jTabel.getModel();
        model.setRowCount(0);
        Object row[] = new Object[10];
        for (Franchise network : systemAdmin.getListOfNetwork()) {        //populate network
            row[0] = network.getName();
            model.addRow(row);
        }
    }
}

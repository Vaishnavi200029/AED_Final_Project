/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.ManagerRole;

import javax.swing.ImageIcon;

/**
 *
 * @author jaahn
 */
public class RestauratAssignJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RestaurantJPanel
     */
    public RestauratAssignJPanel() {
        initComponents();
        jButton2.setOpaque(true);
        jButton2.setIcon(new ImageIcon(ClassLoader.getSystemResource("icons/back.png")));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblviewdetails = new javax.swing.JTable();
        lblsysadmin = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setLayout(null);

        tblviewdetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "CUSTOMER NAME", "CUSTOMERT ID", "ITEM", "ITEM PRICE"
            }
        ));
        jScrollPane1.setViewportView(tblviewdetails);

        add(jScrollPane1);
        jScrollPane1.setBounds(285, 219, 708, 158);

        lblsysadmin.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblsysadmin.setForeground(new java.awt.Color(255, 255, 255));
        lblsysadmin.setText("CONFIRM AND ASSIGN EVENTS");
        add(lblsysadmin);
        lblsysadmin.setBounds(363, 123, 573, 44);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        add(jButton2);
        jButton2.setBounds(100, 47, 108, 50);

        jButton3.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jButton3.setText("CONFIRM ORDER");
        add(jButton3);
        jButton3.setBounds(789, 389, 184, 43);

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(jComboBox1);
        jComboBox1.setBounds(703, 488, 108, 32);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("DELIVERYMAN");
        add(jLabel2);
        jLabel2.setBounds(568, 493, 117, 22);

        jButton4.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jButton4.setText("ASSIGN");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        add(jButton4);
        jButton4.setBounds(710, 590, 108, 42);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/ManagerRole/vecteezy_vector-abstract-futuristic-circuit-board-illustration-high_6115516.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1);
        jLabel1.setBounds(0, 0, 1370, 830);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblsysadmin;
    private javax.swing.JTable tblviewdetails;
    // End of variables declaration//GEN-END:variables
}

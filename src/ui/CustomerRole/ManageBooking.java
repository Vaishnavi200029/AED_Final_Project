package ui.CustomerRole;

import java.util.List;
import java.util.function.Consumer;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import ProjModel.Booking;
import ProjModel.Customer;
import ProjModel.CustomerDirectory;
import ProjModel.SystemAdmin;
import javax.swing.ImageIcon;

public class ManageBooking extends javax.swing.JPanel {

    private SystemAdmin systemAdmin;
    private Runnable callOnCreateMethod1;
    private Consumer<Booking> callOnAddServiceMethod;
    private Consumer<Booking> callOnViewServiceMethod;
    private String username;

    public ManageBooking(SystemAdmin systemAdmin, Runnable callOnCreateMethod1, Consumer<Booking> callOnCreateMethod2, Consumer<Booking> callOnViewServiceMethod, String username) {
        initComponents();
        this.systemAdmin = systemAdmin;
        this.callOnCreateMethod1 = callOnCreateMethod1;
        this.callOnAddServiceMethod = callOnCreateMethod2;
        this.callOnViewServiceMethod = callOnViewServiceMethod;
        this.username = username;

        populateTable();
        backBtn.setOpaque(true);
        backBtn.setIcon(new ImageIcon(ClassLoader.getSystemResource("icons/back.png")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        addServiceBtn = new javax.swing.JButton();
        viewOrder = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BOOKING DETAILS");
        add(jLabel1);
        jLabel1.setBounds(410, 130, 357, 35);

        backBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn);
        backBtn.setBounds(34, 27, 100, 60);

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "HOTEL NAME", "BOOKING ID", "PRICE", "STATUS", "CHECK_IN", "CHECK OUT"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);

        add(jScrollPane2);
        jScrollPane2.setBounds(110, 210, 1080, 390);

        addServiceBtn.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        addServiceBtn.setText("ADD SERVICES");
        addServiceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addServiceBtnActionPerformed(evt);
            }
        });
        add(addServiceBtn);
        addServiceBtn.setBounds(330, 650, 205, 53);

        viewOrder.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        viewOrder.setText("VIEW SERVICE DETAILS");
        viewOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewOrderActionPerformed(evt);
            }
        });
        add(viewOrder);
        viewOrder.setBounds(690, 650, 290, 53);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/CustomerRole/vecteezy_abstract-background-dark-purple-and-triangle-shape_7463701.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        add(jLabel2);
        jLabel2.setBounds(0, 0, 1974, 1067);
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        callOnCreateMethod1.run();
    }//GEN-LAST:event_backBtnActionPerformed

    private void addServiceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addServiceBtnActionPerformed
        int selectedRowIndex = jTable1.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a booking to add services.");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        String bookingId = (String) model.getValueAt(selectedRowIndex, 1);

        System.out.println(bookingId + " is selected");

        CustomerDirectory customDirec = systemAdmin.getCustomerDirec();
        Customer customer = customDirec.findCustomerUsername(username);

        List<Booking> list = customer.getBookingList();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(bookingId)) {
                callOnAddServiceMethod.accept(list.get(i));
                return;
            }
        }
    }//GEN-LAST:event_addServiceBtnActionPerformed

    private void viewOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewOrderActionPerformed
        int selectedRowIndex = jTable1.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a booking to view its details.");
            return;
        }
        String bookingId = (String) model.getValueAt(selectedRowIndex, 1);

        System.out.println(bookingId + " is selected");

        CustomerDirectory customDirec = systemAdmin.getCustomerDirec();
        Customer customer = customDirec.findCustomerUsername(username);

        List<Booking> list = customer.getBookingList();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(bookingId)) {
                callOnViewServiceMethod.accept(list.get(i));
                return;
            }
        }
    }//GEN-LAST:event_viewOrderActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addServiceBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton viewOrder;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        Object row[] = new Object[10];
        CustomerDirectory customDirec = systemAdmin.getCustomerDirec();
        Customer customer = customDirec.findCustomerUsername(username);
        System.out.println("customer found is " + customer.getName() + " username is " + username);
        for (Booking bookingList : customer.getBookingList()) {
            row[0] = bookingList.getHotelService().getEnterprise();
            row[1] = bookingList.getId();
            row[2] = bookingList.getTotalCost();
            row[3] = bookingList.getStatus();
            row[4] = bookingList.getCheckin();
            row[5] = bookingList.getCheckout();
            model.addRow(row);
        }

    }
}

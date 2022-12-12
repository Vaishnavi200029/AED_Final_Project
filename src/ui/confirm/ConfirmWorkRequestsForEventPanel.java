package ui.confirm;

import javax.swing.table.DefaultTableModel;
import ProjModel.Booking;
import ProjModel.Customer;
import ProjModel.CustomerDirectory;
import ProjModel.Manager;
import ProjModel.Organization;
import ProjModel.SystemAdmin;
import ProjectModel.services.Service;

public class ConfirmWorkRequestsForEventPanel extends javax.swing.JPanel {

    private SystemAdmin systemAdmin;
    private String user;
    private String type;

    public ConfirmWorkRequestsForEventPanel(SystemAdmin systemAdmin, String user, String type) {
        initComponents();
        this.systemAdmin = systemAdmin;
        this.user = user;
        this.type = type;
        lblbookservices.setText(lblbookservices.getText() + type.toUpperCase() + " ORGANIZATION");
        populateTable();
        setBackground(new java.awt.Color(255, 204, 204));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblbookservices = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setLayout(null);

        lblbookservices.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblbookservices.setForeground(new java.awt.Color(255, 255, 255));
        lblbookservices.setText("ASSIGNED WORK REQUESTS FOR ");
        add(lblbookservices);
        lblbookservices.setBounds(298, 142, 883, 44);

        jTable1.setBackground(new java.awt.Color(234, 234, 249));
        jTable1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CUSTOMER ID", "BOOKING ID", "HOTEL NAME", "DATE", "STATUS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1);
        jScrollPane1.setBounds(154, 267, 1027, 455);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/confirm/vector-jan-2021-19_generated.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1);
        jLabel1.setBounds(0, -10, 1610, 1020);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblbookservices;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);

        CustomerDirectory customerDirec = systemAdmin.getCustomerDirec();
        for (Customer customer : customerDirec.getListOfCustomer()) {
            for (Booking booking : customer.getBookingList()) {
                for (Service service : booking.getServices()) {
                    for (Organization org : service.getListOfOrg()) {
                        for (Manager man : org.getListOfManager()) {
                            if (man.getUsername().equals(user)) {
                                Object row[] = new Object[5];
                                row[0] = customer.getUserName();
                                row[1] = booking.getId();
                                row[2] = booking.getHotelService().getEnterprise().getName();
                                row[3] = service.getDate();
                                row[4] = service.getStatus();

                                model.addRow(row);
                            }

                            System.out.println();
                        }
                    }
                }
            }
        }

    }
}

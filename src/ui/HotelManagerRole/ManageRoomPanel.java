package ui.HotelManagerRole;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import ProjModel.ServicesDirectory;
import ProjModel.Hotel;
import ProjModel.Manager;
import ProjModel.Franchise;
import ProjModel.Room;
import ProjModel.Room.RoomType;
import ProjModel.RoomList;
import ProjModel.SystemAdmin;
import javax.swing.ImageIcon;

public class ManageRoomPanel extends javax.swing.JPanel {

    private SystemAdmin systemAdmin;
    private Runnable callOnCreateMethod;
    private Franchise network;
    private String user;

    public ManageRoomPanel(SystemAdmin systemAdmin, Runnable callOnCreateMethod, Franchise network, String user) {
        initComponents();

        this.user = user;
        this.systemAdmin = systemAdmin;
        this.callOnCreateMethod = callOnCreateMethod;
        this.network = network;

        Franchise network1 = systemAdmin.findNetwork(network.getName());
        List<Hotel> list = network1.getEnterpriseDirectory().getListOfHotel();

        for (RoomType type : RoomType.values()) {
            roomTypeComboBox.addItem(type);
        }
        backButton.setOpaque(true);
        backButton.setIcon(new ImageIcon(ClassLoader.getSystemResource("icons/back.png")));
        populateTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        roomTypeComboBox = new javax.swing.JComboBox<>();
        backButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setLayout(null);

        jTable1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Room Number", "Room Type", "Room cost"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1);
        jScrollPane1.setBounds(100, 290, 1200, 203);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ROOM TYPE");
        add(jLabel1);
        jLabel1.setBounds(123, 455, 122, 24);

        roomTypeComboBox.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        add(roomTypeComboBox);
        roomTypeComboBox.setBounds(413, 560, 220, 40);

        backButton.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton);
        backButton.setBounds(30, 30, 85, 51);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("MANAGE ROOMS");
        add(jLabel2);
        jLabel2.setBounds(490, 140, 404, 47);

        addButton.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        addButton.setText("ADD");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        add(addButton);
        addButton.setBounds(660, 560, 120, 40);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/HotelManagerRole/vector-jan-2021-19_generated.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        add(jLabel3);
        jLabel3.setBounds(0, -10, 1600, 1020);
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        callOnCreateMethod.run();
    }//GEN-LAST:event_backButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed

        RoomType selectedItem = (RoomType) roomTypeComboBox.getSelectedItem();
        ServicesDirectory enterpriseDirec = network.getEnterpriseDirectory();
        List<Hotel> list = enterpriseDirec.getListOfHotel();

        for (int i = 0; i < list.size(); i++) {
            List<Manager> manager = list.get(i).getListOfManager();
            for (int j = 0; j < manager.size(); j++) {
                if (manager.get(j).getUsername().equals(user)) {
                    RoomList roomList = list.get(i).getRoomListDirec();
                    roomList.createRoom(selectedItem);
                    JOptionPane.showMessageDialog(this, "Room added successfully");
                    
                    populateTable();
                    return;
                }
            }
        }
    }//GEN-LAST:event_addButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<RoomType> roomTypeComboBox;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        ServicesDirectory enterpriseDirec = network.getEnterpriseDirectory();
        for (Hotel hotel : enterpriseDirec.getListOfHotel()) {
            for (Manager man : hotel.getListOfManager()) {
                if (man.getUsername().equals(user)) {
                    RoomList roomDirec = hotel.getRoomListDirec();
                    for (Room room : roomDirec.getListOfRooms()) {
                        Object row[] = new Object[10];
                        row[0] = room.getRoomNo();
                        row[1] = room.getRoomType().getName();
                        row[2] = room.getRoomType().getRate();
                        model.addRow(row);
                    }
                }
            }
        }
    }
}

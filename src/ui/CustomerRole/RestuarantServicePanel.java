package ui.CustomerRole;

import java.util.Date;
import java.util.function.Consumer;
import javax.swing.JOptionPane;
import ProjModel.Booking;
import ProjModel.MenuItem;
import ProjModel.Restaurant;
import ProjModel.SystemAdmin;
import ProjectModel.services.RestaurantService;
import javax.swing.ImageIcon;
import ui.main.DateUtils;

public class RestuarantServicePanel extends javax.swing.JPanel {

    private SystemAdmin systems;
    private Consumer<Booking> callOnCreateMethod1;
    private String username;
    private Booking booking;

    public RestuarantServicePanel(SystemAdmin systems, Consumer<Booking> callOnCreateMethod1, String username, Booking booking) {
        initComponents();
        this.systems = systems;
        this.callOnCreateMethod1 = callOnCreateMethod1;
        this.username = username;
        this.booking = booking;

        for (Restaurant res : booking.getNetwork().getEnterpriseDirectory().getListOfRestaurants()) {
            restaurantCombo.addItem(res);
        }
        backBtn.setOpaque(true);
        backBtn.setIcon(new ImageIcon(ClassLoader.getSystemResource("icons/back.png")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuItem = new javax.swing.JComboBox<>();
        backBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        placeOrder = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        restaurantCombo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();

        setLayout(null);

        menuItem.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        menuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemActionPerformed(evt);
            }
        });
        add(menuItem);
        menuItem.setBounds(402, 332, 336, 25);

        backBtn.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn);
        backBtn.setBounds(39, 18, 100, 50);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText(" MENU ITEMS FOR RESTAURANT");
        add(jLabel1);
        jLabel1.setBounds(90, 91, 603, 47);

        placeOrder.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        placeOrder.setText("PLACE ORDER");
        placeOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placeOrderActionPerformed(evt);
            }
        });
        add(placeOrder);
        placeOrder.setBounds(286, 418, 161, 43);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("SELECT ITEM FROM LIST ");
        add(jLabel2);
        jLabel2.setBounds(90, 333, 225, 24);

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("SELECT A RESTAURANT NAME ");
        add(jLabel4);
        jLabel4.setBounds(90, 238, 275, 24);

        restaurantCombo.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        restaurantCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restaurantComboActionPerformed(evt);
            }
        });
        add(restaurantCombo);
        restaurantCombo.setBounds(402, 237, 327, 25);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/CustomerRole/vecteezy_abstract-background-dark-purple-and-triangle-shape_7463701.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        add(jLabel3);
        jLabel3.setBounds(0, 0, 1380, 770);
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        callOnCreateMethod1.accept(booking);
    }//GEN-LAST:event_backBtnActionPerformed

    private void restaurantComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restaurantComboActionPerformed
        menuItem.removeAllItems();
        Restaurant restaurant = (Restaurant) restaurantCombo.getSelectedItem();
        if (restaurant != null) {
            for (MenuItem item : restaurant.getListOfItem()) {
                menuItem.addItem(item);
            }
        }
    }//GEN-LAST:event_restaurantComboActionPerformed

    private void menuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemActionPerformed

    }//GEN-LAST:event_menuItemActionPerformed

    private void placeOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placeOrderActionPerformed
        Date date = DateUtils.formatDate(new Date());
        MenuItem item = (MenuItem) menuItem.getSelectedItem();
        Restaurant restaurant = (Restaurant) restaurantCombo.getSelectedItem();

        RestaurantService service = new RestaurantService(restaurant, date, item.getDetails(), item.getPrice());
        booking.addService(service);
        JOptionPane.showMessageDialog(this, "Order placed successfully");

        callOnCreateMethod1.accept(booking);
    }//GEN-LAST:event_placeOrderActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JComboBox<MenuItem> menuItem;
    private javax.swing.JButton placeOrder;
    private javax.swing.JComboBox<Restaurant> restaurantCombo;
    // End of variables declaration//GEN-END:variables
}

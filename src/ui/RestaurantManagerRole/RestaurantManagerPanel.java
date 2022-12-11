package ui.RestaurantManagerRole;

import ProjModel.SystemAdmin;

public class RestaurantManagerPanel extends javax.swing.JPanel {

    private SystemAdmin systemAdmin;
    private Runnable callOnCreateMethod1;
    private Runnable callOnCreateMethod2;
    private Runnable callOnCreateMethod3;
    private Runnable callOnCreateMethod4;

    public RestaurantManagerPanel(SystemAdmin systemAdmin, Runnable callOnCreateMethod1, Runnable callOnCreateMethod2, Runnable callOnCreateMethod3, Runnable callOnCreateMethod4) {
        initComponents();
        this.callOnCreateMethod1 = callOnCreateMethod1;
        this.callOnCreateMethod2 = callOnCreateMethod2;
        this.callOnCreateMethod3 = callOnCreateMethod3;
        this.callOnCreateMethod4 = callOnCreateMethod4;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        viewTask = new javax.swing.JButton();
        orgButton = new javax.swing.JButton();
        orgAdminBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        addMenu = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setLayout(null);

        viewTask.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        viewTask.setText("VIEW ORDERS");
        viewTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewTaskActionPerformed(evt);
            }
        });
        add(viewTask);
        viewTask.setBounds(340, 430, 290, 110);

        orgButton.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        orgButton.setText("MANAGE ORGANIZATION");
        orgButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orgButtonActionPerformed(evt);
            }
        });
        add(orgButton);
        orgButton.setBounds(790, 430, 340, 110);

        orgAdminBtn.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        orgAdminBtn.setText("MANAGE ORGANIZATION ADMIN");
        orgAdminBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orgAdminBtnActionPerformed(evt);
            }
        });
        add(orgAdminBtn);
        orgAdminBtn.setBounds(790, 620, 340, 110);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("RESTAURANT MANAGER");
        add(jLabel1);
        jLabel1.setBounds(510, 340, 450, 47);

        addMenu.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        addMenu.setText("ADD MENU ");
        addMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMenuActionPerformed(evt);
            }
        });
        add(addMenu);
        addMenu.setBounds(340, 620, 290, 110);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/RestaurantManagerRole/stock-photo-assorted-of-different-asian-food-chinese-japanese-and-thai-cuisine-noodles-dumplings-gedza-1900062550-transformed.jpeg"))); // NOI18N
        add(jLabel2);
        jLabel2.setBounds(0, 0, 1500, 1162);
    }// </editor-fold>//GEN-END:initComponents

    private void viewTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewTaskActionPerformed
        callOnCreateMethod1.run();
    }//GEN-LAST:event_viewTaskActionPerformed

    private void orgButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orgButtonActionPerformed
        callOnCreateMethod2.run();
    }//GEN-LAST:event_orgButtonActionPerformed

    private void orgAdminBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orgAdminBtnActionPerformed
        callOnCreateMethod3.run();
    }//GEN-LAST:event_orgAdminBtnActionPerformed

    private void addMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMenuActionPerformed
        callOnCreateMethod4.run();
    }//GEN-LAST:event_addMenuActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton orgAdminBtn;
    private javax.swing.JButton orgButton;
    private javax.swing.JButton viewTask;
    // End of variables declaration//GEN-END:variables
}

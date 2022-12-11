package ui.HealthClubManagerRole;

import ProjModel.SystemAdmin;

public class HealthClubManagerPanel extends javax.swing.JPanel {

    private SystemAdmin systemAdmin;
    private Runnable callOnCreateMethod1;
    private Runnable callOnCreateMethod2;
    private Runnable callOnCreateMethod3;

    public HealthClubManagerPanel(SystemAdmin systemAdmin, Runnable callOnCreateMethod1, Runnable callOnCreateMethod2, Runnable callOnCreateMethod3) {
        initComponents();
        this.callOnCreateMethod1 = callOnCreateMethod1;
        this.callOnCreateMethod2 = callOnCreateMethod2;
        this.callOnCreateMethod3 = callOnCreateMethod3;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        viewTask = new javax.swing.JButton();
        orgBtn = new javax.swing.JButton();
        orgAdminBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setText("HEALTH CLUB MANAGER PANEL ");
        add(jLabel1);
        jLabel1.setBounds(540, 130, 400, 50);

        viewTask.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        viewTask.setText("VIEW TASK");
        viewTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewTaskActionPerformed(evt);
            }
        });
        add(viewTask);
        viewTask.setBounds(590, 240, 340, 70);

        orgBtn.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        orgBtn.setText("MANAGE ORGANIZATION");
        orgBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orgBtnActionPerformed(evt);
            }
        });
        add(orgBtn);
        orgBtn.setBounds(590, 350, 340, 80);

        orgAdminBtn.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        orgAdminBtn.setText("MANAGE ORGANISATION ADMIN");
        orgAdminBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orgAdminBtnActionPerformed(evt);
            }
        });
        add(orgAdminBtn);
        orgAdminBtn.setBounds(590, 460, 350, 80);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/HealthClubManagerRole/VECTOR_BACKGROUND_1_cleanup.jpg"))); // NOI18N
        add(jLabel2);
        jLabel2.setBounds(0, 0, 4500, 2950);
    }// </editor-fold>//GEN-END:initComponents

    private void viewTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewTaskActionPerformed
                 callOnCreateMethod1.run();
    }//GEN-LAST:event_viewTaskActionPerformed

    private void orgBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orgBtnActionPerformed
         callOnCreateMethod2.run();
    }//GEN-LAST:event_orgBtnActionPerformed

    private void orgAdminBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orgAdminBtnActionPerformed
        callOnCreateMethod3.run();
    }//GEN-LAST:event_orgAdminBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton orgAdminBtn;
    private javax.swing.JButton orgBtn;
    private javax.swing.JButton viewTask;
    // End of variables declaration//GEN-END:variables
}

package ui.CustomerRole;

import java.util.Date;
import java.util.function.Consumer;
import javax.swing.JOptionPane;
import ProjModel.Booking;
import ProjModel.HealthClub;
import ProjModel.SystemAdmin;
import ProjectModel.services.HealthClubService;
import ui.main.DateUtils;

public class HealthClubServicesJPanel extends javax.swing.JPanel {

    private SystemAdmin systems;
    private Consumer<Booking> callOnCreateMethod1;
    private String username;
    private Booking booking;

    public HealthClubServicesJPanel(SystemAdmin systems, Consumer<Booking> callOnCreateMethod1, String username, Booking booking) {
        initComponents();
        this.systems = systems;
        this.callOnCreateMethod1 = callOnCreateMethod1;
        this.username = username;
        this.booking = booking;

        for (HealthClub healthClub : booking.getNetwork().getEnterpriseDirectory().getListOfHealthClub()) {
            healthClubCombo.addItem(healthClub);
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblbookservices = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        yogaBtn = new javax.swing.JCheckBox();
        massageBtn = new javax.swing.JCheckBox();
        medicalServiceBtn = new javax.swing.JCheckBox();
        addServiceBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        dateField = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        healthClubCombo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setLayout(null);

        lblbookservices.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblbookservices.setForeground(new java.awt.Color(255, 255, 255));
        lblbookservices.setText("HEALTH CLUB SERVICES");
        add(lblbookservices);
        lblbookservices.setBounds(294, 52, 446, 44);

        backBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        backBtn.setText("BACK");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn);
        backBtn.setBounds(31, 27, 108, 36);

        yogaBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        yogaBtn.setForeground(new java.awt.Color(255, 255, 255));
        yogaBtn.setText("YOGA ($20)");
        yogaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yogaBtnActionPerformed(evt);
            }
        });
        add(yogaBtn);
        yogaBtn.setBounds(213, 361, 131, 29);

        massageBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        massageBtn.setForeground(new java.awt.Color(255, 255, 255));
        massageBtn.setText("MASSAGE AND SPA ($20)");
        massageBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                massageBtnActionPerformed(evt);
            }
        });
        add(massageBtn);
        massageBtn.setBounds(213, 442, 241, 29);

        medicalServiceBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        medicalServiceBtn.setForeground(new java.awt.Color(255, 255, 255));
        medicalServiceBtn.setText("MEDICAL SERVICE  ($60)");
        medicalServiceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicalServiceBtnActionPerformed(evt);
            }
        });
        add(medicalServiceBtn);
        medicalServiceBtn.setBounds(213, 532, 241, 29);

        addServiceBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        addServiceBtn.setText("ADD SERVICE");
        addServiceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addServiceBtnActionPerformed(evt);
            }
        });
        add(addServiceBtn);
        addServiceBtn.setBounds(380, 662, 157, 43);

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("(MONDAY-SUNDAY) 7A.M - 9A.M");
        add(jLabel3);
        jLabel3.setBounds(540, 367, 210, 19);

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("(MONDAY-SUNDAY) 4P.M-5:30P.M ");
        add(jLabel5);
        jLabel5.setBounds(540, 448, 226, 19);

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("(MONDAY - SUNDAY) 12P.M-4P.M ");
        add(jLabel6);
        jLabel6.setBounds(540, 533, 282, 25);

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("SELECT A DATE ");
        add(jLabel7);
        jLabel7.setBounds(240, 173, 145, 24);
        add(dateField);
        dateField.setBounds(540, 173, 227, 35);

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Health Club");
        add(jLabel4);
        jLabel4.setBounds(250, 267, 94, 24);

        healthClubCombo.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        add(healthClubCombo);
        healthClubCombo.setBounds(540, 266, 211, 29);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/CustomerRole/vecteezy_abstract-background-dark-purple-and-triangle-shape_7463701.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1);
        jLabel1.setBounds(0, 0, 1981, 1067);
    }// </editor-fold>//GEN-END:initComponents

    private void medicalServiceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicalServiceBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_medicalServiceBtnActionPerformed

    private void addServiceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addServiceBtnActionPerformed

        HealthClub healthClub = (HealthClub) healthClubCombo.getSelectedItem();
        if (healthClub == null) {
            JOptionPane.showMessageDialog(this, "Please select a health club from the dropdown.");
            return;
        }
        Date date = DateUtils.formatDate(dateField.getDate());
        Date checkin = booking.getCheckin();
        Date checkout = booking.getCheckout();

        if (date.compareTo(checkin) < 0 || date.compareTo(checkout) > 0) {
            JOptionPane.showMessageDialog(this, "Selected date should be within check-in date (" + checkin
                    + ") and checkout date (" + checkout + ")");
            return;
        }

        boolean yogaBtnSelected = yogaBtn.isSelected();
        boolean massageRadioBtnSelected = massageBtn.isSelected();
        boolean medicalRadioBtnSelected = medicalServiceBtn.isSelected();

        if (!yogaBtnSelected && !massageRadioBtnSelected && !medicalRadioBtnSelected) {
            JOptionPane.showMessageDialog(this, "Please select at least one service for Health Club.");
            return;
        }

        HealthClubService healthClubService = new HealthClubService(healthClub, date);
        if (yogaBtnSelected) {
            healthClubService.addService(HealthClubService.HealthClubServiceType.TRAINER);
        }

        if (massageRadioBtnSelected) {
            healthClubService.addService(HealthClubService.HealthClubServiceType.THERAPIST);
        }

        if (medicalRadioBtnSelected) {
            healthClubService.addService(HealthClubService.HealthClubServiceType.PHYSICIAN);
        }

        booking.addService(healthClubService);
        JOptionPane.showMessageDialog(this, "Your health club appointment is booked for " + date);
        callOnCreateMethod1.accept(booking);
    }//GEN-LAST:event_addServiceBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        callOnCreateMethod1.accept(booking);
    }//GEN-LAST:event_backBtnActionPerformed

    private void yogaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yogaBtnActionPerformed

    }//GEN-LAST:event_yogaBtnActionPerformed

    private void massageBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_massageBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_massageBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addServiceBtn;
    private javax.swing.JButton backBtn;
    private com.toedter.calendar.JDateChooser dateField;
    private javax.swing.JComboBox<HealthClub> healthClubCombo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblbookservices;
    private javax.swing.JCheckBox massageBtn;
    private javax.swing.JCheckBox medicalServiceBtn;
    private javax.swing.JCheckBox yogaBtn;
    // End of variables declaration//GEN-END:variables
}

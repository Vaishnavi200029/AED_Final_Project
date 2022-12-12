package ui.CustomerRole;

import java.util.Date;
import java.util.function.Consumer;
import javax.swing.JOptionPane;
import ProjModel.Booking;
import ProjModel.BusinessEvent;
import ProjModel.CateringService.CateringType;
import ProjModel.DecorServices.DecorType;
import ProjModel.PhotographyService.PhotographyType;
import ProjModel.SystemAdmin;
import ProjectModel.services.BusinessEventService;
import javax.swing.ImageIcon;
import ui.main.DateUtils;

public class BookEventsJPanel extends javax.swing.JPanel {

    private SystemAdmin systems;
    private Consumer<Booking> callOnCreateMethod1;
    private String username;
    private Booking booking;

    public BookEventsJPanel(SystemAdmin systems, Consumer<Booking> callOnCreateMethod1, String username, Booking booking) {
        initComponents();
        this.systems = systems;
        this.callOnCreateMethod1 = callOnCreateMethod1;
        this.username = username;
        this.booking = booking;

        orgComboBox.addItem(null);
        for (BusinessEvent eventOrg : booking.getNetwork().getEnterpriseDirectory().getListOfEvents()) {
            orgComboBox.addItem(eventOrg);
        }
        backBtn.setOpaque(true);
        backBtn.setIcon(new ImageIcon(ClassLoader.getSystemResource("icons/back.png")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        backBtn = new javax.swing.JButton();
        lblbookservices = new javax.swing.JLabel();
        photoRadioBtn = new javax.swing.JRadioButton();
        cateringRadioBtn = new javax.swing.JRadioButton();
        bookEventBtn = new javax.swing.JButton();
        decorCombo = new javax.swing.JComboBox<>();
        photgraphyCombo = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cateringCombo = new javax.swing.JComboBox<>();
        decorRadioBtn = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        priceField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        dateField = new com.toedter.calendar.JDateChooser();
        orgComboBox = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        totalPrice = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setLayout(null);

        backBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn);
        backBtn.setBounds(33, 21, 80, 50);

        lblbookservices.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblbookservices.setForeground(new java.awt.Color(255, 255, 255));
        lblbookservices.setText("BOOK EVENTS");
        add(lblbookservices);
        lblbookservices.setBounds(241, 71, 258, 44);

        photoRadioBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        photoRadioBtn.setForeground(new java.awt.Color(255, 255, 255));
        photoRadioBtn.setText("PHOTOGRAPHY");
        photoRadioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                photoRadioBtnActionPerformed(evt);
            }
        });
        add(photoRadioBtn);
        photoRadioBtn.setBounds(193, 329, 148, 27);

        cateringRadioBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cateringRadioBtn.setForeground(new java.awt.Color(255, 255, 255));
        cateringRadioBtn.setText("CATERING");
        cateringRadioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cateringRadioBtnActionPerformed(evt);
            }
        });
        add(cateringRadioBtn);
        cateringRadioBtn.setBounds(193, 426, 108, 27);

        bookEventBtn.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        bookEventBtn.setText("BOOK EVENT");
        bookEventBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookEventBtnActionPerformed(evt);
            }
        });
        add(bookEventBtn);
        bookEventBtn.setBounds(344, 761, 138, 38);

        decorCombo.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        add(decorCombo);
        decorCombo.setBounds(453, 581, 440, 50);

        photgraphyCombo.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        add(photgraphyCombo);
        photgraphyCombo.setBounds(453, 359, 445, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("TYPE OF PACKAGE ");
        add(jLabel5);
        jLabel5.setBounds(193, 372, 157, 22);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TYPE OF PACKAGE");
        add(jLabel1);
        jLabel1.setBounds(193, 474, 168, 24);

        cateringCombo.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        cateringCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cateringComboActionPerformed(evt);
            }
        });
        add(cateringCombo);
        cateringCombo.setBounds(453, 462, 445, 40);

        decorRadioBtn.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        decorRadioBtn.setForeground(new java.awt.Color(255, 255, 255));
        decorRadioBtn.setText("DECOR SERVICE ");
        decorRadioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decorRadioBtnActionPerformed(evt);
            }
        });
        add(decorRadioBtn);
        decorRadioBtn.setBounds(193, 545, 175, 29);

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("TYPE OF PACKAGE");
        add(jLabel6);
        jLabel6.setBounds(214, 603, 166, 25);

        priceField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceFieldActionPerformed(evt);
            }
        });
        add(priceField);
        priceField.setBounds(453, 683, 120, 32);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("DATE ");
        add(jLabel2);
        jLabel2.setBounds(200, 176, 98, 24);
        add(dateField);
        dateField.setBounds(453, 176, 210, 22);

        add(orgComboBox);
        orgComboBox.setBounds(453, 261, 210, 22);

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("BUSINESS EVENTS ");
        add(jLabel4);
        jLabel4.setBounds(200, 267, 172, 24);

        totalPrice.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        totalPrice.setText("TOTAL PRICE");
        totalPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalPriceActionPerformed(evt);
            }
        });
        add(totalPrice);
        totalPrice.setBounds(206, 687, 160, 28);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/CustomerRole/vecteezy_abstract-background-dark-purple-and-triangle-shape_7463701.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        add(jLabel3);
        jLabel3.setBounds(0, 0, 1961, 1040);
    }// </editor-fold>//GEN-END:initComponents

    private void photoRadioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_photoRadioBtnActionPerformed
        if (photoRadioBtn.isSelected()) {
            photgraphyCombo.removeAllItems();
            for (PhotographyType photo : PhotographyType.values()) {
                photgraphyCombo.addItem(photo);
            }
        }
    }//GEN-LAST:event_photoRadioBtnActionPerformed

    private void bookEventBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookEventBtnActionPerformed

        BusinessEvent businessEvent = (BusinessEvent) orgComboBox.getSelectedItem();

        if (businessEvent == null) {
            JOptionPane.showMessageDialog(this, "Please select a Business Event organization from the dropdown.");
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

        boolean photoRadioBtnSelected = photoRadioBtn.isSelected();
        boolean decorRadioBtnSelected = decorRadioBtn.isSelected();
        boolean cateringRadioBtnSelected = cateringRadioBtn.isSelected();

        if (!photoRadioBtnSelected && !decorRadioBtnSelected && !cateringRadioBtnSelected) {
            JOptionPane.showMessageDialog(this, "Please select at least one service for Business Event.");
            return;
        }

        int price = 0;
        BusinessEventService service = new BusinessEventService(businessEvent, date);
        if (photoRadioBtnSelected) {
            PhotographyType photography = (PhotographyType) photgraphyCombo.getSelectedItem();
            service.addService(BusinessEventService.BusinessEventServiceType.PHOTOGRAPHY, photography.getRate());
            price += photography.getRate();
        }

        if (decorRadioBtnSelected) {
            DecorType decor = (DecorType) decorCombo.getSelectedItem();
            service.addService(BusinessEventService.BusinessEventServiceType.DECOR, decor.getRate());
            price += decor.getRate();
        }

        if (cateringRadioBtnSelected) {
            CateringType catering = (CateringType) cateringCombo.getSelectedItem();
            service.addService(BusinessEventService.BusinessEventServiceType.CATERING, catering.getRate());
            price += catering.getRate();
        }

        priceField.setText(String.valueOf(price));
        booking.addService(service);

        JOptionPane.showMessageDialog(this, "Business event service added successfully.");
        callOnCreateMethod1.accept(booking);
    }//GEN-LAST:event_bookEventBtnActionPerformed

    private void cateringComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cateringComboActionPerformed

    }//GEN-LAST:event_cateringComboActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        callOnCreateMethod1.accept(booking);
    }//GEN-LAST:event_backBtnActionPerformed

    private void cateringRadioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cateringRadioBtnActionPerformed
        if (cateringRadioBtn.isSelected()) {
            cateringCombo.removeAllItems();
            for (CateringType catering : CateringType.values()) {
                cateringCombo.addItem(catering);
            }

        }
    }//GEN-LAST:event_cateringRadioBtnActionPerformed

    private void decorRadioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decorRadioBtnActionPerformed
        if (decorRadioBtn.isSelected()) {
            decorCombo.removeAllItems();
            for (DecorType decor : DecorType.values()) {
                decorCombo.addItem(decor);
            }
        }
    }//GEN-LAST:event_decorRadioBtnActionPerformed

    private void totalPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalPriceActionPerformed

        BusinessEvent businessEvent = (BusinessEvent) orgComboBox.getSelectedItem();

        if (businessEvent == null) {
            JOptionPane.showMessageDialog(this, "Please select a Business Event organization from the dropdown.");
            return;
        }
        boolean photoRadioBtnSelected = photoRadioBtn.isSelected();
        boolean decorRadioBtnSelected = decorRadioBtn.isSelected();
        boolean cateringRadioBtnSelected = cateringRadioBtn.isSelected();
        Date date = DateUtils.formatDate(dateField.getDate());

        int price = 0;
        BusinessEventService service = new BusinessEventService(businessEvent, date);
        if (photoRadioBtnSelected) {
            PhotographyType photography = (PhotographyType) photgraphyCombo.getSelectedItem();
            service.addService(BusinessEventService.BusinessEventServiceType.PHOTOGRAPHY, photography.getRate());
            price += photography.getRate();
        }

        if (decorRadioBtnSelected) {
            DecorType decor = (DecorType) decorCombo.getSelectedItem();
            service.addService(BusinessEventService.BusinessEventServiceType.DECOR, decor.getRate());
            price += decor.getRate();
        }

        if (cateringRadioBtnSelected) {
            CateringType catering = (CateringType) cateringCombo.getSelectedItem();
            service.addService(BusinessEventService.BusinessEventServiceType.CATERING, catering.getRate());
            price += catering.getRate();
        }

        priceField.setText(String.valueOf(price));
    }//GEN-LAST:event_totalPriceActionPerformed

    private void priceFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton bookEventBtn;
    private javax.swing.JComboBox<CateringType> cateringCombo;
    private javax.swing.JRadioButton cateringRadioBtn;
    private com.toedter.calendar.JDateChooser dateField;
    private javax.swing.JComboBox<DecorType> decorCombo;
    private javax.swing.JRadioButton decorRadioBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JLabel lblbookservices;
    private javax.swing.JComboBox<BusinessEvent> orgComboBox;
    private javax.swing.JComboBox<PhotographyType> photgraphyCombo;
    private javax.swing.JRadioButton photoRadioBtn;
    private javax.swing.JTextField priceField;
    private javax.swing.JButton totalPrice;
    // End of variables declaration//GEN-END:variables
}

package ui.main;

import ProjectModel.BusinessEvent;
import db.DbUtils;
import java.util.List;
import javax.swing.JOptionPane;
import ProjectModel.Customer;
import ProjectModel.Services;
import ProjectModel.Franchise;
import ProjectModel.Manager;
import ProjectModel.SystemAdmin;
import ui.EventManagerRole.EventManagerPanel;
import ui.EventManagerRole.ManageOrganisationAdminForEvent;
import ui.EventManagerRole.ManageOrganisationForEvents;
import ui.EventManagerRole.ViewTaskPanelForEvent;
import ui.SystemAdministration.ManageCustomersJPanel;
import ui.SystemAdministration.ManageFranchisePanel;
import ui.SystemAdministration.ManageManagersPanel;
import ui.SystemAdministration.ManageServicesPanel;
import ui.SystemAdministration.SystemAdministrationJPanel;
import CustomerRoleUi.CustomerStartingPanel;

public class Main1JFrame extends javax.swing.JFrame {

    private SystemAdmin systemAdmin;
    private String userName;
    private String password;

    public Main1JFrame() {
        initComponents();
        this.systemAdmin = DbUtils.getInstance().retrieveSystem();
        logoutBtn.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane = new javax.swing.JSplitPane();
        leftPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        loginBtn = new javax.swing.JButton();
        logoutBtn = new javax.swing.JButton();
        passwordField = new javax.swing.JPasswordField();
        rightPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        leftPanel.setBackground(new java.awt.Color(102, 0, 255));
        leftPanel.setPreferredSize(new java.awt.Dimension(138, 813));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("USERNAME");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("PASSWORD");

        loginBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        loginBtn.setText("LOGIN");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        logoutBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        logoutBtn.setText("LOGOUT");
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        passwordField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout leftPanelLayout = new javax.swing.GroupLayout(leftPanel);
        leftPanel.setLayout(leftPanelLayout);
        leftPanelLayout.setHorizontalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, leftPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(logoutBtn)
                .addGap(23, 23, 23))
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(leftPanelLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel2))
                    .addGroup(leftPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(leftPanelLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, leftPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(passwordField)
                .addContainerGap())
        );
        leftPanelLayout.setVerticalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addGap(315, 315, 315)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(232, Short.MAX_VALUE))
        );

        jSplitPane.setLeftComponent(leftPanel);

        rightPanel.setBackground(new java.awt.Color(0, 0, 0));
        rightPanel.setLayout(null);
        jSplitPane.setRightComponent(rightPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1293, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        this.userName = usernameField.getText();
        this.password = passwordField.getText();

        if (systemAdmin.validateUserNamePassword(userName, password)) {
            String type = systemAdmin.findUserType(userName);

            switch (type) {
                case "admin":
                    SystemAdministrationJPanel systemAdministration = new SystemAdministrationJPanel(systemAdmin,this::renderFranchisePanel,this::renderServicesPanel,this::renderManagerPanel,this::renderCustomerPanel);
                    jSplitPane.setRightComponent(systemAdministration);
                    break;
                case "Customer":
                    renderCustomer(userName);
                    break;
                case "Business Event":
                    eventManagerPanel();
                    break;
                
                default:
                    JOptionPane.showMessageDialog(this, "Type not supported.");
                    return;
            }
            usernameField.setText("");
            passwordField.setText("");
            loginBtn.setEnabled(false);
            logoutBtn.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(this, "Invalid username or password");
        }
    }//GEN-LAST:event_loginBtnActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed

        System.out.println("Logout called.");
        DbUtils.getInstance().storeSystem(systemAdmin);
        jSplitPane.setRightComponent(rightPanel);
        loginBtn.setEnabled(true);
        logoutBtn.setEnabled(false);
        usernameField.setText("");
        passwordField.setText("");
        System.out.println("Logout success.");
    }//GEN-LAST:event_logoutBtnActionPerformed


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main1JFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSplitPane jSplitPane;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JButton loginBtn;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JPanel rightPanel;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables

    private void eventManagerPanel() {
        jSplitPane.setRightComponent(new EventManagerPanel(systemAdmin,this::renderViewTask3, this::renderEventOrg, this::renderEventAdmin));

    }

    private void renderViewTask3() {     // view Business Event manager panel
        String type = systemAdmin.findUserType(userName);
        BusinessEvent event = (BusinessEvent) findUserEnterprise();
        ViewTaskPanelForEvent eventPanel = new ViewTaskPanelForEvent(systemAdmin, this::eventManagerPanel, userName, type, event);
        jSplitPane.setRightComponent(eventPanel);
    }

    private void renderEventOrg() {     // add an organisation for event
        String type = systemAdmin.findUserType(userName);
        Franchise network = findUserFranchiseForEvents();
        ManageOrganisationForEvents org = new ManageOrganisationForEvents(systemAdmin, this::eventManagerPanel, userName, type, network);
        jSplitPane.setRightComponent(org);
    }

    private void renderEventAdmin() { //create organisation admin under event
        String type = systemAdmin.findUserType(userName);
        Franchise network = findUserFranchiseForEvents();
        ManageOrganisationAdminForEvent orgAdmin = new ManageOrganisationAdminForEvent(systemAdmin, this::eventManagerPanel, userName, type, network);
        jSplitPane.setRightComponent(orgAdmin);
    }
    
        private Franchise findUserFranchiseForEvents() {
        List<Franchise> network = systemAdmin.getListOfFranchise();
        for (int i = 0; i < network.size(); i++) {
            List<BusinessEvent> event = network.get(i).getServiceDirectory().getListOfEvents();
            for (int j = 0; j < event.size(); j++) {
                List<Manager> manager = event.get(j).getListOfManager();
                for (int k = 0; k < manager.size(); k++) {
                    if (manager.get(k).getUsername().equals(userName)) {
                        return network.get(i);

                    }
                }
            }
        }
        return null;
    }
        
    private Services findUserEnterprise() {
        List<Franchise> network = systemAdmin.getListOfFranchise();
        for (int i = 0; i < network.size(); i++) {
            List<BusinessEvent> event = network.get(i).getServiceDirectory().getListOfEvents();
            for (int j = 0; j < event.size(); j++) {
                List<Manager> manager = event.get(j).getListOfManager();
                for (int k = 0; k < manager.size(); k++) {
                    if (manager.get(k).getUsername().equals(userName)) {
                        return event.get(j);
                    }
                }
            }
        }
        return null;
    }

    private void renderServicesPanel() {
        ManageServicesPanel enterprise = new ManageServicesPanel(systemAdmin, this::renderSystemAdminPanel);
        jSplitPane.setRightComponent(enterprise);
    }

    private void renderCustomerPanel() {
        ManageCustomersJPanel customer = new ManageCustomersJPanel(systemAdmin, this::renderSystemAdminPanel);
        jSplitPane.setRightComponent(customer);
    }
    
    private void renderSystemAdminPanel() {
        jSplitPane.setRightComponent(new SystemAdministrationJPanel(systemAdmin,this::renderFranchisePanel, this::renderServicesPanel,this::renderManagerPanel, this::renderCustomerPanel));
    }
    
    private void renderFranchisePanel() {
        ManageFranchisePanel fPanel = new ManageFranchisePanel(systemAdmin, this::renderSystemAdminPanel);
        jSplitPane.setRightComponent(fPanel);
    }
        
    private void renderManagerPanel() {
        ManageManagersPanel manager = new ManageManagersPanel(systemAdmin, this::renderSystemAdminPanel);
        jSplitPane.setRightComponent(manager);
    }

    private void renderCustomer(String username) {
        Customer customer = systemAdmin.getCustomerDirec().findCustomerUsername(username);
        CustomerStartingPanel customerPanel = new CustomerStartingPanel(systemAdmin, this::renderBookRoomPanel, this::manageBooking);
        jSplitPane.setRightComponent(customerPanel);
    }
    
    private void renderBookRoomPanel() {

    }

    private void manageBooking() {

    }
}

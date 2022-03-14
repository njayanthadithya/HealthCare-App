/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.Validity.ValidatePassword;
import Business.Validity.ValidateString;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Enterprise.EnterpriseDirectory;
import Business.Network.Network;
import Business.Roles.AdminRole;
import Business.UserAccount.UserAccount;
import static Logger.Logger.logger;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.InputVerifier;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rutvi Patel
 */
public class Manageenterpriseadminpanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;
    private EnterpriseDirectory enterprisedirectory;

    /**
     * Creates new form ManageEnterpriseJPanel
     */
    public Manageenterpriseadminpanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        logger.log(Level.INFO, "Manageenterpriseadminpanel Started");
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        vlb.setVisible(false);
        delbt.setVisible(false);
        jPanel1.setVisible(false);
        gettable();
        addInputVerifiers();
        getnetworkcombobox();
    }

    private void gettable() {
        logger.log(Level.INFO, "gettable Manageenterpriseadminpanel");
        DefaultTableModel model = (DefaultTableModel) enterpriseJTable.getModel();

        model.setRowCount(0);
        for (Network net : system.getNetworkList()) {
            for (Enterprise enterprise : net.getEnterprisedirectory().getEnterpriselist()) {
                for (UserAccount useracc : enterprise.getUseraccountdirectory().getUseraccountlist()) {
                    Object[] row = new Object[3];
                    row[0] = enterprise;
                    row[1] = net.getName();
                    row[2] = useracc.getUsername();

                    model.addRow(row);
                }
            }
        }
    }

    private void getnetworkcombobox(){
         logger.log(Level.INFO, "getnetworkcombobox Manageenterpriseadminpanel");
        networkJComboBox.removeAllItems();
        
        for (Network network : system.getNetworkList()){
            networkJComboBox.addItem(network);
        }
    }
    
    private void addInputVerifiers(){
        logger.log(Level.INFO, "addInputVerifiers Manageenterpriseadminpanel");
    InputVerifier validateString = new ValidateString();
    nameJTextField.setInputVerifier(validateString);
    usernameJTextField.setInputVerifier(validateString);
    InputVerifier validatePassword = new ValidatePassword();
    passwordJPasswordField.setInputVerifier(validatePassword);
    }
    private void populateEnterpriseComboBox(Network network){
        logger.log(Level.INFO, "populateEnterpriseComboBox Manageenterpriseadminpanel");
        enterpriseJComboBox.removeAllItems();
        
        for (Enterprise enterprise : network.getEnterprisedirectory().getEnterpriselist()){
            enterpriseJComboBox.addItem(enterprise);
        }
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backbt = new javax.swing.JButton();
        delbt = new javax.swing.JButton();
        manageEnt = new javax.swing.JLabel();
        vlb = new javax.swing.JLabel();
        submitbt = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        networkJComboBox = new javax.swing.JComboBox();
        enterpriseJComboBox = new javax.swing.JComboBox();
        usernameJTextField = new javax.swing.JTextField();
        passwordJPasswordField = new javax.swing.JPasswordField();
        nameJTextField = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        enterpriseJTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backbt.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        backbt.setText("Back");
        backbt.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(110, 208, 202)));
        backbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtActionPerformed(evt);
            }
        });
        add(backbt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 80, 29));

        delbt.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        delbt.setText("Delete");
        delbt.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(110, 208, 202)));
        delbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delbtActionPerformed(evt);
            }
        });
        add(delbt, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 640, 80, 29));

        manageEnt.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        manageEnt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        manageEnt.setText("MANAGER ENTERPRISE ADMIN");
        add(manageEnt, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 20, 980, -1));

        vlb.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        vlb.setText("View User Admin");
        add(vlb, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 410, 160, -1));

        submitbt.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        submitbt.setText("Submit");
        submitbt.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(110, 208, 202)));
        submitbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitbtActionPerformed(evt);
            }
        });
        add(submitbt, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 360, 80, 29));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("Add User Admin");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, 150, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Network:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Enterprise:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Username:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, -1, 30));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Password:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Enterprise Admin Name:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, -1, -1));

        networkJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        networkJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkJComboBoxActionPerformed(evt);
            }
        });
        add(networkJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, 140, -1));

        enterpriseJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        enterpriseJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterpriseJComboBoxActionPerformed(evt);
            }
        });
        add(enterpriseJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, 136, -1));
        add(usernameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 230, 136, -1));
        add(passwordJPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 270, 134, -1));
        add(nameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 320, 136, -1));

        enterpriseJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ENTERPRISE NAME", "NETWORK", "USERNAME"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(enterpriseJTable);

        jPanel1.add(jScrollPane1);

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 450, 470, 170));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("View");
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(110, 208, 202)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 360, 80, 29));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imaiges/medicare image 1.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
        jLabel6.setMaximumSize(new java.awt.Dimension(1500, 1000));
        jLabel6.setMinimumSize(new java.awt.Dimension(1500, 1000));
        jLabel6.setPreferredSize(new java.awt.Dimension(1500, 1000));
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void networkJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networkJComboBoxActionPerformed
        logger.log(Level.INFO, "networkJComboBoxActionPerformed Manageenterpriseadminpanel");
        Network network = (Network) networkJComboBox.getSelectedItem();
        if (network != null){
            populateEnterpriseComboBox(network);
        }
        
        
    }//GEN-LAST:event_networkJComboBoxActionPerformed

    private void submitbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitbtActionPerformed
    logger.log(Level.INFO, "submitbtActionPerformed Manageenterpriseadminpanel");
    
    vlb.setVisible(true);
        delbt.setVisible(true);
        jPanel1.setVisible(true);
        
        try
       {    
        Enterprise enterprise = (Enterprise) enterpriseJComboBox.getSelectedItem();
        Network network = (Network) networkJComboBox.getSelectedItem();
        String username = usernameJTextField.getText();
        String password = String.valueOf(passwordJPasswordField.getPassword());
        String name = nameJTextField.getText();
        
        for (Network net1 : system.getNetworkList())
        {
            for (Enterprise ent1 : net1.getEnterprisedirectory().getEnterpriselist())
            {
                for (UserAccount user1 : ent1.getUseraccountdirectory().getUseraccountlist())
                {
                    if (username.equalsIgnoreCase(user1.getUsername()))
                    {
                        JOptionPane.showMessageDialog(null, "Username already exists!");
                        return;
                    }
                }
            }
        }
        
        Employee employee = enterprise.getEmployeedirectory().createEmployee(name);
        employee.setEmployeeName(name);
        UserAccount account = enterprise.getUseraccountdirectory().createAccount(username, password, employee, new AdminRole());
        JOptionPane.showMessageDialog(null, "Enterprise Admin Account has been created");
        gettable();
        resetFields();
       }
       catch(Exception e)
       {
        JOptionPane.showMessageDialog(this, "Please enter valid inputs");    
       }    
    }//GEN-LAST:event_submitbtActionPerformed
    
        public void resetFields()
    {
        usernameJTextField.setText("");
        passwordJPasswordField.setText("");
        nameJTextField.setText("");
    }
        
    private void backbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtActionPerformed
        logger.log(Level.INFO, "backbtActionPerformed Manageenterpriseadminpanel");
        userProcessContainer.remove(this);
         Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        Systemadminworkareapanel sysAdminwjp = (Systemadminworkareapanel) component;
        sysAdminwjp.gettree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backbtActionPerformed

    private void delbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delbtActionPerformed
        // TODO add your handling code here:
        logger.log(Level.INFO, "delbtActionPerformed Manageenterpriseadminpanel");
        UserAccount userAccountToBeDeleted = null;
        int selectedRow = enterpriseJTable.getSelectedRow();
        if(selectedRow >= 0)
        {
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(this, "Would you like to delete the row ");
            if (dialogResult == JOptionPane.YES_OPTION) {
                Enterprise enterprise = (Enterprise) enterpriseJTable.getValueAt(selectedRow, 0);
                for (Network network : system.getNetworkList()) {
                    this.enterprisedirectory = network.getEnterprisedirectory();
                }
                enterprisedirectory.deleteenterprise(enterprise);
                JOptionPane.showMessageDialog(null, "Deleted successfully");
                gettable();
            }

        }
        else
        {
            JOptionPane.showMessageDialog(this, "Please select a row");
        }

                    
                
 
        
    
    }//GEN-LAST:event_delbtActionPerformed

    private void enterpriseJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterpriseJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enterpriseJComboBoxActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        vlb.setVisible(true);
        delbt.setVisible(true);
        jPanel1.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbt;
    private javax.swing.JButton delbt;
    private javax.swing.JComboBox enterpriseJComboBox;
    private javax.swing.JTable enterpriseJTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel manageEnt;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JComboBox networkJComboBox;
    private javax.swing.JPasswordField passwordJPasswordField;
    private javax.swing.JButton submitbt;
    private javax.swing.JTextField usernameJTextField;
    private javax.swing.JLabel vlb;
    // End of variables declaration//GEN-END:variables
}
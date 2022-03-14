/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AdministrativeRole;

import Business.Validity.ValidateString;
import Business.Employee.Employee;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import static Logger.Logger.logger;
import java.awt.CardLayout;

import javax.swing.InputVerifier;

import java.util.logging.Level;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jayanthadithya
 */
public class ManageEmpJPanel extends javax.swing.JPanel {

    private OrganizationDirectory orgdir;
    private JPanel userProcessContainer;

    /**
     * Creates new form ManageOrganizationJPanel
     */
    public ManageEmpJPanel(JPanel userProcessContainer, OrganizationDirectory orgdir) {
        logger.log(Level.INFO, "Manageemployeepanel");

        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.orgdir = orgdir;
         vieworgcombo.setVisible(false);
        viewlb.setVisible(false);
        viewpanel.setVisible(false);
        orglb.setVisible(false);

        addInputVerifiers();
        getorgcombobox();
        getorgempcombobox();
    }
         private void addInputVerifiers() {
        InputVerifier stringValidation = new ValidateString();
        nametxt.setInputVerifier(stringValidation);
        
        
    }
    public void getorgcombobox(){
        
        logger.log(Level.INFO, "getorgcombobox --Manageemployeepanel");
        
        vieworgcombo.removeAllItems();

        for (Organization organization : orgdir.getOrganizationAList()) {
            vieworgcombo.addItem(organization);
        }
    }

    public void getorgempcombobox() {
        logger.log(Level.INFO, "getorgempcombobox --Manageemployeepanel");

        orgcmbobox.removeAllItems();

        for (Organization organization : orgdir.getOrganizationAList()) {
            orgcmbobox.addItem(organization);
        }
    }

    private void gettable(Organization organization) {
        logger.log(Level.INFO, "gettable --Manageemployeepanel");

        DefaultTableModel mod = (DefaultTableModel) orgtable.getModel();

        mod.setRowCount(0);

        for (Employee emp : organization.getEmployeedirectory().getEmployeeAList()) {
            Object[] row = new Object[2];
            row[0] = emp.getEmployeeId();
            row[1] = emp.getEmployeeName();
            mod.addRow(row);
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

        vieworgcombo = new javax.swing.JComboBox();
        orglb = new javax.swing.JLabel();
        backbt = new javax.swing.JButton();
        manageEnt = new javax.swing.JLabel();
        viewlb = new javax.swing.JLabel();
        submitbt = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        orgcmbobox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        nametxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        viewpanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        orgtable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        vieworgcombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        vieworgcombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vieworgcomboActionPerformed(evt);
            }
        });
        add(vieworgcombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 400, 200, -1));

        orglb.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        orglb.setText("Organization:");
        add(orglb, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 400, -1, 20));

        backbt.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        backbt.setText("Back");
        backbt.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(110, 208, 202)));
        backbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtActionPerformed(evt);
            }
        });
        add(backbt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 80, 29));

        manageEnt.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        manageEnt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        manageEnt.setText("MANAGE ORGANIZATION EMPLOYEE");
        add(manageEnt, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, 20, 980, -1));

        viewlb.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        viewlb.setText("View Organization Employee");
        add(viewlb, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 340, -1, -1));

        submitbt.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        submitbt.setText("Submit");
        submitbt.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(110, 208, 202)));
        submitbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitbtActionPerformed(evt);
            }
        });
        add(submitbt, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 280, 80, 29));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Organization:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, -1, -1));

        orgcmbobox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        orgcmbobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orgcmboboxActionPerformed(evt);
            }
        });
        add(orgcmbobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 200, 202, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, -1, -1));
        add(nametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 240, 202, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setText("Create Employee");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 190, -1));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("View");
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(110, 208, 202)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 280, 80, 29));

        orgtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NAME"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(orgtable);
        if (orgtable.getColumnModel().getColumnCount() > 0) {
            orgtable.getColumnModel().getColumn(0).setResizable(false);
            orgtable.getColumnModel().getColumn(1).setResizable(false);
        }

        viewpanel.add(jScrollPane1);

        add(viewpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 440, 480, 240));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imaiges/medicare image 1.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setMaximumSize(new java.awt.Dimension(1500, 1000));
        jLabel1.setMinimumSize(new java.awt.Dimension(1500, 1000));
        jLabel1.setPreferredSize(new java.awt.Dimension(1500, 1000));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 820));
    }// </editor-fold>//GEN-END:initComponents

    private void submitbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitbtActionPerformed

        
        logger.log(Level.INFO, "submitbtActionPerformed --Manageemployeepanel");
        vieworgcombo.setVisible(true);
        viewlb.setVisible(true);
        viewpanel.setVisible(true);
        orglb.setVisible(true);
        
        if(nametxt.getText().trim().isEmpty() || orgcmbobox.getSelectedIndex()<0)
        {
         JOptionPane.showMessageDialog(null, "Please provide input in all the fields");
         return;    
        }
        

        logger.log(Level.INFO, "submitbtActionPerformed --Manageemployeepanel");


        Organization org = (Organization) orgcmbobox.getSelectedItem();
        String name = nametxt.getText();

        org.getEmployeedirectory().createEmployee(name);
        JOptionPane.showMessageDialog(null, "Employee has been created successfully", "success",JOptionPane.PLAIN_MESSAGE);
        resetFields();
        gettable(org);
        if (name.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Name field cannot be empty!!", "warning", JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_submitbtActionPerformed

    private void backbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtActionPerformed

        logger.log(Level.INFO, "backbtActionPerformed --Manageemployeepanel");

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backbtActionPerformed

    private void vieworgcomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vieworgcomboActionPerformed
        logger.log(Level.INFO, "vieworgcomboActionPerformed --Manageemployeepanel");

        Organization organization = (Organization) vieworgcombo.getSelectedItem();
        if (organization != null) {
            gettable(organization);
        }
    }//GEN-LAST:event_vieworgcomboActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        vieworgcombo.setVisible(true);
        viewlb.setVisible(true);
        viewpanel.setVisible(true);
        orglb.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void orgcmboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orgcmboboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_orgcmboboxActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel manageEnt;
    private javax.swing.JTextField nametxt;
    private javax.swing.JComboBox orgcmbobox;
    private javax.swing.JLabel orglb;
    private javax.swing.JTable orgtable;
    private javax.swing.JButton submitbt;
    private javax.swing.JLabel viewlb;
    private javax.swing.JComboBox vieworgcombo;
    private javax.swing.JPanel viewpanel;
    // End of variables declaration//GEN-END:variables

    private void resetFields() {
        nametxt.setText("");
        orgcmbobox.setSelectedIndex(0);
    }
}

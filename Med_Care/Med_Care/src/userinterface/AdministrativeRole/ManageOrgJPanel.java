/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AdministrativeRole;

import Business.Enterprise.Enterprise;

import Business.Enterprise.EnterpriseDirectory;

import Business.Organization.Organization;
import Business.Organization.Organization.Type;
import Business.Organization.OrganizationDirectory;
import static Logger.Logger.logger;
import java.awt.CardLayout;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
//import sun.net.www.content.image.jpeg;

/**
 * @author jayanthadithya
 */
public class ManageOrgJPanel extends javax.swing.JPanel {

    private Enterprise enterprise;
    private JPanel userProcessContainer;
    private Organization organization;

    /**
     * Creates new form ManageOrganizationJPanel
     */
    public ManageOrgJPanel(JPanel userProcessContainer, Enterprise directory) {
        logger.log(Level.INFO, "ManageOrganizationpanel");

        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = directory;
        jPanel1.setVisible(false);
        //jPanel1.setVisible(true);
        delbt.setVisible(false);
        viewlb.setVisible(false);

        gettable();
        getcombo();
    }

    private void getcombo() {
        logger.log(Level.INFO, "getcombo --ManageOrganizationpanel");

        orgcombobox.removeAllItems();

        if (enterprise.getEnterprisetype() == Enterprise.EnterpriseType.EmergencyCare) {
            for (Type type : Organization.Type.values()) {
                if (type.getValue().equals(Type.EmgCareManager.getValue()) || type.getValue().equals(Type.Driver.getValue())
                        || type.getValue().equals(Type.EmgCareNurse.getValue())) {
                    orgcombobox.addItem(type);
                }
            }
        } else if (enterprise.getEnterprisetype() == Enterprise.EnterpriseType.BloodBank) {
            for (Type type : Organization.Type.values()) {
               if (type.getValue().equals(Type.Manager.getValue()) || type.getValue().equals(Type.Physicians.getValue())
                    || type.getValue().equals(Type.Lab.getValue())) {
                    orgcombobox.addItem(type);
                }
            }

        } else if (enterprise.getEnterprisetype() == Enterprise.EnterpriseType.Hospital) {
            for (Type type : Organization.Type.values()) {
                if (type.getValue().equals(Type.Doctor.getValue()) || type.getValue().equals(Type.Nurse.getValue())) {
                    orgcombobox.addItem(type);
                }

            }
        }
        else if (enterprise.getEnterprisetype() == Enterprise.EnterpriseType.CovidCare) {
            for (Type type : Organization.Type.values()) {
               if (type.getValue().equals(Type.CCareManager.getValue()) || type.getValue().equals(Type.CCarePhysicians.getValue())) 
               {
                    orgcombobox.addItem(type);
                }
            }

        }

    }

    private void gettable() {
        
        logger.log(Level.INFO, "getcombo --ManageOrganizationpanel");
        
        DefaultTableModel mod = (DefaultTableModel) orgtable.getModel();

        mod.setRowCount(0);

        for (Organization organization : enterprise.getOrganizationdirectory().getOrganizationAList()) {
            Object[] row = new Object[2];
            row[0] = organization.getOrganizationid();
            row[1] = organization;
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

        backbt = new javax.swing.JButton();
        manageEnt = new javax.swing.JLabel();
        submitbt = new javax.swing.JButton();
        orglb = new javax.swing.JLabel();
        orgcombobox = new javax.swing.JComboBox();
        addorglb = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        orgtable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        delbt = new javax.swing.JButton();
        viewlb = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backbt.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        backbt.setText("Back");
        backbt.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(110, 208, 202)));
        backbt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtActionPerformed(evt);
            }
        });
        add(backbt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 80, 29));

        manageEnt.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        manageEnt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        manageEnt.setText("MANAGE ORGANIZATION");
        add(manageEnt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 970, -1));

        submitbt.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        submitbt.setText("Submit");
        submitbt.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(110, 208, 202)));
        submitbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitbtActionPerformed(evt);
            }
        });
        add(submitbt, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 240, 80, 29));

        orglb.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        orglb.setText("Organization Type: ");
        add(orglb, new org.netbeans.lib.awtextra.AbsoluteConstraints(283, 200, -1, -1));

        orgcombobox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        orgcombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orgcomboboxActionPerformed(evt);
            }
        });
        add(orgcombobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 200, 153, -1));

        addorglb.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        addorglb.setText("Add an Organization");
        add(addorglb, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 105, -1, -1));

        orgtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name"
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 347, -1, -1));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("View");
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(110, 208, 202)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, 80, 29));

        delbt.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        delbt.setText("Delete");
        delbt.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(110, 208, 202)));
        delbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delbtActionPerformed(evt);
            }
        });
        add(delbt, new org.netbeans.lib.awtextra.AbsoluteConstraints(523, 573, 80, 29));

        viewlb.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        viewlb.setText("View Organization");
        add(viewlb, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 292, -1, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imaiges/medicare image 1.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setMaximumSize(new java.awt.Dimension(1500, 1000));
        jLabel1.setMinimumSize(new java.awt.Dimension(1500, 1000));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 970));
    }// </editor-fold>//GEN-END:initComponents

    private void submitbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitbtActionPerformed
        
        logger.log(Level.INFO, "submitbtActionPerformed --ManageOrganizationpanel");
        
        Type type = (Type) orgcombobox.getSelectedItem();
        jPanel1.setVisible(true);
        delbt.setVisible(true);
        viewlb.setVisible(true);

        if(type == null)
        {
       //JOptionPane.showMessageDialog(this, "Please select a organization!", "warning",JOptionPane.PLAIN_MESSAGE);
            JOptionPane.showMessageDialog(this, "Select a organization!");
        return;     
        }
        
        for (Organization org : enterprise.getOrganizationdirectory().getOrganizationAList()) {
            if (type.getValue().equals(org.getOrganzationName())) {
                JOptionPane.showMessageDialog(null, "The organization already exists!", "warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
        }
        enterprise.getOrganizationdirectory().createOrganization(type);
        gettable();
    }//GEN-LAST:event_submitbtActionPerformed

    private void backbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtActionPerformed
        logger.log(Level.INFO, "backbtActionPerformed --ManageOrganizationpanel");

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backbtActionPerformed

    private void orgcomboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orgcomboboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_orgcomboboxActionPerformed

    private void delbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delbtActionPerformed

        logger.log(Level.INFO, "delbtActionPerformed --ManageOrganizationpanel");
        int selectedRow = orgtable.getSelectedRow();
        if(selectedRow >= 0)
        {
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(this, "Would you like to delete the row ");
            if(dialogResult == JOptionPane.YES_OPTION)
            {

                Organization org = (Organization)orgtable.getValueAt(selectedRow, 1);
                enterprise.getOrganizationdirectory().removeOrganization(org);
            }
            gettable();
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Please select a row");
            
        }

    }//GEN-LAST:event_delbtActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jPanel1.setVisible(true);
        delbt.setVisible(true);
        viewlb.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addorglb;
    private javax.swing.JButton backbt;
    private javax.swing.JButton delbt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel manageEnt;
    private javax.swing.JComboBox orgcombobox;
    private javax.swing.JLabel orglb;
    private javax.swing.JTable orgtable;
    private javax.swing.JButton submitbt;
    private javax.swing.JLabel viewlb;
    // End of variables declaration//GEN-END:variables
}

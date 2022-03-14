/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.BloodBank;

import Business.BloodGroup.BloodGroup;
import Business.BloodGroup.Bloodgrouplist;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.PhysicianOrganization;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.BloodReqToNewBloodBank;
import Business.WorkQueue.BloodReqToBloodBankfromHos;
import Business.WorkQueue.WorkRequest;
import static Logger.Logger.logger;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rutvi Patel
 */
public class hospreqpanel extends javax.swing.JPanel {

    /**
     * Creates new form hospreqpanel
     */
    private JPanel userProcessContainer;
    private PhysicianOrganization organization;
    private Enterprise enterprise;
    private UserAccount useraccount;
    private BloodGroup bloodgrp;
    private Bloodgrouplist bloodgrplist;
    private EcoSystem ecosystem;
    private Network network;
    private Enterprise.EnterpriseType enterprisetype;
    private OrganizationDirectory organizationdirectory;

    public hospreqpanel(JPanel userProcessContainer, BloodGroup bloodgrp, Bloodgrouplist bloodgrplist, Enterprise enterprise, UserAccount useraccount, EcoSystem ecosystem) {
        logger.log(Level.INFO, "hospreqpanel");

        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.bloodgrp = bloodgrp;
        this.bloodgrplist = bloodgrplist;
        this.network = network;
        this.ecosystem = ecosystem;
        this.useraccount = useraccount;
        this.enterprise = enterprise;
        this.enterprisetype = enterprisetype;
        this.organization = organization;
        this.organizationdirectory = organizationdirectory;

        getBloodReqTable();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        bloodtable = new javax.swing.JTable();
        assignbt = new javax.swing.JButton();
        acceptbt = new javax.swing.JButton();
        rejectbt = new javax.swing.JButton();
        backbt = new javax.swing.JButton();
        manageEnt2 = new javax.swing.JLabel();
        manageEnt3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bloodtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BLOOD GROUP", "NO OF UNITS", "REQUEST STATUS", "ASSIGNED TO", "REQUESTED HOSPITAL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(bloodtable);
        if (bloodtable.getColumnModel().getColumnCount() > 0) {
            bloodtable.getColumnModel().getColumn(0).setResizable(false);
            bloodtable.getColumnModel().getColumn(1).setResizable(false);
            bloodtable.getColumnModel().getColumn(2).setResizable(false);
            bloodtable.getColumnModel().getColumn(3).setResizable(false);
            bloodtable.getColumnModel().getColumn(4).setResizable(false);
        }

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 659, 143));

        assignbt.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        assignbt.setText("Assign ");
        assignbt.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(110, 208, 202)));
        assignbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignbtActionPerformed(evt);
            }
        });
        add(assignbt, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, 80, 29));

        acceptbt.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        acceptbt.setText("Accept");
        acceptbt.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(110, 208, 202)));
        acceptbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptbtActionPerformed(evt);
            }
        });
        add(acceptbt, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 350, 80, 29));

        rejectbt.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rejectbt.setText("Decline");
        rejectbt.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(110, 208, 202)));
        rejectbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rejectbtActionPerformed(evt);
            }
        });
        add(rejectbt, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 350, 80, 29));

        backbt.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        backbt.setText("Back");
        backbt.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(110, 208, 202)));
        backbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtActionPerformed(evt);
            }
        });
        add(backbt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 80, 29));

        manageEnt2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        manageEnt2.setText("Hospital Requests:");
        add(manageEnt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 250, -1));

        manageEnt3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        manageEnt3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        manageEnt3.setText("HOSPITAL REQUEST AREA");
        add(manageEnt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 880, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imaiges/medicare image 1.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setMaximumSize(new java.awt.Dimension(1500, 1000));
        jLabel1.setMinimumSize(new java.awt.Dimension(1500, 1000));
        jLabel1.setPreferredSize(new java.awt.Dimension(1500, 1000));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 910, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void getBloodReqTable() {
        logger.log(Level.INFO, "getBloodReqTable --hospreqpanel");

        DefaultTableModel mod = (DefaultTableModel) bloodtable.getModel();

        mod.setRowCount(0);

        for (WorkRequest wr : enterprise.getWorkqueue().getWorkRequestAList()) {
            if (wr.getClass().getName().contains("BloodrequestToBBfromHospital")) {
                Object[] row = new Object[5];
                row[0] = ((BloodReqToBloodBankfromHos) wr);

                row[1] = ((BloodReqToBloodBankfromHos) wr).getRequestedUnits();
                if (wr.getTaskStatus().equals("0")) {
                    row[2] = "In Process ";
                } else if (wr.getTaskStatus().equals("1")) {
                    row[2] = "In Progress";
                } else if (wr.getTaskStatus().equals("2")) {
                    row[2] = "Declined";
                } else if (wr.getTaskStatus().equals("3")) {
                    row[2] = "Completed";
                }
                try {
                    row[3] = wr.getReceipient().getEmployeeUser().getEmployeeName();
                } catch (NullPointerException e) {

                    row[3] = "No Assignee yet";
                }
                row[4] = ((BloodReqToBloodBankfromHos) wr).sendingEnterprise;
                mod.addRow(row);
            }
        }

    }

    private void assignbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignbtActionPerformed
        logger.log(Level.INFO, "assignbtActionPerformed --hospreqpanel");

        int selectedRow = bloodtable.getSelectedRow();
        int rowCount = bloodtable.getSelectedRowCount();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a request", "warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (rowCount > 1) {
            JOptionPane.showMessageDialog(null, "Please select only one request", "warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        WorkRequest wq = (WorkRequest) bloodtable.getValueAt(selectedRow, 0);
        
        if (wq.getTaskStatus().equals("1")) {
            JOptionPane.showMessageDialog(null, "The request is already in process", "warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (wq.getTaskStatus().equals("3") || wq.getTaskStatus().equals("2")) {
            JOptionPane.showMessageDialog(null, "Request has been completed earlier", "warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if ((wq).getTaskStatus().equals("0")) {
            (wq).setReceipient(useraccount);
            (wq).setTaskStatus("1");
            getBloodReqTable();
            JOptionPane.showMessageDialog(null, "The request is now assigned to you! Kindly process it");
        }

    }//GEN-LAST:event_assignbtActionPerformed

    private void acceptbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptbtActionPerformed
        // TODO add your handling code here:
        logger.log(Level.INFO, "acceptbtActionPerformed --hospreqpanel");

        int selectedRow = bloodtable.getSelectedRow();
        int rowCount = bloodtable.getSelectedRowCount();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a request", "warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (rowCount > 1) {
            JOptionPane.showMessageDialog(null, "Please select only one request", "warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (rowCount == 1) {
            WorkRequest wq = (WorkRequest) bloodtable.getValueAt(selectedRow, 0);

            if (wq.getTaskStatus().equals("0")) {
                JOptionPane.showMessageDialog(null, "The request has to be assigned first");
            } else if (wq.getTaskStatus().equals("3") || wq.getTaskStatus().equals("2")) {
                JOptionPane.showMessageDialog(null, "The request has been processed earlier");
            } else {
                String reqbloodgrp = ((BloodReqToBloodBankfromHos) wq).getPatient().getBloodGroup();
                for (BloodGroup bg : this.bloodgrplist.getBloodGroupAList()) {
                    if (bg.getBloodGroup().equals(reqbloodgrp)) {
                        int availunits = Integer.parseInt(bg.getAvailUnits());
                    }
                }
                int borrowunits = ((BloodReqToBloodBankfromHos) wq).getRequestedUnits();
                for (BloodGroup bg : this.bloodgrplist.getBloodGroupAList()) {
                    if (bg.getBloodGroup().equals(reqbloodgrp)) {
                        if (Integer.parseInt(bg.getAvailUnits()) > borrowunits) {
                            bg.setAvailUnits(String.valueOf((Integer.parseInt(bg.getAvailUnits()) - borrowunits)));
                            JOptionPane.showMessageDialog(null, "Request has been accepted");
                            wq.setTaskStatus("3");
                            getBloodReqTable();
                            break;
                        } else {
                            JOptionPane.showMessageDialog(null, "Available Blood Units are lesser than the requested units, Please Decline the Request");
                        }
                    }
                }
            }
        }

    }//GEN-LAST:event_acceptbtActionPerformed

    private void rejectbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rejectbtActionPerformed
        // TODO add your handling code here:
        logger.log(Level.INFO, "rejectbtActionPerformed --hospreqpanel");

        int selectedRow = bloodtable.getSelectedRow();
        int rowCount = bloodtable.getSelectedRowCount();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a request to be worked on", "warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (rowCount > 1) {
            JOptionPane.showMessageDialog(null, "Please select only one request", "warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        WorkRequest workreq = (WorkRequest) bloodtable.getValueAt(selectedRow, 0);
        if (workreq.getReceipient().equals(useraccount)) {
            if (workreq.getTaskStatus().equals("0")) {
                JOptionPane.showMessageDialog(null, "The request has to be assigned first");
            } else if (workreq.getTaskStatus().equals("3") || workreq.getTaskStatus().equals("2")) {
                JOptionPane.showMessageDialog(null, "The request has been processed earlier");
            } else {
                (workreq).setReceipient(useraccount);
                (workreq).setTaskStatus("2");
                getBloodReqTable();
                JOptionPane.showMessageDialog(null, "The request has been declined due to shortage of blood");

            }
        } else {
            JOptionPane.showMessageDialog(null, "The Request has to be processed by " + workreq.getReceipient().getEmployeeUser().getEmployeeName());
        }
    }//GEN-LAST:event_rejectbtActionPerformed

    private void backbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtActionPerformed
        logger.log(Level.INFO, "backbtActionPerformed --hospreqpanel");

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        Physicianworkareapanel dwjp = (Physicianworkareapanel) component;
        dwjp.gettable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_backbtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acceptbt;
    private javax.swing.JButton assignbt;
    private javax.swing.JButton backbt;
    private javax.swing.JTable bloodtable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel manageEnt2;
    private javax.swing.JLabel manageEnt3;
    private javax.swing.JButton rejectbt;
    // End of variables declaration//GEN-END:variables
}

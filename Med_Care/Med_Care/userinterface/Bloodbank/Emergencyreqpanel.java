/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Bloodbank;

import Business.Blood.Bloodgroup;
import Business.Blood.Bloodgrouplist;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Clinicianorganization;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.UserAccount.Useraccount;
import Business.WorkQueue.BloodReqToNewBB;
import Business.WorkQueue.BloodrequestToBBfromEMS;
import Business.WorkQueue.WorkQueue;
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
 * @author Lokesh Balaji
 */
public class Emergencyreqpanel extends javax.swing.JPanel {

    /**
     * Creates new form HospitalReqJPanel
     */
    private JPanel userProcessContainer;
    private Clinicianorganization organization;
    private Enterprise enterprise;
    private Useraccount useraccount;
    private Bloodgroup bloodgrp;
    private Bloodgrouplist bloodgrplist;
    private EcoSystem ecosystem;
    private Network network;
    private Enterprise.EnterpriseType enterprisetype;
    private OrganizationDirectory organizationdirectory;

    public Emergencyreqpanel(JPanel userProcessContainer, Bloodgroup bloodgrp, Bloodgrouplist bloodgrplist, Enterprise enterprise, Useraccount useraccount, EcoSystem ecosystem) {
        logger.log(Level.INFO, "EMSReqJPanel");

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

        getbloodreqtable();

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
        emergencyreqtable = new javax.swing.JTable();
        assignbt = new javax.swing.JButton();
        acceptbt = new javax.swing.JButton();
        requestbt = new javax.swing.JButton();
        refreshJButton = new javax.swing.JButton();
        backbt = new javax.swing.JButton();
        manageEnt1 = new javax.swing.JLabel();
        manageEnt2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        emergencyreqtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Blood Group", "No of Units", "Request Status", "Assigned To"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(emergencyreqtable);
        if (emergencyreqtable.getColumnModel().getColumnCount() > 0) {
            emergencyreqtable.getColumnModel().getColumn(0).setResizable(false);
            emergencyreqtable.getColumnModel().getColumn(1).setResizable(false);
            emergencyreqtable.getColumnModel().getColumn(2).setResizable(false);
            emergencyreqtable.getColumnModel().getColumn(3).setResizable(false);
        }

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 659, 143));

        assignbt.setText("Assign to me");
        assignbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignbtActionPerformed(evt);
            }
        });
        add(assignbt, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, -1, -1));

        acceptbt.setText("Accept");
        acceptbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptbtActionPerformed(evt);
            }
        });
        add(acceptbt, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 340, -1, -1));

        requestbt.setText("Request Blood");
        requestbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestbtActionPerformed(evt);
            }
        });
        add(requestbt, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 340, -1, -1));

        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });
        add(refreshJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 20, -1, -1));

        backbt.setText("Back");
        backbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtActionPerformed(evt);
            }
        });
        add(backbt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        manageEnt1.setFont(new java.awt.Font("Tamil MN", 0, 14)); // NOI18N
        manageEnt1.setText("EMS Requests:");
        add(manageEnt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 250, -1));

        manageEnt2.setFont(new java.awt.Font("Tamil MN", 1, 18)); // NOI18N
        manageEnt2.setText("CLINICIAN REQUEST AREA");
        add(manageEnt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 250, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void getbloodreqtable() {
        logger.log(Level.INFO, "populateBloodReqTable --EMSReqJPanel");

        DefaultTableModel model = (DefaultTableModel) emergencyreqtable.getModel();

        model.setRowCount(0);

        for (WorkRequest wr : enterprise.getWorkqueue().getWorkrequestlist()) {
            if (wr.getClass().getName().contains("BloodrequestToBBfromEMS")) {
                Object[] row = new Object[4];
                row[0] = ((BloodrequestToBBfromEMS) wr);
                row[1] = ((BloodrequestToBBfromEMS) wr).getReqUnits();
                row[2] = wr.getStatus();
                try {
                    row[3] = wr.getReceiver().getEmpuser().getEmpname();
                } catch (NullPointerException e) {

                    row[3] = "No Assignee yet";
                }
                
                model.addRow(row);
            }
        }

    }

    private void assignbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignbtActionPerformed
        logger.log(Level.INFO, "assignJButtonActionPerformed --EMSReqJPanel");

        int selectedRow = emergencyreqtable.getSelectedRow();
        int rowCount = emergencyreqtable.getSelectedRowCount();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a request", "warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (rowCount > 1) {
            JOptionPane.showMessageDialog(null, "Please select only one request", "warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        WorkRequest wq = (WorkRequest) emergencyreqtable.getValueAt(selectedRow, 0);
        //        if(wq.getReceiver()!=null){
        //        JOptionPane.showMessageDialog(null, "Request has been processed earlier","warning",JOptionPane.WARNING_MESSAGE);
        //        return;
        //        }

        if (wq.getStatus().equals("In Progress")) {
            JOptionPane.showMessageDialog(null, "The request is already in process", "warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (wq.getStatus().equals("Completed") || wq.getStatus().equals("Declined")) {
            JOptionPane.showMessageDialog(null, "Request has been completed earlier", "warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if ((wq).getStatus().equals("Pending")) {
            (wq).setReceiver(useraccount);
            (wq).setStatus(BloodrequestToBBfromEMS.REQUEST_PROGRESS);
            getbloodreqtable();
            JOptionPane.showMessageDialog(null, "The request is now assigned to you! Kindly process it");
        }

    }//GEN-LAST:event_assignbtActionPerformed

    private void acceptbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptbtActionPerformed
        // TODO add your handling code here:
        logger.log(Level.INFO, "btnAcceptActionPerformed --EMSReqJPanel");

        int selectedRow = emergencyreqtable.getSelectedRow();
        int rowCount = emergencyreqtable.getSelectedRowCount();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a request", "warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (rowCount > 1) {
            JOptionPane.showMessageDialog(null, "Please select only one request", "warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (rowCount == 1) {
            WorkRequest wq = (WorkRequest) emergencyreqtable.getValueAt(selectedRow, 0);

            if (wq.getStatus().equals("Pending")) {
                JOptionPane.showMessageDialog(null, "The request has to be assigned first");
            } else if (wq.getStatus().equals("Completed") || wq.getStatus().equals("Declined")) {
                JOptionPane.showMessageDialog(null, "The request has been processed earlier");
            } else {
                String reqbloodgroup = ((BloodrequestToBBfromEMS) wq).getBloodGroup();
                for (Bloodgroup bg : this.bloodgrplist.getBloodgrplist()) {
                    if (bg.getBloodgrp().equals(reqbloodgroup)) {
                        int AvailableUnits = Integer.parseInt(bg.getAvailableunits());
                    }
                }
                int BorrowedUnits = Integer.parseInt(((BloodrequestToBBfromEMS) wq).getReqUnits());
                for (Bloodgroup bg : this.bloodgrplist.getBloodgrplist()) {
                    if (bg.getBloodgrp().equals(reqbloodgroup)) {
                        if (Integer.parseInt(bg.getAvailableunits()) > BorrowedUnits) {
                            bg.setAvailableunits(String.valueOf((Integer.parseInt(bg.getAvailableunits()) - BorrowedUnits)));
                            JOptionPane.showMessageDialog(null, "Request has been accepted");
                            wq.setStatus(BloodrequestToBBfromEMS.REQUEST_COMPLETE);
                            getbloodreqtable();
                            break;
                        } else {
                            JOptionPane.showMessageDialog(null, "Available Blood Units are lesser than the requested units, Please Decline the Request");
                        }
                    }

                }
            }
        }

    }//GEN-LAST:event_acceptbtActionPerformed

    private void requestbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestbtActionPerformed
        // TODO add your handling code here:
        logger.log(Level.INFO, "btnDeclineActionPerformed --EMSReqJPanel");

        int selectedRow = emergencyreqtable.getSelectedRow();
        int rowCount = emergencyreqtable.getSelectedRowCount();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a request to be worked on", "warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (rowCount > 1) {
            JOptionPane.showMessageDialog(null, "Please select only one request", "warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        WorkRequest wq = (WorkRequest) emergencyreqtable.getValueAt(selectedRow, 0);

        if (wq.getStatus().equals("Pending")) {
            JOptionPane.showMessageDialog(null, "The request has to be assigned first");
        } else if (wq.getStatus().equals("Completed") || wq.getStatus().equals("Declined")) {
            JOptionPane.showMessageDialog(null, "The request has been processed earlier");
        } else {
            String bg = ((BloodrequestToBBfromEMS) wq).getBloodGroup();
            for (Bloodgroup b : bloodgrplist.getBloodgrplist()) {
                if (b.getBloodgrp().equals(bg)) {
                    this.bloodgrp = b;
                }
            }
            Sendreqpanel panel = new Sendreqpanel(userProcessContainer, bloodgrp, bloodgrplist, enterprise, useraccount, ecosystem);
            userProcessContainer.add("SendReqJPanel", panel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);

        }


    }//GEN-LAST:event_requestbtActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        logger.log(Level.INFO, "refreshJButtonActionPerformed --EMSReqJPanel");

        getbloodreqtable();

    }//GEN-LAST:event_refreshJButtonActionPerformed

    private void backbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtActionPerformed
        logger.log(Level.INFO, "backJButtonActionPerformed --EMSReqJPanel");
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        Clinicianworkareapanel dwjp = (Clinicianworkareapanel) component;
        dwjp.gettable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_backbtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acceptbt;
    private javax.swing.JButton assignbt;
    private javax.swing.JButton backbt;
    private javax.swing.JTable emergencyreqtable;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel manageEnt1;
    private javax.swing.JLabel manageEnt2;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JButton requestbt;
    // End of variables declaration//GEN-END:variables
}

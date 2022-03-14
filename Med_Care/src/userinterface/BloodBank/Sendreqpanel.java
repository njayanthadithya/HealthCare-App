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
import static Business.Enterprise.Enterprise.EnterpriseType.BloodBank;
import Business.Network.Network;
import Business.Organization.PhysicianOrganization;
import Business.Organization.LabOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.BloodReqToNewBloodBank;
import Business.WorkQueue.LabTestRequest;
import static Logger.Logger.logger;
import com.sun.glass.events.KeyEvent;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.HashSet;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Lokesh Balaji
 */
public class Sendreqpanel extends javax.swing.JPanel {

    /**
     * Creates new form Sendreqpanel
     */
    private BloodGroup bloodgrp;
    private Bloodgrouplist bloodgrplist;
    private JPanel userProcessContainer;
    private UserAccount useraccount;
    private Enterprise enterprise;
    private Enterprise.EnterpriseType enterprisetype;
    private Organization organization;

    private EcoSystem ecosystem;
    private Network network;

    public Sendreqpanel(JPanel userProcessContainer, BloodGroup bloodgrp, Bloodgrouplist bloodgrplist, Enterprise enterprise, UserAccount useraccount, EcoSystem ecosystem) {
        logger.log(Level.INFO, "Sendreqpanel");

        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.bloodgrp = bloodgrp;
        this.bloodgrplist = bloodgrplist;
        this.useraccount = useraccount;
        this.enterprise = enterprise;
        this.enterprisetype = enterprisetype;
        this.organization = organization;
        this.ecosystem = ecosystem;
        this.network = network;
        modifydetails();

        //combo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        submitbt = new javax.swing.JButton();
        backbt = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        reqbloodlb = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        requnitstxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        bloodgrpcmbo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        submitbt.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        submitbt.setText("Submit Request");
        submitbt.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(110, 208, 202)));
        submitbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitbtActionPerformed(evt);
            }
        });
        add(submitbt, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, 130, 30));

        backbt.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        backbt.setText("Back");
        backbt.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(110, 208, 202)));
        backbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtActionPerformed(evt);
            }
        });
        add(backbt, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 60, 30));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("CLINICIAN WORK REQUEST AREA");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 20, 770, 30));

        reqbloodlb.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        reqbloodlb.setText("Request Blood");
        add(reqbloodlb, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, 150, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Required Units:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, -1, -1));

        requnitstxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requnitstxtActionPerformed(evt);
            }
        });
        requnitstxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                requnitstxtKeyTyped(evt);
            }
        });
        add(requnitstxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, 110, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Blood Group:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, -1, -1));

        bloodgrpcmbo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "O+", "O-", "A+", "A-", "B+", "B-", "AB+", "AB-" }));
        bloodgrpcmbo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bloodgrpcmboActionPerformed(evt);
            }
        });
        add(bloodgrpcmbo, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 180, -1, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imaiges/medicare image 1.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setMaximumSize(new java.awt.Dimension(1500, 1000));
        jLabel1.setMinimumSize(new java.awt.Dimension(1500, 1000));
        jLabel1.setPreferredSize(new java.awt.Dimension(1500, 1000));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void submitbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitbtActionPerformed

        // TODO add your handling code here:
        logger.log(Level.INFO, "submitbtActionPerformed --Sendreqpanel");

        String bloodgrp = (String) bloodgrpcmbo.getSelectedItem();
        String requiredunits = requnitstxt.getText();
        if (bloodgrpcmbo.getSelectedIndex() < 0 || requnitstxt.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter data in all fields", "warning", JOptionPane.WARNING_MESSAGE);
            return;
        } else {
            for (BloodGroup bloodgroup : bloodgrplist.getBloodGroupAList()) {
                if (bloodgroup.getBloodGroup().equals(bloodgrp)) {
                    this.bloodgrp = bloodgroup;
                }
            }

            BloodReqToNewBloodBank bloodrequest = new BloodReqToNewBloodBank(this.bloodgrp);

            bloodrequest.setRequestedUnits(requiredunits);
            bloodrequest.setIssuer(this.useraccount);
            bloodrequest.setTaskStatus(BloodReqToNewBloodBank.RequestPENDING);

            Organization org = null;
            for (Network net : ecosystem.getNetworkList()) {
                for (Enterprise enterprise : net.getEnterprisedirectory().getEnterpriselist()) {
                    if (enterprise.getEnterprisetype() == Enterprise.EnterpriseType.BloodBank && !enterprise.getOrganzationName().equals(this.enterprise.getOrganzationName())) {
                        for (Organization organization : enterprise.getOrganizationdirectory().getOrganizationAList()) {
                            if (organization instanceof PhysicianOrganization) {
                                org = organization;
                                break;
                            }
                        }
                    }
                }
            }
            if (org != null) {
                org.getWorkqueue().getWorkRequestAList().add(bloodrequest);
                useraccount.getWorkqueue().getWorkRequestAList().add(bloodrequest);
            }
            JOptionPane.showMessageDialog(null, "Work Request  submitted successfully");
            bloodgrpcmbo.setEnabled(false);
            requnitstxt.setText("");
            requnitstxt.setEnabled(false);
            
        }
    }//GEN-LAST:event_submitbtActionPerformed

    private void backbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtActionPerformed
        // TODO add your handling code here:
      logger.log(Level.INFO, "backbtActionPerformed --Sendreqpanel");

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        Clinicianworkareapanel dwjp = (Clinicianworkareapanel) component;
        dwjp.gettable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_backbtActionPerformed

    private void requnitstxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_requnitstxtKeyTyped
        // TODO add your handling code here:
       
        logger.log(Level.INFO, "requnitstxtKeyTyped --Sendreqpanel");
        char vchar = evt.getKeyChar();
        if (!(Character.isDigit(vchar))
                || (vchar == KeyEvent.VK_BACKSPACE)
                || (vchar == KeyEvent.VK_DELETE)) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Please enter a number");
        }
    }//GEN-LAST:event_requnitstxtKeyTyped

    private void bloodgrpcmboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bloodgrpcmboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bloodgrpcmboActionPerformed

    private void requnitstxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requnitstxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_requnitstxtActionPerformed
//public void combo(){
//        
//        HashSet<String> hash = new HashSet<>();
//        for (BloodGroup bloodgrp : bloodgrplist.getBloodGroupList()) {
//            if (bloodgrp.getBloodgroup() != null) {
//                hash.add(bloodgrp.getBloodgroup());
//            }
//        }
//        
//        for(String u: hash){
//                bloodGroupComboBox.addItem(u);            
//        }      
//        
//    }

    public void modifydetails() {
        logger.log(Level.INFO, "updateDetails --SendReqJPanel");

        bloodgrpcmbo.setSelectedItem(bloodgrp.getBloodGroup());
        bloodgrpcmbo.setEnabled(false);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbt;
    private javax.swing.JComboBox<String> bloodgrpcmbo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel reqbloodlb;
    private javax.swing.JTextField requnitstxt;
    private javax.swing.JButton submitbt;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Emergency.Emergencynurse;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.AdminOrganization;
import Business.Organization.PhysicianOrganization;
import Business.Organization.DoctorOrganization;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.BloodReqToBloodBankfromEmg;
import Business.WorkQueue.MessageNurseToHosRequest;
import Business.WorkQueue.WorkRequest;
import Business.WorkQueue.TransportRequest;
import Business.WorkQueue.EmgNurseRequest;
import Business.WorkQueue.CCarerequestToCCarefromEMS;
import static Logger.Logger.logger;

import java.awt.CardLayout;
import java.awt.Component;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author admin
 */
public class ProcessEMSNurseWorkRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ProcessEMSNurseWorkRequest
     */
    private JPanel userProcessContainer;
    private OrganizationDirectory organizatindirectory;
    private Organization organization;
    private Enterprise enterprise;
    private UserAccount useraccount;
    private EmgNurseRequest nurse;
    private EcoSystem ecosystem;
    private Network network;

    public ProcessEMSNurseWorkRequestJPanel(JPanel userProcessContainer, UserAccount useraccount,
            EmgNurseRequest nurse, EcoSystem ecosystem, Enterprise enterprise) {
        logger.log(Level.INFO, "ProcessEMSNurseWorkRequestJPanel");

        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.useraccount = useraccount;
        this.nurse = nurse;
        this.ecosystem = ecosystem;
        this.network = network;
        this.enterprise = enterprise;
        this.organization = organization;
        getpatientname();
        getcombobox();
        getBB();
        getOB();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        emsnursewkarea = new javax.swing.JLabel();
        OBreqLbl = new javax.swing.JLabel();
        organneededlbl = new javax.swing.JLabel();
        reqOrgantype = new javax.swing.JLabel();
        noofunitsOB = new javax.swing.JLabel();
        organbanklbl = new javax.swing.JLabel();
        sendreqtoOBbtn = new javax.swing.JButton();
        btnYesOB = new javax.swing.JRadioButton();
        btnNoOB = new javax.swing.JRadioButton();
        patreqnameOB = new javax.swing.JTextField();
        ptnameOB = new javax.swing.JLabel();
        chooseOrganTypecombo = new javax.swing.JComboBox<>();
        unitstxtOB = new javax.swing.JTextField();
        OBcombobox = new javax.swing.JComboBox<>();
        msgtohoslbl = new javax.swing.JLabel();
        ptname = new javax.swing.JLabel();
        patnametxt = new javax.swing.JTextField();
        BBReqLbl = new javax.swing.JLabel();
        bloodneededBB = new javax.swing.JLabel();
        bloodgrouplb = new javax.swing.JLabel();
        ptnameBB = new javax.swing.JLabel();
        noofunitsLb = new javax.swing.JLabel();
        BloodBankLbl = new javax.swing.JLabel();
        bloodbankcombo = new javax.swing.JComboBox<>();
        unitstxtBB = new javax.swing.JTextField();
        choosebloodcombo = new javax.swing.JComboBox<>();
        patreqnameBB = new javax.swing.JTextField();
        btnBackBB = new javax.swing.JButton();
        sendreqbtBB = new javax.swing.JButton();
        btnYesBB = new javax.swing.JRadioButton();
        btnNoBB = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        emsnursewkarea.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        emsnursewkarea.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        emsnursewkarea.setText("NURSE WORK AREA");
        add(emsnursewkarea, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1060, 24));

        OBreqLbl.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        OBreqLbl.setText("OrganBank Request");
        add(OBreqLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 400, -1, 20));

        organneededlbl.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        organneededlbl.setText("Organ Needed:");
        add(organneededlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 460, -1, 20));

        reqOrgantype.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        reqOrgantype.setText("Required Organ Type :");
        add(reqOrgantype, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 540, -1, 20));

        noofunitsOB.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        noofunitsOB.setText("No of units :");
        add(noofunitsOB, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 580, -1, 20));

        organbanklbl.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        organbanklbl.setText("Organ Bank:");
        add(organbanklbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 620, -1, 20));

        sendreqtoOBbtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        sendreqtoOBbtn.setText("Send Request to Organ Bank");
        sendreqtoOBbtn.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(110, 208, 202)));
        sendreqtoOBbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendreqtoOBbtnActionPerformed(evt);
            }
        });
        add(sendreqtoOBbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 670, 230, 30));

        buttonGroup1.add(btnYesOB);
        btnYesOB.setText("Yes");
        btnYesOB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYesOBActionPerformed(evt);
            }
        });
        add(btnYesOB, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 460, -1, 30));

        buttonGroup1.add(btnNoOB);
        btnNoOB.setText("No");
        add(btnNoOB, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 460, -1, 30));
        add(patreqnameOB, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 500, 209, 30));

        ptnameOB.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ptnameOB.setText("Patient Name :");
        add(ptnameOB, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 500, -1, 20));

        chooseOrganTypecombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Organ Type", "Heart", "Eye", "Liver", "Kidneys" }));
        add(chooseOrganTypecombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 540, 210, 30));
        add(unitstxtOB, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 580, 209, 30));

        OBcombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Organ Bank" }));
        add(OBcombobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 620, 210, 30));

        msgtohoslbl.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        msgtohoslbl.setText("Message to Hospital");
        add(msgtohoslbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, -1, -1));

        ptname.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ptname.setText("Patient Name :");
        add(ptname, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, -1, -1));
        add(patnametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 120, 209, -1));

        BBReqLbl.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        BBReqLbl.setText("Bloodbank Request");
        add(BBReqLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 400, -1, -1));

        bloodneededBB.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        bloodneededBB.setText("Blood Needed :");
        add(bloodneededBB, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 460, -1, -1));

        bloodgrouplb.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        bloodgrouplb.setText("Required Blood Group :");
        add(bloodgrouplb, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 540, -1, -1));

        ptnameBB.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ptnameBB.setText("Patient Name :");
        add(ptnameBB, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 500, -1, -1));

        noofunitsLb.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        noofunitsLb.setText("No of units :");
        add(noofunitsLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 580, -1, -1));

        BloodBankLbl.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        BloodBankLbl.setText("BloodBank :");
        add(BloodBankLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 630, -1, -1));

        bloodbankcombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Blood Bank" }));
        add(bloodbankcombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 630, 210, -1));

        unitstxtBB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unitstxtBBActionPerformed(evt);
            }
        });
        unitstxtBB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                unitstxtBBKeyTyped(evt);
            }
        });
        add(unitstxtBB, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 580, 209, -1));

        choosebloodcombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose a blood group", "O+", "O-", "A+", "A-", "B+", "B-", "AB+", "AB-", " " }));
        choosebloodcombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choosebloodcomboActionPerformed(evt);
            }
        });
        add(choosebloodcombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 540, 210, -1));
        add(patreqnameBB, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 500, 209, -1));

        btnBackBB.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnBackBB.setText(" Back");
        btnBackBB.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(110, 208, 202)));
        btnBackBB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackBBActionPerformed(evt);
            }
        });
        add(btnBackBB, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 770, 120, 40));

        sendreqbtBB.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        sendreqbtBB.setText("Send Request to Blood Bank");
        sendreqbtBB.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(110, 208, 202)));
        sendreqbtBB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendreqbtBBActionPerformed(evt);
            }
        });
        add(sendreqbtBB, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 680, 240, 30));

        buttonGroup2.add(btnYesBB);
        btnYesBB.setText("Yes");
        btnYesBB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYesBBActionPerformed(evt);
            }
        });
        add(btnYesBB, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 450, -1, 30));

        buttonGroup2.add(btnNoBB);
        btnNoBB.setText("No");
        add(btnNoBB, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 450, -1, 30));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imaiges/medicare image 1.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setMaximumSize(new java.awt.Dimension(1500, 1000));
        jLabel1.setMinimumSize(new java.awt.Dimension(1500, 1000));
        jLabel1.setPreferredSize(new java.awt.Dimension(1500, 1000));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1160, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void unitstxtBBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unitstxtBBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unitstxtBBActionPerformed

    private void unitstxtBBKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_unitstxtBBKeyTyped
        // TODO add your handling code here:
        logger.log(Level.INFO, "unitstxtBBKeyTyped --ProcessEMSNurseWorkRequestJPanel");

        char vchar = evt.getKeyChar();
        if (!(Character.isDigit(vchar))
            || (vchar == KeyEvent.VK_BACK_SPACE)
            || (vchar == KeyEvent.VK_DELETE)) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Please enter a number");
        }
    }//GEN-LAST:event_unitstxtBBKeyTyped

    private void choosebloodcomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choosebloodcomboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_choosebloodcomboActionPerformed

    private void btnBackBBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackBBActionPerformed
        // TODO add your handling code here:
        logger.log(Level.INFO, "btnBackBBActionPerformed --ProcessEMSNurseWorkRequestJPanel");

        if (sendreqbtBB.isEnabled() == false  && sendreqtoOBbtn.isEnabled() == false) {

            nurse.setTaskStatus(EmgNurseRequest.RequestCOMPLETED);

        }

        if (sendreqbtBB.isEnabled() == true &&  sendreqtoOBbtn.isEnabled() == true) {
            JOptionPane.showMessageDialog(null, "Operation not allowed unless the work request is completed");
            return;
        }
//        if (sendreqbtBB.isEnabled() == true && sendreqtoOBbtn.isEnabled() == true) {
//            JOptionPane.showMessageDialog(null, "Operation not allowed unless the work request is completed");
//            return;
//        }
//        if (sendreqbtBB.isEnabled() == false && sendreqtoOBbtn.isEnabled() == false) {
//            JOptionPane.showMessageDialog(null, "Operation not allowed unless the work request is completed");
//            return;
//        }
        if (sendreqbtBB.isEnabled() == false &&  sendreqtoOBbtn.isEnabled() == true) {
            JOptionPane.showMessageDialog(null, "Operation not allowed unless the work request is completed");
            return;
        }
//        if (sendreqbtBB.isEnabled() == false && sendreqtoOBbtn.isEnabled() == true) {
//            JOptionPane.showMessageDialog(null, "Operation not allowed unless the work request is completed");
//            return;
//        }
        if (sendreqbtBB.isEnabled() == true && sendreqtoOBbtn.isEnabled() == false) {
            JOptionPane.showMessageDialog(null, "Operation not allowed unless the work request is completed");
            return;
        }
        
//        if (sendreqbtBB.isEnabled() == true && sendreqtoOBbtn.isEnabled() == false) {
//            JOptionPane.showMessageDialog(null, "Operation not allowed unless the work request is completed");
//            return;
//        }

        userProcessContainer.remove(this);
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        cardLayout.previous(userProcessContainer);
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        Component[] comps = this.userProcessContainer.getComponents();
        for (Component comp : comps) {
            if (comp instanceof EMSNurseWorkAreaJPanel) {
                EMSNurseWorkAreaJPanel createP = (EMSNurseWorkAreaJPanel) comp;
                createP.gettable();
                createP.gettableBB();
                createP.gettableOB();

            }
            layout.previous(userProcessContainer);
        }
    }//GEN-LAST:event_btnBackBBActionPerformed

    private void sendreqbtBBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendreqbtBBActionPerformed
        // TODO add your handling code here:
        logger.log(Level.INFO, "sendreqbtBBActionPerformed --ProcessEMSNurseWorkRequestJPanel");

        if (bloodbankcombo.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(userProcessContainer, "Please select the BloodBank you like to request blood");
            return;
        }

        buttonGroup2.clearSelection();
        
        btnNoOB.setSelected(true);
        String noofUnits = unitstxtBB.getText();
        if (noofUnits.length() > 1) {
            JOptionPane.showMessageDialog(null, "Maximum units allowed is 9");
            return;
        }
        if (choosebloodcombo.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Please choose a bloodgroup");
            return;
        }

        String bloodgrp = String.valueOf(choosebloodcombo.getSelectedItem());
        String patname = patreqnameBB.getText();

        BloodReqToBloodBankfromEmg blood = new BloodReqToBloodBankfromEmg(patname, bloodgrp, noofUnits);
        blood.setpName(patname);
        blood.setBloodGroup(bloodgrp);
        blood.setRequestedUnits(noofUnits);
        blood.setIssuer(useraccount);

        blood.setTaskStatus(BloodReqToBloodBankfromEmg.RequestPENDING);

        for (Network network : ecosystem.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterprisedirectory().getEnterpriselist()) {
                if (enterprise.getEnterprisetype() == Enterprise.EnterpriseType.BloodBank && enterprise.getOrganzationName().equals(bloodbankcombo.getSelectedItem())) {
                    enterprise.getWorkqueue().getWorkRequestAList().add(blood);
                    useraccount.getWorkqueue().getWorkRequestAList().add(blood);
                    break;
                }
            }
        }

        JOptionPane.showMessageDialog(null, "Your request has been sent to BloodBank");
        sendreqbtBB.setEnabled(false);
        patnametxt.setText("");
        patreqnameBB.setText("");
        unitstxtBB.setText("");
        choosebloodcombo.setSelectedIndex(0);
        choosebloodcombo.setEnabled(false);
        unitstxtBB.setEnabled(false);
        bloodbankcombo.setEnabled(false);
        btnYesBB.setEnabled(false);
        if (sendreqbtBB.isEnabled() == false && sendreqtoOBbtn.isEnabled() == false) {

            nurse.setTaskStatus(EmgNurseRequest.RequestCOMPLETED);

        }
    }//GEN-LAST:event_sendreqbtBBActionPerformed

    private void btnYesOBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYesOBActionPerformed
        // TODO add your handling code here:
        logger.log(Level.INFO, "btnYesOBActionPerformed --ProcessEMSNurseWorkRequestJPanel");

        sendreqtoOBbtn.setEnabled(true);
        unitstxtOB.setEnabled(true);
        chooseOrganTypecombo.setEnabled(true);
        OBcombobox.setEnabled(true);
        btnNoOB.setEnabled(false);
  
    }//GEN-LAST:event_btnYesOBActionPerformed

    private void sendreqtoOBbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendreqtoOBbtnActionPerformed
        // TODO add your handling code here:
        
      logger.log(Level.INFO, "sendreqtoOBbtnActionPerformed --ProcessEMSNurseWorkRequestJPanel");

        if (OBcombobox.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(userProcessContainer, "Please select the OrganBank you like to request Organ from!");
            return;
        }

        buttonGroup1.clearSelection();
        String noofUnits = unitstxtOB.getText();
        if (noofUnits.length() > 1) {
            JOptionPane.showMessageDialog(null, "Maximum units allowed is 9");
            return;
        }
        if (chooseOrganTypecombo.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Please choose a OrganType");
            return;
        }

        String organtype = String.valueOf(chooseOrganTypecombo.getSelectedItem());
        String patname = patreqnameOB.getText();



        CCarerequestToCCarefromEMS orgn = new CCarerequestToCCarefromEMS(patname, organtype, noofUnits);
        orgn.setpName(patname);
        orgn.setCCareType(organtype);
        orgn.setReqUnits(noofUnits);
        orgn.setIssuer(useraccount);


        orgn.setTaskStatus(CCarerequestToCCarefromEMS.RequestPENDING);

        for (Network network : ecosystem.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterprisedirectory().getEnterpriselist()) {
                if (enterprise.getEnterprisetype() == Enterprise.EnterpriseType.CovidCare && enterprise.getOrganzationName().equals(OBcombobox.getSelectedItem())) {
                    enterprise.getWorkqueue().getWorkRequestAList().add(orgn);
                    useraccount.getWorkqueue().getWorkRequestAList().add(orgn);
                    break;
                }
            }
        }

        JOptionPane.showMessageDialog(null, "Your request has been sent to OrganBank");
        sendreqtoOBbtn.setEnabled(false);
        patnametxt.setText("");
        patreqnameOB.setText("");
        unitstxtOB.setText("");
        chooseOrganTypecombo.setSelectedIndex(0);
        chooseOrganTypecombo.setEnabled(false);
        OBcombobox.setEnabled(false);
        unitstxtOB.setEnabled(false);
        OBcombobox.setEnabled(false);
        btnYesOB.setEnabled(false);
        if (sendreqtoOBbtn.isEnabled() == false && sendreqbtBB.isEnabled() == false) {

            nurse.setTaskStatus(EmgNurseRequest.RequestCOMPLETED);
        }
  
    }//GEN-LAST:event_sendreqtoOBbtnActionPerformed

    private void btnYesBBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYesBBActionPerformed
        // TODO add your handling code here:
        logger.log(Level.INFO, "btnYesBBActionPerformed --ProcessEMSNurseWorkRequestJPanel");

        sendreqbtBB.setEnabled(true);
        unitstxtBB.setEnabled(true);
        choosebloodcombo.setEnabled(true);
        bloodbankcombo.setEnabled(true);
        btnNoBB.setEnabled(false);
 
    }//GEN-LAST:event_btnYesBBActionPerformed

 

    private void getpatientname() {
        logger.log(Level.INFO, "getpatientname --ProcessEMSNurseWorkRequestJPanel");

        
        patnametxt.setEnabled(false);
        //sendmsgtoHospitalbtn.setEnabled(true);
//        transferHospital.setEnabled(true);
        patnametxt.setText(nurse.getEmgPatient().getpName());
      //  msgtxt.setEnabled(true);
        
        //for Blood bank
        btnNoBB.setSelected(true);
        patreqnameBB.setEnabled(false);
        sendreqbtBB.setEnabled(false);
        bloodbankcombo.setEnabled(false);
        unitstxtBB.setEnabled(false);
        choosebloodcombo.setEnabled(false);
        patreqnameBB.setText(nurse.getEmgPatient().getpName());
        
        
        //for organ bank
        btnNoOB.setSelected(true);
        patreqnameOB.setEnabled(false);
        sendreqtoOBbtn.setEnabled(false);
        OBcombobox.setEnabled(false);
        unitstxtOB.setEnabled(false);
        chooseOrganTypecombo.setEnabled(false);
        patreqnameOB.setText(nurse.getEmgPatient().getpName());
        
    }

    public void getcombobox() {
        logger.log(Level.INFO, "getcombobox --ProcessEMSNurseWorkRequestJPanel");

        for (Network net : ecosystem.getNetworkList()) {
            for (Enterprise ent : net.getEnterprisedirectory().getEnterpriselist()) {
                if (!ent.getOrganzationName().equals(this.enterprise.getOrganzationName())
                        && ent.getEnterprisetype() == Enterprise.EnterpriseType.Hospital) {
//                    transferHospital.addItem(ent.getName());
                }
            }
        }
    }

    public void getBB() {
        logger.log(Level.INFO, "getBB --ProcessEMSNurseWorkRequestJPanel");

        for (Network net : ecosystem.getNetworkList()) {
            for (Enterprise e : net.getEnterprisedirectory().getEnterpriselist()) {
                if (e.getEnterprisetype() == Enterprise.EnterpriseType.BloodBank) {
                    bloodbankcombo.addItem(e.getOrganzationName());
                }
            }
        }
    }
    
        public void getOB() {
        logger.log(Level.INFO, "getOB --ProcessEMSNurseWorkRequestJPanel");

        for (Network net : ecosystem.getNetworkList()) {
            for (Enterprise e : net.getEnterprisedirectory().getEnterpriselist()) {
                if (e.getEnterprisetype() == Enterprise.EnterpriseType.CovidCare) {
                    OBcombobox.addItem(e.getOrganzationName());
                }
            }
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BBReqLbl;
    private javax.swing.JLabel BloodBankLbl;
    private javax.swing.JComboBox<String> OBcombobox;
    private javax.swing.JLabel OBreqLbl;
    private javax.swing.JComboBox<String> bloodbankcombo;
    private javax.swing.JLabel bloodgrouplb;
    private javax.swing.JLabel bloodneededBB;
    private javax.swing.JButton btnBackBB;
    private javax.swing.JRadioButton btnNoBB;
    private javax.swing.JRadioButton btnNoOB;
    private javax.swing.JRadioButton btnYesBB;
    private javax.swing.JRadioButton btnYesOB;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> chooseOrganTypecombo;
    private javax.swing.JComboBox<String> choosebloodcombo;
    private javax.swing.JLabel emsnursewkarea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel msgtohoslbl;
    private javax.swing.JLabel noofunitsLb;
    private javax.swing.JLabel noofunitsOB;
    private javax.swing.JLabel organbanklbl;
    private javax.swing.JLabel organneededlbl;
    private javax.swing.JTextField patnametxt;
    private javax.swing.JTextField patreqnameBB;
    private javax.swing.JTextField patreqnameOB;
    private javax.swing.JLabel ptname;
    private javax.swing.JLabel ptnameBB;
    private javax.swing.JLabel ptnameOB;
    private javax.swing.JLabel reqOrgantype;
    private javax.swing.JButton sendreqbtBB;
    private javax.swing.JButton sendreqtoOBbtn;
    private javax.swing.JTextField unitstxtBB;
    private javax.swing.JTextField unitstxtOB;
    // End of variables declaration//GEN-END:variables

}
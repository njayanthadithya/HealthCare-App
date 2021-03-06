/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.BloodBank;

import Business.BloodGroup.BloodGroup;
import Business.BloodGroup.Bloodgrouplist;
import Business.Enterprise.Enterprise;
import Business.Organization.PhysicianOrganization;
import Business.UserAccount.UserAccount;
import static Logger.Logger.logger;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.event.KeyEvent;
import java.util.HashSet;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import userinterface.Emergency.Emergencynurse.EMSNurseWorkAreaJPanel;
import userinterface.LabAssistantRole.LabAssistantWorkAreaJPanel;

/**
 *
 * @author Lokesh Balaji
 */
public class Createbloodgrppanel extends javax.swing.JPanel {

    /**
     * Creates new form Createbloodgrppanel
     */
    private JPanel userProcessContainer;
    private PhysicianOrganization organization;
    private Enterprise enterprise;
    private UserAccount useraccount;
    private BloodGroup bloodgrp;
    private Bloodgrouplist Bloodgrplist;

    public Createbloodgrppanel(JPanel userProcessContainer, BloodGroup bloodgrp, Bloodgrouplist Bloodgrplist) {
        
        logger.log(Level.INFO, "Createbloodgrppanel");
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.bloodgrp = bloodgrp;
        this.organization = organization;
        this.Bloodgrplist = Bloodgrplist;
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
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bgtxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        AUtxt = new javax.swing.JTextField();
        savebt = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backbt.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        backbt.setText("Back");
        backbt.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(110, 208, 202)));
        backbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtActionPerformed(evt);
            }
        });
        add(backbt, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 80, 29));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("CREATE BLOOD DETAILS");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 14, 760, 40));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Blood Group :");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, -1, -1));

        bgtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bgtxtActionPerformed(evt);
            }
        });
        add(bgtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 110, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Available Units :");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, -1, -1));

        AUtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AUtxtActionPerformed(evt);
            }
        });
        AUtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                AUtxtKeyTyped(evt);
            }
        });
        add(AUtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, 110, -1));

        savebt.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        savebt.setText("Save");
        savebt.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(110, 208, 202)));
        savebt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebtActionPerformed(evt);
            }
        });
        add(savebt, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, 80, 29));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imaiges/medicare image 1.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setMaximumSize(new java.awt.Dimension(1500, 1000));
        jLabel1.setMinimumSize(new java.awt.Dimension(1500, 1000));
        jLabel1.setPreferredSize(new java.awt.Dimension(1500, 1000));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 960));
    }// </editor-fold>//GEN-END:initComponents

    private void AUtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AUtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AUtxtActionPerformed

    private void savebtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebtActionPerformed
        // TODO add your handling code here:
        logger.log(Level.INFO, "savebtActionPerformed --Createbloodgrppanel");

        String bloodgrp = bgtxt.getText();
        String availunits = AUtxt.getText();

        if (bloodgrp.equals("") || bloodgrp.isEmpty() || availunits.equals("") || availunits.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter values for all the fields");
            return;
        }
        if (Bloodgrplist.getBloodGroupAList().size() > 0) {
            for (BloodGroup bg : Bloodgrplist.getBloodGroupAList()) {
                if (bloodgrp.equalsIgnoreCase(String.valueOf(bg))) {
                    JOptionPane.showMessageDialog(null, "BloodGroup already exists");
                    bgtxt.setText("");
                    AUtxt.setText("");
                    return;
                }
            }
        }
        this.bloodgrp = new BloodGroup(bloodgrp, availunits);
        Bloodgrplist.addBloodGroup(this.bloodgrp);
        JOptionPane.showMessageDialog(null, "BloodGroup details added successfully");
        bgtxt.setText("");
        AUtxt.setText("");
        return;
    }//GEN-LAST:event_savebtActionPerformed

    private void backbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtActionPerformed
        // TODO add your handling code here:
        logger.log(Level.INFO, "backbtActionPerformed --Createbloodgrppanel");

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        Clinicianworkareapanel dwjp = (Clinicianworkareapanel) component;
        dwjp.gettable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_backbtActionPerformed

    private void AUtxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AUtxtKeyTyped
        // TODO add your handling code here:
        char vchar = evt.getKeyChar();
        if (!(Character.isDigit(vchar))
                || (vchar == KeyEvent.VK_BACK_SPACE)
                || (vchar == KeyEvent.VK_DELETE)) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Please enter a number");
        }
    }//GEN-LAST:event_AUtxtKeyTyped

    private void bgtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bgtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bgtxtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AUtxt;
    private javax.swing.JButton backbt;
    private javax.swing.JTextField bgtxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton savebt;
    // End of variables declaration//GEN-END:variables
}

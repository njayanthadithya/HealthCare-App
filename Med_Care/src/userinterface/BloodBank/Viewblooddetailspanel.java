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
import Business.Organization.DriverOrganization;
import Business.Organization.LabOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.LabTestRequest;
import static Logger.Logger.logger;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Lokesh Balaji
 */
public class Viewblooddetailspanel extends javax.swing.JPanel {

    /**
     * Creates new form Viewblooddetailspanel
     */
    private JPanel userProcessContainer;
    private PhysicianOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private BloodGroup bloodgroup;
    private Bloodgrouplist bloodgrouplist;

    public Viewblooddetailspanel(JPanel userProcessContainer, BloodGroup bloodgroup, Bloodgrouplist bloodgrouplist, Enterprise enterprise,UserAccount useraccount) {
        logger.log(Level.INFO, "Viewblooddetailspanel");

        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.bloodgroup = bloodgroup;
        this.bloodgrouplist = bloodgrouplist;
        this.userAccount=useraccount;

        updateDetails();
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
        backbt = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        updatebt = new javax.swing.JButton();
        savebt = new javax.swing.JButton();
        testbt = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        bloodgrptxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        availunitstxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Noofunitstxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
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
        add(backbt, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 400, 120, 40));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("UPDATE BLOOD DETAILS");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 30, 770, -1));

        updatebt.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        updatebt.setText("Update");
        updatebt.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(110, 208, 202)));
        updatebt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtActionPerformed(evt);
            }
        });
        add(updatebt, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 90, 30));

        savebt.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        savebt.setText("Save");
        savebt.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(110, 208, 202)));
        savebt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebtActionPerformed(evt);
            }
        });
        add(savebt, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, 80, 30));

        testbt.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        testbt.setText("Test Blood");
        testbt.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(110, 208, 202)));
        testbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testbtActionPerformed(evt);
            }
        });
        add(testbt, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 330, 80, 29));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Blood Group:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, -1, -1));
        add(bloodgrptxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, 116, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Available Units:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, -1, -1));

        availunitstxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                availunitstxtActionPerformed(evt);
            }
        });
        add(availunitstxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, 116, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("No of Units to be added:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, -1, -1));

        Noofunitstxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NoofunitstxtKeyTyped(evt);
            }
        });
        add(Noofunitstxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, 116, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Verified Blood?");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, -1, -1));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("No");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 280, -1, -1));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Yes");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 280, -1, -1));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imaiges/medicare image 1.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
        jLabel6.setMaximumSize(new java.awt.Dimension(1500, 1000));
        jLabel6.setMinimumSize(new java.awt.Dimension(1500, 1000));
        jLabel6.setPreferredSize(new java.awt.Dimension(1500, 1000));
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void updateDetails() {
        logger.log(Level.INFO, "updateDetails --Viewblooddetailspanel");

        bloodgrptxt.setText(bloodgroup.getBloodGroup());
        String bloodunits = bloodgroup.getAvailUnits();
        availunitstxt.setText(bloodunits);

        bloodgrptxt.setEnabled(false);
        Noofunitstxt.setEnabled(false);
        savebt.setEnabled(false);
        updatebt.setEnabled(true);
        availunitstxt.setEnabled(false);
        testbt.setEnabled(false);
    }
    private void savebtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebtActionPerformed
        // TODO add your handling code here:
        logger.log(Level.INFO, "savebtActionPerformed --Viewblooddetailspanel");

        try{
        String bg = bloodgrptxt.getText();
        String nu = Noofunitstxt.getText();
        int newUnits = Integer.parseInt(nu);
        int existingUnits = Integer.parseInt(bloodgroup.getAvailUnits());
        String totalUnits = String.valueOf(newUnits + existingUnits);
        
        if(nu.isEmpty() || nu == null || (!jRadioButton1.isSelected() && !jRadioButton2.isSelected()) )
        {
            JOptionPane.showMessageDialog(null, "Fields cannot be empty");
            return;
        }
        
        else{
        bloodgroup.setBloodGroup(bg);
        bloodgroup.setAvailUnits(totalUnits);
        JOptionPane.showMessageDialog(null, "Blood Details updated successfully");
        }
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, "Fields cannot be empty");
           return;
        }
         
        bloodgrptxt.setEnabled(false);
        Noofunitstxt.setEnabled(false);
        this.availunitstxt.setEnabled(false);
        
       

        
    }//GEN-LAST:event_savebtActionPerformed

    private void updatebtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtActionPerformed
        // TODO add your handling code here:
        logger.log(Level.INFO, "updatebtActionPerformed --Viewblooddetailspanel");

        bloodgrptxt.setEnabled(false);
        Noofunitstxt.setEnabled(true);
        savebt.setEnabled(true);
        updatebt.setEnabled(false);
        testbt.setEnabled(false);
        this.availunitstxt.setEnabled(false);
        jRadioButton1.setEnabled(true);
        jRadioButton2.setEnabled(true);
    }//GEN-LAST:event_updatebtActionPerformed

    private void backbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtActionPerformed

        logger.log(Level.INFO, "backbtActionPerformed --Viewblooddetailspanel");

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        Clinicianworkareapanel dwjp = (Clinicianworkareapanel) component;
        dwjp.gettable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);


    }//GEN-LAST:event_backbtActionPerformed

    private void availunitstxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_availunitstxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_availunitstxtActionPerformed

    private void NoofunitstxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NoofunitstxtKeyTyped
        // TODO add your handling code here:
        logger.log(Level.INFO, "NoofunitstxtKeyTyped --Viewblooddetailspanel");

        char vchar = evt.getKeyChar();
        if (!(Character.isDigit(vchar))
                || (vchar == KeyEvent.VK_BACK_SPACE)
                || (vchar == KeyEvent.VK_DELETE)) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Please enter a number");
        }

    }//GEN-LAST:event_NoofunitstxtKeyTyped

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
        savebt.setEnabled(true);
        testbt.setEnabled(false);
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
        testbt.setEnabled(true);
        savebt.setEnabled(false);
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void testbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testbtActionPerformed
        // TODO add your handling code here:
        try{
        String bloodgroup = bloodgrptxt.getText();
        for (BloodGroup bg : bloodgrouplist.getBloodGroupAList()) {
                if (bg.getBloodGroup().equals(bloodgroup)) {
                    this.bloodgroup = bg;
                }
            }
        int newUnits = Integer.parseInt(Noofunitstxt.getText());
        LabTestRequest lt = new LabTestRequest(this.bloodgroup);
        lt.setBloodgroup(this.bloodgroup);
        lt.setBloodBagUnits(String.valueOf(newUnits));
        lt.setTaskStatus(LabTestRequest.RequestPENDING);
        
        Organization organization = null;
        if (enterprise.getEnterprisetype() == Enterprise.EnterpriseType.BloodBank) {
            for (Organization org : enterprise.getOrganizationdirectory().getOrganizationAList()) {
                if (org instanceof LabOrganization) {
                    organization = org;
                    organization.getWorkqueue().getWorkRequestAList().add(lt);
                    userAccount.getWorkqueue().getWorkRequestAList().add(lt);
                    organization = null;

                }
            }
        }
        JOptionPane.showMessageDialog(null, "Work Request has been submitted successfully");
        Noofunitstxt.setEnabled(false);
        testbt.setEnabled(false);
        return;
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, "Fields cannot be empty");
        }
    }//GEN-LAST:event_testbtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Noofunitstxt;
    private javax.swing.JTextField availunitstxt;
    private javax.swing.JButton backbt;
    private javax.swing.JTextField bloodgrptxt;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JButton savebt;
    private javax.swing.JButton testbt;
    private javax.swing.JButton updatebt;
    // End of variables declaration//GEN-END:variables

   
}

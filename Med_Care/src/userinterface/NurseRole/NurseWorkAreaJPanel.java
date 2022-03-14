/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.NurseRole;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Location.Location;
import Business.Medicine.Medicine;
import Business.Organization.AdminOrganization;
import Business.Organization.DoctorOrganization;
import Business.Organization.NurseOrganization;
import Business.Organization.Organization;
import Business.Patients.Patient;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.DischargeRequesttoNurse;
import Business.WorkQueue.WorkRequest;
import static Logger.Logger.logger;
//import Mail.SendMail;
//import javax.mail.MessagingException;
import java.awt.CardLayout;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.AdministrativeRole.CreatePatientJPanel;

/**
 *
 * @author krish
 */
public class NurseWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private NurseOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;

    /**
     * Creates new form DoctorWorkAreaJPanel
     */
    public NurseWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, NurseOrganization organization, Enterprise enterprise) {
        logger.log(Level.INFO, "NurseWorkAreaJPanel");
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        populateTable();
        populateReq();
    }

    public void populateReq() {
        logger.log(Level.INFO, "populateReq --NurseWorkAreaJPanel");

        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        model.setRowCount(0);
        for (WorkRequest req : organization.getWorkqueue().getWorkRequestAList()) {
            if (req.getClass().getName().contains("DischargeReqtoNurse")) {
                if (!((DischargeRequesttoNurse) req).getPatient().isIsDischarged()) {
                    if (((DischargeRequesttoNurse) req).getPatient().getLocation().getNurseAList().contains(userAccount.getEmployeeUser())
                            && req.getTaskStatus().equals("0")) {
                        Object[] row = new Object[2];
                        row[0] = ((DischargeRequesttoNurse) req);
                        if (req.getTaskStatus().equals("0")) {
                            row[1] = "Yet to be Discharged";
                        } else if (req.getTaskStatus().equals("1")) {
                            row[1] = "Discharged";
                        }
                        model.addRow(row);
                    }
                }
            }
        }
    }

    public void populateTable() {
        logger.log(Level.INFO, "populateTable --NurseWorkAreaJPanel");

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        for (Location loc : enterprise.getLocationlist().getLocationAList()) {
            for (Employee emp : loc.getNurseAList()) {
                if (emp.getEmployeeName().equals(this.userAccount.getEmployeeUser().getEmployeeName())) {
                    Object[] row = new Object[1];
                    row[0] = loc;
                    model.addRow(row);
                }
            }
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        BtnAdminister = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "LOCATION"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 334, 160));

        BtnAdminister.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        BtnAdminister.setText("Admit");
        BtnAdminister.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(110, 208, 202)));
        BtnAdminister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAdministerActionPerformed(evt);
            }
        });
        add(BtnAdminister, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, 90, 40));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PATIENT", "SENDER"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 130, 334, 160));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("Discharge");
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(110, 208, 202)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 309, 110, 40));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Nurse Work Area");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 940, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imaiges/medicare image 1.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setMaximumSize(new java.awt.Dimension(1500, 1000));
        jLabel1.setMinimumSize(new java.awt.Dimension(1500, 1000));
        jLabel1.setPreferredSize(new java.awt.Dimension(1500, 1000));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAdministerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAdministerActionPerformed
        // TODO add your handling code here:
        logger.log(Level.INFO, "BtnAdministerActionPerformed --NurseWorkAreaJPanel");
        try {
            int selectedRow = jTable1.getSelectedRow();
            if (selectedRow >= 0) {
                Location location = (Location) jTable1.getValueAt(selectedRow, 0);
                Nurseadminpanel nurseAdministerJPanel = new Nurseadminpanel(userProcessContainer, location, enterprise, userAccount);
                userProcessContainer.add("prescribeJPanel", nurseAdministerJPanel);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);
            } else {
                JOptionPane.showMessageDialog(userProcessContainer, "Select a Location");
            }
        } catch (Exception e) {
            logger.log(Level.INFO, "BtnAdministerActionPerformed --NurseWorkAreaJPanel" + e.getMessage());
        }

    }//GEN-LAST:event_BtnAdministerActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        logger.log(Level.INFO, "jButton1ActionPerformed --NurseWorkAreaJPanel");

        try {
            int selectedRow = jTable2.getSelectedRow();
            if (selectedRow >= 0) {
                DischargeRequesttoNurse dischargereq = (DischargeRequesttoNurse) jTable2.getValueAt(selectedRow, 0);
                if (!dischargereq.getPatient().isIsDischarged()) {

                    dischargereq.setTaskStatus("1");
                    Location location = dischargereq.getPatient().getLocation();
                    location.setCount(location.getCount() - 1);
                    dischargereq.getPatient().setIsDischarged(true);
//                    
                    for (Medicine med : dischargereq.getPatient().getMedList().getMedAList()) {
                        med.setIsdischarged(true);
                    }
                    JOptionPane.showMessageDialog(userProcessContainer, "Discharged");
                    populateReq();
                    populateTable();
                    return;
                } else {
                    JOptionPane.showMessageDialog(userProcessContainer, "Patient has been discharged");
                    return;
                }
            }
        } catch (Exception e) {
            logger.log(Level.INFO, "populateReq --NurseWorkAreaJPanel" + e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAdminister;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}

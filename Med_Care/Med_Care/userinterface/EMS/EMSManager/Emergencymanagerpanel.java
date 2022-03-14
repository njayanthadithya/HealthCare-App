/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.EMS.EMSManager;

import Business.EmergencyPatient.EmergencyPatient;
import Business.EmergencyPatient.EmergencyPatientDirectory;
import Business.Enterprise.Enterprise;
import Business.Organization.Emergencycaremanageroganization;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.UserAccount.Useraccount;
import Business.Ambulance.Ambulance;
import Business.Ambulance.Ambulancedirectory;
import Business.WorkQueue.EMSNurseWorkRequest;
import Business.WorkQueue.WorkRequest;
import Business.WorkQueue.TransportWorkRequest;
import static Logger.Logger.logger;
import java.awt.CardLayout;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author krish
 */
public class Emergencymanagerpanel extends javax.swing.JPanel {

    /**
     * Creates new form Emergencymanagerpanel
     */
    private JPanel userProcessContainer;
    private Organization organization;
    private Enterprise enterprise;
    private Useraccount useraccount;
    private EmergencyPatient Emergencypatient;
    private Ambulance vehicle;
    private EmergencyPatientDirectory Emergencypatientdirectory;
    private Ambulancedirectory ambulancedirectory;
    //private DriverManagerWorkRequest workRequest;

    public Emergencymanagerpanel(JPanel userProcessContainer, Organization organization, Enterprise enterprise, Useraccount useraccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.useraccount = useraccount;
        this.Emergencypatientdirectory = enterprise.getEmergencyPatientdirectory();
        valueLabel.setText(enterprise.getName());
        getTabletransport();
        getTablenurse();
    }

   

    public void getTabletransport() {
        logger.log(Level.INFO, "populateTableTransport --EMERGENCY Manager JPanel");

        DefaultTableModel transtable = (DefaultTableModel) tblTransport.getModel();
        transtable.setRowCount(0);

        //if(!organization.getWorkQueue().getWorkRequestList().isEmpty()){
        for (WorkRequest workrequest : useraccount.getWorkqueue().getWorkrequestlist()) {
            if (workrequest.getClass().getName().contains("TransportWorkRequest")) {

                Object row[] = new Object[9];
                row[0] = ((TransportWorkRequest) workrequest);
                row[1] = ((TransportWorkRequest) workrequest).getEmergencypatient().getContactNumber();
                row[2] = ((TransportWorkRequest) workrequest).getEmergencypatient().getSource();
                row[3] = ((TransportWorkRequest) workrequest).getEmergencypatient().getDestination();
                row[4] = ((TransportWorkRequest) workrequest).getAmbulance().getAmbulancenumber();
                row[5] = ((TransportWorkRequest) workrequest).getTime();
                row[6] = ((TransportWorkRequest) workrequest).getSender().getEmpuser().getEmpname();
                try {
                    row[7] = ((TransportWorkRequest) workrequest).getReceiver().getEmpuser().getEmpname();
                } catch (NullPointerException e) {
                    row[7] = "No assignee yet";
                }
                row[8] = ((TransportWorkRequest) workrequest).getStatus();
                transtable.addRow(row);
            }
        }
        //}

    }

    public void getTablenurse() {
        logger.log(Level.INFO, "populateTableNurse --EMSManagerJPanel");

        DefaultTableModel nursetable = (DefaultTableModel) tblNurse.getModel();
        nursetable.setRowCount(0);

        for (WorkRequest workrequest : useraccount.getWorkqueue().getWorkrequestlist()) {
            if (workrequest.getClass().getName().contains("EMSNurseWorkRequest")) {

                Object row[] = new Object[6];
                row[0] = ((EMSNurseWorkRequest) workrequest);
                row[1] = ((EMSNurseWorkRequest) workrequest).getMessage();
                row[2] = ((EMSNurseWorkRequest) workrequest).getTime();
                row[3] = ((EMSNurseWorkRequest) workrequest).getSender().getEmpuser().getEmpname();
                try {
                    row[4] = ((EMSNurseWorkRequest) workrequest).getReceiver().getEmpuser().getEmpname();
                } catch (NullPointerException e) {
                    row[4] = "No assignee yet";
                }
                row[5] = ((EMSNurseWorkRequest) workrequest).getStatus();
                nursetable.addRow(row);
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

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnScheduleEmergency = new javax.swing.JButton();
        btnManageAmbulance = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblNurse = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTransport = new javax.swing.JTable();

        jLabel2.setText("jLabel2");

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tamil MN", 1, 18)); // NOI18N
        jLabel1.setText("EMS MANAGER WORK AREA");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, -1, 33));

        btnScheduleEmergency.setText("Schedule Emergency Request");
        btnScheduleEmergency.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnScheduleEmergencyActionPerformed(evt);
            }
        });
        add(btnScheduleEmergency, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 277, -1));

        btnManageAmbulance.setText("Manage Ambulance Services");
        btnManageAmbulance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageAmbulanceActionPerformed(evt);
            }
        });
        add(btnManageAmbulance, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, 277, -1));

        enterpriseLabel.setFont(new java.awt.Font("Tamil MN", 1, 18)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, 127, 30));

        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, 158, 26));

        tblNurse.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient Name", "Message", "DateTime", "Raised by", "Assigned to", "Status"
            }
        ));
        jScrollPane2.setViewportView(tblNurse);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 830, 150));

        jLabel3.setFont(new java.awt.Font("Tamil MN", 1, 13)); // NOI18N
        jLabel3.setText("SCHEDULED NURSE WORK REQUESTS");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 390, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tamil MN", 1, 13)); // NOI18N
        jLabel4.setText("SCHEDULED DRIVER WORK REQUESTS");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, -1, -1));

        tblTransport.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient Name", "ContactNo", "Source", "Destination", "VehicleNo", "DateTime", "Raised by", "Assigned to", "Status"
            }
        ));
        jScrollPane1.setViewportView(tblTransport);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 830, 160));
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageAmbulanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageAmbulanceActionPerformed
        // TODO add your handling code here:
        logger.log(Level.INFO, "btnManageAmbulanceActionPerformed --EMSManagerJPanel");

        ManageAmbulanceServiceJPanel ambulanceJPanel = new ManageAmbulanceServiceJPanel(userProcessContainer, organization, enterprise, useraccount);
        userProcessContainer.add("ManageAmbulanceJPanel", ambulanceJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageAmbulanceActionPerformed

    private void btnScheduleEmergencyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnScheduleEmergencyActionPerformed
        // TODO add your handling code here:
              logger.log(Level.INFO, "btnScheduleEmergencyActionPerformed --EMSManagerJPanel");

        ScheduleEmergencyServiceJPanel JPanel = new ScheduleEmergencyServiceJPanel(userProcessContainer, useraccount, enterprise, Emergencypatientdirectory, Emergencypatient, organization, vehicle);
        userProcessContainer.add("ScheduleEmergencyServiceJPanel", JPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnScheduleEmergencyActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageAmbulance;
    private javax.swing.JButton btnScheduleEmergency;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblNurse;
    private javax.swing.JTable tblTransport;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Emergency.Emergencymanager;

import Business.EmgPatient.EmgPatient;
import Business.EmgPatient.EmgPatientDirectory;
import Business.Enterprise.Enterprise;
import Business.Organization.ECareManagerOganization;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.UserAccount.UserAccount;
import Business.Ambulance.Ambulance;
import Business.Ambulance.Ambulancedirectory;
import Business.WorkQueue.EmgNurseRequest;
import Business.WorkQueue.WorkRequest;
import Business.WorkQueue.TransportRequest;
import static Logger.Logger.logger;
import java.awt.CardLayout;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ksahi
 */
public class Emgmanagerpanel extends javax.swing.JPanel {

    /**
     * Creates new form Emgmanagerpanel
     */
    private JPanel userProcessContainer;
    private Organization organization;
    private Enterprise enterprise;
    private UserAccount useraccount;
    private EmgPatient Emergencypatient;
    private Ambulance vehicle;
    private EmgPatientDirectory Emergencypatientdirectory;
    private Ambulancedirectory ambulancedirectory;
    //private DriverManagerWorkRequest workRequest;

    public Emgmanagerpanel(JPanel userProcessContainer, Organization organization, Enterprise enterprise, UserAccount useraccount) {
         logger.log(Level.INFO, "Createvehiclepanel");
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.useraccount = useraccount;
        this.Emergencypatientdirectory = enterprise.getEmergencyPatientdirectory();
        valueLabel.setText(enterprise.getOrganzationName());
        getTabletransport();
        getTablenurse();
    }

   

    public void getTabletransport() {
        logger.log(Level.INFO, "getTabletransport --Createvehiclepanel");

        DefaultTableModel transtable = (DefaultTableModel) drivertable.getModel();
        transtable.setRowCount(0);

        //if(!organization.getWorkQueue().getWorkRequestList().isEmpty()){
        for (WorkRequest workrequest : useraccount.getWorkqueue().getWorkRequestAList()) {
            if (workrequest.getClass().getName().contains("TransportWorkRequest")) {

                Object row[] = new Object[9];
                row[0] = ((TransportRequest) workrequest);
                row[1] = ((TransportRequest) workrequest).getEmgPatient().getContactNo();
                row[2] = ((TransportRequest) workrequest).getEmgPatient().getPickUpLocation();
                row[3] = ((TransportRequest) workrequest).getEmgPatient().getDropOffLocation();
                row[4] = ((TransportRequest) workrequest).getAmbulance().getAmbulanceNo();
                row[5] = ((TransportRequest) workrequest).getTime();
                row[6] = ((TransportRequest) workrequest).getIssuer().getEmployeeUser().getEmployeeName();
                try {
                    row[7] = ((TransportRequest) workrequest).getReceipient().getEmployeeUser().getEmployeeName();
                } catch (NullPointerException e) {
                    row[7] = "No assignee yet";
                }
                row[8] = ((TransportRequest) workrequest).getTaskStatus();
                transtable.addRow(row);
            }
        }
        //}

    }

    public void getTablenurse() {
        
        
        logger.log(Level.INFO, "getTablenurse --Createvehiclepanel");
        DefaultTableModel dtm = (DefaultTableModel) nursetable.getModel();
        dtm.setRowCount(0);

        for (WorkRequest workrequest : useraccount.getWorkqueue().getWorkRequestAList()) {
            if (workrequest.getClass().getName().contains("EMSNurseWorkRequest")) {

                Object row[] = new Object[6];
                row[0] = ((EmgNurseRequest) workrequest);
                row[1] = ((EmgNurseRequest) workrequest).getMessage();
                row[2] = ((EmgNurseRequest) workrequest).getTime();
                row[3] = ((EmgNurseRequest) workrequest).getIssuer().getEmployeeUser().getEmployeeName();
                try {
                    row[4] = ((EmgNurseRequest) workrequest).getReceipient().getEmployeeUser().getEmployeeName();
                } catch (NullPointerException e) {
                    row[4] = "No assignee yet";
                }
                row[5] = ((EmgNurseRequest) workrequest).getTaskStatus();
                dtm.addRow(row);
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
        emerreqbt = new javax.swing.JButton();
        manageambbt = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        nursetable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        drivertable = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Emergency Manager Work Area");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, -1, 33));

        emerreqbt.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        emerreqbt.setText("Schedule Emergency Request");
        emerreqbt.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(110, 208, 202)));
        emerreqbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emerreqbtActionPerformed(evt);
            }
        });
        add(emerreqbt, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 290, 40));

        manageambbt.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        manageambbt.setText("Manage Ambulance Services");
        manageambbt.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(110, 208, 202)));
        manageambbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageambbtActionPerformed(evt);
            }
        });
        add(manageambbt, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, 270, 40));

        enterpriseLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, 127, 30));

        valueLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, 158, 26));

        nursetable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient Name", "Message", "DateTime", "Raised by", "Assigned to", "Status"
            }
        ));
        jScrollPane2.setViewportView(nursetable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 830, 150));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText(" NURSE WORK REQUESTS");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 390, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText(" DRIVER WORK REQUESTS");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, -1, -1));

        drivertable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient Name", "ContactNo", "Source", "Destination", "VehicleNo", "DateTime", "Raised by", "Assigned to", "Status"
            }
        ));
        jScrollPane1.setViewportView(drivertable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 830, 160));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imaiges/medicare image 1.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        jLabel5.setMaximumSize(new java.awt.Dimension(1500, 1000));
        jLabel5.setMinimumSize(new java.awt.Dimension(1500, 1000));
        jLabel5.setPreferredSize(new java.awt.Dimension(1500, 1000));
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void manageambbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageambbtActionPerformed
        // TODO add your handling code here:
       logger.log(Level.INFO, "manageambbtActionPerformed --Createvehiclepanel");

        Manageambulancepanel ambulanceJPanel = new Manageambulancepanel(userProcessContainer, organization, enterprise, useraccount);
        userProcessContainer.add("ManageAmbulanceJPanel", ambulanceJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageambbtActionPerformed

    private void emerreqbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emerreqbtActionPerformed
        // TODO add your handling code here:
        logger.log(Level.INFO, "emerreqbtActionPerformed --Createvehiclepanel");

        ScheduleEmgServiceJPanel JPanel = new ScheduleEmgServiceJPanel(userProcessContainer, useraccount, enterprise, Emergencypatientdirectory, Emergencypatient, organization, vehicle);
        userProcessContainer.add("ScheduleEmergencyServiceJPanel", JPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_emerreqbtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable drivertable;
    private javax.swing.JButton emerreqbt;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton manageambbt;
    private javax.swing.JTable nursetable;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables

}

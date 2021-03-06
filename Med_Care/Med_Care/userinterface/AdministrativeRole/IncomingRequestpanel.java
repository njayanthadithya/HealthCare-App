/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AdministrativeRole;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Location.Location;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Patients.Patient;
import Business.WorkQueue.MsgfromNurseToHospWorkRequest;
import Business.WorkQueue.WorkRequest;
import static Logger.Logger.logger;
//import Mail.SendMail;
//import javax.mail.MessagingException;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author monishmm
 */
public class IncomingRequestpanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;

    private Enterprise enterprise;

    /**
     * Creates new form IncomingRequest
     */
    public IncomingRequestpanel(JPanel userProcessContainer, Enterprise enterprise) {
       // logger.log(Level.INFO, "IncomingRequestpanel");
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        gettable();
    }

    public void gettable() {
        logger.log(Level.INFO, "populateTable --IncomingRequest");

        DefaultTableModel requesttable = (DefaultTableModel) patientreqtable.getModel();
        requesttable.setRowCount(0);
        if (enterprise.getWorkqueue().getWorkrequestlist().size() > 0) {
            for (WorkRequest workreq : enterprise.getWorkqueue().getWorkrequestlist()) {

                if (workreq.getClass().getName().contains("MsgfromNurseToHosp")) {
                    if(!((MsgfromNurseToHospWorkRequest) workreq).getMessage().contains("Transfer") ){
                    Object row[] = new Object[1];
                    row[0] = ((MsgfromNurseToHospWorkRequest) workreq).getPatientName();
                    requesttable.addRow(row);
                    }
                }
            }
        }
    }

    public void getcombobox() {
        logger.log(Level.INFO, "populateComboBox --IncomingRequest");

        OrganizationDirectory org = enterprise.getOrganizationdirectory();

        for (Organization or : org.getOrglist()) {
            if (or.getName().equals("Doctor Organization")) {
                for (Employee u : or.getEmployeedirectory().getEmployeelist()) {
                    doctorcombobox.addItem(u.toString());
                }
            }
        }
        for (Location location : enterprise.getLocationlist().getLocationlist()) {
            locationcombo.addItem(location.getLocationname());
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
        patientreqtable = new javax.swing.JTable();
        admitbt = new javax.swing.JButton();
        backbt = new javax.swing.JButton();
        locationlb = new javax.swing.JLabel();
        locationcombo = new javax.swing.JComboBox<>();
        doctorlb = new javax.swing.JLabel();
        doctorcombobox = new javax.swing.JComboBox<>();
        patientlb = new javax.swing.JLabel();
        patientHRNtxt = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        patientreqtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(patientreqtable);
        if (patientreqtable.getColumnModel().getColumnCount() > 0) {
            patientreqtable.getColumnModel().getColumn(0).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 117, -1, 183));

        admitbt.setText("Admit");
        admitbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admitbtActionPerformed(evt);
            }
        });
        add(admitbt, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 20, -1, -1));

        backbt.setText("Back");
        backbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtActionPerformed(evt);
            }
        });
        add(backbt, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 15, -1, -1));

        locationlb.setText("Location");
        add(locationlb, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 550, -1, -1));

        locationcombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Set Location" }));
        add(locationcombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 540, 103, -1));

        doctorlb.setText("Doctor");
        add(doctorlb, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 510, -1, -1));

        doctorcombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Doctor" }));
        add(doctorcombobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 500, -1, -1));

        patientlb.setText("Patient HRN");
        add(patientlb, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, -1, -1));
        add(patientHRNtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 310, 146, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void admitbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admitbtActionPerformed
        // TODO add your handling code here:
       logger.log(Level.INFO, "jButton1ActionPerformed --IncomingRequest");

        if (doctorcombobox.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(userProcessContainer, "Please Choose a Doctor");
            return;
        }
        if (locationcombo.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(userProcessContainer, "Please Choose a Location");
            return;
        }
        if (patientHRNtxt.getText().length() == 0) {
            JOptionPane.showMessageDialog(userProcessContainer, "Enter HRN");
            return;
        }
        for (Patient patient : enterprise.getPatientdirectory().getPatientList()) {
            if (patient.getPatientHRN().equals(patientHRNtxt.getText())) {
                JOptionPane.showMessageDialog(userProcessContainer, "HRN already exists, Please re-enter HRN");
                return;
            }
        }
        int selectedRow = patientreqtable.getSelectedRow();
        if (selectedRow >= 0) {
            String patient = patientreqtable.getValueAt(selectedRow, 0).toString();
            String emp = doctorcombobox.getSelectedItem().toString();
            ArrayList<Organization> org = enterprise.getOrganizationdirectory().getOrglist();
            for (Organization o : org) {
            if (o.getName().equals("Doctor Organization")) {
            for (Employee e : o.getEmployeedirectory().getEmployeelist()) {
            if (e.getEmpname().equals(emp)) {
                String locs = locationcombo.getSelectedItem().toString();
                for (Location loc : enterprise.getLocationlist().getLocationlist()) {
                if (loc.getLocationname().equals(locs)) {
                if (loc.getNurselist().size() == 0) {
                    JOptionPane.showMessageDialog(userProcessContainer, "Currently nurse is not available in this location");
                    return;
                }
            if (loc.getMaximum() >= (loc.getCount() + 1)) {
            Patient newPat = enterprise.getPatientdirectory().addPatient();
            newPat.setDoctor(e);
            newPat.setLocation(loc);
            newPat.setPatientName(patient);
            newPat.setPatientHRN(patientHRNtxt.getText());
            loc.setCount(loc.getCount() + 1);
            JOptionPane.showMessageDialog(userProcessContainer, "In patient Admitted");
            for (WorkRequest workreq : enterprise.getWorkqueue().getWorkrequestlist()) {
            if (workreq.getClass().getName().contains("MsgfromNurseToHospWorkRequest")) {
            if (((MsgfromNurseToHospWorkRequest) workreq).getPatientName().equals(patient)) {
            enterprise.getWorkqueue().getWorkrequestlist().remove(workreq);
            break;
           }
            }
            }
//                                        
            gettable();

            return;
            } else {
            JOptionPane.showMessageDialog(userProcessContainer, loc.getLocationname() + " has reached maximum capacity");
            return;
            }
                }
                }}
            }
            }
            }
               
        } else {
            JOptionPane.showMessageDialog(userProcessContainer, "Please choose a patient");
            return;
        }
    }//GEN-LAST:event_admitbtActionPerformed

    private void backbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        logger.log(Level.INFO, "jButton2ActionPerformed --IncomingRequest");
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backbtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton admitbt;
    private javax.swing.JButton backbt;
    private javax.swing.JComboBox<String> doctorcombobox;
    private javax.swing.JLabel doctorlb;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> locationcombo;
    private javax.swing.JLabel locationlb;
    private javax.swing.JTextField patientHRNtxt;
    private javax.swing.JLabel patientlb;
    private javax.swing.JTable patientreqtable;
    // End of variables declaration//GEN-END:variables
}

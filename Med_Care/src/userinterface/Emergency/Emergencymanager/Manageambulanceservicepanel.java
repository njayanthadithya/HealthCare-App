/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Emergency.Emergencymanager;

import userinterface.Emergency.Emergencymanager.Createvehiclepanel;
import Business.Enterprise.Enterprise;
import Business.Organization.ECareManagerOganization;
import Business.Organization.ECareOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.Ambulance.Ambulance;
import Business.Ambulance.Ambulancedirectory;
import static Logger.Logger.logger;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author krish
 */
public class Manageambulanceservicepanel extends javax.swing.JPanel {

    /**
     * Creates new form Manageambulanceservicepanel
     */
    private JPanel userProcessContainer;
    private Organization organization;
    private Enterprise enterprise;
    private UserAccount useraccount;
    private Ambulancedirectory ambulancedirectory;
    private List<Ambulance> amblist = new ArrayList<>();
    private Ambulance ambulance;

    public Manageambulanceservicepanel(JPanel userProcessContainer, Organization organization, Enterprise enterprise, UserAccount useraccount) {
        logger.log(Level.INFO, "Manageambulanceservicepanel");
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.useraccount = useraccount;
        this.ambulancedirectory = enterprise.getAmbulancelist();
        Manageambulanceservicepanel.this.gettable();
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
        btnBack = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        searchTable = new javax.swing.JTable();
        btnDelete = new javax.swing.JButton();
        btnViewFullDetails = new javax.swing.JButton();
        btnCreate = new javax.swing.JButton();
        btnRefresh1 = new javax.swing.JButton();
        btnConsolidatedSearch1 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        comboBoxSerialNo = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        comboBoxLocality = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        comboBoxVehicleNo = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        btnYesVA = new javax.swing.JRadioButton();
        btnNoVA = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        btnFirstAvailablePassengerCar1 = new javax.swing.JButton();
        btnCurrentUnavailableCars = new javax.swing.JButton();
        btnAvailability2 = new javax.swing.JTextField();
        btnCurrentAvailableCars = new javax.swing.JButton();
        btnAvailability1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBack.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 510, 130, 40));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("MANAGE AMBULANCE SERVICE");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 980, -1));

        searchTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "VehicleNo", "Availability", "Serial No"
            }
        ));
        jScrollPane1.setViewportView(searchTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 820, 100));

        btnDelete.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 510, 130, 40));

        btnViewFullDetails.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnViewFullDetails.setText("View Details");
        btnViewFullDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewFullDetailsActionPerformed(evt);
            }
        });
        add(btnViewFullDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 510, 160, 40));

        btnCreate.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnCreate.setText("Create a Vehicle");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        add(btnCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 310, 170, 40));

        btnRefresh1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnRefresh1.setText("Refresh");
        btnRefresh1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefresh1ActionPerformed(evt);
            }
        });
        add(btnRefresh1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 100, 40));

        btnConsolidatedSearch1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnConsolidatedSearch1.setText("Search");
        btnConsolidatedSearch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsolidatedSearch1ActionPerformed(evt);
            }
        });
        add(btnConsolidatedSearch1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 120, 40));

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("Serial Number:");
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, -1, 24));

        comboBoxSerialNo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose a Serial Number" }));
        add(comboBoxSerialNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 258, 200, -1));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("Available Locality:");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 205, -1, 28));

        comboBoxLocality.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose a locality", "Alphnosus Street", "Fenway", "Ruggles", "Rxbury Crossing", "Huntington Avenue" }));
        comboBoxLocality.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxLocalityActionPerformed(evt);
            }
        });
        add(comboBoxLocality, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 208, 200, -1));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Vehicle No:");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 160, -1, -1));

        comboBoxVehicleNo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose a VehicleNo" }));
        add(comboBoxVehicleNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 157, 200, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Vehicle Availability:");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 111, -1, -1));

        buttonGroup1.add(btnYesVA);
        btnYesVA.setText("Yes");
        add(btnYesVA, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 107, -1, -1));

        buttonGroup1.add(btnNoVA);
        btnNoVA.setText("No");
        add(btnNoVA, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 107, -1, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Search Vehicle");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 76, -1, -1));

        btnFirstAvailablePassengerCar1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnFirstAvailablePassengerCar1.setText("First Available Vehicle");
        btnFirstAvailablePassengerCar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstAvailablePassengerCar1ActionPerformed(evt);
            }
        });
        add(btnFirstAvailablePassengerCar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(494, 257, 180, -1));

        btnCurrentUnavailableCars.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnCurrentUnavailableCars.setText("No of Vehicles currently unavailable");
        btnCurrentUnavailableCars.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCurrentUnavailableCarsActionPerformed(evt);
            }
        });
        add(btnCurrentUnavailableCars, new org.netbeans.lib.awtextra.AbsoluteConstraints(494, 205, 254, -1));

        btnAvailability2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvailability2ActionPerformed(evt);
            }
        });
        add(btnAvailability2, new org.netbeans.lib.awtextra.AbsoluteConstraints(774, 206, 70, -1));

        btnCurrentAvailableCars.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnCurrentAvailableCars.setText("No of Vehicles currently available");
        btnCurrentAvailableCars.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCurrentAvailableCarsActionPerformed(evt);
            }
        });
        add(btnCurrentAvailableCars, new org.netbeans.lib.awtextra.AbsoluteConstraints(492, 156, 256, -1));
        add(btnAvailability1, new org.netbeans.lib.awtextra.AbsoluteConstraints(774, 157, 70, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Search Vehicle Availability");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(609, 76, -1, -1));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imaiges/medicare image 1.jpg"))); // NOI18N
        jLabel4.setMaximumSize(new java.awt.Dimension(1500, 1000));
        jLabel4.setMinimumSize(new java.awt.Dimension(1500, 1000));
        jLabel4.setPreferredSize(new java.awt.Dimension(1500, 1000));
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        logger.log(Level.INFO, "btnBackActionPerformed --Manageambulanceservicepanel");

        userProcessContainer.remove(this);
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        cardLayout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        logger.log(Level.INFO, "btnDeleteActionPerformed --Manageambulanceservicepanel");

        int selectedrow = searchTable.getSelectedRow();
        int rowCount = searchTable.getSelectedRowCount();
        if (rowCount > 1) {
            JOptionPane.showMessageDialog(userProcessContainer, "Please select only one row");
            return;
        }
        if (selectedrow >= 0) {
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(null, "Would you like to delete the Vehicle?", "Warning", dialogButton);
            if (dialogResult == JOptionPane.YES_OPTION) {
                Ambulance ambulance = (Ambulance) searchTable.getValueAt(selectedrow, 0);
                ambulancedirectory.removeAmbulance(ambulance);
                JOptionPane.showMessageDialog(null, "Deleted successfully");
                gettable();
            }

        } else {
            JOptionPane.showMessageDialog(null, "Please select a row");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnViewFullDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewFullDetailsActionPerformed
        // TODO add your handling code here:
        logger.log(Level.INFO, "btnViewFullDetailsActionPerformed --Manageambulanceservicepanel");

        int selectedRow = searchTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showConfirmDialog(null, "Please select a row from the table to view the details", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            Ambulance ambulance = (Ambulance) searchTable.getValueAt(selectedRow, 0);
            Ambulancedetailspanel panel = new Ambulancedetailspanel(userProcessContainer, ambulancedirectory, ambulance);
            userProcessContainer.add("ViewFullDetailsJPanel", panel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
    }

    public void gettable(List<Ambulance> ambulancelist) {
        logger.log(Level.INFO, "gettable --Manageambulanceservicepanel");

        DefaultTableModel ambulancemodel = (DefaultTableModel) searchTable.getModel();
        ambulancemodel.setRowCount(0);

        for (Ambulance vehicle : ambulancelist) {
            Object row[] = new Object[4];
            row[0] = vehicle;
            row[1] = vehicle.availability();
            //row[2] = vehicle.getManufactured_year();
            row[2] = vehicle.getSerialNo();
            //row[4] = vehicle.getModel();
            row[3] = vehicle.getAvailableInArea();
            ambulancemodel.addRow(row);
        }
    }

    public void gettable() {
       logger.log(Level.INFO, "gettable --Manageambulanceservicepanel");

        DefaultTableModel ambulancemodel1 = (DefaultTableModel) searchTable.getModel();
        ambulancemodel1.setRowCount(0);

        for (Ambulance vehicle : ambulancedirectory.getAmbulanceAList()) {
            Object row[] = new Object[4];
            row[0] = vehicle;
            row[1] = vehicle.availability();
            //row[2] = vehicle.getManufactured_year();
            row[2] = vehicle.getSerialNo();
            //row[4] = vehicle.getModel();
            row[3] = vehicle.getAvailableInArea();
            ambulancemodel1.addRow(row);
        }
        comboBoxSerialNo.removeAllItems();
        comboBoxVehicleNo.removeAllItems();
   
        comboBoxSerialNo.addItem("Choose a Serial number");
        comboBoxVehicleNo.addItem("Choose a Vehicle number");
        
        populate1();
        //combo2();
        populate3();
    }//GEN-LAST:event_btnViewFullDetailsActionPerformed

    private void btnRefresh1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefresh1ActionPerformed
        // TODO add your handling code here:
        logger.log(Level.INFO, "btnRefresh1ActionPerformed --Manageambulanceservicepanel");

        gettable();
    }//GEN-LAST:event_btnRefresh1ActionPerformed

    private void btnConsolidatedSearch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsolidatedSearch1ActionPerformed
        // TODO add your handling code here:
           logger.log(Level.INFO, "btnConsolidatedSearch1ActionPerformed --Manageambulanceservicepanel");

        amblist.removeAll(amblist);

        if (!btnYesVA.isSelected() && !btnNoVA.isSelected()) {
            JOptionPane.showMessageDialog(null, "Please select the vehicle availability status");
            return;
        }

        for (Ambulance vehicle : ambulancedirectory.getAmbulanceAList()) {
            //System.out.println((YesMainCert.isSelected()&&car.isMaintenance_certificate())||(NoMainCert.isSelected()&&!car.isMaintenance_certificate())||(NAmaincert.isSelected()));
            if ((comboBoxVehicleNo.getSelectedItem().equals(vehicle.getAmbulanceNo())
                    || comboBoxVehicleNo.getSelectedIndex() == 0)
                    && (comboBoxSerialNo.getSelectedItem().equals(vehicle.getSerialNo())
                    || comboBoxSerialNo.getSelectedIndex() == 0)
                    && (comboBoxLocality.getSelectedItem().equals(vehicle.getAvailableInArea())
                    || comboBoxLocality.getSelectedIndex() == 0)
                    
                    && ((btnYesVA.isSelected() && vehicle.isAvailability()) || (btnNoVA.isSelected() && (vehicle.isAvailability() == false)))) {
                amblist.add(vehicle);
            }
        }
        gettable(amblist);
           

    }//GEN-LAST:event_btnConsolidatedSearch1ActionPerformed

    public void populate1() {
        logger.log(Level.INFO, "populate1 --Manageambulanceservicepanel");

        HashSet<String> hash = new HashSet<>();
        for (Ambulance u : ambulancedirectory.getAmbulanceAList()) {
            if (u.getAmbulanceNo() != null) {

                hash.add(u.getAmbulanceNo());
            }

        }
        for (String u : hash) {
            comboBoxVehicleNo.addItem(u);
        }

    }

  

    public void populate3() {
      logger.log(Level.INFO, "populate3 --Manageambulanceservicepanel");

        HashSet<String> hash = new HashSet<>();
        for (Ambulance u : ambulancedirectory.getAmbulanceAList()) {
            if (u.getSerialNo() != null) {
                hash.add(u.getSerialNo());
            }
        }

        for (String u : hash) {
            comboBoxSerialNo.addItem(u);
        }

    }


    private void btnFirstAvailablePassengerCarActionPerformed(java.awt.event.ActionEvent evt) {                                                              
        // TODO add your handling code here:
  
    }                                                             


    private void btnCurrentAvailableCarsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCurrentAvailableCarsActionPerformed
        // TODO add your handling code here:
        logger.log(Level.INFO, "btnCurrentAvailableCarsActionPerformed --ManageAmbulanceServiceJPanel");

        DefaultTableModel availablemodel = (DefaultTableModel) searchTable.getModel();
        availablemodel.setRowCount(0);
        int count = 0;
        for (Ambulance vehicle : ambulancedirectory.getAmbulanceAList()) {
            if (vehicle.isAvailability() == true) {
                Object row[] = new Object[4];
                row[0] = vehicle;
                row[1] = vehicle.availability();
               
                row[2] = vehicle.getSerialNo();
                
                row[3] = vehicle.getAvailableInArea();
                availablemodel.addRow(row);
                count++;
            }
        }

        btnAvailability1.setText(String.valueOf(count));
    }//GEN-LAST:event_btnCurrentAvailableCarsActionPerformed

    private void btnCurrentUnavailableCarsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCurrentUnavailableCarsActionPerformed
        // TODO add your handling code here:
        logger.log(Level.INFO, "btnCurrentUnavailableCarsActionPerformed --Manageambulanceservicepanel");
        DefaultTableModel dtm = (DefaultTableModel) searchTable.getModel();
        dtm.setRowCount(0);
        int count = 0;
        for (Ambulance vehicle : ambulancedirectory.getAmbulanceAList()) {
            if (vehicle.isAvailability() == false) {
                Object row[] = new Object[4];
                row[0] = vehicle;
                row[1] = vehicle.availability();
                
                row[2] = vehicle.getSerialNo();
                
                row[3] = vehicle.getAvailableInArea();
                dtm.addRow(row);
                count++;
            }
        }

        btnAvailability2.setText(String.valueOf(count));
    }//GEN-LAST:event_btnCurrentUnavailableCarsActionPerformed

    private void btnAvailability2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvailability2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAvailability2ActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
       logger.log(Level.INFO, "btnCreateActionPerformed --Manageambulanceservicepanel");
        Createvehiclepanel createVehicleJPanel = new Createvehiclepanel(userProcessContainer, ambulancedirectory, ambulance);
        userProcessContainer.add("CreateVehicleJPanel", createVehicleJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnCreateActionPerformed

    private void comboBoxLocalityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxLocalityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxLocalityActionPerformed

                                                              


                                                     

                                                         

   
                                           

                                                         

                                                 

    private void btnFirstAvailablePassengerCar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstAvailablePassengerCar1ActionPerformed
        // TODO add your handling code
              logger.log(Level.INFO, "btnFirstAvailablePassengerCarActionPerformed --ManageAmbulanceServiceJPanel");

        DefaultTableModel firstambulance = (DefaultTableModel) searchTable.getModel();
        firstambulance.setRowCount(0);

        for (Ambulance vehicle : ambulancedirectory.getAmbulanceAList()) {
            if (vehicle.isAvailability() == true) {
                Object row[] = new Object[4];
                row[0] = vehicle;
                row[1] = vehicle.availability();               
                row[2] = vehicle.getSerialNo();
                row[3] = vehicle.getAvailableInArea();

                firstambulance.addRow(row);
                break;
            }
        }
    }//GEN-LAST:event_btnFirstAvailablePassengerCar1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField btnAvailability1;
    private javax.swing.JTextField btnAvailability2;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnConsolidatedSearch1;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnCurrentAvailableCars;
    private javax.swing.JButton btnCurrentUnavailableCars;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnFirstAvailablePassengerCar1;
    private javax.swing.JRadioButton btnNoVA;
    private javax.swing.JButton btnRefresh1;
    private javax.swing.JButton btnViewFullDetails;
    private javax.swing.JRadioButton btnYesVA;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> comboBoxLocality;
    private javax.swing.JComboBox<String> comboBoxSerialNo;
    private javax.swing.JComboBox<String> comboBoxVehicleNo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable searchTable;
    // End of variables declaration//GEN-END:variables
}

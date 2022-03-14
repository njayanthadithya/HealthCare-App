/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AdministrativeRole;

import Business.Enterprise.Enterprise;
import Business.Location.Location;
import static Logger.Logger.logger;
import java.awt.CardLayout;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jayanthadithya
 */
public class ManageLocJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;

    private Enterprise enterprise;

    /**
     * Creates new form ManageLocations
     */
    public ManageLocJPanel(JPanel userProcessContainer, Enterprise enterprise) {
        logger.log(Level.INFO, "ManageLocations");

        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        jPanel1.setVisible(false);
        assignnursebt.setVisible(false);
        this.gettable();
    }

    public void gettable() {
        logger.log(Level.INFO, "gettable --ManageLocations");

        if (enterprise.getLocationlist().getLocationAList().size() <= 0) {
            return;
        }
        DefaultTableModel locationmodel = (DefaultTableModel) locationtable.getModel();
        locationmodel.setRowCount(0);
        for (Location l : enterprise.getLocationlist().getLocationAList()) {
            Object row[] = new Object[3];
            row[0] = l;
            row[1] = l.getMax();
            row[2] = l.getMax() - l.getCount();
            locationmodel.addRow(row);
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

        addlocationbt = new javax.swing.JButton();
        backbt = new javax.swing.JButton();
        assignnursebt = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        locnametxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        capacitytxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        locationtable = new javax.swing.JTable();
        jToolBar1 = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addlocationbt.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        addlocationbt.setText("Add Location");
        addlocationbt.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(110, 208, 202)));
        addlocationbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addlocationbtActionPerformed(evt);
            }
        });
        add(addlocationbt, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 230, -1, 29));

        backbt.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        backbt.setText("Back");
        backbt.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(110, 208, 202)));
        backbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtActionPerformed(evt);
            }
        });
        add(backbt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 60, 29));

        assignnursebt.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        assignnursebt.setText("Assign Nurse");
        assignnursebt.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(110, 208, 202)));
        assignnursebt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignnursebtActionPerformed(evt);
            }
        });
        add(assignnursebt, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 540, -1, 29));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Location Name:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, -1, -1));
        add(locnametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, 105, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Capacity:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, -1, -1));

        capacitytxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                capacitytxtActionPerformed(evt);
            }
        });
        add(capacitytxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, 105, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Manage Locations");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 16, 980, 30));

        locationtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Location Name", "Capacity", "Remaining"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(locationtable);
        if (locationtable.getColumnModel().getColumnCount() > 0) {
            locationtable.getColumnModel().getColumn(0).setResizable(false);
            locationtable.getColumnModel().getColumn(1).setResizable(false);
            locationtable.getColumnModel().getColumn(2).setResizable(false);
        }

        jPanel1.add(jScrollPane1);

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 490, 220));

        jToolBar1.setRollover(true);
        add(jToolBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 90, -1, -1));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("View");
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(110, 208, 202)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, 70, 30));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imaiges/medicare image 1.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jLabel3.setMaximumSize(new java.awt.Dimension(1500, 1000));
        jLabel3.setMinimumSize(new java.awt.Dimension(1500, 1000));
        jLabel3.setPreferredSize(new java.awt.Dimension(1500, 1000));
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 870));
    }// </editor-fold>//GEN-END:initComponents

    private void addlocationbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addlocationbtActionPerformed
        // TODO add your handling code here:   
        logger.log(Level.INFO, "addlocationbtActionPerformed --ManageLocations");

        if (locnametxt.getText().length() == 0) {
            JOptionPane.showMessageDialog(userProcessContainer, "Enter Locations");
            return;
        }
        if (capacitytxt.getText().length() == 0) {
            JOptionPane.showMessageDialog(userProcessContainer, "Enter capacity");
            return;
        }
        for (Location loc : enterprise.getLocationlist().getLocationAList()) {
            if (loc.getLocName().equals(locnametxt.getText())) {
                JOptionPane.showMessageDialog(userProcessContainer, "Location Name already exist");
                return;
            }
        }
        if (capacitytxt.getText().matches("[0-9]+")) {
            enterprise.getLocationlist().addLocation(locnametxt.getText(), Integer.parseInt(capacitytxt.getText()));
            this.gettable();
            locnametxt.setText("");
            capacitytxt.setText("");
            return;
        } else {
            JOptionPane.showMessageDialog(userProcessContainer, "Please enter a number");
            return;
        }

    }//GEN-LAST:event_addlocationbtActionPerformed

    private void backbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtActionPerformed
        // TODO add your handling code here:
        logger.log(Level.INFO, "backbtActionPerformed --ManageLocations");

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backbtActionPerformed

    private void assignnursebtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignnursebtActionPerformed
        // TODO add your handling code here:
        //logger.log(Level.INFO, "jButton1ActionPerformed --ManageLocJPanel");
        logger.log(Level.INFO, "assignnursebtActionPerformed --ManageLocations");
        int selectedRow = locationtable.getSelectedRow();
        if (selectedRow >= 0) {
            Location location = (Location) locationtable.getValueAt(selectedRow, 0);
            LocDetailsJPanel locDetails = new LocDetailsJPanel(userProcessContainer,
                    location, enterprise.getOrganizationdirectory());
            userProcessContainer.add("locDetails", locDetails);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        } else {
            JOptionPane.showMessageDialog(userProcessContainer, "Select a Location");
            return;
        }
    }//GEN-LAST:event_assignnursebtActionPerformed

    private void capacitytxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_capacitytxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_capacitytxtActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jPanel1.setVisible(true);
        assignnursebt.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addlocationbt;
    private javax.swing.JButton assignnursebt;
    private javax.swing.JButton backbt;
    private javax.swing.JTextField capacitytxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTable locationtable;
    private javax.swing.JTextField locnametxt;
    // End of variables declaration//GEN-END:variables
}
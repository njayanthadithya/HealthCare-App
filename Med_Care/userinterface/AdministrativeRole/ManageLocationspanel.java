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
 * @author monishmm
 */
public class ManageLocationspanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;

    private Enterprise enterprise;

    /**
     * Creates new form ManageLocations
     */
    public ManageLocationspanel(JPanel userProcessContainer, Enterprise enterprise) {
        logger.log(Level.INFO, "ManageLocations");

        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.gettable();
    }

    public void gettable() {
        logger.log(Level.INFO, "populateTable --ManageLocations");

        if (enterprise.getLocationlist().getLocationlist().size() <= 0) {
            return;
        }
        DefaultTableModel locationmodel = (DefaultTableModel) locationtable.getModel();
        locationmodel.setRowCount(0);
        for (Location l : enterprise.getLocationlist().getLocationlist()) {
            Object row[] = new Object[3];
            row[0] = l;
            row[1] = l.getMaximum();
            row[2] = l.getMaximum() - l.getCount();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        locationtable = new javax.swing.JTable();
        backbt = new javax.swing.JButton();
        assignnursebt = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        locnametxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        capacitytxt = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addlocationbt.setText("Add Location");
        addlocationbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addlocationbtActionPerformed(evt);
            }
        });
        add(addlocationbt, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 20, -1, -1));

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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 616, 198));

        backbt.setText("Back");
        backbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtActionPerformed(evt);
            }
        });
        add(backbt, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 16, -1, -1));

        assignnursebt.setText("Assign Nurse");
        assignnursebt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignnursebtActionPerformed(evt);
            }
        });
        add(assignnursebt, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 520, -1, -1));

        jLabel1.setText("Location Name");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, -1, -1));
        add(locnametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, 105, -1));

        jLabel2.setText("Capacity");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, -1, -1));

        capacitytxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                capacitytxtActionPerformed(evt);
            }
        });
        add(capacitytxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, 105, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void addlocationbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addlocationbtActionPerformed
        // TODO add your handling code here:   
        logger.log(Level.INFO, "btnaddLocationActionPerformed --ManageLocations");

        if (locnametxt.getText().length() == 0) {
            JOptionPane.showMessageDialog(userProcessContainer, "Enter Locations");
            return;
        }
        if (capacitytxt.getText().length() == 0) {
            JOptionPane.showMessageDialog(userProcessContainer, "Enter capacity");
            return;
        }
        for (Location loc : enterprise.getLocationlist().getLocationlist()) {
            if (loc.getLocationname().equals(locnametxt.getText())) {
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
        logger.log(Level.INFO, "btnbackActionPerformed --ManageLocations");

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backbtActionPerformed

    private void assignnursebtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignnursebtActionPerformed
        // TODO add your handling code here:
        //logger.log(Level.INFO, "jButton1ActionPerformed --ManageLocationspanel");

        int selectedRow = locationtable.getSelectedRow();
        if (selectedRow >= 0) {
            Location location = (Location) locationtable.getValueAt(selectedRow, 0);
            Locationdetailspanel locDetails = new Locationdetailspanel(userProcessContainer,
                    location, enterprise.getOrganizationdirectory());
            userProcessContainer.add("locDetails", locDetails);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        } else {
            JOptionPane.showMessageDialog(userProcessContainer, "Please select a Location");
            return;
        }
    }//GEN-LAST:event_assignnursebtActionPerformed

    private void capacitytxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_capacitytxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_capacitytxtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addlocationbt;
    private javax.swing.JButton assignnursebt;
    private javax.swing.JButton backbt;
    private javax.swing.JTextField capacitytxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable locationtable;
    private javax.swing.JTextField locnametxt;
    // End of variables declaration//GEN-END:variables
}

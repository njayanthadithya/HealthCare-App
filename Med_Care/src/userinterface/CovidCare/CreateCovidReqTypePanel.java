/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CovidCare;


import Business.Enterprise.Enterprise;
import Business.CovidCare.CovidCareList;
import Business.CovidCare.CovidCareRequirementType;
import Business.Organization.PhysicianOrganization;
import Business.UserAccount.UserAccount;
import static Logger.Logger.logger;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author monishmm
 */
public class CreateCovidReqTypePanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateCovidReqTypePanel
     */
    private JPanel userProcessContainer;
    private PhysicianOrganization organization;
    private Enterprise enterprise;
    private UserAccount useraccount;
    private CovidCareList organlist;
    private CovidCareRequirementType organtype;
    
    
    public CreateCovidReqTypePanel(JPanel userProcessContainer, CovidCareRequirementType organtype, CovidCareList organlist) {
        
        logger.log(Level.INFO, "CreateCovidReqTypePanel");
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organtype = organtype;
        this.organization = organization;
        this.organlist = organlist;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        AUtxt = new javax.swing.JTextField();
        backbt = new javax.swing.JButton();
        savebt = new javax.swing.JButton();
        Organcombobox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Create OrganType Details");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 760, 40));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Organ Type :");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 178, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Available Units :");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 238, -1, -1));

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
        add(AUtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(359, 238, 140, -1));

        backbt.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        backbt.setText("Back");
        backbt.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(110, 208, 202)));
        backbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtActionPerformed(evt);
            }
        });
        add(backbt, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 298, 80, 29));

        savebt.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        savebt.setText("Save");
        savebt.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(110, 208, 202)));
        savebt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebtActionPerformed(evt);
            }
        });
        add(savebt, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 300, 80, 29));

        Organcombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Option", "Heart", "Eye", "Liver", "Kidneys" }));
        Organcombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrgancomboboxActionPerformed(evt);
            }
        });
        add(Organcombobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(359, 174, -1, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imaiges/medicare image 1.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setMaximumSize(new java.awt.Dimension(1500, 1000));
        jLabel1.setMinimumSize(new java.awt.Dimension(1500, 1000));
        jLabel1.setPreferredSize(new java.awt.Dimension(1500, 1000));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void AUtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AUtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AUtxtActionPerformed

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

    private void backbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtActionPerformed
        // TODO add your handling code here:
        logger.log(Level.INFO, "backbtActionPerformed --CreateOrganTypePanel");

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CovidPhysicianWorkArea obcl = (CovidPhysicianWorkArea) component;
        obcl.gettable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backbtActionPerformed

    private void savebtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebtActionPerformed
        // TODO add your handling code here:
        
 logger.log(Level.INFO, "savebtActionPerformed --CreateOrganTypePanel");
        
        String availunits = AUtxt.getText();
        String selOrgan= String.valueOf(Organcombobox.getSelectedItem());
        System.out.println(Organcombobox.getSelectedItem().toString());
        if((Organcombobox.getSelectedIndex()==0)|| availunits.equals("") || availunits.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Please enter values for all the fields");
            return;
        }
        if (organlist.getCCareTypeAList().size() > 0) {
            for (CovidCareRequirementType ot :organlist.getCCareTypeAList() ) {
                
                if (ot.getRequirementType().equals(String.valueOf(Organcombobox.getSelectedItem()))) {
                    JOptionPane.showMessageDialog(null, "Covid Requirement type already exists");
                    
                    AUtxt.setText("");
                    return;
                }
            }
        }
        
         this.organtype = new CovidCareRequirementType(selOrgan, availunits);
         organlist.addRequirement(this.organtype);
         JOptionPane.showMessageDialog(null, "Organtype details added successfully");
         Organcombobox.setSelectedIndex(0);
         AUtxt.setText("");
         return;

    }//GEN-LAST:event_savebtActionPerformed

    private void OrgancomboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrgancomboboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OrgancomboboxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AUtxt;
    private javax.swing.JComboBox<String> Organcombobox;
    private javax.swing.JButton backbt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton savebt;
    // End of variables declaration//GEN-END:variables
}

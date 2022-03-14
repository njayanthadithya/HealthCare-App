/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CovidCare;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.CovidCare.CovidCareList;
import Business.CovidCare.CovidCareRequirementType;
import Business.Organization.PhysicianOrganization;
import Business.Organization.LabOrganization;
import Business.Organization.ManagerOrganization;
import Business.Organization.CCareManagerOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.BloodReqToBloodBankfromEmg;
import Business.WorkQueue.BloodReqToBloodBankfromHos;
import Business.WorkQueue.LabTestRequest;
import Business.WorkQueue.CCarerequestToCCarefromEMS;
import Business.WorkQueue.CCarerequestToCCarefromHospital;
import Business.WorkQueue.WorkRequest;
import static Logger.Logger.logger;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author monishmm
 */
public class CovidManagerWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form CovidManagerWorkArea
     */private JPanel userProcessContainer;
    private CCareManagerOrganization organization;
    private Enterprise enterprise;
    private UserAccount useraccount;
    private PhysicianOrganization cob;
    private List<Map.Entry<String, Integer>> topOrgantype;
    private List<Map.Entry<String, Integer>> topRequests;
    private CovidCareRequirementType organtype;
    private CovidCareList organlist;
    private EcoSystem ecosystem;
    
    public CovidManagerWorkArea(JPanel userProcessContainer, UserAccount account, CCareManagerOrganization organization, Enterprise enterprise, EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.useraccount = account;
        this.ecosystem = ecosystem;
        getpiechartdata();
    }
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Organ Bank Manager Work area");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("Top 3 Requested Organs");
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(51, 202, 208)));
        jButton1.setPreferredSize(new java.awt.Dimension(137, 29));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(45, 45, 45)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        FindTop3OrganRequest();
    }//GEN-LAST:event_jButton1ActionPerformed

    public void getpiechartdata() {
        logger.log(Level.INFO, "getpiechartdata --ManagerRoleWorkAreaJPanel");

        DefaultPieDataset dataSet = new DefaultPieDataset();
        int RTPCR = 0;
        int PLASMA = 0;
        int Rapidtest = 0;
        int  Ventilator= 0;
        
        try {

            for (CovidCareRequirementType ot : enterprise.getCCareList().getCCareTypeAList()) {
                   System.out.println("ssss"+enterprise.getCCareList().getCCareTypeAList());
                if (ot.getRequirementType().equalsIgnoreCase("RTPCR")) {
                    System.out.println("ssss"+Integer.parseInt(ot.getAvailUnits()));
                    RTPCR = Integer.parseInt(ot.getAvailUnits());
                } else if (ot.getRequirementType().equalsIgnoreCase("Plasma")) {
                    PLASMA = Integer.parseInt(ot.getAvailUnits());
                } else if (ot.getRequirementType().equalsIgnoreCase("Rapid Test")) {
                    Rapidtest = Integer.parseInt(ot.getAvailUnits());
                    System.out.println("Rapid Test"+Integer.parseInt(ot.getAvailUnits()));
                } else if (ot.getRequirementType().equalsIgnoreCase("Ventilators")) {
                    Ventilator = Integer.parseInt(ot.getAvailUnits());
                } 
            }

            dataSet.setValue("RTPCR", RTPCR);
            dataSet.setValue("PLASMA", PLASMA);
            dataSet.setValue("Rapid Test", Rapidtest);
            dataSet.setValue("Ventilator", Ventilator);
           

            JFreeChart chart = ChartFactory.createPieChart3D("Pie Chart for Available OrganUnits", dataSet, true, true, Locale.ENGLISH);
            chart.setBackgroundPaint(Color.WHITE);
            chart.getTitle().setPaint(Color.BLUE);
            ChartPanel chartpanel = new ChartPanel(chart);
            chartpanel.setDomainZoomable(true);

            jPanel1.setLayout(new BorderLayout());
            jPanel1.add(chartpanel, BorderLayout.EAST);
            jPanel1.setVisible(true);
        } catch (NullPointerException npe) {
            JOptionPane.showMessageDialog(null, " No Data to display as of now!", "warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

    }
    
    
    public void FindTop3OrganRequest() {
        logger.log(Level.INFO, "FindTop3OrganRequest --ManagerRoleWorkAreaJPanel");

        int quantity = 0;
        String ot = "";
        HashMap<String, Integer> volMap = new HashMap<>();
        try {
            for (Network network : ecosystem.getNetworkList()) {
                if (enterprise.equals(this.enterprise)) {
                    for (Organization org : enterprise.getOrganizationdirectory().getOrganizationAList()) {
                        
                        

                    
                    for (WorkRequest request : enterprise.getWorkqueue().getWorkRequestAList()) {

                        if (request.getClass().getName().contains("OrganrequestToOBfromHospital")) {
                            quantity = (((CCarerequestToCCarefromHospital) request).getRequestedUnits());
                            ot = ((CCarerequestToCCarefromHospital) request).getCcareType();
                            System.out.println("userinterface.OrganBank.OBManagerroleworkarea.findTop3BloodRequest()"+((CCarerequestToCCarefromHospital) request).getCcareType());
                            if (volMap.containsKey(ot)) {
                                volMap.put(ot, volMap.get(ot) + quantity);
                                    System.out.println("prit if in volmap"+volMap.get(0));
                            } else {
                                volMap.put(ot, quantity);
                                     System.out.println("prit if else in volmap"+volMap.get(0));
                            }
                        } else if (request.getClass().getName().contains("OrganrequestToOBfromEMS")) {
                            quantity = Integer.parseInt(((CCarerequestToCCarefromEMS) request).getReqUnits());
                            ot = ((CCarerequestToCCarefromEMS) request).getCCareType();
                            if (volMap.containsKey(ot)) {
                                volMap.put(ot, volMap.get(ot) + quantity);
                            } else {
                                volMap.put(ot, quantity);
                            }
                        }
                    }
                }
                }
                System.out.println("volMap>>" + volMap.toString());

                List<Map.Entry<String, Integer>> list = new LinkedList<>(volMap.entrySet());

                Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
                    public int compare(Map.Entry<String, Integer> o1,
                            Map.Entry<String, Integer> o2) {
                        if (o1.getValue() > o2.getValue()) {
                            return 1;
                        } else if (o1.getValue() < o2.getValue()) {
                            return -1;
                        }
                        return 0;
                    }

                });
                Collections.reverse(list);
                System.out.println("After Sort " + list.toString());

                topOrgantype = list;

                DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
                int count = 0;

                if (volMap.entrySet().size() <= 3) {
                    for (Map.Entry<String, Integer> entry : list) {
                        System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
                        dataSet.setValue(entry.getValue(), "No of Organ Units", entry.getKey());
                    }
                } else if (volMap.entrySet().size() > 3) {
                    for (Map.Entry<String, Integer> entry : list) {
                        System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
                        dataSet.setValue(entry.getValue(), "No of Organ Units", entry.getKey());
                        count++;
                        if (count == 3) {
                            break;
                        }
                    }
                }
            
                JFreeChart piechart = ChartFactory.createBarChart(" Top 3 Organtypes based on Required Units ", "Organtype", "Quantity", dataSet, PlotOrientation.VERTICAL, false, true, false);
                piechart.setBackgroundPaint(Color.WHITE);
                piechart.getTitle().setPaint(Color.BLUE);
                CategoryPlot plot = piechart.getCategoryPlot();
                plot.setBackgroundPaint(Color.CYAN);

                ChartFrame frame = new ChartFrame("Bar Chart for Top 3 Organ Units ", piechart);
                frame.setVisible(true);
                Dimension ss = Toolkit.getDefaultToolkit().getScreenSize();
                Dimension frameSize = new Dimension(500, 300);

                frame.setBounds(ss.width / 2 - frameSize.width / 2,
                        ss.height / 2 - frameSize.height / 2,
                        frameSize.width, frameSize.height);

            }
        } catch (NullPointerException npe) {
            npe.printStackTrace();
            JOptionPane.showMessageDialog(null, " No Data to display as of now!", "warning", JOptionPane.WARNING_MESSAGE);
            return;

        }

    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
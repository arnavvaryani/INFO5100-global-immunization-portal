/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Health;

import Model.Ecosystem;
import Model.Enterprise.Enterprise;
import Model.Region.Region;
import Model.Organization.HealthOrganization;
import Model.UserAccount.UserAccount;
import Model.Flow.WorkRequest;
import Model.Flow.AdministerVaccine;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author nehadevarapalli
 */
public class HealthWorkAreaJPanel extends javax.swing.JPanel {
        
    private JPanel userProcessContainer;
    private HealthOrganization organization;
    private Enterprise enterprise;
    private Ecosystem system;
    private UserAccount userAccount;
    int approved = 0;
    int requested = 0;
    /**
     * Creates new form DistributionWorkAreaJPanel
     */
    public HealthWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, HealthOrganization organization, Enterprise enterprise, Ecosystem system) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.system = system;
        this.userAccount = account;
        lblVal.setText(account.getEmployee().getName());
        populateApproveTable();
        populateRequestedTable();
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
        tblRequested = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblApproved = new javax.swing.JTable();
        lblApproved = new javax.swing.JLabel();
        lblRequested = new javax.swing.JLabel();
        btnpieChart = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblTxt = new javax.swing.JLabel();
        lblVal = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1440, 848));
        setPreferredSize(new java.awt.Dimension(1440, 848));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblRequested.setForeground(new java.awt.Color(36, 47, 65));
        tblRequested.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Person", "Distribution", "Status", "Date"
            }
        ));
        jScrollPane1.setViewportView(tblRequested);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 500, 470, 180));

        tblApproved.setForeground(new java.awt.Color(36, 47, 65));
        tblApproved.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Person", "Distribution", "Status", "Date"
            }
        ));
        jScrollPane2.setViewportView(tblApproved);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 470, 180));

        lblApproved.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        lblApproved.setText("Approved List of Vaccine by person");
        add(lblApproved, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, -1, -1));

        lblRequested.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        lblRequested.setText("Requested List of Vaccines by person");
        add(lblRequested, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 460, -1, -1));

        btnpieChart.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        btnpieChart.setText("Generate PieChart");
        btnpieChart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpieChartActionPerformed(evt);
            }
        });
        add(btnpieChart, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 720, -1, -1));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Vaccines");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, 140, 1190, -1));

        lblTxt.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        lblTxt.setText("Currently Logged in as:");
        add(lblTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 30, -1, 30));

        lblVal.setBackground(new java.awt.Color(255, 255, 255));
        lblVal.setFont(new java.awt.Font("Helvetica Neue", 1, 22)); // NOI18N
        lblVal.setForeground(new java.awt.Color(255, 255, 255));
        lblVal.setText("<value>");
        add(lblVal, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 30, 230, 30));

        lblTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/gradient-big.jpg"))); // NOI18N
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1440, 850));
    }// </editor-fold>//GEN-END:initComponents

    private void btnpieChartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpieChartActionPerformed
        // TODO add your handling code here:
        DefaultPieDataset pieDataset = new DefaultPieDataset();
        pieDataset.setValue("Approved", new Integer(tblApproved.getRowCount()));
        pieDataset.setValue("Requested",new Integer(tblRequested.getRowCount()));
        JFreeChart chart = ChartFactory.createPieChart("Chart", pieDataset,true , true , true);
        PiePlot P = (PiePlot) chart.getPlot();
        //P.setForegroundAlpha(TOP_ALIGNMENT);
        ChartFrame frame = new ChartFrame("Pie Chart" , chart);
        frame.setVisible(true);
        frame.setSize(450,500);
    }//GEN-LAST:event_btnpieChartActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnpieChart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblApproved;
    private javax.swing.JLabel lblRequested;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTxt;
    private javax.swing.JLabel lblVal;
    private javax.swing.JTable tblApproved;
    private javax.swing.JTable tblRequested;
    // End of variables declaration//GEN-END:variables

    private void populateApproveTable() {
        DefaultTableModel model = (DefaultTableModel) tblApproved.getModel();
        model.setRowCount(0);
        
            System.out.println("Inside approved table");
        for(WorkRequest wr: userAccount.getWorkQueue().getWorkRequestList()){
            approved++;
            Object[] row = new Object[4];
            System.out.println("Inside approved for");
            if(wr instanceof AdministerVaccine){
                
            System.out.println("Inside approved if");
                if(wr.getStatus().equals("Approved")){
                    
            System.out.println("Inside approved if 2");
                row[0] = wr;
                row[1] = wr.getReceiver();
                row[2] = wr.getStatus();
                String Date = ((AdministerVaccine) wr).getDate();
                row[3] = Date;
                model.addRow(row);
                }
            }
        }
    }

    private void populateRequestedTable() {
        DefaultTableModel model = (DefaultTableModel) tblRequested.getModel();
        model.setRowCount(0);
        
            System.out.println("Inside requesed table");
        for(WorkRequest wr: userAccount.getWorkQueue().getWorkRequestList()){
            requested++;
            System.out.println("Inside requested for");
            Object[] row = new Object[4];
            if(wr instanceof AdministerVaccine){
                
            System.out.println("Inside requested if");
                if(wr.getStatus().equals("Requested")){
                    
            System.out.println("Inside requested if 2");
                row[0] = wr;
                row[1] = wr.getReceiver();
                row[2] = wr.getStatus();
                String Date = ((AdministerVaccine) wr).getDate();
                row[3] = Date;
                model.addRow(row);
                }
            }
        }
    }
}

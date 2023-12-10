/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Sales;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.ManufacturingOrganization;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Organization.PurchaseInventory;
import Business.Organization.SalesOrganization;
import Business.Organization.Vaccine;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import Business.WorkQueue.approveVaccine;
import Business.WorkQueue.requestVaccine;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nehadevarapalli
 */
public class SalesWorkAreaJPanel extends javax.swing.JPanel {
        
    
    private EcoSystem system;
    private OrganizationDirectory directory;
    private JPanel userProcessContainer;
    private SalesOrganization organization;
    private Enterprise enterprise;
    private Network network;
    private UserAccount userAccount;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    /**
     * Creates new form DistributionWorkAreaJPanel
     */
    public SalesWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, SalesOrganization organization, Enterprise enterprise, EcoSystem system) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.system = system;
        this.userAccount = account;
        lblVal.setText(account.getEmployee().getName());
        populateApproveTable();
        populateTable();
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
        tblVacc = new javax.swing.JTable();
        btnRejected = new javax.swing.JButton();
        txtComm = new javax.swing.JTextField();
        lblComm = new javax.swing.JLabel();
        btnApproved = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblOrder = new javax.swing.JTable();
        separatorLine = new javax.swing.JSeparator();
        lblTitle = new javax.swing.JLabel();
        lblTxt = new javax.swing.JLabel();
        lblVal = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1440, 848));
        setMinimumSize(new java.awt.Dimension(1440, 848));
        setPreferredSize(new java.awt.Dimension(1440, 848));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblVacc.setForeground(new java.awt.Color(36, 47, 65));
        tblVacc.setModel(new javax.swing.table.DefaultTableModel(
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
                "Sender", "Receiver", "Quantity per dose", "Status"
            }
        ));
        tblVacc.setGridColor(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(tblVacc);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 460, 480, 180));

        btnRejected.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        btnRejected.setText("Reject");
        btnRejected.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejectedActionPerformed(evt);
            }
        });
        add(btnRejected, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 370, -1, -1));

        txtComm.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        txtComm.setBorder(null);
        add(txtComm, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 330, 190, 20));

        lblComm.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        lblComm.setText("Comments:");
        add(lblComm, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 330, -1, -1));

        btnApproved.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        btnApproved.setText("Approve");
        btnApproved.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApprovedActionPerformed(evt);
            }
        });
        add(btnApproved, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 370, -1, -1));

        tblOrder.setForeground(new java.awt.Color(36, 47, 65));
        tblOrder.setModel(new javax.swing.table.DefaultTableModel(
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
                "Sender", "Receiver", "Quantity", "Status"
            }
        ));
        tblOrder.setGridColor(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(tblOrder);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 130, 480, 180));

        separatorLine.setForeground(new java.awt.Color(0, 0, 0));
        separatorLine.setMinimumSize(new java.awt.Dimension(1, 12));
        separatorLine.setPreferredSize(new java.awt.Dimension(1, 12));
        add(separatorLine, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 350, 180, -1));

        lblTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/gradient-big.jpg"))); // NOI18N
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1440, 850));

        lblTxt.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        lblTxt.setText("Currently Logged in as:");
        add(lblTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 30, -1, 30));

        lblVal.setFont(new java.awt.Font("Helvetica Neue", 1, 22)); // NOI18N
        lblVal.setText("<value>");
        add(lblVal, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 30, 230, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void btnApprovedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApprovedActionPerformed
        // TODO add your handling code here:
        ManufacturingOrganization org = null;
        for(Organization o : enterprise.getOrganizationDirectory().getOrganizationList()){
            for(UserAccount u : o.getUserAccountDirectory().getUserAccountList()){
                if(u.getRole().toString().equals("Business.Role.ManufacturingRole")){
                    org = ((ManufacturingOrganization)o);
                }
            }
            
        }
        for(Vaccine v : org.getVaccineDirectory()){
            
            if(v.getStatus().equals("Approved")){
               
                int selectedRow = tblOrder.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(this, "Please select an order to approve");
            return;
        }
        requestVaccine request = (requestVaccine)tblOrder.getValueAt(selectedRow, 0);
        
        if(request.getStatus().equals("Approved")){
            JOptionPane.showMessageDialog(this, "Vaccine already approved");
            return;
        }
     
        if(validate(txtComm.getText())){
        request.setStatus("Approved");
        request.setTestResult("Approved");
        ArrayList<PurchaseInventory> inv = ((requestVaccine) request).getInventoryPurchase();
        if(inv!=null){
            for(PurchaseInventory p : inv){
                ((requestVaccine) request).setQty(p.getQty());
                
            }
            }
        
        
        populateTable();
        populateApproveTable();
        dB4OUtil.storeSystem(system);
        txtComm.setText("");
        }
        break;
            }
            else{
                JOptionPane.showMessageDialog(this, "You must have an approved vaccine in the inventory to manage orders");
                return;
            }
        }
        //dB4OUtil.storeSystem(system);
        //txtComments.setText("");
    }//GEN-LAST:event_btnApprovedActionPerformed

    private void btnRejectedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejectedActionPerformed
        // TODO add your handling code here:
        ManufacturingOrganization org = null;
        for(Organization o : enterprise.getOrganizationDirectory().getOrganizationList()){
            for(UserAccount u : o.getUserAccountDirectory().getUserAccountList()){
                if(u.getRole().toString().equals("Business.Role.ManufacturingRole")){
                    org = ((ManufacturingOrganization)o);
                }
            }
            
        }
        for(Vaccine v : org.getVaccineDirectory()){
           
            if(v.getStatus().equals("Approved")){
               
                int selectedRow = tblOrder.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(this, "Please select a row to Reject");
            return;
        }
        requestVaccine request = (requestVaccine)tblOrder.getValueAt(selectedRow, 0);
        
        if(request.getStatus().equals("Approved")){
            JOptionPane.showMessageDialog(this, "Vaccine already approved");
            return;
        }
     
        if(validate(txtComm.getText())){
        request.setStatus("Rejected");
        request.setTestResult("Rejected");
        ArrayList<PurchaseInventory> inv = ((requestVaccine) request).getInventoryPurchase();
        if(inv!=null){
            for(PurchaseInventory p : inv){
                ((requestVaccine) request).setQty(p.getQty());
                
            }
            }
        
        
        populateTable();
        populateApproveTable();
        dB4OUtil.storeSystem(system);
        txtComm.setText("");
        }
        break;
            }
            else{
                JOptionPane.showMessageDialog(this, "You must have an approved vaccine in the inventory to manage orders");
                return;
            }
        }
        //dB4OUtil.storeSystem(system);
        //txtComments.setText("");
    }//GEN-LAST:event_btnRejectedActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApproved;
    private javax.swing.JButton btnRejected;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblComm;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTxt;
    private javax.swing.JLabel lblVal;
    private javax.swing.JSeparator separatorLine;
    private javax.swing.JTable tblOrder;
    private javax.swing.JTable tblVacc;
    private javax.swing.JTextField txtComm;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblVacc.getModel();
        model.setRowCount(0);
        System.out.println(enterprise.getName());
        try{
        for(WorkRequest wr : userAccount.getWorkQueue().getWorkRequestList()){
            if(wr instanceof approveVaccine){
            UserAccount inv = ((approveVaccine) wr).getSales();
            Object[] row = new Object[4];
            row[0] = wr;
            row[1] = inv.getUsername();
//            if(inv!=null){
//            for(PurchaseInventory p : inv){
//                row[2] = p.getQty();
//            }
            row[2] = "20";
            row[3] = wr.getStatus();
            
            model.addRow(row);
            }
        }
        }
    
        catch(NullPointerException e){
            System.out.println("Null exception caught");
    }
    }

    private void populateApproveTable() {
        DefaultTableModel model = (DefaultTableModel) tblOrder.getModel();
        model.setRowCount(0);
        System.out.println(enterprise.getName());
        try{
        for(WorkRequest wr : userAccount.getWorkQueue().getWorkRequestList()){
//            UserAccount inv = ((approveVaccine) wr).getSales();
            if(wr instanceof requestVaccine){
            Object[] row = new Object[4];
            row[0] = wr;
            row[1] = wr.getReceiver().getUsername();
//            if(inv!=null){
//            for(PurchaseInventory p : inv){
//                row[2] = p.getQty();
//            }
            row[2] = ((requestVaccine) wr).getQty();
            row[3] = wr.getStatus();
            
            model.addRow(row);
            }
        }
        }
    
        catch(NullPointerException e){
            System.out.println("Null exception caught");
    }
    }
    
    private boolean validate(String comment) {
       if(comment.length()<1){
           JOptionPane.showMessageDialog(this, "Please enter comments");
           return false;
       }
           return true;
    }
    
}

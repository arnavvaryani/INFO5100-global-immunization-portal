/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Admin;

import Util.DB4OUtil;
import Model.Ecosystem;
import Model.Employee.Employee;
import Model.Organization.Organization;
import Model.Organization.OrganizationDirectory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nehadevarapalli
 */
public class ManageEmployeeJPanel extends javax.swing.JPanel {

    private OrganizationDirectory organizationDir;
    private JPanel userProcessContainer;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    private Ecosystem system;

    /**
     * Creates new form ManageOrganizationJPanel
     */
    public ManageEmployeeJPanel(JPanel userProcessContainer, OrganizationDirectory organizationDir) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organizationDir = organizationDir;

        populateOrganizationComboBox();
        populateOrganizationEmpComboBox();
    }

    public void populateOrganizationComboBox() {
        cmbOrg.removeAllItems();

        for (Organization organization : organizationDir.getOrganizationList()) {
            cmbOrg.addItem(organization);
        }
    }

    public void populateOrganizationEmpComboBox() {
        cmborgEmp.removeAllItems();

        for (Organization organization : organizationDir.getOrganizationList()) {
            cmborgEmp.addItem(organization);
        }
    }

    private void populateTable(Organization organization) {
        DefaultTableModel model = (DefaultTableModel) tblOrg.getModel();

        model.setRowCount(0);

        for (Employee employee : organization.getEmployeeDirectory().getEmployeeList()) {
            Object[] row = new Object[2];
            row[0] = employee.getId();
            row[1] = employee.getName();
            model.addRow(row);
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
        tblOrg = new javax.swing.JTable();
        btnCreatee = new javax.swing.JButton();
        cmbOrg = new javax.swing.JComboBox();
        lblOrg = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        cmborgEmp = new javax.swing.JComboBox();
        lblSelOrganization = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lbltitle = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1190, 848));
        setPreferredSize(new java.awt.Dimension(1190, 848));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblOrg.setForeground(new java.awt.Color(36, 47, 65));
        tblOrg.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Employee ID", "Employee Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblOrg);
        if (tblOrg.getColumnModel().getColumnCount() > 0) {
            tblOrg.getColumnModel().getColumn(0).setResizable(false);
            tblOrg.getColumnModel().getColumn(1).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 390, 480, 180));

        btnCreatee.setBackground(new java.awt.Color(204, 255, 255));
        btnCreatee.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        btnCreatee.setText("Create Employee");
        btnCreatee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateeActionPerformed(evt);
            }
        });
        add(btnCreatee, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 700, -1, -1));

        cmbOrg.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        cmbOrg.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbOrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbOrgActionPerformed(evt);
            }
        });
        add(cmbOrg, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 340, 240, -1));

        lblOrg.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        lblOrg.setForeground(new java.awt.Color(255, 255, 255));
        lblOrg.setText("Organization:");
        add(lblOrg, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 340, -1, -1));

        lblName.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        lblName.setText("Name:");
        add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 580, -1, -1));

        txtName.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        txtName.setForeground(new java.awt.Color(255, 255, 255));
        txtName.setBorder(null);
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 580, 210, -1));

        cmborgEmp.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        cmborgEmp.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmborgEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmborgEmpActionPerformed(evt);
            }
        });
        add(cmborgEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 630, 260, -1));

        lblSelOrganization.setBackground(new java.awt.Color(0, 0, 0));
        lblSelOrganization.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        lblSelOrganization.setText("Select organization to add new employee in:");
        add(lblSelOrganization, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 630, -1, -1));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Employees");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, 140, 1190, -1));

        lbltitle.setForeground(new java.awt.Color(255, 255, 255));
        lbltitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/gradient.jpg"))); // NOI18N
        add(lbltitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 850));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateeActionPerformed
        Organization organization = (Organization) cmborgEmp.getSelectedItem();
        String name = txtName.getText();
        if (name.equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter a name", "Warning", JOptionPane.WARNING_MESSAGE);

        }
        organization.getEmployeeDirectory().createEmployee(name);
        populateTable(organization);
        //store data in database
        dB4OUtil.storeSystem(system);
        txtName.setText("");
        JOptionPane.showMessageDialog(null, "Employee created");


    }//GEN-LAST:event_btnCreateeActionPerformed

    private void cmbOrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbOrgActionPerformed
        Organization organization = (Organization) cmbOrg.getSelectedItem();
        if (organization != null) {
            populateTable(organization);
        }

    }//GEN-LAST:event_cmbOrgActionPerformed

    private void cmborgEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmborgEmpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmborgEmpActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreatee;
    private javax.swing.JComboBox cmbOrg;
    private javax.swing.JComboBox cmborgEmp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblOrg;
    private javax.swing.JLabel lblSelOrganization;
    private javax.swing.JLabel lbltitle;
    private javax.swing.JTable tblOrg;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}

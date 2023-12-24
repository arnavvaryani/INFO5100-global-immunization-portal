/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SystemAdmin;

import Util.DB4OUtil;
import Model.Ecosystem;
import Model.Enterprise.Enterprise;
import Model.Region.Region;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nehadevarapalli
 */
public class ManageEnterpriseJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Ecosystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();

    /**
     * Creates new form ManageEnterpriseJPanel
     */
    public ManageEnterpriseJPanel(JPanel userProcessContainer, Ecosystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;

        populateTable();
        populateComboBox();
    }

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblEnterpriseselect.getModel();

        model.setRowCount(0);
        for (Region network : system.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                Object[] row = new Object[3];
                row[0] = enterprise.getName();
                row[1] = network.getName();
                row[2] = enterprise.getEnterpriseType().getValue();

                model.addRow(row);
            }
        }
    }

    private void populateComboBox() {
        cmbNetworkselect.removeAllItems();
        cmbEnterpriseselect.removeAllItems();

        for (Region network : system.getNetworkList()) {
            cmbNetworkselect.addItem(network);
        }

        for (Enterprise.EnterpriseType type : Enterprise.EnterpriseType.values()) {
            cmbEnterpriseselect.addItem(type);
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
        tblEnterpriseselect = new javax.swing.JTable();
        lblNetworkselect = new javax.swing.JLabel();
        cmbNetworkselect = new javax.swing.JComboBox();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblEnterpriseselect = new javax.swing.JLabel();
        cmbEnterpriseselect = new javax.swing.JComboBox();
        btnSub = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1190, 848));
        setPreferredSize(new java.awt.Dimension(1190, 848));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblEnterpriseselect.setForeground(new java.awt.Color(36, 47, 65));
        tblEnterpriseselect.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Enterprise", "Region", "Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblEnterpriseselect.setGridColor(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(tblEnterpriseselect);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, 530, 180));

        lblNetworkselect.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        lblNetworkselect.setText("Region:");
        add(lblNetworkselect, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 500, -1, -1));

        cmbNetworkselect.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        cmbNetworkselect.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(cmbNetworkselect, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 490, 136, -1));

        lblName.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        lblName.setText("Name:");
        add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 610, -1, -1));

        txtName.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        txtName.setBorder(null);
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 610, 190, 20));

        lblEnterpriseselect.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        lblEnterpriseselect.setText("Enterprise Type:");
        add(lblEnterpriseselect, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 550, -1, -1));

        cmbEnterpriseselect.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        cmbEnterpriseselect.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(cmbEnterpriseselect, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 550, 136, -1));

        btnSub.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        btnSub.setText("Submit");
        btnSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubActionPerformed(evt);
            }
        });
        add(btnSub, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 670, -1, -1));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Enterprises");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 1440, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/gradient.jpg"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 850));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubActionPerformed

        Region network = (Region) cmbNetworkselect.getSelectedItem();
        Enterprise.EnterpriseType type = (Enterprise.EnterpriseType) cmbEnterpriseselect.getSelectedItem();

        if (network == null || type == null) {
            JOptionPane.showMessageDialog(null, "Invalid Input!");
            return;
        }
        

        String name = txtName.getText();
        if(name.equals("")){
            JOptionPane.showMessageDialog(null, "Please Enter Enterprise Name", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Enterprise enterprise = network.getEnterpriseDirectory().createAndAddEnterprise(name, type, network);
        System.out.println(network.getName());

        populateTable();
        //stores in the database
        dB4OUtil.storeSystem(system);
        txtName.setText("");

    }//GEN-LAST:event_btnSubActionPerformed


    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
         Component[] componentArray = userProcessContainer.getComponents();
         try{
             Component component = componentArray[componentArray.length - 1];
             SystemAdminWorkAreaJPanel sysAdminwjp = (SystemAdminWorkAreaJPanel) component;
         }catch(Exception e){
             System.out.println("Exception caught!");
         }
        
        
        
        
        //Jtree -> removed -> sysAdminwjp.populateTree();

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSub;
    private javax.swing.JComboBox cmbEnterpriseselect;
    private javax.swing.JComboBox cmbNetworkselect;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEnterpriseselect;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblNetworkselect;
    private javax.swing.JTable tblEnterpriseselect;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}

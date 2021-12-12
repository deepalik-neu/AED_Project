/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.PlasmaBankAdminRole;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.PlasmaBankOrganization;
import Business.Organization.SystemCoordinatorOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author namita
 */
public class PlasmaRequestJPanel extends javax.swing.JPanel {

    private UserAccount userAccount;
    private PlasmaBankOrganization plasmaorganization;
    private Enterprise enterprise;
    private Network network;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    private EcoSystem system;
    /**
     * Creates new form PlasmaRequestJPanel
     */
    public PlasmaRequestJPanel(UserAccount userAccount, PlasmaBankOrganization plasmaorganization, Enterprise enterprise, Network network, EcoSystem system) {
        initComponents();
        this.userAccount = userAccount;
        this.plasmaorganization = plasmaorganization;
        this.enterprise = enterprise;
        this.network = network;
        this.system = system;
        
        
        populatePlasmaRequestTable();
    }
    
     public void populatePlasmaRequestTable(){
        DefaultTableModel model = (DefaultTableModel)tablePlasmaRequest.getModel();
        
        model.setRowCount(0);
        
        for(WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[6];
            row[0] = request;
            row[1] = request.getPatient();
            row[2] = request.getPatient().getName();
            row[3] = request.getPatient().getEmailID();
            row[4] = request.getPatient().getBloodGroup();
            row[5] = request.getStatus();
             
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablePlasmaRequest = new javax.swing.JTable();
        btnApproveRequest = new javax.swing.JButton();
        btnRejectRequest = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Kefa", 1, 24)); // NOI18N
        jLabel1.setText("Plasma Bank");

        jLabel2.setText("Plasma Requests List");

        tablePlasmaRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9"
            }
        ));
        jScrollPane1.setViewportView(tablePlasmaRequest);

        btnApproveRequest.setText("Approve Request");
        btnApproveRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApproveRequestActionPerformed(evt);
            }
        });

        btnRejectRequest.setText("Reject Request");
        btnRejectRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejectRequestActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addComponent(btnApproveRequest)
                        .addGap(112, 112, 112)
                        .addComponent(btnRejectRequest))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(370, 370, 370)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 885, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnApproveRequest)
                    .addComponent(btnRejectRequest))
                .addContainerGap(131, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRejectRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejectRequestActionPerformed
        // TODO add your handling code here:
        
          int selectedRow = tablePlasmaRequest.getSelectedRow();
       // jPanel1.setVisible(true);
        if (selectedRow < 0){   
            JOptionPane.showMessageDialog(null, new JLabel(  "<html><h2><I>Please select<font color='red'> a row</font> from the<font color='green'> table!</I></font></h2></html>"), "Warning", JOptionPane.WARNING_MESSAGE);
             return;
        }
         else{
           // jPanel1.setVisible(true);
            WorkRequest request = (WorkRequest)tablePlasmaRequest.getValueAt(selectedRow, 0);
            if(request.getStatus().equals("Legally Approved. Passing to PlasmaBank")){
               JOptionPane.showMessageDialog(null, new JLabel("<html><h2><I>Work Request is<font color='red'> on hold</font> !</I></h2></html>"), "Warning", JOptionPane.WARNING_MESSAGE);
        //        if(request.getPatient().isEmergencyStatus() == true){
                //jPanel1.setVisible(true);
       //         }
                //dB4OUtil.storeSystem(system);
                //populatePlasmaCoordinatorTable();   
            }
            else{
              //JOptionPane.showMessageDialog(null, new JLabel("<html><h2><I>Work Request is<font color='red'> already</font> in progress!</I></h2></html>"), "Warning", JOptionPane.WARNING_MESSAGE);
      //           jPanel1.setVisible(false);
              //  JOptionPane.showMessageDialog(null, "Work Request is already in progress!" ); 
            }
        }
    }//GEN-LAST:event_btnRejectRequestActionPerformed

    private void btnApproveRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApproveRequestActionPerformed
        // TODO add your handling code here:
        
        int selectedRow = tablePlasmaRequest.getSelectedRow();
        
        if (selectedRow < 0){
            //JOptionPane.showMessageDialog(null, "Please select a row first!" );
            JOptionPane.showMessageDialog(null, new JLabel(  "<html><h2><I>Please select<font color='red'> a row</font> from the<font color='green'> table</I></font></h2></html>"), "Warning", JOptionPane.WARNING_MESSAGE);
            
            return;
        }
        else{
            WorkRequest request = (WorkRequest)tablePlasmaRequest.getValueAt(selectedRow, 0);
            if(request.getStatus().equals("Legally Approved. Passing to PlasmaBank")
                || request.getStatus().equals("On Hold Due to Plasma unavailability")){
                request.setStatus("PlasmaBank Approved. Passing to System Coordinator");
        
                dB4OUtil.storeSystem(system);
                populatePlasmaRequestTable();
        
                Enterprise ent = null;
                Organization org = null;
        
                for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                    if (enterprise.getEnterpriseType().toString().equals("Hospital")) {
                            ent = enterprise;
                            break;
                    }
                }
                for (Organization organization : ent.getOrganizationDirectory().getOrganizationList()) {
                    if(organization instanceof SystemCoordinatorOrganization) {
                        org = organization;
                        break;
                    }
                }
        
                if (org != null) {
                    org.getWorkQueue().getWorkRequestList().add(request);
                   // org.getBloodGroup().subtractBloodGroup(request.getPatient().getBloodGroup());
                   // populateTextFields();
                }
                else {
                    JOptionPane.showMessageDialog(null, "No organization present", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            else{
                // JOptionPane.showMessageDialog(null, "Work Request is already in progress!" );
                 JOptionPane.showMessageDialog(null, new JLabel("<html><h2><I>Work Request is<font color='red'> already</font> in progress!</I></h2></html>"), "Warning", JOptionPane.WARNING_MESSAGE);
                
            }
        }
            
     dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_btnApproveRequestActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApproveRequest;
    private javax.swing.JButton btnRejectRequest;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablePlasmaRequest;
    // End of variables declaration//GEN-END:variables
}

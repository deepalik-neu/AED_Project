/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.AuthorizationOfficerRole;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.AuthorizationOrganization;
import Business.Organization.Organization;
import Business.Organization.PlasmaBankOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author namita
 */
public class AuthorizationApprovalPanel extends javax.swing.JPanel {

    private EcoSystem system;
    private UserAccount userAccount;
    private Network network;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    private AuthorizationOrganization org;
    
    
    /**
     * Creates new form AuthorizationApprovalPanel
     */
    public AuthorizationApprovalPanel(EcoSystem system, UserAccount userAccount, Network network,AuthorizationOrganization org) {
        initComponents();
          this.system = system;
        this.userAccount = userAccount;
        this.network = network;
        this.org=org;
       
     
        populateTable();
    }
 public void populateTable(){
        DefaultTableModel model = (DefaultTableModel)tblRequests.getModel();
        
        model.setRowCount(0);
        
        for(WorkRequest request : org.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[5];
            row[0] = request;
            row[1] = request.getPatient();
            row[2] = request.getPatient().getName();
           // row[3] = request.getPatient().getContact();
            row[3] = request.getPatient().getEmailID();
            row[4] = request.getStatus();
             
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

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRequests = new javax.swing.JTable();
        btnApproval = new javax.swing.JButton();
        btnReject = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();

        jButton1.setText("jButton1");

        jLabel1.setFont(new java.awt.Font("Kefa", 1, 24)); // NOI18N
        jLabel1.setText("Authorization Approval");

        tblRequests.setBackground(new java.awt.Color(255, 204, 204));
        tblRequests.setFont(new java.awt.Font("Kefa", 1, 14)); // NOI18N
        tblRequests.setForeground(new java.awt.Color(102, 0, 0));
        tblRequests.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblRequests);

        btnApproval.setBackground(new java.awt.Color(255, 204, 204));
        btnApproval.setFont(new java.awt.Font("Kefa", 1, 14)); // NOI18N
        btnApproval.setForeground(new java.awt.Color(102, 0, 0));
        btnApproval.setText("Appove");
        btnApproval.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApprovalActionPerformed(evt);
            }
        });

        btnReject.setBackground(new java.awt.Color(255, 204, 204));
        btnReject.setFont(new java.awt.Font("Kefa", 1, 14)); // NOI18N
        btnReject.setForeground(new java.awt.Color(102, 0, 0));
        btnReject.setText("Reject");
        btnReject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejectActionPerformed(evt);
            }
        });

        backJButton.setBackground(new java.awt.Color(255, 204, 204));
        backJButton.setFont(new java.awt.Font("Kefa", 1, 14)); // NOI18N
        backJButton.setForeground(new java.awt.Color(102, 0, 0));
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(btnApproval, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103)
                        .addComponent(btnReject, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(backJButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 745, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(271, 271, 271)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnApproval, btnReject});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnApproval, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReject, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 193, Short.MAX_VALUE)
                .addComponent(backJButton)
                .addGap(46, 46, 46))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnApproval, btnReject});

    }// </editor-fold>//GEN-END:initComponents

    private void btnRejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejectActionPerformed
        // TODO add your handling code here:
         int selectedRow = tblRequests.getSelectedRow();
        
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, new JLabel(  "<html><h2><I>Please select<font color='red'> a row</font> from the<font color='green'> table</I></font></h2></html>"), "Warning", JOptionPane.WARNING_MESSAGE);
           
           // JOptionPane.showMessageDialog(null,"Please select a row", "Info", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        else{
        WorkRequest request = (WorkRequest)tblRequests.getValueAt(selectedRow, 0);
      
        request.setStatus("Legally Disapproved");
        request.setUserAccount(userAccount);
        userAccount.getWorkQueue().getWorkRequestList().add(request);
       
        dB4OUtil.storeSystem(system);
        populateTable();
        JOptionPane.showMessageDialog(null, new JLabel("<html><h2><I><font color='red'> Legally Disapproved!</I></font></h2></html>"), "Info", JOptionPane.INFORMATION_MESSAGE);
           
        //JOptionPane.showMessageDialog(null,"Legally Disapproved", "Info", JOptionPane.INFORMATION_MESSAGE);
        
        }
    }//GEN-LAST:event_btnRejectActionPerformed

    private void btnApprovalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApprovalActionPerformed
        // TODO add your handling code here:
        
        int selectedRow = tblRequests.getSelectedRow();
        
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, new JLabel(  "<html><h2><I>Please select<font color='red'> a row</font> from the<font color='green'> table</I></font></h2></html>"), "Warning", JOptionPane.WARNING_MESSAGE);
           
           // JOptionPane.showMessageDialog(null,"Please select a row", "Info", JOptionPane.INFORMATION_MESSAGE);
            
            return;
        }
        else{
        WorkRequest request = (WorkRequest)tblRequests.getValueAt(selectedRow, 0);
      
        request.setStatus("Legally Approved. Passing to PlasmaBank");
        //request.setUserAccount(userAccount);
        //userAccount.getWorkQueue().getWorkRequestList().add(request);
        dB4OUtil.storeSystem(system);
        populateTable();
        
        //JOptionPane.showMessageDialog(null,"Legally Approved Successfully", "Info", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, new JLabel(  "<html><h2><I>Legally<font color='green'> approved</font> successfully!</I></font></h2></html>"),"Info", JOptionPane.INFORMATION_MESSAGE);
           
        
        Enterprise ent = null;
        Organization org = null;
        
        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
            if (enterprise.getEnterpriseType().toString().equals("PlasmaBank")) {
            
                ent = enterprise;
                System.out.println(enterprise);
                break;
            }
        }
        
        for (Organization organization : ent.getOrganizationDirectory().getOrganizationList()) {
            if(organization instanceof PlasmaBankOrganization) {
                org = organization;
                break;
            }
        }
        
        if (org != null) {
            org.getWorkQueue().getWorkRequestList().add(request);
            System.out.println(org.getName()+"Orgcheck");    
        } else {
         JOptionPane.showMessageDialog(null, "No organization present", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        UserAccount userAc = null;
        for (UserAccount userAcc: org.getUserAccountDirectory().getUserAccountList()){
            userAc = userAcc;
            userAc.getWorkQueue().getWorkRequestList().add(request);
            break;
        }
        }
        
    }//GEN-LAST:event_btnApprovalActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
       
        
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnApproval;
    private javax.swing.JButton btnReject;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblRequests;
    // End of variables declaration//GEN-END:variables
}

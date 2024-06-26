/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.HospitalCoordinatorRole;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.EnterpriseDirectory;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.PathologistOrganization;
import Business.Person.Donor;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.LabTestWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author namita
 */
public class DonorListJPanel extends javax.swing.JPanel {

    private EcoSystem system;
    private EnterpriseDirectory enterpriseDirectory;
    private Network network;
    private UserAccount userAccount;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
     private JPanel userProcessContainer;
    /**
     * Creates new form DonorListJPanel
     */
    public DonorListJPanel(JPanel userProcessContainer,UserAccount userAccount,EcoSystem system,Network network) {
        initComponents();
        this.system=system;
        this.userAccount=userAccount;
        this.network=network;
        this.userProcessContainer=userProcessContainer;
        populateDonorTable();
        populateHospitalTable();
        populateRequestTable();
    }

     private void populateDonorTable(){
        DefaultTableModel dtm = (DefaultTableModel)tableDonor.getModel();
        dtm.setRowCount(0);
        
        for (Donor donor : system.getDonorDirectory().getDonorList()){
            Object row[] = new  Object[4];
            row[0] = donor;
            row[1] = donor.getName();
            row[2] = donor.getContact();
            row[3] = donor.getStatus();
            
            dtm.addRow(row);
        }}
        
        private void populateHospitalTable(){
        
        DefaultTableModel dtm = (DefaultTableModel) tableHospital.getModel();
        dtm.setRowCount(0);
        
        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()){
            if(enterprise.getEnterpriseType().toString().equals("Hospital")){
                
                Object[] row = new Object[2];
                row[0] = enterprise;
                row[1] = enterprise.getName();
                
                dtm.addRow(row);
        }
        }       
        }
        
        private void populateRequestTable(){
            
            
        DefaultTableModel model = (DefaultTableModel) tableDHAssignment.getModel();

        model.setRowCount(0);

        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()) {
            Object[] row = new Object[6];
            row[0] = request;
            
            row[1] = request;
            row[2] = request.getSummary();
            row[3] = request.getEnterprise();
            row[4] = request.getStatus();
            row[5] = request.getRequestDate();
            model.addRow(row);
        }
            
        }
        private void populate(){
            int n=5;
            for(int i=0;i<=n;i++){
                System.out.println("Approved");
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
        tableDonor = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableHospital = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableDHAssignment = new javax.swing.JTable();
        btnAssign = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));

        tableDonor.setForeground(new java.awt.Color(102, 0, 0));
        tableDonor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Name", "Contact No"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableDonor);

        tableHospital.setForeground(new java.awt.Color(102, 0, 0));
        tableHospital.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Hospital"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tableHospital);

        tableDHAssignment.setForeground(new java.awt.Color(102, 0, 0));
        tableDHAssignment.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Donor Name", "Summary", "Enterprise", "Status", "Requested Date"
            }
        ));
        jScrollPane3.setViewportView(tableDHAssignment);

        btnAssign.setBackground(new java.awt.Color(255, 255, 255));
        btnAssign.setFont(new java.awt.Font("Kefa", 1, 14)); // NOI18N
        btnAssign.setForeground(new java.awt.Color(102, 0, 0));
        btnAssign.setText("Assign");
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Kefa", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 0));
        jLabel2.setText("Assign to Hospital");

        jLabel3.setFont(new java.awt.Font("Kefa", 1, 24)); // NOI18N
        jLabel3.setText("Connect Donor to Hospital");

        jLabel1.setFont(new java.awt.Font("Kefa", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 0));
        jLabel1.setText("List of approved Donors");

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Kefa", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 0, 0));
        jButton1.setText("<<Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 966, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(82, 82, 82)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(80, 80, 80)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(328, 328, 328)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(14, 14, 14)
                            .addComponent(jButton1)
                            .addGap(241, 241, 241)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(436, 436, 436)
                            .addComponent(btnAssign, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(221, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAssign, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed
        // TODO add your handling code here:
        
        int dnr = tableDonor.getSelectedRow();
        int hosp = tableHospital.getSelectedRow();
        Donor donor=(Donor) tableDonor.getValueAt(dnr, 0); 
        Enterprise e=(Enterprise) tableHospital.getValueAt(hosp, 0);
        
        if (dnr < 0) {
            JOptionPane.showMessageDialog(null, new JLabel(  "<html><h2 color='red'>Please select a row from the Donors Table</h2></html>"), "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        else if (hosp < 0) {
            JOptionPane.showMessageDialog(null, new JLabel(  "<html><h2 color='red>Please select a row from the Hospital Table</h2></html>"), "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        else{
            WorkRequest request = new LabTestWorkRequest();
                        
            if(donor.getStatus().equals("Portal Admin Approved"))
            {
                request.setRequestDate(new Date());
                request.setAssigned("Assigned to Hospital");
                request.setSummary("Donor assigned to Hospital and requested for Donation");
                request.setStatus("Assigned to Hospital"); 
                request.setUserAccount(userAccount);
                request.setDonor(donor);
                request.getDonor().setStatus("Donor assigned to Hospital"); 
                request.setEnterprise(e);
                System.out.println("request !!");
                Organization o = null;
               // Enterprise enterprise = (Enterprise) tableHospital.getValueAt(hosp, 0);
                for (Organization organization : e.getOrganizationDirectory().getOrganizationList()) {
                    System.out.println("request !!!"+organization.getName());
                    if (organization.getName().equals(Organization.Type.Pathologist.getValue())) {
                        o = organization;
                        break;
                    }
                }
        
                if (o != null) {
                    System.out.println("request !");
                    o.getWorkQueue().getWorkRequestList().add(request);
                    System.out.println(o.getName());
                    userAccount.getWorkQueue().getWorkRequestList().add(request);
                    populateDonorTable();
                    populateRequestTable();
                    JOptionPane.showMessageDialog(null,new JLabel(  "<html><h2 color='green'>Work Request added successfully</h2></html>"), "Success", JOptionPane.INFORMATION_MESSAGE);
                }
                else {
                        JOptionPane.showMessageDialog(null, "Sorry, organization is not present", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            else if(donor.getStatus().equals("Donor assigned to Hospital"))
            {
                JOptionPane.showMessageDialog(null,new JLabel(  "<html><h2 color='green'>Donor is already assigned to Hospital</h2></html>"), "Error", JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                JOptionPane.showMessageDialog(null, new JLabel(  "<html><h2 color='green'>Donor is not Portal Admin Approved!</h2></html>"), "Error", JOptionPane.ERROR_MESSAGE);
            }
             
        }
        dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_btnAssignActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssign;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tableDHAssignment;
    private javax.swing.JTable tableDonor;
    private javax.swing.JTable tableHospital;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.PathologistRole;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.PathologistOrganization;
import Business.Person.Donor;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.LabTestWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raunak
 */
public class PathologistWorkRequestJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    LabTestWorkRequest request;
    private EcoSystem system;
    private UserAccount userAccount;
    private PathologistOrganization pathologistOrganization;
    private Enterprise enterprise;
    private Network network;
    private Enterprise enterprise1;
    private Organization organ;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    /**
     * Creates new form ProcessWorkRequestJPanel
     */
    public PathologistWorkRequestJPanel(EcoSystem system, UserAccount userAccount, PathologistOrganization pathologistOrganization, Enterprise enterprise, Network network) {
    
          initComponents();
        this.userProcessContainer = userProcessContainer;
        this.request = request;
        this.pathologistOrganization = pathologistOrganization;
        this.enterprise = enterprise;
        this.system = system;
        this.userAccount = userAccount;
        this.network = network;
        
        populateWorkRequestDonorTable();
        populateAssignedToPathologistDonorTable();
       
    }

     public void populateWorkRequestDonorTable(){
        DefaultTableModel model = (DefaultTableModel)tableDonor.getModel();
        
        model.setRowCount(0);
        
        for(WorkRequest wr : pathologistOrganization.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[6];
            row[0] = wr;            
            row[1] = wr.getDonor().getBloodGroup();
            row[2] = wr.getSummary();
            row[3] = wr.getStatus();
            row[4] = wr.getDonor().getEmailID();
            row[5] = wr.getRequestDate();
            
            model.addRow(row);
        }
    }
     
      public void populateAssignedToPathologistDonorTable(){
        DefaultTableModel model = (DefaultTableModel)tablePathologistDonors.getModel();
        
        model.setRowCount(0);
        
        for(WorkRequest wr : userAccount.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[6];
          
            row[0] = wr;
            row[1] = wr.getDonor().getName();
            row[2] = wr.getDonor().getBloodGroup();
            row[3] = wr.getUserAccount().getUsername();
            row[4] = wr.getStatus();
             
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
        tableDonor = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablePathologistDonors = new javax.swing.JTable();
        btnAssign = new javax.swing.JButton();
        btnProcess = new javax.swing.JButton();
        donate = new javax.swing.JButton();
        add = new javax.swing.JButton();
        discard = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));

        jScrollPane1.setForeground(new java.awt.Color(102, 0, 0));

        tableDonor.setBackground(new java.awt.Color(153, 153, 153));
        tableDonor.setFont(new java.awt.Font("Kefa", 1, 14)); // NOI18N
        tableDonor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Donor Name", "Donor BloodGroup", "Summary", "Status", "EmailID", "Requested Date"
            }
        ));
        jScrollPane1.setViewportView(tableDonor);

        jScrollPane2.setForeground(new java.awt.Color(102, 0, 0));

        tablePathologistDonors.setBackground(new java.awt.Color(153, 153, 153));
        tablePathologistDonors.setFont(new java.awt.Font("Kefa", 1, 14)); // NOI18N
        tablePathologistDonors.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Donor ID", "Donor Name", "Blood Group", "Username", "Status"
            }
        ));
        jScrollPane2.setViewportView(tablePathologistDonors);

        btnAssign.setBackground(new java.awt.Color(153, 153, 153));
        btnAssign.setFont(new java.awt.Font("Kefa", 1, 14)); // NOI18N
        btnAssign.setForeground(new java.awt.Color(102, 0, 0));
        btnAssign.setText("Assign to me");
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });

        btnProcess.setBackground(new java.awt.Color(153, 153, 153));
        btnProcess.setFont(new java.awt.Font("Kefa", 1, 14)); // NOI18N
        btnProcess.setForeground(new java.awt.Color(102, 0, 0));
        btnProcess.setText("Process Request");
        btnProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessActionPerformed(evt);
            }
        });

        donate.setBackground(new java.awt.Color(153, 153, 153));
        donate.setFont(new java.awt.Font("Kefa", 1, 14)); // NOI18N
        donate.setForeground(new java.awt.Color(102, 0, 0));
        donate.setText("Plasma Donated by Donor");
        donate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                donateActionPerformed(evt);
            }
        });

        add.setBackground(new java.awt.Color(153, 153, 153));
        add.setFont(new java.awt.Font("Kefa", 1, 14)); // NOI18N
        add.setForeground(new java.awt.Color(102, 0, 0));
        add.setText("Add Plasma to Bank");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        discard.setBackground(new java.awt.Color(153, 153, 153));
        discard.setFont(new java.awt.Font("Kefa", 1, 14)); // NOI18N
        discard.setForeground(new java.awt.Color(102, 0, 0));
        discard.setText("Discard Plasma ");
        discard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                discardActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Kefa", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 0));
        jLabel1.setText("Pathologist Organization");

        jButton1.setBackground(new java.awt.Color(153, 153, 153));
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(356, 356, 356)
                        .addComponent(btnAssign, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(181, 181, 181)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(donate, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnProcess, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(64, 64, 64)
                                .addComponent(discard, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {add, btnProcess, discard, donate});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(60, 60, 60)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAssign)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnProcess, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(donate, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(discard, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(201, 201, 201))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {add, btnAssign, btnProcess, discard, donate});

    }// </editor-fold>//GEN-END:initComponents

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed
        // TODO add your handling code here:
        
        int selectedDonor = tableDonor.getSelectedRow();
        
        if (selectedDonor < 0){
         
            JOptionPane.showMessageDialog(null, new JLabel(  "<html><h2>Please select<font color='red'> a row</font> from the<font color='green'> Work request donor table</font></h2></html>"), "Warning", JOptionPane.WARNING_MESSAGE);   
            return;
        }
        
        else{
        WorkRequest request = (WorkRequest) tableDonor.getValueAt(selectedDonor, 0);

        if(request.getStatus().equals("Assigned to Hospital"))
        { 
            request.setStatus("Assigned to Pathologist");
            request.setSummary("Donor assigned to Pathologist"+ userAccount.getUsername());
            request.setUserAccount(userAccount);
            userAccount.getWorkQueue().getWorkRequestList().add(request);
            request.setRequestDate(new Date());
            JOptionPane.showMessageDialog(null, new JLabel(  "<html><h2 color='green'>Donor assigned to Pathologist"+ userAccount.getUsername()+"</h2></html>"), "Success", JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            
            JOptionPane.showMessageDialog(null, new JLabel(  "<html><h2 color='yellow'>Work Request for donor is already in progress!</h2></html>"), "Warning", JOptionPane.WARNING_MESSAGE);
                
        }
        
        dB4OUtil.storeSystem(system);
        
        
        populateWorkRequestDonorTable();
        populateAssignedToPathologistDonorTable();
        }
    }//GEN-LAST:event_btnAssignActionPerformed

    private void btnProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessActionPerformed
        // TODO add your handling code here:
        
         int selectedDonor = tablePathologistDonors.getSelectedRow();
        
        if (selectedDonor < 0){
              JOptionPane.showMessageDialog(null, new JLabel(  "<html><h2>Please select<font color='red'> a row</font> from the<font color='green'>  donor table</font></h2></html>"), "Warning", JOptionPane.WARNING_MESSAGE);   
            
            return;
        }
        else
        {               
        WorkRequest request = (WorkRequest)tablePathologistDonors.getValueAt(selectedDonor, 0);
      
        if(request.getStatus().contains("Assigned to Pathologist")){
             
            request.setSummary("Donor sample request processed.");
            JOptionPane.showMessageDialog(null, new JLabel(  "<html><h2 color='green'>Process request accepted by the pathlogist</h2></html>"), "Success", JOptionPane.INFORMATION_MESSAGE);

        }
        else{
            
            JOptionPane.showMessageDialog(null, new JLabel(  "<html><h2>Work Request is<font color='red'> already</font> in progress!</h2></html>"), "Warning", JOptionPane.WARNING_MESSAGE);

            }
        }
        dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_btnProcessActionPerformed

    private void donateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_donateActionPerformed
        // TODO add your handling code here:
        int selectedRow = tablePathologistDonors.getSelectedRow();
  
        if (selectedRow < 0){
            
            JOptionPane.showMessageDialog(null, new JLabel(  "<html><h2>Please select<font color='red'> a row</font> from the<font color='green'>  donor table</font></h2></html>"), "Warning", JOptionPane.WARNING_MESSAGE);   
            return;
        }
        
        else{
        WorkRequest wr = (WorkRequest)tableDonor.getValueAt(selectedRow, 0);
               
                wr.setStatus("Plasma Donated");
                wr.setSummary("Donor sample is dobated.");           
                wr.setRequestDate(new Date());
               
                dB4OUtil.storeSystem(system);
                
                populateWorkRequestDonorTable();
                populateAssignedToPathologistDonorTable();
                
                JOptionPane.showMessageDialog(null, new JLabel("<html><h2><font color='blue'>Plasma Donated successfully!</font></h2></html>"));
           
        for(Donor dnr: system.getDonorDirectory().getDonorList()){
            if(dnr.getId().equals(wr.getDonor().getId())){
                dnr.setStatus("Plasma Donated");
                JOptionPane.showMessageDialog(null, new JLabel("<html><h2><font color='blue'>Donor status changes successfully!</font></h2></html>"));
            }
        }

        }
        dB4OUtil.storeSystem(system);
        
    }//GEN-LAST:event_donateActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
        

//        for(Enterprise ent : network.getEnterpriseDirectory().getEnterpriseList()){
//              if(ent.getEnterpriseType().toString().equals("PlasmaBank")){
//                  enterprise1 = ent;           
//              }
//        }  
//        for (Organization org: enterprise1.getOrganizationDirectory().getOrganizationList()){
//              System.out.println(org.getClass().getTypeName().toString()+" asit");
//              if(org.getClass().getTypeName().toString().equals("Business.Organization.PlasmaBankOrganization")){
//                 organ =org;
//              }
//        }
                
        int selectedRow = tablePathologistDonors.getSelectedRow();
        
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, new JLabel(  "<html><h2><I>Kindly select a<font color='red'> row!</font><I></h2></html>"), "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        else{
        WorkRequest request = (WorkRequest)tablePathologistDonors.getValueAt(selectedRow, 0);
                request.setStatus("Plasma added to Bank");
                request.setSummary("Plasma sample added to the Plasma Bank successfully!");      
                dB4OUtil.storeSystem(system);
                
                populateWorkRequestDonorTable();
                populateAssignedToPathologistDonorTable();
            
                JOptionPane.showMessageDialog(null, new JLabel(  "<html><h2 color='blue'>Plasma added to the bank successfully!</h2></html>"));
           
        }
         dB4OUtil.storeSystem(system);
         
    }//GEN-LAST:event_addActionPerformed

    private void discardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_discardActionPerformed
        // TODO add your handling code here:
        
        int selectedRow = tablePathologistDonors.getSelectedRow();
        if (selectedRow < 0){
             JOptionPane.showMessageDialog(null, new JLabel(  "<html><h2><I>Please select<font color='red'> a row</font> from the<font color='green'> table</I></font></h2></html>"), "Warning", JOptionPane.WARNING_MESSAGE);
            
            return;
        }
        else
        {  
        WorkRequest request = (WorkRequest)tablePathologistDonors.getValueAt(selectedRow, 0);
                request.setStatus("Plasma Discarded");
                 request.setSummary("Plasma sample discarded!");      
                populateWorkRequestDonorTable();
                populateAssignedToPathologistDonorTable();
                JOptionPane.showMessageDialog(null, new JLabel("<html><h2 color='red'>Plasma sample is Discarded!</h2></html>"));  
               
        dB4OUtil.storeSystem(system);
        }
    }//GEN-LAST:event_discardActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton btnAssign;
    private javax.swing.JButton btnProcess;
    private javax.swing.JButton discard;
    private javax.swing.JButton donate;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableDonor;
    private javax.swing.JTable tablePathologistDonors;
    // End of variables declaration//GEN-END:variables
}

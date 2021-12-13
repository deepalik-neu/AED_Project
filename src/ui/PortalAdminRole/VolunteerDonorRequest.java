/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

package ui.PortalAdminRole;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Person.Donor;
import Business.Person.DonorRequest;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author namita
 */
public class VolunteerDonorRequest extends javax.swing.JPanel {

    JPanel userProcessContainer;
    private  EcoSystem system;
  private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    /** Creates new form VolunteerDonorRequest */
    public VolunteerDonorRequest(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        this.system=system;
        this.userProcessContainer=userProcessContainer;
        populateTable();
    }
    
    private void populateTable(){
                DefaultTableModel table = (DefaultTableModel) tableDonorRequest.getModel();
        
        table.setRowCount(0);
          
        for(DonorRequest dnr : system.getDonorRequestDirectory().getDnrList()){
            System.out.println("PRINITNG IT HERE in Volunteer !!");
            System.out.println(dnr.getName());
        }
        
         for(DonorRequest donorRequest: system.getDonorRequestDirectory().getDnrList()){            
            Object row[] = new Object[12];
            row[0]= donorRequest;
            row[1]= donorRequest.getName();
            row[2]= donorRequest.getEmailID();
            row[3]= donorRequest.getStatus();
            row[4]= donorRequest.getAge();
            row[5]= donorRequest.getBloodGroup();
            row[6]= donorRequest.getContact();
            row[7]= donorRequest.getAddress();
            row[8]= donorRequest.getCovidDiagnosisDate();
            row[9]= donorRequest.getCovidCuredDate();
            row[10]= donorRequest.getStatus();
            row[11]= donorRequest.getSymptoms();
            
              
            table.addRow(row);
        }   
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableDonorRequest = new javax.swing.JTable();
        btnReject = new javax.swing.JButton();
        btnApprove = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 238, 238));

        jLabel1.setFont(new java.awt.Font("Kefa", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 0));
        jLabel1.setText("Manage Donor Request");

        tableDonorRequest.setFont(new java.awt.Font("Kefa", 1, 14)); // NOI18N
        tableDonorRequest.setForeground(new java.awt.Color(102, 0, 0));
        tableDonorRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Donor ID", "Name", "EmailID", "Status", "Age", "Blood Group", "Contact", "Address", "Covid Diagnosed Date", "Covid Cured Date", "Symptoms"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableDonorRequest);

        btnReject.setBackground(new java.awt.Color(255, 255, 255));
        btnReject.setFont(new java.awt.Font("Kefa", 1, 14)); // NOI18N
        btnReject.setForeground(new java.awt.Color(102, 0, 0));
        btnReject.setText("Reject");
        btnReject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejectActionPerformed(evt);
            }
        });

        btnApprove.setBackground(new java.awt.Color(255, 255, 255));
        btnApprove.setFont(new java.awt.Font("Kefa", 1, 14)); // NOI18N
        btnApprove.setForeground(new java.awt.Color(102, 0, 0));
        btnApprove.setText("Approve");
        btnApprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApproveActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setFont(new java.awt.Font("Kefa", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(102, 0, 0));
        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon("/Users/namita/Desktop/Images for AED Project/8.jpeg")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(btnBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(277, 277, 277)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 966, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(263, 263, 263)
                        .addComponent(btnApprove)
                        .addGap(136, 136, 136)
                        .addComponent(btnReject, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnApprove)
                    .addComponent(btnReject))
                .addGap(43, 43, 43)
                .addComponent(btnBack)
                .addGap(60, 60, 60))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnApproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApproveActionPerformed
        // TODO add your handling code here:
         int selectedRow = tableDonorRequest.getSelectedRow();
        populateRequestDetails((DonorRequest) tableDonorRequest.getValueAt(selectedRow, 0));
    }//GEN-LAST:event_btnApproveActionPerformed

    private void btnRejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejectActionPerformed
        // TODO add your handling code here:
        
        int selectedRow = tableDonorRequest.getSelectedRow();
        DonorRequest req= (DonorRequest)tableDonorRequest.getValueAt(selectedRow, 0);
        
//        if( !req.getStatus().equals("New Request"))
//        {
//            //JOptionPane.showMessageDialog(null,"Can Not Approve the Request!");
//         JOptionPane.showMessageDialog(null, new JLabel(  "<html><h2><I>Request<font color='red'> can not</font> be accepted. Please check!</I></h2></html>"), "Warning", JOptionPane.WARNING_MESSAGE);
//           
//        
//        }
//       else{
        for(DonorRequest donorRequest: system.getDonorRequestDirectory().getDnrList()){            
        
            //if(donorRequest.getName().equals(req.getStatus())){
          
            donorRequest.setStatus("Rejected");
            //}
    }
        dB4OUtil.storeSystem(system);
        populateTable();
        
        JOptionPane.showMessageDialog(null, new JLabel("<html><h2><I>Request has been<font color='red'> rejected</font>!</I></h2></html>"));
        
        //JOptionPane.showMessageDialog(null,"Rejected the Request!");
        //}
       dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_btnRejectActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

private void populateRequestDetails(DonorRequest donorRequest){
//    if( !donorRequest.getStatus().equals("New Request"))
//        {
//            //JOptionPane.showMessageDialog(null,"Can Not Approve the Request!");
//         JOptionPane.showMessageDialog(null, new JLabel(  "<html><h2><I>Request<font color='red'> can not</font> be approved!</I></h2></html>"), "Warning", JOptionPane.WARNING_MESSAGE);
//           
//        
//        }
//        
//        else
//        {
            System.out.println("check approved"+donorRequest.getAge());
        Donor donor = system.getDonorDirectory().addDonor();  
        donor.setId(donorRequest.getId()); 
        donor.setName(donorRequest.getName()); 
       
        donor.setCovidDiagnosisDate(donorRequest.getCovidDiagnosisDate()); 
        donor.setCovidCuredDate(donorRequest.getCovidCuredDate()); 
     
               
        donor.setAge(donorRequest.getAge()); // Age
        donor.setGender(donorRequest.getGender()); // gender
        donor.setBloodGroup(donorRequest.getBloodGroup()); // Blood group
        donor.setAddress(donorRequest.getAddress()); // streetAddress
       
        donor.setContact(donorRequest.getContact()); // contact
        donor.setEmailID(donorRequest.getEmailID()); // emailID
        donor.setStatus("Portal Admin Approved"); // status
    
       
        donor.setSymptoms(donorRequest.getSymptoms()); //  symptoms
       
           
//        for(DonorRequest dnrRequest: system.getDonorRequestDirectory().getDonorRequestList()){            
//        
//            if(dnrRequest.getDonarId().equals(donorRequest.getDonarId())){
//            //dnrRequest.setStatus("Portal Admin Approved");
//           // dB4OUtil.storeSystem(system);
//            }
//        }
     
        
        dB4OUtil.storeSystem(system);
        //populateTable();
        
         JOptionPane.showMessageDialog(null, new JLabel(  "<html><h2><I>Request<font color='green'> approved</font> successfully!</I></h2></html>"));
           
         JOptionPane.showMessageDialog(null,"Request Approved. New Donor added!");
        
        
        //}
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApprove;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnReject;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableDonorRequest;
    // End of variables declaration//GEN-END:variables

}

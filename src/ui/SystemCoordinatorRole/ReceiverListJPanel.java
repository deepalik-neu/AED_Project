/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.SystemCoordinatorRole;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.DoctorOrganization;
import Business.Organization.Organization;
import Business.Organization.SystemCoordinatorOrganization;
import Business.Person.PatientDirectory;
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
public class ReceiverListJPanel extends javax.swing.JPanel {
    private PatientDirectory patientDirectory;
    private UserAccount userAccount;
    private EcoSystem system;
    private Network network;
    private SystemCoordinatorOrganization systemCoOrganization;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    private JPanel userProcessContainer;
    /**
     * Creates new form ReceiverJPanel
     */
    public ReceiverListJPanel(JPanel userProcessContainer,UserAccount userAccount,EcoSystem system,Network network,SystemCoordinatorOrganization systemCoOrganization) {
        initComponents();
        this.userAccount=userAccount;
        this.system=system;
        this.network=network;
        this.userProcessContainer=userProcessContainer;
        this.systemCoOrganization=systemCoOrganization;
        
        populateReciverRequestTable();
        populateHospitalTable();
    }
private void populateHospitalTable(){
        
        DefaultTableModel dtm = (DefaultTableModel) tblHospital.getModel();
        dtm.setRowCount(0);
        
        System.out.println("list of enterprises:");
       // System.out.println(enterpriseDirectory.getEnterpriseList());
        System.out.println("list of enterprises ends");
        System.out.println(network.getName());
        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()){
            if(enterprise.getEnterpriseType().toString().equals("Hospital")){
                System.out.println("Hosp");
                Object[] row = new Object[2];
                row[0] = enterprise;
                row[1] = enterprise.getName();
                
                dtm.addRow(row);
        }
        }       
        }
    
     public void populateReciverRequestTable(){
        DefaultTableModel model = (DefaultTableModel)tblReciever.getModel();
        
        model.setRowCount(0);
        
        for(WorkRequest request : systemCoOrganization.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[6];
            row[0] = request.getPatient();
            row[1] = request.getSummary();
            row[2] = request.getPatient().getName();
           // row[3] = request.getEnterprise();
            row[3] = request.getStatus();
            row[4] = request.getPatient().getStatus(); //check status
            
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblReciever = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblHospital = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Kefa", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 0));
        jLabel1.setText("Connect Receiver to Hospital");

        tblReciever.setBackground(new java.awt.Color(255, 204, 204));
        tblReciever.setForeground(new java.awt.Color(102, 0, 51));
        tblReciever.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Summary", "Name", "Request Status", "Patient Status"
            }
        ));
        jScrollPane1.setViewportView(tblReciever);

        jLabel2.setFont(new java.awt.Font("Kefa", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 0));
        jLabel2.setText("Receivers in need of Plasma");

        tblHospital.setBackground(new java.awt.Color(255, 204, 204));
        tblHospital.setForeground(new java.awt.Color(102, 0, 51));
        tblHospital.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Hospital Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblHospital);

        jLabel3.setFont(new java.awt.Font("Kefa", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 0));
        jLabel3.setText("Assign Receiver to Hospital");

        jButton1.setBackground(new java.awt.Color(255, 204, 204));
        jButton1.setFont(new java.awt.Font("Kefa", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 0, 51));
        jButton1.setText("Assign");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 204, 204));
        jButton2.setFont(new java.awt.Font("Kefa", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(102, 0, 51));
        jButton2.setText("<<Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(319, 319, 319)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 799, Short.MAX_VALUE)
                                .addComponent(jScrollPane2))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jButton2)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addContainerGap(31, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         int rcr = tblReciever.getSelectedRow();
        int hosp = tblHospital.getSelectedRow();
        if (rcr < 0) {
            //JOptionPane.showMessageDialog(null, "Please select a row from the Request table", "Warning", JOptionPane.WARNING_MESSAGE);
            //return;
            JOptionPane.showMessageDialog(null, new JLabel(  "<html><h2><I>Please select<font color='red'> a row</font> from the<font color='green'> Request Table</I></font></h2></html>"), "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (hosp < 0) {
            //JOptionPane.showMessageDialog(null, "Please select a row from the Hospital table", "Warning", JOptionPane.WARNING_MESSAGE);
            //return;
            JOptionPane.showMessageDialog(null, new JLabel(  "<html><h2><I>Please select<font color='red'> a row</font> from the<font color='green'> Hospital Table</I></font></h2></html>"), "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        else{
            WorkRequest request = (WorkRequest)tblReciever.getValueAt(rcr, 0);   
            if(request.getStatus().equals("PlasmaBank Approved. Passing to System Coordinator")){
                    
                    request.setEnterprise((Enterprise) tblHospital.getValueAt(hosp, 0));
                    request.setStatus("Assigned in Doctor Pool");
                    
                    dB4OUtil.storeSystem(system);
                    populateReciverRequestTable();
                    
                    
                    Organization org = null;
                    Enterprise enterprise = (Enterprise) tblHospital.getValueAt(hosp, 0);
                    for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                            if (organization instanceof DoctorOrganization) {
                                org = organization;
                                break;
                            }
                    }
                    if (org != null) {
                        org.getWorkQueue().getWorkRequestList().add(request);
                        System.out.println(org.getName());
                        userAccount.getWorkQueue().getWorkRequestList().add(request);
                        JOptionPane.showMessageDialog(null,
                                new JLabel(  "<html><h2><I>Patient successfully<font color='green'> assigned</font> to the Hospital.</I></h2></html>"), 
                                 "Info", JOptionPane.INFORMATION_MESSAGE);
                        populateReciverRequestTable();
                    }
                    else {
                    JOptionPane.showMessageDialog(null, "No organization present", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }   
            else{
                JOptionPane.showMessageDialog(null, new JLabel(  "<html><h2><I>Work Request is<font color='red'> already</font> in progress!</I></h2></html>"), "Warning", JOptionPane.WARNING_MESSAGE);
                }
        
        }
        dB4OUtil.storeSystem(system);
        populateReciverRequestTable();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblHospital;
    private javax.swing.JTable tblReciever;
    // End of variables declaration//GEN-END:variables
}

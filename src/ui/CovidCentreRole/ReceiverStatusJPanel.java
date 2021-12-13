/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.CovidCentreRole;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Person.Patient;
import Business.Person.PatientRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author namita
 */
public class ReceiverStatusJPanel extends javax.swing.JPanel {

       private EcoSystem system;
      private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
      private JPanel userProcessContainer;

    /**
     * Creates new form ReceiverStatusJPanel
     */
    public ReceiverStatusJPanel(JPanel userProcessContainer,EcoSystem system) {
        initComponents();
        this.system = system;
        this.userProcessContainer=userProcessContainer;
        populateTable();
        populateTable1();
    }
    
      private void populateTable(){
        DefaultTableModel dtm = (DefaultTableModel) tablePatient.getModel();
        
        dtm.setRowCount(0);
        
         for(Patient patient: system.getPatientDirectory().getPatientList())
         {            
            Object row[] = new Object[7];
            row[0]= patient.getPatientID();
            row[1]=patient.getName();
            row[2]=patient.getContact();
            row[3]=patient.getEmailID();
            row[4]=patient.getStatus();
            row[5]=patient.getGender();
            row[6]=patient.getBloodGroup();
              
            dtm.addRow(row);
         }
    }
    
     private void populateTable1(){
        DefaultTableModel dtm = (DefaultTableModel) tablePatientRequest.getModel();
        
        dtm.setRowCount(0);
        
         for(PatientRequest patient: system.getPatientRequestDirectory().getPrList())
         {            
            Object row[] = new Object[7];
            row[0]= patient.getPatientID();
            row[1]=patient.getName();
            row[2]=patient.getContact();
            row[3]=patient.getEmailID();
            row[4]=patient.getStatus();
            row[5]=patient.getGender();
            row[6]=patient.getBloodGroup();
              
            dtm.addRow(row);
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
        tablePatientRequest = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablePatient = new javax.swing.JTable();
        btnDelete = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        backJButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 153, 153));

        tablePatientRequest.setBackground(new java.awt.Color(255, 204, 204));
        tablePatientRequest.setFont(new java.awt.Font("Kefa", 1, 14)); // NOI18N
        tablePatientRequest.setForeground(new java.awt.Color(102, 0, 0));
        tablePatientRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Contact", "Email ID", "Status", "Gender", "Blood Group"
            }
        ));
        jScrollPane1.setViewportView(tablePatientRequest);

        tablePatient.setBackground(new java.awt.Color(255, 204, 204));
        tablePatient.setFont(new java.awt.Font("Kefa", 1, 14)); // NOI18N
        tablePatient.setForeground(new java.awt.Color(102, 0, 0));
        tablePatient.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Contact", "Email ID", "Status", "Gender", "Blood Group"
            }
        ));
        jScrollPane2.setViewportView(tablePatient);

        btnDelete.setBackground(new java.awt.Color(255, 204, 204));
        btnDelete.setFont(new java.awt.Font("Kefa", 1, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(102, 0, 0));
        btnDelete.setText("Delete");

        jLabel1.setFont(new java.awt.Font("Kefa", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 51));
        jLabel1.setText("Receiver Status");

        backJButton2.setBackground(new java.awt.Color(255, 204, 204));
        backJButton2.setFont(new java.awt.Font("Kefa", 1, 14)); // NOI18N
        backJButton2.setForeground(new java.awt.Color(102, 0, 0));
        backJButton2.setText("<< Back");
        backJButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(backJButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(445, 445, 445)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(346, 346, 346)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 877, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 877, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(148, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addComponent(backJButton2)
                .addGap(14, 14, 14))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButton2ActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton2;
    private javax.swing.JButton btnDelete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablePatient;
    private javax.swing.JTable tablePatientRequest;
    // End of variables declaration//GEN-END:variables
}

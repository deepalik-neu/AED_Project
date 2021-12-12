/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.CovidCentreRole;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Person.Patient;
import Business.Person.PatientRequest;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author namita
 */
public class ReceiverStatusJPanel extends javax.swing.JPanel {

       private EcoSystem system;
      private DB4OUtil dB4OUtil = DB4OUtil.getInstance();

    /**
     * Creates new form ReceiverStatusJPanel
     */
    public ReceiverStatusJPanel(EcoSystem system) {
        initComponents();
        this.system = system;
        populateTable();
        populateTable1();
    }
    
      private void populateTable(){
        DefaultTableModel dtm = (DefaultTableModel) tablePatient.getModel();
        
        dtm.setRowCount(0);
        
         for(Patient patient: system.getPatientDirectory().getPatientList())
         {            
            Object row[] = new Object[4];
            row[0]= patient;
            row[1]=patient.getName();
            row[2]=patient.getContact();
            row[3]=patient.getStatus();
              
            dtm.addRow(row);
         }
    }
    
     private void populateTable1(){
        DefaultTableModel dtm = (DefaultTableModel) tablePatientRequest.getModel();
        
        dtm.setRowCount(0);
        
         for(PatientRequest patient: system.getPatientRequestDirectory().getPatientRequestList())
         {            
            Object row[] = new Object[4];
            row[0]= patient;
            row[1]=patient.getName();
            row[2]=patient.getContact();
            row[3]=patient.getStatus();
              
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

        setBackground(new java.awt.Color(255, 255, 255));

        tablePatientRequest.setBackground(new java.awt.Color(255, 204, 204));
        tablePatientRequest.setFont(new java.awt.Font("Kefa", 1, 14)); // NOI18N
        tablePatientRequest.setForeground(new java.awt.Color(102, 0, 0));
        tablePatientRequest.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablePatientRequest);

        tablePatient.setBackground(new java.awt.Color(255, 204, 204));
        tablePatient.setFont(new java.awt.Font("Kefa", 1, 14)); // NOI18N
        tablePatient.setForeground(new java.awt.Color(102, 0, 0));
        tablePatient.setModel(new javax.swing.table.DefaultTableModel(
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(337, 337, 337))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(backJButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 877, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 877, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(445, 445, 445)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(148, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(backJButton2)
                .addGap(14, 14, 14))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButton2ActionPerformed

    }//GEN-LAST:event_backJButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton backJButton1;
    private javax.swing.JButton backJButton2;
    private javax.swing.JButton btnDelete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablePatient;
    private javax.swing.JTable tablePatientRequest;
    // End of variables declaration//GEN-END:variables
}
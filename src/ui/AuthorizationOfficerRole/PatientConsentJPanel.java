/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ui.AuthorizationOfficerRole;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.PlasmaBankOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import HomePages.TableFormat;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Properties;
import javax.imageio.ImageIO;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Akshay
 */
public class PatientConsentJPanel extends javax.swing.JPanel {

    /** Creates new form PatientConsentJPanel */
    private EcoSystem system;
    private UserAccount userAccount;
    private Network network;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    
    public PatientConsentJPanel(EcoSystem system, UserAccount userAccount, Network network) {
        initComponents();
        this.system = system;
        this.userAccount = userAccount;
        this.network = network;
        tblPatientConsent.getTableHeader().setDefaultRenderer(new TableFormat());
        populatePatientConsentTable();
    }

    

    public void populatePatientConsentTable(){
        DefaultTableModel model = (DefaultTableModel)tblPatientConsent.getModel();
        
        model.setRowCount(0);
        
        for(WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()){
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
    
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblPatientConsent = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        btnSi8gn = new javax.swing.JButton();
        btnApproval = new javax.swing.JButton();
        btnDisapproval = new javax.swing.JButton();
        btnConsentForm = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        toTextField = new javax.swing.JTextField();
        fromTextField = new javax.swing.JTextField();
        subjectTextField = new javax.swing.JTextField();
        messageTextField = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        lblConsent = new javax.swing.JLabel();
        btnPatientAgreement = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(208, 93, 2));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblPatientConsent.setBackground(new java.awt.Color(0, 0, 0));
        tblPatientConsent.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        tblPatientConsent.setForeground(new java.awt.Color(255, 255, 255));
        tblPatientConsent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Request Number", "Patient ID", "Patient Name", "Patient email", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPatientConsent.setFocusable(false);
        tblPatientConsent.setGridColor(new java.awt.Color(0, 0, 0));
        tblPatientConsent.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tblPatientConsent.setRowHeight(30);
        tblPatientConsent.setShowVerticalLines(false);
        jScrollPane1.setViewportView(tblPatientConsent);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 1330, 220));

        jButton1.setBackground(new java.awt.Color(31, 31, 31));
        jButton1.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Send Consent Form On email");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 610, 300, 40));

        btnSi8gn.setBackground(new java.awt.Color(31, 31, 31));
        btnSi8gn.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnSi8gn.setForeground(new java.awt.Color(255, 255, 255));
        btnSi8gn.setText("Sign the form");
        btnSi8gn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSi8gn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSi8gnActionPerformed(evt);
            }
        });
        add(btnSi8gn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 690, 150, 40));

        btnApproval.setBackground(new java.awt.Color(31, 31, 31));
        btnApproval.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnApproval.setForeground(new java.awt.Color(255, 255, 255));
        btnApproval.setText("Give Legal Approval");
        btnApproval.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnApproval.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApprovalActionPerformed(evt);
            }
        });
        add(btnApproval, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 690, 210, 40));

        btnDisapproval.setBackground(new java.awt.Color(31, 31, 31));
        btnDisapproval.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnDisapproval.setForeground(new java.awt.Color(255, 255, 255));
        btnDisapproval.setText("Disapprove ");
        btnDisapproval.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDisapproval.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisapprovalActionPerformed(evt);
            }
        });
        add(btnDisapproval, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 690, 140, 40));

        btnConsentForm.setBackground(new java.awt.Color(31, 31, 31));
        btnConsentForm.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnConsentForm.setForeground(new java.awt.Color(255, 255, 255));
        btnConsentForm.setText("Display Consent Form");
        btnConsentForm.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnConsentForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsentFormActionPerformed(evt);
            }
        });
        add(btnConsentForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 360, 250, 40));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("To:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("From:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 430, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Subject:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 480, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Message: ");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 540, -1, -1));

        toTextField.setBackground(new java.awt.Color(0, 0, 0));
        toTextField.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        toTextField.setForeground(new java.awt.Color(255, 255, 255));
        add(toTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, 290, 40));

        fromTextField.setBackground(new java.awt.Color(0, 0, 0));
        fromTextField.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        fromTextField.setForeground(new java.awt.Color(255, 255, 255));
        fromTextField.setText("aedprojecttitans@gmail.com");
        add(fromTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 420, 290, 40));

        subjectTextField.setBackground(new java.awt.Color(0, 0, 0));
        subjectTextField.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        subjectTextField.setForeground(new java.awt.Color(255, 255, 255));
        add(subjectTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 470, 290, 40));

        messageTextField.setBackground(new java.awt.Color(0, 0, 0));
        messageTextField.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        messageTextField.setForeground(new java.awt.Color(255, 255, 255));
        messageTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                messageTextFieldActionPerformed(evt);
            }
        });
        add(messageTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 520, 290, 130));

        jPanel3.setBackground(new java.awt.Color(31, 31, 31));
        jPanel3.setPreferredSize(new java.awt.Dimension(926, 70));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Treatment Consent Letter Status");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 1566, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1590, -1));

        lblConsent.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 255, 204)));
        add(lblConsent, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 420, 230, 250));

        btnPatientAgreement.setBackground(new java.awt.Color(31, 31, 31));
        btnPatientAgreement.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnPatientAgreement.setForeground(new java.awt.Color(255, 255, 255));
        btnPatientAgreement.setText("Patient Agreement");
        btnPatientAgreement.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPatientAgreement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPatientAgreementActionPerformed(evt);
            }
        });
        add(btnPatientAgreement, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 359, 230, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/legal.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 430, 130, 130));
    }// </editor-fold>//GEN-END:initComponents

    private void btnApprovalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApprovalActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblPatientConsent.getSelectedRow();
        
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, new JLabel(  "<html><h2><I>Please select<font color='red'> a row</font> from the<font color='green'> table</I></font></h2></html>"), "Warning", JOptionPane.WARNING_MESSAGE);
           
           // JOptionPane.showMessageDialog(null,"Please select a row", "Info", JOptionPane.INFORMATION_MESSAGE);
            
            return;
        }
        else{
        WorkRequest request = (WorkRequest)tblPatientConsent.getValueAt(selectedRow, 0);
      
        request.setStatus("Legally Approved. Passing to PlasmaBank");
        //request.setUserAccount(userAccount);
        //userAccount.getWorkQueue().getWorkRequestList().add(request);
        dB4OUtil.storeSystem(system);
        populatePatientConsentTable();
        
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        //System.out.println("Preparing to send message ..");
      
       String toEmail = toTextField.getText();
//       String toEmail = "yashwant7kotipalli@gmail.com";
//       final String fromEmail = "yashwant7kotipalli@gmail.com";
       final String fromEmail = fromTextField.getText();
       final String fromEmailPassword = "teamtitans"; //your email password
       String subject = subjectTextField.getText();
        
        Properties properties = new Properties();
        properties.put("mail.smtp.starttls.enable","true");
        properties.put("mail.smtp.EnableSSL.enable","true");
        properties.put("mail.smtp.host", "smtp.gmail.com"); 
        properties.put("mail.smtp.auth","true");
        properties.put("mail.debug", "true"); 
        properties.put("mail.smtp.host","smtp.gmail.com");
        properties.setProperty("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");   
        properties.setProperty("mail.smtp.socketFactory.fallback", "false");   
        properties.setProperty("mail.smtp.port", "465");   
        properties.setProperty("mail.smtp.socketFactory.port", "465"); 
        
        Session session = Session.getDefaultInstance(properties, new javax.mail.Authenticator() {
        protected PasswordAuthentication getPasswordAuthentication() {
            return new PasswordAuthentication(fromEmail, fromEmailPassword);
        }
       });
        
        try{
          MimeMessage message = new  MimeMessage(session);
          message.setFrom(new InternetAddress(fromEmail));
          message.addRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));
          message.setSubject(subject);
          message.setText(messageTextField.getText());
          Transport.send(message);
        }
        catch(Exception ex){
            System.out.println(""+ex);
        }
        
        System.out.println("Sent message successfully ...");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnConsentFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsentFormActionPerformed
        // TODO add your handling code here:
        BufferedImage img1 = null;
        try {
            img1 = ImageIO.read(new File("organ_Agreement.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Image dimg = img1.getScaledInstance(lblConsent.getWidth(), lblConsent.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon imageIcon = new ImageIcon(dimg);
        lblConsent.setIcon(imageIcon);
        
        
        
    }//GEN-LAST:event_btnConsentFormActionPerformed

    private void btnSi8gnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSi8gnActionPerformed
        // TODO add your handling code here:
        BufferedImage img1 = null;
        try {
            img1 = ImageIO.read(new File("organ_Agreement_DonorReceiverAdvocate.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Image dimg = img1.getScaledInstance(lblConsent.getWidth(), lblConsent.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon imageIcon = new ImageIcon(dimg);
        lblConsent.setIcon(imageIcon);
        
        
        
        
    }//GEN-LAST:event_btnSi8gnActionPerformed

    private void btnPatientAgreementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPatientAgreementActionPerformed
        // TODO add your handling code here:
        BufferedImage img1 = null;
        try {
            img1 = ImageIO.read(new File("organ_Agreement_Donor.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Image dimg = img1.getScaledInstance(lblConsent.getWidth(), lblConsent.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon imageIcon = new ImageIcon(dimg);
        lblConsent.setIcon(imageIcon);
        
    }//GEN-LAST:event_btnPatientAgreementActionPerformed

    private void messageTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_messageTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_messageTextFieldActionPerformed

    private void btnDisapprovalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisapprovalActionPerformed
        // TODO add your handling code here:
        
        int selectedRow = tblPatientConsent.getSelectedRow();
        
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, new JLabel(  "<html><h2><I>Please select<font color='red'> a row</font> from the<font color='green'> table</I></font></h2></html>"), "Warning", JOptionPane.WARNING_MESSAGE);
           
           // JOptionPane.showMessageDialog(null,"Please select a row", "Info", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        else{
        WorkRequest request = (WorkRequest)tblPatientConsent.getValueAt(selectedRow, 0);
      
        request.setStatus("Legally Disapproved");
        request.setUserAccount(userAccount);
        userAccount.getWorkQueue().getWorkRequestList().add(request);
       
        dB4OUtil.storeSystem(system);
        populatePatientConsentTable();
        JOptionPane.showMessageDialog(null, new JLabel("<html><h2><I><font color='red'> Legally Disapproved!</I></font></h2></html>"), "Info", JOptionPane.INFORMATION_MESSAGE);
           
        //JOptionPane.showMessageDialog(null,"Legally Disapproved", "Info", JOptionPane.INFORMATION_MESSAGE);
        
        }
        
    }//GEN-LAST:event_btnDisapprovalActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApproval;
    private javax.swing.JButton btnConsentForm;
    private javax.swing.JButton btnDisapproval;
    private javax.swing.JButton btnPatientAgreement;
    private javax.swing.JButton btnSi8gn;
    private javax.swing.JTextField fromTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblConsent;
    private javax.swing.JTextField messageTextField;
    private javax.swing.JTextField subjectTextField;
    private javax.swing.JTable tblPatientConsent;
    private javax.swing.JTextField toTextField;
    // End of variables declaration//GEN-END:variables

}
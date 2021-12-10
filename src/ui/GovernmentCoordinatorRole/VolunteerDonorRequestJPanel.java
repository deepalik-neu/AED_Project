/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.GovernmentCoordinatorRole;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.People.Donor;
import Business.People.DonorRequest;
import HomePages.TableFormat;
import java.awt.Color;
import java.awt.Image;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Akshay
 */
public class VolunteerDonorRequestJPanel extends javax.swing.JPanel {

  private  EcoSystem system;
  private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
  //private DonorRequest donorRequest;
  
    VolunteerDonorRequestJPanel(EcoSystem system) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        initComponents();
        this.system = system;
        
        requestTable.getTableHeader().setDefaultRenderer(new TableFormat());
        populateRequestTable();
     }
   
     
        private void populateRequestTable(){
        DefaultTableModel dtm = (DefaultTableModel) requestTable.getModel();
        
        dtm.setRowCount(0);
          
        for(DonorRequest dnr : system.getDonorRequestDirectory().getDonorRequestList()){
            System.out.println("PRINITNG IT HERE in Volunteer !!");
            System.out.println(dnr.getName());
        }
        
         for(DonorRequest donorRequest: system.getDonorRequestDirectory().getDonorRequestList()){            
            Object row[] = new Object[4];
            row[0]= donorRequest;
            row[1]= donorRequest.getName();
            row[2]= donorRequest.getContact();
            row[3]= donorRequest.getStatus();
              
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
        requestTable = new javax.swing.JTable();
        buttonApprove = new javax.swing.JButton();
        buttonReject = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        uidText = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ageText = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        genderText = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        streetText = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        bloodText = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        cityText = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        stateText = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        zipText = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        contactText = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        statusText = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        lastDaySymptomsText = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        nameText = new javax.swing.JTextField();
        buttonDetails = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        labConfirmationText = new javax.swing.JTextField();
        followUpTestText = new javax.swing.JTextField();
        symptomsText = new javax.swing.JTextField();
        lblProfilePicture = new javax.swing.JLabel();
        dobDateField = new com.toedter.calendar.JDateChooser();
        diagnosedDateField = new com.toedter.calendar.JDateChooser();
        curedDateField = new com.toedter.calendar.JDateChooser();
        lastDonationDateField = new com.toedter.calendar.JDateChooser();
        emailText = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(208, 93, 2));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        requestTable.setBackground(new java.awt.Color(0, 0, 0));
        requestTable.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        requestTable.setForeground(new java.awt.Color(255, 255, 255));
        requestTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "UID", "Name", "Contact", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        requestTable.setFocusable(false);
        requestTable.setGridColor(new java.awt.Color(0, 0, 0));
        requestTable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        requestTable.setRowHeight(30);
        requestTable.setShowVerticalLines(false);
        jScrollPane1.setViewportView(requestTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 90, 780, 190));

        buttonApprove.setBackground(new java.awt.Color(31, 31, 31));
        buttonApprove.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        buttonApprove.setForeground(new java.awt.Color(255, 255, 255));
        buttonApprove.setText("Approve");
        buttonApprove.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonApprove.setEnabled(false);
        buttonApprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonApproveActionPerformed(evt);
            }
        });
        add(buttonApprove, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 130, 100, 40));

        buttonReject.setBackground(new java.awt.Color(31, 31, 31));
        buttonReject.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        buttonReject.setForeground(new java.awt.Color(255, 255, 255));
        buttonReject.setText("Reject");
        buttonReject.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonReject.setEnabled(false);
        buttonReject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRejectActionPerformed(evt);
            }
        });
        add(buttonReject, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 200, 100, 40));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("UID");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, -1, 30));

        uidText.setBackground(new java.awt.Color(0, 0, 0));
        uidText.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        uidText.setForeground(new java.awt.Color(255, 255, 255));
        add(uidText, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 380, 170, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("DOB");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 430, -1, 30));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Age");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 410, -1, -1));

        ageText.setBackground(new java.awt.Color(0, 0, 0));
        ageText.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        ageText.setForeground(new java.awt.Color(255, 255, 255));
        add(ageText, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 410, 180, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Gender");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 530, -1, -1));

        genderText.setBackground(new java.awt.Color(0, 0, 0));
        genderText.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        genderText.setForeground(new java.awt.Color(255, 255, 255));
        add(genderText, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 530, 170, -1));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Status");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 530, -1, 30));

        streetText.setBackground(new java.awt.Color(0, 0, 0));
        streetText.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        streetText.setForeground(new java.awt.Color(255, 255, 255));
        add(streetText, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 400, 176, -1));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Covid diagnosed date");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 660, -1, -1));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Covid cured date");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 700, -1, -1));

        bloodText.setBackground(new java.awt.Color(0, 0, 0));
        bloodText.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        bloodText.setForeground(new java.awt.Color(255, 255, 255));
        add(bloodText, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 490, 180, -1));

        jLabel13.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Street address");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 400, -1, -1));

        jLabel14.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("City");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 440, -1, 30));

        cityText.setBackground(new java.awt.Color(0, 0, 0));
        cityText.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        cityText.setForeground(new java.awt.Color(255, 255, 255));
        add(cityText, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 440, 180, -1));

        jLabel15.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("State");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 490, -1, -1));

        stateText.setBackground(new java.awt.Color(0, 0, 0));
        stateText.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        stateText.setForeground(new java.awt.Color(255, 255, 255));
        add(stateText, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 480, 180, -1));

        jLabel16.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("ZipCode");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 530, -1, -1));

        zipText.setBackground(new java.awt.Color(0, 0, 0));
        zipText.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        zipText.setForeground(new java.awt.Color(255, 255, 255));
        add(zipText, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 520, 180, -1));

        jLabel17.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Contact Number");
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 480, -1, -1));

        contactText.setBackground(new java.awt.Color(0, 0, 0));
        contactText.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        contactText.setForeground(new java.awt.Color(255, 255, 255));
        add(contactText, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 480, 170, -1));

        jLabel18.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Email ID");
        add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 450, -1, -1));

        statusText.setBackground(new java.awt.Color(0, 0, 0));
        statusText.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        statusText.setForeground(new java.awt.Color(255, 255, 255));
        add(statusText, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 530, 180, -1));

        jLabel19.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Date of last donation of Plasma");
        add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 740, -1, -1));

        lastDaySymptomsText.setBackground(new java.awt.Color(0, 0, 0));
        lastDaySymptomsText.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        lastDaySymptomsText.setForeground(new java.awt.Color(255, 255, 255));
        lastDaySymptomsText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastDaySymptomsTextActionPerformed(evt);
            }
        });
        add(lastDaySymptomsText, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 800, 170, -1));

        jLabel20.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Was your COVID-19 diagnosis confirmed by a lab test?");
        add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 660, -1, -1));

        jLabel21.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Currently you do NOT have any symptoms? ");
        add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 750, -1, -1));

        jLabel22.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Has it been at least 14 days since the last day of your symptoms?");
        add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 800, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Name");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 370, -1, -1));

        jLabel24.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Have you had a follow up test that was negative for COVID-19?");
        add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 710, -1, -1));

        nameText.setBackground(new java.awt.Color(0, 0, 0));
        nameText.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        nameText.setForeground(new java.awt.Color(255, 255, 255));
        add(nameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 370, 180, -1));

        buttonDetails.setBackground(new java.awt.Color(31, 31, 31));
        buttonDetails.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        buttonDetails.setForeground(new java.awt.Color(255, 255, 255));
        buttonDetails.setText("See Details");
        buttonDetails.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDetailsActionPerformed(evt);
            }
        });
        add(buttonDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 130, 40));

        jPanel3.setBackground(new java.awt.Color(31, 31, 31));
        jPanel3.setPreferredSize(new java.awt.Dimension(926, 70));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Donor Request Handling");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 1706, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1730, -1));

        labConfirmationText.setBackground(new java.awt.Color(0, 0, 0));
        labConfirmationText.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        labConfirmationText.setForeground(new java.awt.Color(255, 255, 255));
        add(labConfirmationText, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 660, 170, -1));

        followUpTestText.setBackground(new java.awt.Color(0, 0, 0));
        followUpTestText.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        followUpTestText.setForeground(new java.awt.Color(255, 255, 255));
        followUpTestText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                followUpTestTextActionPerformed(evt);
            }
        });
        add(followUpTestText, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 700, 170, -1));

        symptomsText.setBackground(new java.awt.Color(0, 0, 0));
        symptomsText.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        symptomsText.setForeground(new java.awt.Color(255, 255, 255));
        symptomsText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                symptomsTextActionPerformed(evt);
            }
        });
        add(symptomsText, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 750, 170, -1));

        lblProfilePicture.setBackground(new java.awt.Color(0, 0, 0));
        add(lblProfilePicture, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 130, 130, 130));

        dobDateField.setBackground(new java.awt.Color(0, 0, 0));
        dobDateField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        dobDateField.setForeground(new java.awt.Color(255, 255, 255));
        dobDateField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                dobDateFieldFocusLost(evt);
            }
        });
        dobDateField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dobDateFieldMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                dobDateFieldMousePressed(evt);
            }
        });
        dobDateField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dobDateFielduDobKeyTyped(evt);
            }
        });
        add(dobDateField, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 430, 170, -1));

        diagnosedDateField.setBackground(new java.awt.Color(0, 0, 0));
        diagnosedDateField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        diagnosedDateField.setForeground(new java.awt.Color(255, 255, 255));
        add(diagnosedDateField, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 660, 180, -1));

        curedDateField.setBackground(new java.awt.Color(0, 0, 0));
        curedDateField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        curedDateField.setForeground(new java.awt.Color(255, 255, 255));
        curedDateField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                curedDateFieldUCovidCuredDateKeyTyped(evt);
            }
        });
        add(curedDateField, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 700, 180, -1));

        lastDonationDateField.setBackground(new java.awt.Color(0, 0, 0));
        lastDonationDateField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lastDonationDateField.setForeground(new java.awt.Color(255, 255, 255));
        add(lastDonationDateField, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 740, 180, -1));

        emailText.setBackground(new java.awt.Color(0, 0, 0));
        emailText.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        emailText.setForeground(new java.awt.Color(255, 255, 255));
        add(emailText, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 450, 180, -1));

        jLabel23.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Blood group");
        add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 490, -1, 20));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 580, 1310, 20));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("COVID Details");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 610, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("BIO Details");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 320, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Address Details");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 330, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void buttonApproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonApproveActionPerformed
        // TODO add your handling code here:
        if( !statusText.getText().equals("New Request"))
        {
            //JOptionPane.showMessageDialog(null,"Can Not Approve the Request!");
         JOptionPane.showMessageDialog(null, new JLabel(  "<html><h2><I>Request<font color='red'> can not</font> be approved!</I></h2></html>"), "Warning", JOptionPane.WARNING_MESSAGE);
           
        
        }
        
        else
        {
        Donor donor = system.getDonorDirectory().addDonor();  
        donor.setDonorID(uidText.getText()); // UID
        donor.setName(nameText.getText()); // Name
        donor.setDob(dobDateField.getDate()); // DOB 
        donor.setCovidDiagnosedDate(diagnosedDateField.getDate()); // CovidDiagnosedDate
        donor.setCovidCuredDate(curedDateField.getDate()); // CovidCuredDate
        donor.setLastDonationDate(lastDonationDateField.getDate()); // LastDonationDate
               
        donor.setAge(Integer.parseInt(ageText.getText())); // Age
        donor.setGender(genderText.getText()); // gender
        donor.setBloodGroup(bloodText.getText()); // Blood group
        donor.setStreetAddress(streetText.getText()); // streetAddress
        donor.setCity(cityText.getText()); // city
        donor.setState(stateText.getText()); // state
        donor.setZipCode(Integer.parseInt(zipText.getText())); // zipCode
        donor.setContact(Integer.parseInt(contactText.getText())); // contact
        donor.setEmailID(statusText.getText()); // emailID
        donor.setStatus("Government Approved"); // status
    
        donor.setLabConfirmation(true); //  labConfirmation
        donor.setSymptoms(true); //  symptoms
        donor.setLastDaySymptoms(true); //  lastDaySymptoms
        donor.setFollowUpTest(true); //  followUpTest     
             
        for(DonorRequest donorRequest: system.getDonorRequestDirectory().getDonorRequestList()){            
        
            if(donorRequest.getDonorID().equals(uidText.getText())){
            donorRequest.setStatus("Government Approved");
            dB4OUtil.storeSystem(system);
            }
        }
        statusText.setText("Government Approved");
        
        dB4OUtil.storeSystem(system);
        populateRequestTable();
         JOptionPane.showMessageDialog(null, new JLabel(  "<html><h2><I>Request<font color='green'> approved</font> successfully!</I></h2></html>"));
           
        //JOptionPane.showMessageDialog(null,"Request Approved. New Donor added!");
        
        
        
        }
    }//GEN-LAST:event_buttonApproveActionPerformed

    private void buttonDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDetailsActionPerformed
        // TODO add your handling code here:
  
        int selectedRow = requestTable.getSelectedRow();
        if(selectedRow < 0){
             JOptionPane.showMessageDialog(null, new JLabel(  "<html><h2><I>Please select<font color='red'> a row</font> from the<font color='green'> table</font> to view details!</I></h2></html>"), "Warning", JOptionPane.WARNING_MESSAGE);
           
           // JOptionPane.showMessageDialog(null,"Please select a row from the table first to View Details!","Warning!",JOptionPane.WARNING_MESSAGE);
        }
        else{
       //display the details 
            populateRequestDetails((DonorRequest) requestTable.getValueAt(selectedRow, 0));
            buttonApprove.setEnabled(true);
            buttonReject.setEnabled(true);
            
            if(Integer.parseInt(ageText.getText()) < 18) // AGE IS LESS THAN 18 YEARS
            {
            ageText.setBorder(BorderFactory.createLineBorder(Color.RED));
            ageText.setForeground(Color.red);
            }
            if(labConfirmationText.getText().equals("false")) // Was your COVID-19 diagnosis confirmed by a lab test?
            {
            labConfirmationText.setBorder(BorderFactory.createLineBorder(Color.RED));
            labConfirmationText.setForeground(Color.red);
            }
            if(followUpTestText.getText().equals("false")) // Have you had a follow up test that was negative for COVID-19?
            {
            followUpTestText.setBorder(BorderFactory.createLineBorder(Color.RED));
            followUpTestText.setForeground(Color.red);
            }
            if(symptomsText.getText().equals("false")) // Currently you do NOT have any symptoms? 
            {
            symptomsText.setBorder(BorderFactory.createLineBorder(Color.RED));
            symptomsText.setForeground(Color.red);
            }
            if(lastDaySymptomsText.getText().equals("false")) // Has it been at least 14 days since the last day of your symptoms?
            {
            lastDaySymptomsText.setBorder(BorderFactory.createLineBorder(Color.RED));
            lastDaySymptomsText.setForeground(Color.red);
            }
            if(new Date().getDay() - lastDonationDateField.getDate().getDay()  < 30) // AGE IS LESS THAN 18 YEARS
            {
            lastDonationDateField.setBorder(BorderFactory.createLineBorder(Color.RED));
            lastDonationDateField.setForeground(Color.red);
            }

            
           dB4OUtil.storeSystem(system);
            
        }
    }

    private void populateRequestDetails(DonorRequest donorRequest){
            uidText.setText(donorRequest.getDonorID());
            nameText.setText(donorRequest.getName());
            dobDateField.setDate(donorRequest.getDob());
            curedDateField.setDate(donorRequest.getCovidCuredDate());
            diagnosedDateField.setDate(donorRequest.getCovidDiagnosedDate());
            lastDonationDateField.setDate(donorRequest.getLastDonationDate());
            ageText.setText(String.valueOf(donorRequest.getAge()));
            genderText.setText(donorRequest.getGender());
            bloodText.setText(donorRequest.getBloodGroup());
            streetText.setText(donorRequest.getStreetAddress());
            cityText.setText(donorRequest.getCity());
            stateText.setText(donorRequest.getState());
            zipText.setText(String.valueOf(donorRequest.getZipCode()));
            contactText.setText(String.valueOf(donorRequest.getContact()));
            emailText.setText(donorRequest.getEmailID());
            statusText.setText(donorRequest.getStatus());
      
            labConfirmationText.setText(String.valueOf(donorRequest.isLabConfirmation()));
            followUpTestText.setText(String.valueOf(donorRequest.isFollowUpTest()));
            symptomsText.setText(String.valueOf(donorRequest.isSymptoms()));
            lastDaySymptomsText.setText(String.valueOf(donorRequest.isLastDaySymptoms()));
            
            if(donorRequest.getdP() !=null){
            //Working line
            byte[] JLabelpictureLabel = donorRequest.getdP();
            ImageIcon i = setPicturebyte(JLabelpictureLabel);
            lblProfilePicture.setIcon(i);
            }
            else{
            System.err.println("No Image");
            }
            
            uidText.setEditable(false);
            nameText.setEditable(false);
            ageText.setEditable(false);
            genderText.setEditable(false);
            bloodText.setEditable(false);
            streetText.setEditable(false);
            cityText.setEditable(false);
            stateText.setEditable(false);
            zipText.setEditable(false);
            contactText.setEditable(false);
            statusText.setEditable(false);
            statusText.setEditable(false);
            labConfirmationText.setEditable(false);
            followUpTestText.setEditable(false);
            symptomsText.setEditable(false);
            lastDaySymptomsText.setEditable(false);        
            diagnosedDateField.setEnabled(false);
            dobDateField.setEnabled(false);
            curedDateField.setEnabled(false);
            lastDonationDateField.setEnabled(false);
            
    }//GEN-LAST:event_buttonDetailsActionPerformed

    private ImageIcon setPicturebyte(byte[] byteArrayImage){

        ImageIcon imageCar;
        imageCar = new ImageIcon(byteArrayImage);
        Image picCar = imageCar.getImage();
        JLabel pictureLabel1 = new JLabel();
        pictureLabel1.setSize(107, 133);
        Image resizedImage = picCar.getScaledInstance(pictureLabel1.getWidth(), pictureLabel1.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon selectedCarPicture = new ImageIcon(resizedImage);
        return selectedCarPicture;  
}
    
    
    
    private void buttonRejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRejectActionPerformed
        // TODO add your handling code here:
       if(!statusText.getText().equals("New Request"))
                  {
                      
       JOptionPane.showMessageDialog(null, new JLabel("<html><h2><I>Request<font color='red'> can not</font> be rejected!</I></h2></html>"), "Warning", JOptionPane.WARNING_MESSAGE);
          
                      
                      //JOptionPane.showMessageDialog(null,"Can Not Reject the Request!");
        }
       else{
        for(DonorRequest donorRequest: system.getDonorRequestDirectory().getDonorRequestList()){            
        
            if(donorRequest.getName().equals(nameText.getText())){
            statusText.setText("Rejected");
            donorRequest.setStatus("Rejected");
            }}
        dB4OUtil.storeSystem(system);
        populateRequestTable();
        
        JOptionPane.showMessageDialog(null, new JLabel("<html><h2><I>Request has been<font color='red'> rejected</font>!</I></h2></html>"));
        
        //JOptionPane.showMessageDialog(null,"Rejected the Request!");
        }
       dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_buttonRejectActionPerformed

    private void lastDaySymptomsTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastDaySymptomsTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastDaySymptomsTextActionPerformed

    private void followUpTestTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_followUpTestTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_followUpTestTextActionPerformed

    private void symptomsTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_symptomsTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_symptomsTextActionPerformed

    private void dobDateFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dobDateFieldFocusLost
        // TODO add your handling code here:

    }//GEN-LAST:event_dobDateFieldFocusLost

    private void dobDateFieldMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dobDateFieldMouseExited
        //Date dob = dobDateField.getDate();
        //System.out.println(dob.getYear());
        //ageText.setText((String.valueOf(new Date().getYear()-dob.getYear())));
    }//GEN-LAST:event_dobDateFieldMouseExited

    private void dobDateFieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dobDateFieldMousePressed

    }//GEN-LAST:event_dobDateFieldMousePressed

    private void dobDateFielduDobKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dobDateFielduDobKeyTyped
        // TODO add your handling code here:
        System.out.println("date");
        /*

        Date dob = dobDateField.getDate();

        LocalDate today = LocalDate.now();                          //Today's date
        LocalDate birthday;  //Birth date
        birthday = LocalDate.of(dob);

        Period p = Period.between(birthday, today);

        ageText.setText(String.valueOf(p.getYears()));
        String dobq=  calculateAge(dob, today);

        }

        */
        /*  public  int calculateAge(LocalDate birthDate, LocalDate currentDate) {
            if ((birthDate != null) && (currentDate != null)) {
                return Period.between(birthDate, currentDate).getYears();
            } else {
                return 0;
            }

            */
    }//GEN-LAST:event_dobDateFielduDobKeyTyped

    private void curedDateFieldUCovidCuredDateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_curedDateFieldUCovidCuredDateKeyTyped
        // TODO add your handling code here:
        //if( diagnosedDateField.getDate().compareTo(curedDateField.getDate()) > 0){
            // Date 1 is after Date 2
          //  curedDateValidateMessage.setVisible(true);
        //}

    }//GEN-LAST:event_curedDateFieldUCovidCuredDateKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ageText;
    private javax.swing.JTextField bloodText;
    private javax.swing.JButton buttonApprove;
    private javax.swing.JButton buttonDetails;
    private javax.swing.JButton buttonReject;
    private javax.swing.JTextField cityText;
    private javax.swing.JTextField contactText;
    private com.toedter.calendar.JDateChooser curedDateField;
    private com.toedter.calendar.JDateChooser diagnosedDateField;
    private com.toedter.calendar.JDateChooser dobDateField;
    private javax.swing.JTextField emailText;
    private javax.swing.JTextField followUpTestText;
    private javax.swing.JTextField genderText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField labConfirmationText;
    private javax.swing.JTextField lastDaySymptomsText;
    private com.toedter.calendar.JDateChooser lastDonationDateField;
    private javax.swing.JLabel lblProfilePicture;
    private javax.swing.JTextField nameText;
    private javax.swing.JTable requestTable;
    private javax.swing.JTextField stateText;
    private javax.swing.JTextField statusText;
    private javax.swing.JTextField streetText;
    private javax.swing.JTextField symptomsText;
    private javax.swing.JTextField uidText;
    private javax.swing.JTextField zipText;
    // End of variables declaration//GEN-END:variables
}

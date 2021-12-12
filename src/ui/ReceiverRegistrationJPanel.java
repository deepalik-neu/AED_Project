/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Person.DonorRequest;
import Business.Person.PatientRequest;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author namita
 */
public class ReceiverRegistrationJPanel extends javax.swing.JPanel {

    private EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    /**
     * Creates new form ReceiverRegistrationJPanel
     */
    public ReceiverRegistrationJPanel(EcoSystem system) {
        initComponents();
        this.system=system;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtDDate = new com.toedter.calendar.JDateChooser();
        labelName = new javax.swing.JLabel();
        labelAddress = new javax.swing.JLabel();
        labelEmail = new javax.swing.JLabel();
        labelGender = new javax.swing.JLabel();
        labelContact = new javax.swing.JLabel();
        labelBloodGroup = new javax.swing.JLabel();
        labelAge = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        textID = new javax.swing.JTextField();

        jTextField2.setBackground(new java.awt.Color(255, 204, 204));
        jTextField2.setFont(new java.awt.Font("Kefa", 1, 14)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(102, 0, 51));
        jTextField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField2FocusLost(evt);
            }
        });
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField2KeyReleased(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(255, 204, 204));
        jLabel7.setFont(new java.awt.Font("Kefa", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 0, 51));
        jLabel7.setText("Blood Group :");

        jLabel6.setBackground(new java.awt.Color(255, 204, 204));
        jLabel6.setFont(new java.awt.Font("Kefa", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 0, 51));
        jLabel6.setText("Phone No :");

        jLabel5.setBackground(new java.awt.Color(255, 204, 204));
        jLabel5.setFont(new java.awt.Font("Kefa", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 0, 51));
        jLabel5.setText("Gender :");

        jLabel9.setBackground(new java.awt.Color(255, 204, 204));
        jLabel9.setFont(new java.awt.Font("Kefa", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 0, 51));
        jLabel9.setText("Covid Diagnosed Date :");

        jLabel4.setBackground(new java.awt.Color(255, 204, 204));
        jLabel4.setFont(new java.awt.Font("Kefa", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 51));
        jLabel4.setText("Email :");

        jTextField7.setBackground(new java.awt.Color(255, 204, 204));
        jTextField7.setFont(new java.awt.Font("Kefa", 1, 14)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(102, 0, 51));
        jTextField7.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField7FocusLost(evt);
            }
        });
        jTextField7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField7KeyReleased(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 204, 204));
        jLabel3.setFont(new java.awt.Font("Kefa", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 51));
        jLabel3.setText("Address :");

        jTextField6.setBackground(new java.awt.Color(255, 204, 204));
        jTextField6.setFont(new java.awt.Font("Kefa", 1, 14)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(102, 0, 51));
        jTextField6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField6FocusLost(evt);
            }
        });
        jTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField6KeyReleased(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 204, 204));
        jLabel2.setFont(new java.awt.Font("Kefa", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 51));
        jLabel2.setText("Name :");

        jTextField5.setBackground(new java.awt.Color(255, 204, 204));
        jTextField5.setFont(new java.awt.Font("Kefa", 1, 14)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(102, 0, 51));
        jTextField5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField5FocusLost(evt);
            }
        });
        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField5KeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Kefa", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 0));
        jLabel1.setText("Receiver Registration Form");

        jTextField4.setBackground(new java.awt.Color(255, 204, 204));
        jTextField4.setFont(new java.awt.Font("Kefa", 1, 14)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(102, 0, 51));
        jTextField4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField4FocusLost(evt);
            }
        });
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField4KeyReleased(evt);
            }
        });

        jTextField3.setBackground(new java.awt.Color(255, 204, 204));
        jTextField3.setFont(new java.awt.Font("Kefa", 1, 14)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(102, 0, 51));
        jTextField3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField3FocusLost(evt);
            }
        });
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField3KeyReleased(evt);
            }
        });

        btnSave.setBackground(new java.awt.Color(255, 204, 204));
        btnSave.setFont(new java.awt.Font("Kefa", 1, 14)); // NOI18N
        btnSave.setForeground(new java.awt.Color(102, 0, 51));
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jTextField1.setBackground(new java.awt.Color(255, 204, 204));
        jTextField1.setFont(new java.awt.Font("Kefa", 1, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(102, 0, 51));
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1FocusLost(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(255, 204, 204));
        jLabel8.setFont(new java.awt.Font("Kefa", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 0, 51));
        jLabel8.setText("Age :");

        jLabel10.setText("ID :");

        textID.setBackground(new java.awt.Color(255, 204, 204));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(204, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField5)
                            .addComponent(jTextField6)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(labelBloodGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelContact, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelGender, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelAge, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(labelName, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(80, 80, 80))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(261, 261, 261)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel10)
                        .addGap(33, 33, 33)
                        .addComponent(textID, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jTextField1, jTextField2, jTextField3, jTextField4, jTextField5, jTextField6, jTextField7});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {labelAddress, labelAge, labelBloodGroup, labelContact, labelEmail, labelGender, labelName});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelName, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(labelGender, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45))
                            .addComponent(labelContact, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(labelBloodGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelAge, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(btnSave)
                .addGap(54, 54, 54))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jTextField1, jTextField2, jTextField3, jTextField4, jTextField5, jTextField6, jTextField7});

    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        
        
       try{
         
           
         PatientRequest patientrequest = system.getPatientRequestDirectory().addPatientRequest();
        patientrequest.setName(jTextField1.getText());
     
        patientrequest.setAge(jTextField7.getText());
       patientrequest.setBloodGroup(jTextField6.getText());
       
       patientrequest.setContact(jTextField5.getText());
     
       patientrequest.setCovidDiagnosisDate(txtDDate.getDate());
     
       patientrequest.setPatientID(textID.getText());
       patientrequest.setEmailID(jTextField3.getText());
       
       patientrequest.setGender(jTextField4.getText());
       patientrequest.setAddress(jTextField2.getText());
       patientrequest.setStatus("New Patient Request!");
      
        dB4OUtil.storeSystem(system);
        JOptionPane.showMessageDialog(null, new JLabel("<html><h2>Thank you for registering for<font color='green'><I><B> HELP!</B></I></font> We will soon get back to you. <font color='green'><I><B>Take Care!!</B></I></font></h2></html>"));
        }
        catch(Exception e){
            System.out.println("stack"+e.getStackTrace());
            System.out.println("stack"+e.toString());
        }
        
        
        
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusLost
        // TODO add your handling code here:
        
//        String chckName=jTextField1.getText();
//
//    Pattern pattern = Pattern.compile("^[a-zA-Z- ]{1,50}$");
//    Matcher matchPattern=pattern.matcher(chckName);
//    if(!matchPattern.matches())
//    {
//     JOptionPane.showMessageDialog(this,"<html><h2>Please enter a valid name</h2> </html>! ");   
//    }
    }//GEN-LAST:event_jTextField1FocusLost

    private void jTextField2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusLost
        // TODO add your handling code here:
        
//        String chckName=jTextField2.getText();
//
//    Pattern pattern = Pattern.compile("^[a-zA-Z- ]{1,100}$");
//    Matcher matchPattern=pattern.matcher(chckName);
//    if(!matchPattern.matches())
//    {
//     JOptionPane.showMessageDialog(this,"<html><h2>Please enter a valid address</h2> </html>! ");   
//    }
    }//GEN-LAST:event_jTextField2FocusLost

    private void jTextField3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField3FocusLost
        // TODO add your handling code here:
//        String checkEmailAddress=jTextField3.getText();
//
//        Pattern pattern=Pattern.compile("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$");
//
//        Matcher matchPattern=pattern.matcher(checkEmailAddress);
//
//        if(!matchPattern.matches())
//
//        {
//
//        JOptionPane.showMessageDialog(this," Please Enter Valid Email Address. ");
//
//        }
        
    }//GEN-LAST:event_jTextField3FocusLost

    private void jTextField4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField4FocusLost
        // TODO add your handling code here:
//        String chckName=jTextField4.getText();
//
//    Pattern pattern = Pattern.compile("^[F|M|f|m]{1}$");
//    Matcher matchPattern=pattern.matcher(chckName);
//    if(!matchPattern.matches())
//    {
//     JOptionPane.showMessageDialog(this,"<html><h2>Please enter a valid Gender(F/M)</h2> </html>! ");   
//    }
    }//GEN-LAST:event_jTextField4FocusLost

    private void jTextField5FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField5FocusLost
        // TODO add your handling code here:
//        String chckName=jTextField5.getText();
//        Pattern pattern = Pattern.compile("^[0-9]{10}$");  
//  
//    Matcher matchPattern=pattern.matcher(chckName);
//    if(!matchPattern.matches())
//    {
//     JOptionPane.showMessageDialog(this,"<html><h2>Please enter a valid Phone number)</h2> </html>! ");   
//    }
    }//GEN-LAST:event_jTextField5FocusLost

    private void jTextField6FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField6FocusLost
        // TODO add your handling code here:
//        String chckName=jTextField4.getText();
//
//    Pattern pattern = Pattern.compile("^[A|B|AB|O][\\+|\\-]$");
//    Matcher matchPattern=pattern.matcher(chckName);
//    if(!matchPattern.matches())
//    {
//     JOptionPane.showMessageDialog(this,"<html><h2>Please enter a valid Gender(F/M)</h2> </html>! ");   
//    }
    }//GEN-LAST:event_jTextField6FocusLost

    private void jTextField7FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField7FocusLost
        // TODO add your handling code here:
        
//         String chckName=jTextField7.getText();
//        Pattern pattern = Pattern.compile("^[0-9]{1,2}$");  
//  
//    Matcher matchPattern=pattern.matcher(chckName);
//    if(!matchPattern.matches())
//    {
//     JOptionPane.showMessageDialog(this,"<html><h2>Please enter a valid Age</h2> </html>! ");   
//    }
    }//GEN-LAST:event_jTextField7FocusLost

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        // TODO add your handling code here:
        String checkName=jTextField1.getText();

    Pattern pattern=Pattern.compile("^[a-zA-Z]{1,50}$");

    Matcher matchPattern=pattern.matcher(checkName);
    if(!matchPattern.matches())
    {
    labelName.setText("Please enter correct name.");
    }
    else
    {
    labelName.setText(null);
    }
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jTextField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyReleased
        // TODO add your handling code here:
        String checkName=jTextField2.getText();

    Pattern pattern=Pattern.compile("^[a-zA-Z]{1,50}$");

    Matcher matchPattern=pattern.matcher(checkName);
    if(!matchPattern.matches())
    {
    labelAddress.setText("Please enter correct address.");
    }
    else
    {
    labelAddress.setText(null);
    }
    }//GEN-LAST:event_jTextField2KeyReleased

    private void jTextField3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyReleased
        // TODO add your handling code here:
        String checkName=jTextField3.getText();

    Pattern pattern=Pattern.compile("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$");

    Matcher matchPattern=pattern.matcher(checkName);
    if(!matchPattern.matches())
    {
    labelEmail.setText("Please enter correct email.");
    }
    else
    {
    labelEmail.setText(null);
    }
    }//GEN-LAST:event_jTextField3KeyReleased

    private void jTextField4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyReleased
        // TODO add your handling code here:
        String checkName=jTextField4.getText();

    Pattern pattern=Pattern.compile("^(?:m|M|male|Male|f|F|female|Female)$");

    Matcher matchPattern=pattern.matcher(checkName);
    if(!matchPattern.matches())
    {
    labelGender.setText("Please enter correct gender.");
    }
    else
    {
    labelGender.setText(null);
    }
    }//GEN-LAST:event_jTextField4KeyReleased

    private void jTextField5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyReleased
        // TODO add your handling code here:
        
        String checkName=jTextField5.getText();

    Pattern pattern=Pattern.compile("^[0-9]{10}$");

    Matcher matchPattern=pattern.matcher(checkName);
    if(!matchPattern.matches())
    {
    labelContact.setText("Please enter 10 digits.");
    }
    else
    {
    labelContact.setText(null);
    }
    }//GEN-LAST:event_jTextField5KeyReleased

    private void jTextField6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyReleased
        // TODO add your handling code here:
        String checkName=jTextField6.getText();

    Pattern pattern=Pattern.compile("^(A|B|AB|O)[-+]$");

    Matcher matchPattern=pattern.matcher(checkName);
    if(!matchPattern.matches())
    {
    labelBloodGroup.setText("Please enter valid blood group.");
    }
    else
    {
    labelBloodGroup.setText(null);
    }
    }//GEN-LAST:event_jTextField6KeyReleased

    private void jTextField7KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7KeyReleased
        // TODO add your handling code here:
        String checkName=jTextField7.getText();

    Pattern pattern=Pattern.compile("^[0-9]{1,2}$");

    Matcher matchPattern=pattern.matcher(checkName);
    if(!matchPattern.matches())
    {
    labelAge.setText("Please enter valid age.");
    }
    else
    {
    labelAge.setText(null);
    }
    }//GEN-LAST:event_jTextField7KeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JLabel labelAddress;
    private javax.swing.JLabel labelAge;
    private javax.swing.JLabel labelBloodGroup;
    private javax.swing.JLabel labelContact;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelGender;
    private javax.swing.JLabel labelName;
    private javax.swing.JTextField textID;
    private com.toedter.calendar.JDateChooser txtDDate;
    // End of variables declaration//GEN-END:variables
}

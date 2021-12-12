/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.PathologistRole;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author namita
 */
public class PathologistProfile extends javax.swing.JPanel {

    /**
     * Creates new form PathologistProfile
     */
    public PathologistProfile() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtAddress = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        txtGender = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        txtContact = new javax.swing.JTextField();
        labelName = new javax.swing.JLabel();
        labelAddress = new javax.swing.JLabel();
        labelEmail = new javax.swing.JLabel();
        labelGender = new javax.swing.JLabel();
        labelContact = new javax.swing.JLabel();
        labelBloodGroup = new javax.swing.JLabel();
        labelAge = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        txtAddress.setBackground(new java.awt.Color(255, 204, 204));
        txtAddress.setFont(new java.awt.Font("Kefa", 1, 14)); // NOI18N
        txtAddress.setForeground(new java.awt.Color(102, 0, 51));
        txtAddress.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAddressKeyReleased(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 204, 204));
        jLabel1.setFont(new java.awt.Font("Kefa", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 51));
        jLabel1.setText("Name:");

        jLabel2.setBackground(new java.awt.Color(255, 204, 204));
        jLabel2.setFont(new java.awt.Font("Kefa", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 51));
        jLabel2.setText("Contact:");

        jLabel3.setBackground(new java.awt.Color(255, 204, 204));
        jLabel3.setFont(new java.awt.Font("Kefa", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 51));
        jLabel3.setText("Address:");

        txtAge.setBackground(new java.awt.Color(255, 204, 204));
        txtAge.setFont(new java.awt.Font("Kefa", 1, 14)); // NOI18N
        txtAge.setForeground(new java.awt.Color(102, 0, 51));
        txtAge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAgeKeyReleased(evt);
            }
        });

        txtGender.setBackground(new java.awt.Color(255, 204, 204));
        txtGender.setFont(new java.awt.Font("Kefa", 1, 14)); // NOI18N
        txtGender.setForeground(new java.awt.Color(102, 0, 51));
        txtGender.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtGenderKeyReleased(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 204, 204));
        jLabel4.setFont(new java.awt.Font("Kefa", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 0));
        jLabel4.setText("Email :");

        jLabel6.setBackground(new java.awt.Color(255, 204, 204));
        jLabel6.setFont(new java.awt.Font("Kefa", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 0, 51));
        jLabel6.setText("Gender:");

        jTextField3.setBackground(new java.awt.Color(255, 204, 204));
        jTextField3.setFont(new java.awt.Font("Kefa", 1, 14)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(102, 0, 0));
        jTextField3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField3FocusLost(evt);
            }
        });
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField3KeyReleased(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(255, 204, 204));
        jLabel7.setFont(new java.awt.Font("Kefa", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 0, 51));
        jLabel7.setText("Age :");

        jLabel8.setBackground(new java.awt.Color(255, 204, 204));
        jLabel8.setFont(new java.awt.Font("Kefa", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 0, 0));
        jLabel8.setText("Blood Group :");

        txtName.setBackground(new java.awt.Color(255, 204, 204));
        txtName.setFont(new java.awt.Font("Kefa", 1, 14)); // NOI18N
        txtName.setForeground(new java.awt.Color(102, 0, 51));
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNameKeyReleased(evt);
            }
        });

        jTextField6.setBackground(new java.awt.Color(255, 204, 204));
        jTextField6.setFont(new java.awt.Font("Kefa", 1, 14)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(102, 0, 0));
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

        txtContact.setBackground(new java.awt.Color(255, 204, 204));
        txtContact.setFont(new java.awt.Font("Kefa", 1, 14)); // NOI18N
        txtContact.setForeground(new java.awt.Color(102, 0, 51));
        txtContact.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtContactKeyReleased(evt);
            }
        });

        labelName.setFont(new java.awt.Font("Kefa", 1, 14)); // NOI18N
        labelName.setForeground(new java.awt.Color(255, 0, 0));

        labelAddress.setFont(new java.awt.Font("Kefa", 1, 14)); // NOI18N
        labelAddress.setForeground(new java.awt.Color(255, 0, 0));

        labelEmail.setFont(new java.awt.Font("Kefa", 1, 14)); // NOI18N
        labelEmail.setForeground(new java.awt.Color(255, 0, 0));

        labelGender.setFont(new java.awt.Font("Kefa", 1, 14)); // NOI18N
        labelGender.setForeground(new java.awt.Color(255, 0, 0));

        labelContact.setFont(new java.awt.Font("Kefa", 1, 14)); // NOI18N
        labelContact.setForeground(new java.awt.Color(255, 0, 0));

        labelBloodGroup.setFont(new java.awt.Font("Kefa", 1, 14)); // NOI18N
        labelBloodGroup.setForeground(new java.awt.Color(255, 0, 0));

        labelAge.setFont(new java.awt.Font("Kefa", 1, 14)); // NOI18N
        labelAge.setForeground(new java.awt.Color(255, 0, 0));

        jLabel5.setFont(new java.awt.Font("Kefa", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 0, 51));
        jLabel5.setText("Manage Profile");

        jButton1.setBackground(new java.awt.Color(255, 204, 204));
        jButton1.setFont(new java.awt.Font("Kefa", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 0, 0));
        jButton1.setText("Save");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(335, 335, 335)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel8))
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField6)
                            .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                            .addComponent(txtContact, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                            .addComponent(txtAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                            .addComponent(txtAge, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                            .addComponent(txtGender)
                            .addComponent(jTextField3))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelBloodGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(labelGender, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                                .addComponent(labelAge, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(labelContact, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(labelAddress, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                                .addComponent(labelEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(labelName, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(381, 381, 381)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(420, 420, 420)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jLabel1, jLabel2, jLabel3, jLabel4, jLabel6, jLabel7, jLabel8, jTextField3, jTextField6, txtAddress, txtAge, txtContact, txtGender, txtName});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(labelAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelContact, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelGender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelAge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtAge)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelBloodGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(63, 63, 63)
                .addComponent(jButton1)
                .addGap(124, 124, 124))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton1, jLabel1, jLabel2, jLabel3, jLabel4, jLabel6, jLabel7, jLabel8, jTextField3, jTextField6, txtAddress, txtAge, txtContact, txtGender, txtName});

    }// </editor-fold>//GEN-END:initComponents

    private void txtAddressKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddressKeyReleased
        // TODO add your handling code here:
        String checkName=txtAddress.getText();

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
    }//GEN-LAST:event_txtAddressKeyReleased

    private void txtAgeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAgeKeyReleased
        // TODO add your handling code here:
        String checkName=txtAge.getText();

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
    }//GEN-LAST:event_txtAgeKeyReleased

    private void txtGenderKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGenderKeyReleased
        // TODO add your handling code here:
        String checkName=txtGender.getText();

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
    }//GEN-LAST:event_txtGenderKeyReleased

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
        //email
    }//GEN-LAST:event_jTextField3FocusLost

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:

        //email
    }//GEN-LAST:event_jTextField3ActionPerformed

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

    private void txtNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyReleased
        // TODO add your handling code here:
        String checkName=txtName.getText();

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
    }//GEN-LAST:event_txtNameKeyReleased

    private void jTextField6FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField6FocusLost
        // TODO add your handling code here:
        //        String chckName=jTextField4.getText();
        //
        //    Pattern pattern = Pattern.compile("^(A|B|AB|O)[-+]$");
        //    Matcher matchPattern=pattern.matcher(chckName);
        //    if(!matchPattern.matches())
        //    {
            //     JOptionPane.showMessageDialog(this,"<html><h2>Please enter a valid Gender(F/M)</h2> </html>! ");
            //    }
    }//GEN-LAST:event_jTextField6FocusLost

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

    private void txtContactKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContactKeyReleased
        // TODO add your handling code here:
        String checkName=txtContact.getText();

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
    }//GEN-LAST:event_txtContactKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JLabel labelAddress;
    private javax.swing.JLabel labelAge;
    private javax.swing.JLabel labelBloodGroup;
    private javax.swing.JLabel labelContact;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelGender;
    private javax.swing.JLabel labelName;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.AdministrativeRole;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import static Business.Enterprise.Enterprise.EnterpriseType.Authorization;
import static Business.Enterprise.Enterprise.EnterpriseType.CovidCentre;
import static Business.Enterprise.Enterprise.EnterpriseType.Government;
import static Business.Enterprise.Enterprise.EnterpriseType.PlasmaBank;
import Business.Organization.Organization;
import Business.Organization.Organization.AuthorizationType;
import Business.Organization.Organization.CovidCentreType;
import Business.Organization.Organization.GovernmentType;
import Business.Organization.Organization.PlasmaBankType;
import Business.Organization.Organization.Type;
import Business.Organization.OrganizationDirectory;
import java.awt.CardLayout;
import java.awt.Color;
import static java.time.Clock.system;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raunak
 */
public class ManageOrganizationJPanel extends javax.swing.JPanel {

    private OrganizationDirectory directory;
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    
    /**
     * Creates new form ManageOrganizationJPanel
     */
    public ManageOrganizationJPanel(JPanel container,OrganizationDirectory directory, Enterprise enterprise, EcoSystem system) {
        initComponents();
        this.userProcessContainer = container;
        this.directory = directory;
        this.enterprise=enterprise;
        this.system = system;
        
        populateTable();
        populateCombo();
    }

//    
    
    private void populateCombo(){
        organizationJComboBox.removeAllItems();
        //for (Type type : Organization.Type.values()){
          //  if (!type.getValue().equals(Type.Admin.getValue()))
            //    organizationJComboBox.addItem(type);
        //}
        System.out.println(enterprise.getEnterpriseType());
       System.out.println(enterprise.getEnterpriseType().toString().equals(Authorization.toString()));
       if(enterprise.getEnterpriseType().toString().equals(Authorization.toString())){
        for(Organization.AuthorizationType legalType: Organization.AuthorizationType.values()){
            if (legalType.getValue().equals(Organization.AuthorizationType.Authorization.getValue())){
                organizationJComboBox.addItem(legalType);
            }
        }
        }
       
       else if(enterprise.getEnterpriseType().toString().equals(PlasmaBank.toString())){
           System.out.println("1");
        for(Organization.PlasmaBankType plasmaType: Organization.PlasmaBankType.values()){
            System.out.println("1");
            System.out.println(plasmaType.getValue());
            System.out.println(Organization.PlasmaBankType.PlasmaBank.getValue());
            if (plasmaType.getValue().equals(Organization.PlasmaBankType.PlasmaBank.getValue())){
                organizationJComboBox.addItem(plasmaType);
            }
        }
        }
       else if(enterprise.getEnterpriseType().toString().equals(CovidCentre.toString())){
        for(Organization.CovidCentreType covidType: Organization.CovidCentreType.values()){
            if (covidType.getValue().equals(Organization.CovidCentreType.CovidCentre.getValue())){
                organizationJComboBox.addItem(covidType);
            }
        }
        }
       else if(enterprise.getEnterpriseType().toString().equals(Government.toString())){
        for(Organization.GovernmentType govtType: Organization.GovernmentType.values()){
            if (govtType.getValue().equals(Organization.GovernmentType.Government.getValue())){
                organizationJComboBox.addItem(govtType);
            }
        }
        }
       else{
        for (Organization.Type type : Organization.Type.values()){            
            if (type.getValue().equals(Organization.Type.SystemCoordinator.getValue())
                    ||type.getValue().equals(Organization.Type.Doctor.getValue())
                    ||type.getValue().equals(Organization.Type.Pathologist.getValue())
                    )
                organizationJComboBox.addItem(type);
        }
       
    }
    }

    private void populateTable(){
        DefaultTableModel model = (DefaultTableModel) organizationJTable.getModel();
        
        model.setRowCount(0);
      
        for (Organization organization : directory.getOrganizationList()){
            Object[] row = new Object[2];
            row[0] = organization.getOrganizationID();
            row[1] = organization.getRealName();
            
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
        organizationJTable = new javax.swing.JTable();
        addJButton = new javax.swing.JButton();
        organizationJComboBox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtOrgRealName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        organizationJTable.setBackground(new java.awt.Color(255, 204, 204));
        organizationJTable.setFont(new java.awt.Font("Kefa", 1, 14)); // NOI18N
        organizationJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(organizationJTable);
        if (organizationJTable.getColumnModel().getColumnCount() > 0) {
            organizationJTable.getColumnModel().getColumn(0).setResizable(false);
            organizationJTable.getColumnModel().getColumn(1).setResizable(false);
        }

        addJButton.setBackground(new java.awt.Color(255, 204, 204));
        addJButton.setFont(new java.awt.Font("Kefa", 1, 14)); // NOI18N
        addJButton.setForeground(new java.awt.Color(102, 0, 0));
        addJButton.setText("Add Organization");
        addJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJButtonActionPerformed(evt);
            }
        });

        organizationJComboBox.setBackground(new java.awt.Color(255, 204, 204));
        organizationJComboBox.setForeground(new java.awt.Color(102, 0, 0));
        organizationJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setFont(new java.awt.Font("Kefa", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 0));
        jLabel1.setText("Organization Type ");

        backJButton.setBackground(new java.awt.Color(255, 204, 204));
        backJButton.setFont(new java.awt.Font("Kefa", 1, 14)); // NOI18N
        backJButton.setForeground(new java.awt.Color(102, 0, 0));
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Kefa", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 0));
        jLabel2.setText("Organization Name");

        txtOrgRealName.setBackground(new java.awt.Color(255, 204, 204));
        txtOrgRealName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOrgRealNameActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Kefa", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 0));
        jLabel3.setText("Manage Organization");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(addJButton)
                .addGap(0, 658, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(99, 99, 99)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2))
                            .addGap(49, 49, 49)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtOrgRealName, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(organizationJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(66, 66, 66)
                            .addComponent(backJButton))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(256, 256, 256)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(organizationJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtOrgRealName, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(addJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(142, 142, 142)
                .addComponent(backJButton)
                .addGap(48, 48, 48))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJButtonActionPerformed

//        Type type = (Type) organizationJComboBox.getSelectedItem();
//        directory.createOrganization(type);
//        populateTable();

String check1 = "";    
        
        if (txtOrgRealName.getText().isEmpty()) {
            txtOrgRealName.setBorder(BorderFactory.createLineBorder(Color.RED));
            txtOrgRealName.setForeground(Color.red);

            JOptionPane.showMessageDialog(null, new JLabel("<html><h2><I>Organization Name<font color='red'> can not </font>be empty!/I<></h2></html>") , "Error", JOptionPane.ERROR_MESSAGE);
                   

            //JOptionPane.showMessageDialog(null, "Organization name cannot be empty!");
            check1 = "do not go further!";
            return;
        }

        
        for (Organization organization : directory.getOrganizationList()) {

            if (organization.getName().equals(txtOrgRealName.getText())) {
                
            JOptionPane.showMessageDialog(null, new JLabel("<html><h2><I>Organization name</I><font color='red'> already</font><I> exists!/I<></h2></html>") , "Error", JOptionPane.ERROR_MESSAGE);
                   
                //JOptionPane.showMessageDialog(null, "Organization name already exists!");
                check1 = "do not go further!";
                return;
            }
        }

// Main Process after validation checks
        if(check1.equals("")){
        if(enterprise.getEnterpriseType().toString().equals(Authorization.toString())){
            directory.createAuthorizationOrganization((AuthorizationType)organizationJComboBox.getSelectedItem(), txtOrgRealName.getText());
        }
        else if(enterprise.getEnterpriseType().toString().equals(Government.toString())){
            directory.createGovernmentOrganization((GovernmentType)organizationJComboBox.getSelectedItem(), txtOrgRealName.getText());
        }
        else if(enterprise.getEnterpriseType().toString().equals(PlasmaBank.toString())){
            directory.createPlasmaOrganization((PlasmaBankType)organizationJComboBox.getSelectedItem(), txtOrgRealName.getText());
        }
        else if(enterprise.getEnterpriseType().toString().equals(CovidCentre.toString())){
            directory.createCovidCentreOrganization((CovidCentreType)organizationJComboBox.getSelectedItem(), txtOrgRealName.getText());
        }
        else{
            
        Type type = (Type) organizationJComboBox.getSelectedItem();
        directory.createOrganization(type, txtOrgRealName.getText());
        }
        populateTable();
        
        
       JOptionPane.showMessageDialog(null, new JLabel("<html><h2><I>A new Organization</I><font color='green'> created </font><I>successfully!/I<></h2></html>"));
                   
        //JOptionPane.showMessageDialog(null, "Organization created successfully!");
        
        
        dB4OUtil.storeSystem(system);
        
        
        txtOrgRealName.setText("");
        organizationJComboBox.removeItem(organizationJComboBox.getSelectedItem());
        }

    }//GEN-LAST:event_addJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void txtOrgRealNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOrgRealNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOrgRealNameActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox organizationJComboBox;
    private javax.swing.JTable organizationJTable;
    private javax.swing.JTextField txtOrgRealName;
    // End of variables declaration//GEN-END:variables
}

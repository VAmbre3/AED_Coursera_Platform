/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import login.PersonHistory;
import login.PersonHistoryService;
import login.PersonHistoryServiceImpl;
import login.PersonLogin;

/**
 *
 * @author visma
 */
public class ProfViewStudCourseJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AdminList
     */
    
    PersonHistoryService history;
    
    public ProfViewStudCourseJPanel() {
        initComponents();
        history = PersonHistoryServiceImpl.getInstance();         
        populateTable();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSignIn = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        UserTable = new javax.swing.JTable();
        btnAdminView = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 51, 51));

        lblSignIn.setBackground(new java.awt.Color(204, 204, 204));
        lblSignIn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblSignIn.setForeground(new java.awt.Color(255, 255, 255));
        lblSignIn.setText("List of Courses");

        UserTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "NUID", "UserID", "Password"
            }
        ));
        jScrollPane1.setViewportView(UserTable);

        btnAdminView.setText("View Course");
        btnAdminView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminViewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSignIn)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(103, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAdminView, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(lblSignIn, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAdminView)
                .addContainerGap(154, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdminViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminViewActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnAdminViewActionPerformed
    
    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        //Take to next page to edit student details
        
               
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable UserTable;
    private javax.swing.JButton btnAdminView;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblSignIn;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        
        DefaultTableModel model = (DefaultTableModel) UserTable.getModel();
        model.setRowCount(0);
        
        for(PersonLogin vs : history.getPerson()){
            
            Object[] row = new Object[4];
            row[0] = vs.getUserName();
            row[1] = vs.getNuID();
            row[2] = vs.getUserID();
            row[3] = vs.getPassword();
            
            model.addRow(row);
            
        }
        
    }
}

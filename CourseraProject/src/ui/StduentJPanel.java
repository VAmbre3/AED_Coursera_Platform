/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import login.PersonHistory;
import login.PersonHistoryService;
import login.PersonHistoryServiceImpl;
import login.PersonLogin;

/**
 *
 * @author visma
 */
public class StduentJPanel extends javax.swing.JPanel {

    /**
     * Creates new form StduentJPanel
     */
    
    
    private PersonHistoryService history;
    
    public StduentJPanel() {
        initComponents();
        this.history = PersonHistoryServiceImpl.getInstance();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        UserSplitPane = new javax.swing.JSplitPane();
        UserControl = new javax.swing.JPanel();
        btnViewUser = new javax.swing.JButton();
        btnUpdateUser = new javax.swing.JButton();
        lblControl = new javax.swing.JLabel();
        UserWorkArea = new javax.swing.JPanel();

        setBackground(new java.awt.Color(247, 247, 247));

        btnViewUser.setBackground(new java.awt.Color(200, 16, 46));
        btnViewUser.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnViewUser.setForeground(new java.awt.Color(255, 255, 255));
        btnViewUser.setText("View Info");
        btnViewUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewUserActionPerformed(evt);
            }
        });

        btnUpdateUser.setBackground(new java.awt.Color(200, 16, 46));
        btnUpdateUser.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnUpdateUser.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateUser.setText("Update Info");
        btnUpdateUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateUserActionPerformed(evt);
            }
        });

        lblControl.setBackground(new java.awt.Color(200, 16, 46));
        lblControl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblControl.setForeground(new java.awt.Color(200, 16, 46));
        lblControl.setText("Welcome Student");

        javax.swing.GroupLayout UserControlLayout = new javax.swing.GroupLayout(UserControl);
        UserControl.setLayout(UserControlLayout);
        UserControlLayout.setHorizontalGroup(
            UserControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UserControlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(UserControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnUpdateUser)
                    .addComponent(btnViewUser)
                    .addComponent(lblControl))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        UserControlLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnUpdateUser, btnViewUser});

        UserControlLayout.setVerticalGroup(
            UserControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UserControlLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblControl)
                .addGap(98, 98, 98)
                .addComponent(btnViewUser)
                .addGap(40, 40, 40)
                .addComponent(btnUpdateUser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(251, Short.MAX_VALUE))
        );

        UserControlLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnUpdateUser, btnViewUser});

        UserSplitPane.setLeftComponent(UserControl);

        UserWorkArea.setBackground(new java.awt.Color(200, 16, 46));

        javax.swing.GroupLayout UserWorkAreaLayout = new javax.swing.GroupLayout(UserWorkArea);
        UserWorkArea.setLayout(UserWorkAreaLayout);
        UserWorkAreaLayout.setHorizontalGroup(
            UserWorkAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 656, Short.MAX_VALUE)
        );
        UserWorkAreaLayout.setVerticalGroup(
            UserWorkAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        UserSplitPane.setRightComponent(UserWorkArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(UserSplitPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(UserSplitPane)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewUserActionPerformed
        // TODO add your handling code here:
        
        StudentViewJPanel userView = new StudentViewJPanel();
        UserSplitPane.setRightComponent(userView);
        
    }//GEN-LAST:event_btnViewUserActionPerformed

    private void btnUpdateUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateUserActionPerformed
        PersonLogin userToDisplay = history.getCurrentUser();

        // Create an instance of StudentUpdateJPanel and pass the user information
        if (userToDisplay != null) {
            StudentUpdateJPanel userUpdate = new StudentUpdateJPanel(userToDisplay);
            UserSplitPane.setRightComponent(userUpdate);
        } else {
            // Handle the case when the user is not logged in or userToDisplay is null.
            // You can show an error message or take appropriate action.
            // For example, you can display an error dialog.
            JOptionPane.showMessageDialog(this, "User not found or not logged in. Please log in or try again.");
        }
        
    }//GEN-LAST:event_btnUpdateUserActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel UserControl;
    private javax.swing.JSplitPane UserSplitPane;
    private javax.swing.JPanel UserWorkArea;
    private javax.swing.JButton btnUpdateUser;
    private javax.swing.JButton btnViewUser;
    private javax.swing.JLabel lblControl;
    // End of variables declaration//GEN-END:variables

    
}
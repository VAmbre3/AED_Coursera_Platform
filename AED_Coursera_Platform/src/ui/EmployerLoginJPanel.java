/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

/**
 *
 * @author arvin
 */
public class EmployerLoginJPanel extends javax.swing.JPanel {

    /**
     * Creates new form EmpoyerLoginJPanel
     */
    public EmployerLoginJPanel() {
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

        lblSignIn = new javax.swing.JLabel();
        lblEmployerUserName = new javax.swing.JLabel();
        txtEmployerUserName = new javax.swing.JTextField();
        lblEmployerPassword = new javax.swing.JLabel();
        btnLogIn = new javax.swing.JButton();
        txtEmployerPassword = new javax.swing.JPasswordField();

        lblSignIn.setBackground(new java.awt.Color(204, 204, 204));
        lblSignIn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblSignIn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSignIn.setText("Employer Sign In");

        lblEmployerUserName.setBackground(new java.awt.Color(204, 204, 204));
        lblEmployerUserName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblEmployerUserName.setText("User Name:");

        txtEmployerUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmployerUserNameActionPerformed(evt);
            }
        });

        lblEmployerPassword.setBackground(new java.awt.Color(204, 204, 204));
        lblEmployerPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblEmployerPassword.setText("Password:");

        btnLogIn.setBackground(new java.awt.Color(200, 16, 46));
        btnLogIn.setForeground(new java.awt.Color(255, 255, 255));
        btnLogIn.setText("Log In");
        btnLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogInActionPerformed(evt);
            }
        });

        txtEmployerPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmployerPasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEmployerUserName)
                    .addComponent(lblEmployerPassword))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnLogIn)
                    .addComponent(txtEmployerUserName)
                    .addComponent(txtEmployerPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(139, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSignIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lblSignIn, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmployerUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmployerUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmployerPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmployerPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(btnLogIn)
                .addContainerGap(134, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmployerUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmployerUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmployerUserNameActionPerformed

    private void btnLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogInActionPerformed
        // TODO add your handling code here:
        String username = txtEmployerUserName.getText();
        String password = new String(txtEmployerPassword.getPassword());

        // Hash the user-provided password
        String hashedPassword = hashPassword(password);

        if (username.equals("admin") && history.verifyCredentials(username, hashedPassword)) {
            // Login successful
            EmployerJPanel EmployerPanel = new EmployerJPanel();
            SplitPane.setRightComponent(EmployerPanel);
        } else {
            // Login failed
            JOptionPane.showMessageDialog(this, "Invalid Login!");
        }
    }//GEN-LAST:event_btnLogInActionPerformed

    private void txtEmployerPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmployerPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmployerPasswordActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogIn;
    private javax.swing.JLabel lblEmployerPassword;
    private javax.swing.JLabel lblEmployerUserName;
    private javax.swing.JLabel lblSignIn;
    private javax.swing.JPasswordField txtEmployerPassword;
    private javax.swing.JTextField txtEmployerUserName;
    // End of variables declaration//GEN-END:variables
}

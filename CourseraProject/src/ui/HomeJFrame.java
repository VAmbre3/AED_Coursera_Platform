/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;


import login.PersonHistory;

/**
 *
 * @author visma
 */
public class HomeJFrame extends javax.swing.JFrame {

    /**
     * Creates new form HomePage
     */
    
    PersonHistory history;
    

    public HomeJFrame() {
        initComponents();
        
        history = new PersonHistory();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SplitPane = new javax.swing.JSplitPane();
        PnlControl = new javax.swing.JPanel();
        BtnStudentLogin = new javax.swing.JButton();
        BtnProfLogin = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        BtnNewStudent = new javax.swing.JButton();
        BtnProfLogin1 = new javax.swing.JButton();
        PnlWorkArea = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PnlControl.setBackground(new java.awt.Color(255, 255, 255));

        BtnStudentLogin.setBackground(new java.awt.Color(200, 16, 46));
        BtnStudentLogin.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BtnStudentLogin.setForeground(new java.awt.Color(255, 255, 255));
        BtnStudentLogin.setText("Student Login");
        BtnStudentLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnStudentLoginActionPerformed(evt);
            }
        });

        BtnProfLogin.setBackground(new java.awt.Color(200, 16, 46));
        BtnProfLogin.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BtnProfLogin.setForeground(new java.awt.Color(255, 255, 255));
        BtnProfLogin.setText("Professor Login");
        BtnProfLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnProfLoginActionPerformed(evt);
            }
        });

        lblTitle.setBackground(new java.awt.Color(204, 204, 204));
        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(200, 16, 46));
        lblTitle.setText("Couresera");

        BtnNewStudent.setBackground(new java.awt.Color(200, 16, 46));
        BtnNewStudent.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BtnNewStudent.setForeground(new java.awt.Color(255, 255, 255));
        BtnNewStudent.setText("New Student");
        BtnNewStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNewStudentActionPerformed(evt);
            }
        });

        BtnProfLogin1.setBackground(new java.awt.Color(0, 0, 0));
        BtnProfLogin1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BtnProfLogin1.setForeground(new java.awt.Color(255, 255, 255));
        BtnProfLogin1.setText("Admin Login");
        BtnProfLogin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnProfLogin1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PnlControlLayout = new javax.swing.GroupLayout(PnlControl);
        PnlControl.setLayout(PnlControlLayout);
        PnlControlLayout.setHorizontalGroup(
            PnlControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlControlLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PnlControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(BtnProfLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnStudentLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTitle)
                    .addComponent(BtnNewStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnProfLogin1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PnlControlLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {BtnProfLogin, BtnStudentLogin});

        PnlControlLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {BtnNewStudent, BtnProfLogin1});

        PnlControlLayout.setVerticalGroup(
            PnlControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlControlLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addComponent(BtnProfLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addComponent(BtnStudentLogin)
                .addGap(82, 82, 82)
                .addComponent(BtnNewStudent)
                .addGap(81, 81, 81)
                .addComponent(BtnProfLogin1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(209, Short.MAX_VALUE))
        );

        PnlControlLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {BtnNewStudent, BtnProfLogin, BtnStudentLogin});

        SplitPane.setLeftComponent(PnlControl);

        PnlWorkArea.setBackground(new java.awt.Color(200, 16, 46));

        javax.swing.GroupLayout PnlWorkAreaLayout = new javax.swing.GroupLayout(PnlWorkArea);
        PnlWorkArea.setLayout(PnlWorkAreaLayout);
        PnlWorkAreaLayout.setHorizontalGroup(
            PnlWorkAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1100, Short.MAX_VALUE)
        );
        PnlWorkAreaLayout.setVerticalGroup(
            PnlWorkAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );

        SplitPane.setRightComponent(PnlWorkArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SplitPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SplitPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnProfLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnProfLoginActionPerformed
        // TODO add your handling code here:
        
        ProfLoginJPanel adminLog = new ProfLoginJPanel(SplitPane);
        SplitPane.setRightComponent(adminLog);
    }//GEN-LAST:event_BtnProfLoginActionPerformed

    private void BtnStudentLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnStudentLoginActionPerformed
        // TODO add your handling code here:
        
        StudentLoginJPanel userLog = new StudentLoginJPanel(SplitPane);
        SplitPane.setRightComponent(userLog);
    }//GEN-LAST:event_BtnStudentLoginActionPerformed

    private void BtnNewStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNewStudentActionPerformed
        // TODO add your handling code here:
        
        
        NewStudentJPanel createPanel = new NewStudentJPanel(history);
        SplitPane.setRightComponent(createPanel);
    }//GEN-LAST:event_BtnNewStudentActionPerformed

    private void BtnProfLogin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnProfLogin1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnProfLogin1ActionPerformed

    /**
     * @param args the command line arguments
     * 
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnNewStudent;
    private javax.swing.JButton BtnProfLogin;
    private javax.swing.JButton BtnProfLogin1;
    private javax.swing.JButton BtnStudentLogin;
    private javax.swing.JPanel PnlControl;
    private javax.swing.JPanel PnlWorkArea;
    private javax.swing.JSplitPane SplitPane;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}
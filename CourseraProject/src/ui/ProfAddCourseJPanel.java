/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import login.PersonHistoryService;
import login.PersonHistoryServiceImpl;
import login.PersonLogin;

/**
 *
 * @author visma
 */
public class ProfAddCourseJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ProfAddCourseJPanel
     */
    
    PersonHistoryService history;
    
    public ProfAddCourseJPanel() {
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

        lblAddUser = new javax.swing.JLabel();
        btnProfAddCourse = new javax.swing.JButton();
        lblCourseName = new javax.swing.JLabel();
        txtAddCourseName = new javax.swing.JTextField();
        txtCourseDescription = new javax.swing.JTextField();
        lblCourseDescription = new javax.swing.JLabel();
        lblCourseSchedule = new javax.swing.JLabel();
        lblPrerequisites = new javax.swing.JLabel();
        lblMaxEnrollments = new javax.swing.JLabel();
        txtMaxEnrollments = new javax.swing.JTextField();
        lblSelectDays = new javax.swing.JLabel();
        CBPrerequisites = new javax.swing.JComboBox<>();
        CBmonday = new javax.swing.JCheckBox();
        CBtuesday = new javax.swing.JCheckBox();
        CBwednesday = new javax.swing.JCheckBox();
        CBthursday = new javax.swing.JCheckBox();
        CBfriday = new javax.swing.JCheckBox();

        setBackground(new java.awt.Color(255, 51, 51));

        lblAddUser.setBackground(new java.awt.Color(204, 204, 204));
        lblAddUser.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblAddUser.setForeground(new java.awt.Color(255, 255, 255));
        lblAddUser.setText("Add New Course");

        btnProfAddCourse.setText("Add Course");
        btnProfAddCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfAddCourseActionPerformed(evt);
            }
        });

        lblCourseName.setBackground(new java.awt.Color(204, 204, 204));
        lblCourseName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCourseName.setForeground(new java.awt.Color(255, 255, 255));
        lblCourseName.setText("Course Name:");

        txtAddCourseName.setForeground(new java.awt.Color(255, 255, 255));
        txtAddCourseName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddCourseNameActionPerformed(evt);
            }
        });

        txtCourseDescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCourseDescriptionActionPerformed(evt);
            }
        });

        lblCourseDescription.setBackground(new java.awt.Color(204, 204, 204));
        lblCourseDescription.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCourseDescription.setForeground(new java.awt.Color(255, 255, 255));
        lblCourseDescription.setText("Course Description:");

        lblCourseSchedule.setBackground(new java.awt.Color(204, 204, 204));
        lblCourseSchedule.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCourseSchedule.setForeground(new java.awt.Color(255, 255, 255));
        lblCourseSchedule.setText("Course Schedule:");

        lblPrerequisites.setBackground(new java.awt.Color(204, 204, 204));
        lblPrerequisites.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblPrerequisites.setForeground(new java.awt.Color(255, 255, 255));
        lblPrerequisites.setText("Prerequisites:");

        lblMaxEnrollments.setBackground(new java.awt.Color(204, 204, 204));
        lblMaxEnrollments.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblMaxEnrollments.setForeground(new java.awt.Color(255, 255, 255));
        lblMaxEnrollments.setText("Maximum Enrollments:");

        txtMaxEnrollments.setForeground(new java.awt.Color(255, 255, 255));
        txtMaxEnrollments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaxEnrollmentsActionPerformed(evt);
            }
        });

        lblSelectDays.setForeground(new java.awt.Color(255, 255, 255));
        lblSelectDays.setText("Select Days");

        CBPrerequisites.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        CBmonday.setForeground(new java.awt.Color(255, 255, 255));
        CBmonday.setText("Monday");

        CBtuesday.setForeground(new java.awt.Color(255, 255, 255));
        CBtuesday.setText("Tuesday");

        CBwednesday.setForeground(new java.awt.Color(255, 255, 255));
        CBwednesday.setText("Wednesday");
        CBwednesday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBwednesdayActionPerformed(evt);
            }
        });

        CBthursday.setForeground(new java.awt.Color(255, 255, 255));
        CBthursday.setText("Thursday");
        CBthursday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBthursdayActionPerformed(evt);
            }
        });

        CBfriday.setForeground(new java.awt.Color(255, 255, 255));
        CBfriday.setText("Friday");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(618, 618, 618)
                        .addComponent(btnProfAddCourse))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAddUser)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtAddCourseName, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(CBthursday)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(lblSelectDays)
                                                .addComponent(CBmonday)))
                                        .addGap(57, 57, 57)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(CBwednesday)
                                            .addComponent(CBtuesday))
                                        .addGap(39, 39, 39)
                                        .addComponent(CBfriday))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(CBPrerequisites, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtMaxEnrollments, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)))
                                .addComponent(txtCourseDescription, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(90, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(72, 72, 72)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblCourseName)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCourseSchedule)
                            .addComponent(lblPrerequisites)
                            .addComponent(lblMaxEnrollments)
                            .addComponent(lblCourseDescription)))
                    .addContainerGap(583, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(lblAddUser, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(txtAddCourseName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(lblSelectDays)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CBtuesday)
                            .addComponent(CBfriday))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CBwednesday))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CBmonday)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CBthursday)))
                .addGap(29, 29, 29)
                .addComponent(CBPrerequisites, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtMaxEnrollments, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(txtCourseDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(btnProfAddCourse)
                .addGap(44, 44, 44))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(105, 105, 105)
                    .addComponent(lblCourseName, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(26, 26, 26)
                    .addComponent(lblCourseSchedule, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(75, 75, 75)
                    .addComponent(lblPrerequisites, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(lblMaxEnrollments, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(lblCourseDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(188, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnProfAddCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfAddCourseActionPerformed

        String userName = txtUserName.getText();
        //int nuID = Integer.parseInt(txtNUID.getText());
        String nuID = txtNUID.getText();
        String userID =txtUserID.getText();
        char[] passwordChars = txtUserPassword.getPassword();
        String password = new String(passwordChars);
        PersonLogin newPerson = new PersonLogin(userName, nuID, userID, password);
        history.addPerson(newPerson);

        /*vs.setUserName(userName);
        vs.setNuID(nuID);
        vs.setUserID(userID);
        vs.setPassword(password);*/

        JOptionPane.showMessageDialog(this, "New User Created");

        txtUserName.setText("");
        txtNUID.setText("");
        txtUserID.setText("");
        txtUserPassword.setText("");

    }//GEN-LAST:event_btnProfAddCourseActionPerformed

    private void txtAddCourseNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddCourseNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddCourseNameActionPerformed

    private void txtCourseDescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCourseDescriptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCourseDescriptionActionPerformed

    private void txtMaxEnrollmentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaxEnrollmentsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaxEnrollmentsActionPerformed

    private void CBwednesdayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBwednesdayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBwednesdayActionPerformed

    private void CBthursdayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBthursdayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBthursdayActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CBPrerequisites;
    private javax.swing.JCheckBox CBfriday;
    private javax.swing.JCheckBox CBmonday;
    private javax.swing.JCheckBox CBthursday;
    private javax.swing.JCheckBox CBtuesday;
    private javax.swing.JCheckBox CBwednesday;
    private javax.swing.JButton btnProfAddCourse;
    private javax.swing.JLabel lblAddUser;
    private javax.swing.JLabel lblCourseDescription;
    private javax.swing.JLabel lblCourseName;
    private javax.swing.JLabel lblCourseSchedule;
    private javax.swing.JLabel lblMaxEnrollments;
    private javax.swing.JLabel lblPrerequisites;
    private javax.swing.JLabel lblSelectDays;
    private javax.swing.JTextField txtAddCourseName;
    private javax.swing.JTextField txtCourseDescription;
    private javax.swing.JTextField txtMaxEnrollments;
    // End of variables declaration//GEN-END:variables
}
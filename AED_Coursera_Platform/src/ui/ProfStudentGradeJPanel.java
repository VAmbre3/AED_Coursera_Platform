/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author visma
 */
public class ProfStudentGradeJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ProfStudentGradeJPanel
     */
    public ProfStudentGradeJPanel() {
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

        lblCourseDescription = new javax.swing.JLabel();
        lblstatus = new javax.swing.JLabel();
        txtStudentName = new javax.swing.JTextField();
        txtGrade = new javax.swing.JComboBox<>();
        lblManageUser = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblManageStudentGrade = new javax.swing.JTable();
        btnAdminView = new javax.swing.JButton();
        btnAdminDelete = new javax.swing.JButton();
        btnAdminUpdate = new javax.swing.JButton();
        lblStudentName = new javax.swing.JLabel();
        lblGrade = new javax.swing.JLabel();
        txtstatus = new javax.swing.JComboBox<>();

        lblCourseDescription.setBackground(new java.awt.Color(204, 204, 204));
        lblCourseDescription.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCourseDescription.setText("Course Description:");

        setBackground(new java.awt.Color(255, 51, 51));

        lblstatus.setBackground(new java.awt.Color(204, 204, 204));
        lblstatus.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblstatus.setForeground(new java.awt.Color(255, 255, 255));
        lblstatus.setText("Status:");

        txtGrade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblManageUser.setBackground(new java.awt.Color(204, 204, 204));
        lblManageUser.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblManageUser.setForeground(new java.awt.Color(255, 255, 255));
        lblManageUser.setText("Manage Student Grade");

        tblManageStudentGrade.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblManageStudentGrade);

        btnAdminView.setText("View User");

        btnAdminDelete.setText("Delete User");

        btnAdminUpdate.setText("Update User");

        lblStudentName.setBackground(new java.awt.Color(204, 204, 204));
        lblStudentName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblStudentName.setForeground(new java.awt.Color(255, 255, 255));
        lblStudentName.setText("Student Name");

        lblGrade.setBackground(new java.awt.Color(204, 204, 204));
        lblGrade.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblGrade.setForeground(new java.awt.Color(255, 255, 255));
        lblGrade.setText("Grade:");

        txtstatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 41, Short.MAX_VALUE)
                .addComponent(lblManageUser)
                .addGap(611, 611, 611))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(lblGrade)
                                    .addGap(115, 115, 115))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(lblStudentName)
                                    .addGap(64, 64, 64)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblstatus)
                                .addGap(114, 114, 114)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtStudentName)
                            .addComponent(txtstatus, 0, 193, Short.MAX_VALUE)
                            .addComponent(txtGrade, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(431, 431, 431)
                        .addComponent(btnAdminView)
                        .addGap(18, 18, 18)
                        .addComponent(btnAdminDelete)
                        .addGap(26, 26, 26)
                        .addComponent(btnAdminUpdate))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(lblManageUser)
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStudentName)
                    .addComponent(txtStudentName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblGrade)
                    .addComponent(txtstatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblstatus)
                    .addComponent(txtGrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 196, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdminView)
                    .addComponent(btnAdminDelete)
                    .addComponent(btnAdminUpdate))
                .addGap(212, 212, 212))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdminDelete;
    private javax.swing.JButton btnAdminUpdate;
    private javax.swing.JButton btnAdminView;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCourseDescription;
    private javax.swing.JLabel lblGrade;
    private javax.swing.JLabel lblManageUser;
    private javax.swing.JLabel lblStudentName;
    private javax.swing.JLabel lblstatus;
    private javax.swing.JTable tblManageStudentGrade;
    private javax.swing.JComboBox<String> txtGrade;
    private javax.swing.JTextField txtStudentName;
    private javax.swing.JComboBox<String> txtstatus;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student;

/**
 *
 * @author visma
 */
public class StudentLogin {
    private String name;
    private String email;
    private String studentId;
    private String password;
    private String schoolOrUniversity;
    private String levelOfEducation;
    private String phoneNumber;
    private String country;

    // Constructors
    public StudentLogin() {
        // Default constructor
    }

    public StudentLogin(String name, String email, String studentId, String password, String schoolOrUniversity,
                        String levelOfEducation, String phoneNumber, String country) {
        this.name = name;
        this.email = email;
        this.studentId = studentId;
        this.password = password;
        this.schoolOrUniversity = schoolOrUniversity;
        this.levelOfEducation = levelOfEducation;
        this.phoneNumber = phoneNumber;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSchoolOrUniversity() {
        return schoolOrUniversity;
    }

    public void setSchoolOrUniversity(String schoolOrUniversity) {
        this.schoolOrUniversity = schoolOrUniversity;
    }

    public String getLevelOfEducation() {
        return levelOfEducation;
    }

    public void setLevelOfEducation(String levelOfEducation) {
        this.levelOfEducation = levelOfEducation;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    
    
    
}

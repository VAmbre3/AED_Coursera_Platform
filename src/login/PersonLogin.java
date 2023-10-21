/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package login;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author visma
 */
public class PersonLogin {
    
    private String userName;
    private String nuID ;
    private String userID;
    private String password;
    
    

    /*public PersonLogin(String userName, String nuID, String userID, String password) {
		super();
		this.userName = userName;
		this.nuID = nuID;
		this.userID = userID;
		this.password = hashPassword(password);
	}
    */

    public PersonLogin(String userName, String nuID, String userID, String password) {
        super();
        this.userName = userName;
        this.nuID = nuID;
        this.userID = userID;
        this.password = hashPassword(password); // Hash the password when setting it
    }
    
	public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNuID() {
        return nuID;
    }

    public void setNuID(String nuID) {
        this.nuID = nuID;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = hashPassword(password);
    }

    
    private String hashPassword(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(password.getBytes());
            byte[] byteData = md.digest();

            // Convert the byte[] to a hexadecimal string
            StringBuilder sb = new StringBuilder();
            for (byte b : byteData) {
                sb.append(Integer.toString((b & 0xff) + 0x100, 16).substring(1));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null; // Handle the error appropriately in your application
        }
    }

    
    
}

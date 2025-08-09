/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package network.Model;

/**
 *
 * @author SS
 */
public class User {
    
    private String userId;
    private String userName;
    private String password;
    private String role;
    private boolean loggedInStatus;

    public User(String userId, String userName, String password, String role) {
        this.userId = userId;
        this.userName = userName;
        this.password = password;
        this.role = role;
        this.loggedInStatus = false;
    }

    public String getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setLoggedInStatus(boolean loggedInStatus) {
        this.loggedInStatus = loggedInStatus;
    }
    
    
    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public boolean isLoggedIn() {
        return loggedInStatus;
    }

    public boolean login(String inputPassword) {
        if (this.password.equals(inputPassword)) {
            loggedInStatus = true;
            System.out.println(role + " " + userName + " logged in successfully.");
            return true;
        } else {
            System.out.println("Invalid credentials for " + role + ".");
            return false;
        }
    }

    public void logout() {
        loggedInStatus = false;
        System.out.println(role + " " + userName + " logged out.");
    }
}

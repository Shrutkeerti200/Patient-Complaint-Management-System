/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package network.Model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Abhishek Patil
 */
public class UserDirectory {
    
    
    private List<User> userList;

    public UserDirectory() {
        this.userList = new ArrayList<>();
    }

    // Add a user to the directory
    public void addUser(User user) {
        userList.add(user);
    }

    // Retrieve a user by userId
    public User getUserById(String userId) {
        for (User user : userList) {
            if (user.getUserId().equals(userId)) {
                return user;
            }
        }
        return null; // User not found
    }

    // Retrieve all users
    public List<User> getUserList() {
        return userList;
    }
    
    
}

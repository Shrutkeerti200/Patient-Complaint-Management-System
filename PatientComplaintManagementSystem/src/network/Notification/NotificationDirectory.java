/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package network.Notification;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Abhishek Patil
 */
public class NotificationDirectory {
    ArrayList<Notification> notifications;

    public NotificationDirectory() {
        notifications = new ArrayList();
        
    }

    public ArrayList<Notification> getNotifications() {
        return notifications;
    }

    public void setNotifications(ArrayList<Notification> notifications) {
        this.notifications = notifications;
    }
    
    public void addNewNotification(Notification notification){
        this.notifications.add(notification);
    
    }
    
    public List<Notification> getNotificationsForRoleAndUser(String toRole, String toUser) {
    return notifications.stream()
            .filter(notification -> notification.getToRole().equalsIgnoreCase(toRole) &&
                                    (toUser == null || notification.getToUser().equalsIgnoreCase(toUser)))
            .collect(Collectors.toList());
}
public List<Notification> getNotificationsForToUser(String toUserId) {
    return notifications.stream()
            .filter(notification -> notification.getToUser().equals(toUserId))
            .collect(Collectors.toList());
}
    
    
}

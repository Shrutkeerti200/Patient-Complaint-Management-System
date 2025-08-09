/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package network.Notification;

/**
 *
 * @author SS
 */
public class Notification {

    private static int reportCounter = 1;
    private String notificationId ;
    private String Status;
    private String timestamp;
    private String fromRole;
    private String toRole;
    private String regarding;
    private String toUser;
    private String AdditionalNote;
   
    public Notification(String Status, String timestamp, String fromRole, String toRole, String regarding) {
        this.Status = Status;
        this.timestamp = timestamp;
        this.fromRole = fromRole;
        this.toRole = toRole;
        this.regarding = regarding;
        this.notificationId = "R" + reportCounter++;
        
    }

    public static int getReportCounter() {
        return reportCounter;
    }

    public static void setReportCounter(int reportCounter) {
        Notification.reportCounter = reportCounter;
    }

    public String getAdditionalNote() {
        return AdditionalNote;
    }

    public void setAdditionalNote(String AdditionalNote) {
        this.AdditionalNote = AdditionalNote;
    }
    
    

    public String getToUser() {
        return toUser;
    }

    public void setToUser(String toUser) {
        this.toUser = toUser;
    }
    
    
    
    public String getRegarding() {
        return regarding;
    }

    public void setRegarding(String regarding) {
        this.regarding = regarding;
    }
    
    
    public String getNotificationId() {
        return notificationId;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getFromRole() {
        return fromRole;
    }

    public void setFromRole(String fromRole) {
        this.fromRole = fromRole;
    }

    public String getToRole() {
        return toRole;
    }

    public void setToRole(String toRole) {
        this.toRole = toRole;
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package network.Complaint;

import java.util.Date;

/**
 *
 * @author SS
 */
public class Feedback {

    private String feedbackId;
    private String patientId;
    private String feedbackText;
    private Date timestamp;

    public Feedback(String feedbackId, String patientId, String feedbackText) {
        this.feedbackId = feedbackId;
        this.patientId = patientId;
        this.feedbackText = feedbackText;
        this.timestamp = new Date(); 
    }

    public String getFeedbackId() {
        return feedbackId;
    }

    public void setFeedbackId(String feedbackId) {
        this.feedbackId = feedbackId;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getFeedbackText() {
        return feedbackText;
    }

    public void setFeedbackText(String feedbackText) {
        this.feedbackText = feedbackText;
    }

    public Date getTimestamp() {
        return timestamp;
    }
}

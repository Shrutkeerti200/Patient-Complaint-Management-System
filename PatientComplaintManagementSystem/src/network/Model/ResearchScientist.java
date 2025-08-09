/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package network.Model;

import java.util.ArrayList;
import java.util.List;
import network.Complaint.Feedback;
import network.Drug.Drug;

/**
 *
 * @author SS
 */
public class ResearchScientist extends User{
    
    private String scientistId;
    private String name;
    private String fieldOfResearch;
    private String email;
    private List<Feedback> feedbackReports;
    
    public ResearchScientist(String userId, String username, String password, String scientistId, String name, String fieldOfResearch, String email) {
        super(userId, username, password, "Research Scientist");
        this.feedbackReports = new ArrayList<>();
        this.scientistId = scientistId;
        this.name = name;
        this.fieldOfResearch = fieldOfResearch;
        this.email = email;
    }

    public String getScientistId() {
        return scientistId;
    }

    public String getName() {
        return name;
    }

    public String getFieldOfResearch() {
        return fieldOfResearch;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFieldOfResearch(String fieldOfResearch) {
        this.fieldOfResearch = fieldOfResearch;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFeedbackReports(List<Feedback> feedbackReports) {
        this.feedbackReports = feedbackReports;
    }

    public List<Feedback> getFeedbackReports() {
        return feedbackReports;
    }
    
    public void analyzeDrugPerformance(Drug drug) {
        System.out.println("Analyzing performance of drug: " + drug.getDrugName());
    }

    public void submitFeedback(Feedback feedback) {
        feedbackReports.add(feedback);
        System.out.println("Feedback submitted for drug: " + feedback.getFeedbackId());
    }
}

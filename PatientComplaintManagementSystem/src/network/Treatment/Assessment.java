/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package network.Treatment;

import java.util.ArrayList;
import java.util.List;
import network.Medication.Medication;

/**
 *
 * @author SS
 */
public class Assessment {

    private String complaintId;
    private String assessmentReview;
    private String treatmentPlan;
    private double totalFees;
    private ArrayList<Medication> medicationsList;

    public Assessment(String assessmentReview, String treatmentPlan, double totalFees, ArrayList<Medication> medicationsList) {
        this.complaintId = complaintId;
        this.assessmentReview = assessmentReview;
        this.treatmentPlan = treatmentPlan;
        this.totalFees = totalFees;
        this.medicationsList = new ArrayList<>(medicationsList);
    }

    public String getComplaintId() {
        return complaintId;
    }

    public String getAssessmentReview() {
        return assessmentReview;
    }

    public String getTreatmentPlan() {
        return treatmentPlan;
    }

    public void setComplaintId(String complaintId) {
        this.complaintId = complaintId;
    }

    public void setAssessmentReview(String assessmentReview) {
        this.assessmentReview = assessmentReview;
    }

    public void setTreatmentPlan(String treatmentPlan) {
        this.treatmentPlan = treatmentPlan;
    }

    public double getTotalFees() {
        return totalFees;
    }

    public void setTotalFees(double totalFees) {
        this.totalFees = totalFees;
    }
    
    public ArrayList<Medication> getMedicationsList() {
        return medicationsList;
    }

    public void setMedicationsList(ArrayList<Medication> medicationsList) {
        this.medicationsList = medicationsList;
    }
}

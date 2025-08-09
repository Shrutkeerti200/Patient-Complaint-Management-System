/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package network.Treatment;

import java.util.List;

/**
 *
 * @author SS
 */
public class Treatment {
    
    private String treatmentId;
    private String diagnosisId;
    private List<String> treatmentPlan;
    private List<String> medicationList;

    public Treatment(String treatmentId, String diagnosisId, List<String> treatmentPlan, List<String> medicationList) {
        this.treatmentId = treatmentId;
        this.diagnosisId = diagnosisId;
        this.treatmentPlan = treatmentPlan;
        this.medicationList = medicationList;
    }
    
    public String getTreatmentId() {
        return treatmentId;
    }

    public void setTreatmentId(String treatmentId) {
        this.treatmentId = treatmentId;
    }

    public String getDiagnosisId() {
        return diagnosisId;
    }

    public void setDiagnosisId(String diagnosisId) {
        this.diagnosisId = diagnosisId;
    }

    public List<String> getTreatmentPlan() {
        return treatmentPlan;
    }

    public void setTreatmentPlan(List<String> treatmentPlan) {
        this.treatmentPlan = treatmentPlan;
    }

    public List<String> getMedicationList() {
        return medicationList;
    }

    public void setMedicationList(List<String> medicationList) {
        this.medicationList = medicationList;
    }
}

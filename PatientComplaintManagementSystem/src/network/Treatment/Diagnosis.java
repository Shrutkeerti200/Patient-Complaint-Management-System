/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package network.Treatment;

/**
 *
 * @author SS
 */
public class Diagnosis {

    private String diagnosisId;
    private String complaintId;
    private String diagnosisDetails;
    private String createDate;
    private String timestamp;

    public Diagnosis(String diagnosisId, String complaintId, String diagnosisDetails, String createDate, String timestamp) {
        this.diagnosisId = diagnosisId;
        this.complaintId = complaintId;
        this.diagnosisDetails = diagnosisDetails;
        this.createDate = createDate;
        this.timestamp = timestamp;
    }
    
    public String getDiagnosisId() {
        return diagnosisId;
    }

    public void setDiagnosisId(String diagnosisId) {
        this.diagnosisId = diagnosisId;
    }

    public String getComplaintId() {
        return complaintId;
    }

    public void setComplaintId(String complaintId) {
        this.complaintId = complaintId;
    }

    public String getDiagnosisDetails() {
        return diagnosisDetails;
    }

    public void setDiagnosisDetails(String diagnosisDetails) {
        this.diagnosisDetails = diagnosisDetails;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
    
}

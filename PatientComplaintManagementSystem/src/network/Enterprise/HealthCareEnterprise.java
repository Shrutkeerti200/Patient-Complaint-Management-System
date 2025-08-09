/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package network.Enterprise;

/**
 *
 * @author SS
 */
public class HealthCareEnterprise extends Enterprise {
    private int healthCareId;
    private String healthCareLocation;

    public HealthCareEnterprise(String enterpriseId, String healthCareName, String healthCareLocation) {
        super(enterpriseId, healthCareName, "Healthcare");
        this.healthCareLocation = healthCareLocation;
    }

    public int getHealthCareId() {
        return healthCareId;
    }

    public String getHealthCareLocation() {
        return healthCareLocation;
    }
}

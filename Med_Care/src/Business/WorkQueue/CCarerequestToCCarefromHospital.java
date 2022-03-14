/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Enterprise.Enterprise;
import Business.CovidCare.CovidCareRequirementType;
import Business.Patients.Patient;

/**
 *
 * @author ksahi
 */
public class CCarerequestToCCarefromHospital extends WorkRequest {

    public Patient Patient;

    public int requestedUnits;

    public Enterprise sendEnterprise;
    
    
    public String ccareType;

    public String getCcareType() {
        return ccareType;
    }

    public void setCcareType(String ccareType) {
        this.ccareType = ccareType;
    }

    public Enterprise getSendEnterprise() {
        return sendEnterprise;
    }

    public void setSendEnterprise(Enterprise sendEnterprise) {
        this.sendEnterprise = sendEnterprise;
    }

    public Patient getPatient() {
        return Patient;
    }

    public void setPatient(Patient Patient) {
        this.Patient = Patient;
    }

    public int getRequestedUnits() {
        return requestedUnits;
    }

    public void setRequestedUnits(int requestedUnits) {
        this.requestedUnits = requestedUnits;
    }

    @Override
    public String toString() {
        return getCcareType();
    }
}

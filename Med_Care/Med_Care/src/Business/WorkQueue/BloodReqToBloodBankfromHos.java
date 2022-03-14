/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Enterprise.Enterprise;
import Business.Patients.Patient;

/**
 * @author ksahi
 **/
public class BloodReqToBloodBankfromHos extends WorkRequest {

    public Patient Patient;

    public int requestedUnits;

    public Enterprise sendingEnterprise;

    public Enterprise getSendingEnterprise() {
        return sendingEnterprise;
    }

    public void setSendingEnterprise(Enterprise sendingEnterprise) {
        this.sendingEnterprise = sendingEnterprise;
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
        return this.getPatient().getBloodGroup();
    }
}

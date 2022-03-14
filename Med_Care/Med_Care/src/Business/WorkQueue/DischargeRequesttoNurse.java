/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Patients.Patient;

/**
 *
 * @author ksahi
 */
public class DischargeRequesttoNurse extends WorkRequest {

    private Patient patient;

    public Patient getPatient() {
        return patient;
    }

    private String pName;

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }
    
    public DischargeRequesttoNurse(Patient patient) {
        this.patient = patient;
        this.pName = patient.getpName();
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    
    @Override
    public String toString(){
        return this.getpName();
    }

}

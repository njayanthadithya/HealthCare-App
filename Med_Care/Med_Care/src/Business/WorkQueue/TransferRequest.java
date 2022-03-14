/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Patients.Patient;

/**
 * @author ksahi
 */
public class TransferRequest extends WorkRequest {

    private Patient patient;

    private Enterprise enterprise;

    private Employee Driver;
    
    private Enterprise sendEnterprise;

    public Enterprise getSendEnterprise() {
        return sendEnterprise;
    }

    public void setSendEnterprise(Enterprise sendEnterprise) {
        this.sendEnterprise = sendEnterprise;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }
    
    @Override
    public String toString(){
        return patient.getpName();
    }

}

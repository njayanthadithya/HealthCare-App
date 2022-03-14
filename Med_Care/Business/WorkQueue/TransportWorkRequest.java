/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author krish
 */

import Business.EmergencyPatient.EmergencyPatient;
import Business.Enterprise.Enterprise;
import Business.Patients.Patient;
import Business.Ambulance.Ambulance;
import Business.Ambulance.Ambulancedirectory;
public class TransportWorkRequest extends WorkRequest {
 
 private EmergencyPatient emergencypatient;
 private Ambulance ambulance;



    public static String getREQUEST_PROCESSING() {
        return REQUEST_PROCESSING;
    }

    public static void setREQUEST_PROCESSING(String REQUEST_PROCESSING) {
        TransportWorkRequest.REQUEST_PROCESSING = REQUEST_PROCESSING;
    }
    
    public static String REQUEST_PENDING = "Pending";
    public static String REQUEST_PROCESSING = "In Progress";
    public static String REQUEST_COMPLETED = "Completed";
 
    public TransportWorkRequest(EmergencyPatient EMSPatient,Ambulance vehicle ){
    this.emergencypatient=EMSPatient;
    this.ambulance= vehicle;
    }
    
    public boolean istransfer;
    
    public Patient transferpatient;

    public Enterprise recieverenterprise;

    public Enterprise getRecieverenterprise() {
        return recieverenterprise;
    }

    public void setRecieverenterprise(Enterprise recieverenterprise) {
        this.recieverenterprise = recieverenterprise;
    }

    
    public boolean isIstransfer() {
        return istransfer;
    }

    public void setIstransfer(boolean istransfer) {
        this.istransfer = istransfer;
    }

    public Patient getTransferpatient() {
        return transferpatient;
    }

    public void setTransferpatient(Patient transferpatient) {
        this.transferpatient = transferpatient;
    }

    public Ambulance getAmbulance() {
        return ambulance;
    }

    public void setAmbulance(Ambulance ambulance) {
        this.ambulance = ambulance;
    }

    public EmergencyPatient getEmergencypatient() {
        return emergencypatient;
    }


    public static String getREQUEST_PENDING() {
        return REQUEST_PENDING;
    }

    public static void setREQUEST_PENDING(String REQUEST_PENDING) {
        TransportWorkRequest.REQUEST_PENDING = REQUEST_PENDING;
    }

    public static String getREQUEST_COMPLETED() {
        return REQUEST_COMPLETED;
    }

    public static void setREQUEST_COMPLETED(String REQUEST_COMPLETED) {
        TransportWorkRequest.REQUEST_COMPLETED = REQUEST_COMPLETED;
    }

    public void setEmergencypatient(EmergencyPatient emergencypatient) {
        this.emergencypatient = emergencypatient;
    }

    @Override
    public String toString(){
        return emergencypatient.getPatientname();
    }
    
}
    

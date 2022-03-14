/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.EmergencyPatient.EmergencyPatient;

/**
 *
 * @author krish
 */
public class EMSNurseWorkRequest extends WorkRequest {
 
 private EmergencyPatient EMSPatient;
    
    public static String REQUEST_PENDING = "Pending";
    public static String REQUEST_PROCESSING = "In Progress";
    public static String REQUEST_COMPLETED = "Completed";
    
    public static String getREQUEST_PROCESSING() {
        return REQUEST_PROCESSING;
    }

    public static void setREQUEST_PROCESSING(String REQUEST_PROCESSING) {
        EMSNurseWorkRequest.REQUEST_PROCESSING = REQUEST_PROCESSING;
    }


 
    public EMSNurseWorkRequest(EmergencyPatient EMSPatient){
    this.EMSPatient=EMSPatient;
    }

    public EmergencyPatient getEMSPatient() {
        return EMSPatient;
    }


    public static String getREQUEST_PENDING() {
        return REQUEST_PENDING;
    }

    public static void setREQUEST_PENDING(String REQUEST_PENDING) {
        EMSNurseWorkRequest.REQUEST_PENDING = REQUEST_PENDING;
    }

    public static String getREQUEST_COMPLETED() {
        return REQUEST_COMPLETED;
    }

    public static void setREQUEST_COMPLETED(String REQUEST_COMPLETED) {
        EMSNurseWorkRequest.REQUEST_COMPLETED = REQUEST_COMPLETED;
    }

    public void setEMSPatient(EmergencyPatient EMSPatient) {
        this.EMSPatient = EMSPatient;
    }

    @Override
    public String toString(){
        return EMSPatient.getPatientname();
    }
    
}

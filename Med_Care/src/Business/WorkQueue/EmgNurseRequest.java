/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.EmgPatient.EmgPatient;

/**
 * @author ksahi
 */
public class EmgNurseRequest extends WorkRequest {
 
 private EmgPatient EmgPatient;
    
    public static String RequestPENDING = "Pending";
    public static String RequestPROCESSING = "In Progress";
    public static String RequestCOMPLETED = "Completed";
    
    public static String getRequestPROCESSING() {
        return RequestPROCESSING;
    }

    public static void setRequestPROCESSING(String RequestPROCESSING) {
        EmgNurseRequest.RequestPROCESSING = RequestPROCESSING;
    }


 
    public EmgNurseRequest(EmgPatient EMSPatient){
    this.EmgPatient=EMSPatient;
    }

    public EmgPatient getEmgPatient() {
        return EmgPatient;
    }


    public static String getRequestPENDING() {
        return RequestPENDING;
    }

    public static void setRequestPENDING(String RequestPENDING) {
        EmgNurseRequest.RequestPENDING = RequestPENDING;
    }

    public static String getRequestCOMPLETED() {
        return RequestCOMPLETED;
    }

    public static void setRequestCOMPLETED(String RequestCOMPLETED) {
        EmgNurseRequest.RequestCOMPLETED = RequestCOMPLETED;
    }

    public void setEmgPatient(EmgPatient EmgPatient) {
        this.EmgPatient = EmgPatient;
    }

    @Override
    public String toString(){
        return EmgPatient.getpName();
    }
    
}

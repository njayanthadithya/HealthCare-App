/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 * @author ksahi
 */

import Business.EmgPatient.EmgPatient;
import Business.Enterprise.Enterprise;
import Business.Patients.Patient;
import Business.Ambulance.Ambulance;
import Business.Ambulance.Ambulancedirectory;
public class TransportRequest extends WorkRequest {
 
 private EmgPatient EmgPatient;
 private Ambulance ambulance;
 
 public static String RequestPENDING = "Pending";
 public static String RequestINPROCESS = "In Progress";
 public static String RequestCOMPLETED = "Completed";

 public boolean isTransfer; 
 public Patient transferPatient;
 public Enterprise recieveEnterprise;

  
 
    public TransportRequest(EmgPatient EmgPatient,Ambulance vehicle ){
    this.EmgPatient=EmgPatient;
    this.ambulance= vehicle;
    }
    

    public Enterprise getRecieveEnterprise() {
        return recieveEnterprise;
    }

    public void setRecieveEnterprise(Enterprise recieveEnterprise) {
        this.recieveEnterprise = recieveEnterprise;
    }

    
    public boolean isIsTransfer() {
        return isTransfer;
    }

    public void setIsTransfer(boolean isTransfer) {
        this.isTransfer = isTransfer;
    }

    public Patient getTransferPatient() {
        return transferPatient;
    }

    public void setTransferPatient(Patient transferPatient) {
        this.transferPatient = transferPatient;
    }

    public Ambulance getAmbulance() {
        return ambulance;
    }

    public void setAmbulance(Ambulance ambulance) {
        this.ambulance = ambulance;
    }

    public EmgPatient getEmgPatient() {
        return EmgPatient;
    }


    public static String getRequestPENDING() {
        return RequestPENDING;
    }

    public static void setRequestPENDING(String RequestPENDING) {
        TransportRequest.RequestPENDING = RequestPENDING;
    }

    public static String getRequestCOMPLETED() {
        return RequestCOMPLETED;
    }

    public static void setRequestCOMPLETED(String RequestCOMPLETED) {
        TransportRequest.RequestCOMPLETED = RequestCOMPLETED;
    }

    public void setEmgPatient(EmgPatient EmgPatient) {
        this.EmgPatient = EmgPatient;
    }

    @Override
    public String toString(){
        return EmgPatient.getpName();
    }
    
}
    

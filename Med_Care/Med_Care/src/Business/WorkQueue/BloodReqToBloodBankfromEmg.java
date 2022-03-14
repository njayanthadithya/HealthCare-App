/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.EmgPatient.EmgPatient;
import Business.UserAccount.UserAccount;

/**
 * @author ksahi
 **/
public class BloodReqToBloodBankfromEmg extends WorkRequest {

    public String pName;
    public String bloodGroup;
    public static String RequestPENDING = "Pending";
    public static String RequestREJECT = "Declined";
    public static String RequestINPROGRESS = "In Progress";
    public static String RequestCOMPLETE = "Completed";
    public String requestedUnits;
    public UserAccount userAccount;

    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }

    public static String getRequestPENDING() {
        return RequestPENDING;
    }

    public static void setRequestPENDING(String RequestPENDING) {
        BloodReqToBloodBankfromEmg.RequestPENDING = RequestPENDING;
    }

    public static String getRequestREJECT() {
        return RequestREJECT;
    }

    public static void setRequestREJECT(String RequestREJECT) {
        BloodReqToBloodBankfromEmg.RequestREJECT = RequestREJECT;
    }

    public static String getRequestINPROGRESS() {
        return RequestINPROGRESS;
    }

    public static void setRequestINPROGRESS(String RequestINPROGRESS) {
        BloodReqToBloodBankfromEmg.RequestINPROGRESS = RequestINPROGRESS;
    }

    public static String getRequestCOMPLETE() {
        return RequestCOMPLETE;
    }

    public static void setRequestCOMPLETE(String RequestCOMPLETE) {
        BloodReqToBloodBankfromEmg.RequestCOMPLETE = RequestCOMPLETE;
    }
    
    
    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getRequestedUnits() {
        return requestedUnits;
    }

    public void setRequestedUnits(String requestedUnits) {
        this.requestedUnits = requestedUnits;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }
    

    public BloodReqToBloodBankfromEmg(String pName, String bloodGroup, String requestedUnits) {
        this.pName = pName;
        this.bloodGroup = bloodGroup;
        this.requestedUnits = requestedUnits;
    }

    @Override
    public String toString(){
        return getBloodGroup();
    }

 

}

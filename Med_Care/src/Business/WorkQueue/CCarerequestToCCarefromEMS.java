/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.EmgPatient.EmgPatient;
import Business.UserAccount.UserAccount;

/**
 *
 * @author ksahi
 */
public class CCarerequestToCCarefromEMS extends WorkRequest {

    public String pName;
    public String CCareType;
    public String reqUnits;
    public UserAccount userAccount;
    public static String RequestPENDING = "Pending";
    public static String RequestREJECT = "Declined";
    public static String RequestINPROGRESS = "In Progress";
    public static String RequestCOMPLETE = "Completed";

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

    public String getCCareType() {
        return CCareType;
    }

    public void setCCareType(String CCareType) {
        this.CCareType = CCareType;
    }
    
    public String getReqUnits() {
        return reqUnits;
    }

    public void setReqUnits(String reqUnits) {
        this.reqUnits = reqUnits;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }
    

    public CCarerequestToCCarefromEMS(String patientName, String ccareType, String reqUnits) {
        this.pName = patientName;
        this.CCareType = ccareType;
        this.reqUnits = reqUnits;
    }

    @Override
    public String toString(){
        return getCCareType();
    }

}

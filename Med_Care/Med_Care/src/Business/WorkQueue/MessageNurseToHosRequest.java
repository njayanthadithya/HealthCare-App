/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.EmgPatient.EmgPatient;

/**
 *
 * @author ksahi
 */
public class MessageNurseToHosRequest extends WorkRequest {
    public String message;
    public String pName;

  
    public MessageNurseToHosRequest(String message, String pName) {
        this.message = message;
        this.pName = pName;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
}

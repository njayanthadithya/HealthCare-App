/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.UserAccount.UserAccount;
import java.sql.Time;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * @author ksahi
 */
public abstract class WorkRequest {

    private String message;
    private UserAccount Issuer;
    private UserAccount receipient;
    private String taskStatus;
    private Date reqDate;
    private Date updatedDate;
    private LocalDateTime time;

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }
   
    
    public WorkRequest(){
        reqDate = new Date();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public UserAccount getIssuer() {
        return Issuer;
    }

    public void setIssuer(UserAccount Issuer) {
        this.Issuer = Issuer;
    }

    public UserAccount getReceipient() {
        return receipient;
    }

    public void setReceipient(UserAccount receipient) {
        this.receipient = receipient;
    }

    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    public Date getReqDate() {
        return reqDate;
    }

    public void setReqDate(Date reqDate) {
        this.reqDate = reqDate;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }
    
     @Override
    public String toString(){
        return Issuer.getUsername();
    }
}

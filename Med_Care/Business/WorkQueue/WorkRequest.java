/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.UserAccount.Useraccount;
import java.sql.Time;
import java.time.LocalDateTime;
import java.util.Date;

/**
 *
 * @author raunak
 */
public abstract class WorkRequest {

    private String message;
    private Useraccount sender;
    private Useraccount receiver;
    private String status;
    private Date requesteddate;
    private Date resolveddate;
    private LocalDateTime time;

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }
   
    
    public WorkRequest(){
        requesteddate = new Date();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Useraccount getSender() {
        return sender;
    }

    public void setSender(Useraccount sender) {
        this.sender = sender;
    }

    public Useraccount getReceiver() {
        return receiver;
    }

    public void setReceiver(Useraccount receiver) {
        this.receiver = receiver;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getRequesteddate() {
        return requesteddate;
    }

    public void setRequesteddate(Date requesteddate) {
        this.requesteddate = requesteddate;
    }

    public Date getResolveddate() {
        return resolveddate;
    }

    public void setResolveddate(Date resolveddate) {
        this.resolveddate = resolveddate;
    }
    
     @Override
    public String toString(){
        return sender.getUsername();
    }
}

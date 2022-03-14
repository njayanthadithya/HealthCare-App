/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.ArrayList;

/**
 * @author ksahi
 */
public class WorkQueue {
    
    private ArrayList<WorkRequest> workRequestAList;

    public WorkQueue() {
        workRequestAList = new ArrayList();
    }

    public ArrayList<WorkRequest> getWorkRequestAList() {
        return workRequestAList;
    }
}
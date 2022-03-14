/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class WorkQueue {
    
    private ArrayList<WorkRequest> workrequestlist;

    public WorkQueue() {
        workrequestlist = new ArrayList();
    }

    public ArrayList<WorkRequest> getWorkrequestlist() {
        return workrequestlist;
    }
}
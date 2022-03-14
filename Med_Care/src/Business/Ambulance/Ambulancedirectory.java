/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Ambulance;

/**
 *
 * @author ksahi
 */

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Ambulancedirectory {
   public ArrayList<Ambulance> ambulanceAList;
    public LocalDateTime RecentlyUpdatedTime;
    
    public Ambulancedirectory(){
    
    ambulanceAList = new ArrayList<Ambulance>();

    }

    public LocalDateTime getRecentlyUpdatedTime() {
        return RecentlyUpdatedTime;
    }

    public void setRecentlyUpdatedTime(LocalDateTime RecentlyUpdatedTime) {
        this.RecentlyUpdatedTime = RecentlyUpdatedTime;
    }

    public ArrayList<Ambulance> getAmbulanceAList() {
        return ambulanceAList;
    }

    public void setAmbulanceAList(ArrayList<Ambulance> ambulanceAList) {
        this.ambulanceAList = ambulanceAList;
    }
    
    public Ambulance addAmbulance(Ambulance ambulance){
    ambulanceAList.add(ambulance);
    return ambulance;
    }
    
    public int totalAmbulance(){
    return ambulanceAList.size();
    }
    
    public void removeAmbulance(Ambulance ambulance){
    ambulanceAList.remove(ambulance);
    }
    
    
    
}

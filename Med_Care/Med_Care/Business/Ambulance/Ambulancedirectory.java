/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Ambulance;

/**
 *
 * @author krish
 */

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Ambulancedirectory {
   public ArrayList<Ambulance> ambulancelist;
    public LocalDateTime Recentlyupdated;
    
    public Ambulancedirectory(){
    
    ambulancelist = new ArrayList<Ambulance>();

    }

    public LocalDateTime getRecentlyupdated() {
        return Recentlyupdated;
    }

    public void setRecentlyupdated(LocalDateTime Recentlyupdated) {
        this.Recentlyupdated = Recentlyupdated;
    }

    public ArrayList<Ambulance> getAmbulancelist() {
        return ambulancelist;
    }

    public void setAmbulancelist(ArrayList<Ambulance> ambulancelist) {
        this.ambulancelist = ambulancelist;
    }
    
    public Ambulance addAmbulance(Ambulance ambulance){
    ambulancelist.add(ambulance);
    return ambulance;
    }
    
    public int totalambulanceCount(){
    return ambulancelist.size();
    }
    
    public void removeambulance(Ambulance ambulance){
    ambulancelist.remove(ambulance);
    }
    
    
    
}

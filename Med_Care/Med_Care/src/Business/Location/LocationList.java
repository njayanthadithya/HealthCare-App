/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Location;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * @author ksahi
 */
public class LocationList {

    private ArrayList<Location> locationAList;

    public LocationList() {
        locationAList = new ArrayList<Location>();
    }

    public ArrayList<Location> getLocationAList() {
        return locationAList;
    }

    public void setLocationAList(ArrayList<Location> locationAList) {
        this.locationAList = locationAList;
    }

    public void addLocation(String Name, int Limit) {
        Location Location = new Location(Limit);
        Location.setLocName(Name);
        locationAList.add(Location);
    }
}

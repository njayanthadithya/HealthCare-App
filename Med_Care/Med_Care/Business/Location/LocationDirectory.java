/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Location;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author krish
 */
public class LocationDirectory {

    private ArrayList<Location> locationlist;

    public LocationDirectory() {
        locationlist = new ArrayList<Location>();
    }

    public ArrayList<Location> getLocationlist() {
        return locationlist;
    }

    public void setLocationlist(ArrayList<Location> locationlist) {
        this.locationlist = locationlist;
    }

    public void addLocation(String Name, int size) {
        Location location = new Location(size);
        location.setLocationname(Name);
        locationlist.add(location);
    }
}

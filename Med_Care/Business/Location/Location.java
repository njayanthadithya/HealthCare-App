/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Location;

import Business.Employee.Employee;
import java.util.ArrayList;

/**
 *
 * @author krish
 */
public class Location {

    private int maximum;
    private String locationname;
    private int count;

    private ArrayList<Employee> nurselist;
    
    
    public Location(int size) {
        maximum = size;
        this.nurselist = new ArrayList<Employee>();
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getMaximum() {
        return maximum;
    }

    public ArrayList<Employee> getNurselist() {
        return nurselist;
    }

    public void setNurselist(ArrayList<Employee> nurselist) {
        this.nurselist = nurselist;
    }

    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }

    public String getLocationname() {
        return locationname;
    }

    public void setLocationname(String locationname) {
        this.locationname = locationname;
    }

   

    @Override
    public String toString() {
        return this.getLocationname();
    }

    public void addNurse(Employee emp) {
        this.nurselist.add(emp);
    }

    public Boolean checkNurse(Employee emp) {

        boolean b1 = true;
        for (Employee empnurse : this.nurselist) {
            if (empnurse.getEmpname().equals(empnurse.getEmpname())) {
                b1 = false;
                break;
            }
        }
        return b1;

}
}

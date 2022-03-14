/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Location;

import Business.Employee.Employee;
import java.util.ArrayList;

/*
 * @author ksahi
 */
public class Location {

    private int max;
    private String locName;
    private int count;

    private ArrayList<Employee> nurseAList;
    
    
    public Location(int size) {
        max = size;
        this.nurseAList = new ArrayList<Employee>();
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getMax() {
        return max;
    }

    public ArrayList<Employee> getNurseAList() {
        return nurseAList;
    }

    public void setNurseAList(ArrayList<Employee> nurseAList) {
        this.nurseAList = nurseAList;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public String getLocName() {
        return locName;
    }

    public void setLocName(String locName) {
        this.locName = locName;
    }

   

    @Override
    public String toString() {
        return this.getLocName();
    }

    public void addNurse(Employee emp) {
        this.nurseAList.add(emp);
    }

    public Boolean checkNurse(Employee emp) {

        boolean b1 = true;
        for (Employee empnurse : this.nurseAList) {
            if (empnurse.getEmployeeName().equals(empnurse.getEmployeeName())) {
                b1 = false;
                break;
            }
        }
        return b1;

}
}

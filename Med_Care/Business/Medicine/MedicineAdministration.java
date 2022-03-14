/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Medicine;

import Business.Employee.Employee;

/**
 *
 * @author Lokesh Balaji
 */
public class MedicineAdministration {
    
    private int day;
    private int time;
    private int Sequence = 0;
    private Boolean isadminis;
    private Employee administered;

    public MedicineAdministration(int day, int time) {
        this.day = day;
        this.time = time;
        this.isadminis = false;
        administered = new Employee();
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public Boolean getIsadminis() {
        return isadminis;
    }

    public void setIsadminis(Boolean isadminis) {
        this.isadminis = isadminis;
    }

    public Employee getAdministered() {
        return administered;
    }

    public void setAdministered(Employee administered) {
        this.administered = administered;
    }
    
      @Override
    public String toString() {
        return this.getDay() + "";
    }
    
}

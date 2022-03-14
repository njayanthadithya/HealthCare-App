/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Medicine;

import Business.Employee.Employee;

/**
 *
 * @author jayanthadithya
 */
public class MedAdministration {
    
    private int day;
    private int time;
    private int Seq = 0;
    private Boolean isadmin;
    private Employee administered;

    public MedAdministration(int day, int time) {
        this.day = day;
        this.time = time;
        this.isadmin = false;
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

    public Boolean getIsadmin() {
        return isadmin;
    }

    public void setIsadmin(Boolean isadmin) {
        this.isadmin = isadmin;
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

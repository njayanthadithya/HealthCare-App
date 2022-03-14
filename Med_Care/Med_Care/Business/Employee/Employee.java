/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

/**
 *
 * @author Lokesh Balaji
 */
public class Employee {
    
    private String empname;
    private int empid;
    private static int count = 1;
    
    
    public Employee() {
        empid = count;
        count++;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }
    
    @Override
    public String toString() {
        return empname;
    }
    
}

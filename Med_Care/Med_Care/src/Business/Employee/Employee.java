/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

/*
 * @author ksahi
 */
public class Employee {
    
    private String employeeName;
    private int employeeId;
    private static int count = 1;
    
    
    public Employee() {
        employeeId = count;
        count++;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    
    @Override
    public String toString() {
        return employeeName;
    }
    
}

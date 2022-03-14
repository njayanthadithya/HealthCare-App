/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import java.util.ArrayList;

/*
 * @author ksahi
 */
public class EmployeeDirectory {
    
    private ArrayList<Employee> employeeAList;

    public EmployeeDirectory() {
        employeeAList = new ArrayList();
    }

    public ArrayList<Employee> getEmployeeAList() {
        return employeeAList;
    }

    
    public Employee createEmployee(String Name){
        Employee employee = new Employee();
        employee.setEmployeeName(Name);
        employeeAList.add(employee);       
        return employee;
    }
    
}

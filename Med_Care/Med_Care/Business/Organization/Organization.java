/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Employee.EmployeeDirectory;
import Business.Roles.Role;
import Business.UserAccount.Useraccountdirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author monishmm
 */
public abstract class Organization {

    private String name;
    private WorkQueue workqueue;
    private EmployeeDirectory employeedirectory;
    private Useraccountdirectory useraccountdirectory;
    private int organizationid;
    private static int count = 0;
    //private String value;

    public enum Type {

        Admin("Admin Organization"), Doctor("Doctor Organization"), Lab("Lab Organization"), Nurse("Nurse Organization"),
        Manager("Manager Organization"), Clinicians("Clinical Organization"), Donor("Donor Organization"),EmergencycareAdmin("Emergencycare Organization"),
        EmergencycareManager("Emergencycare Organization"),Driver("Driver Organization"),EmergencycareNurse("Emergencycarenurse Organization");

        private String value;

        private Type(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

    }

    public Organization(String name) {
        this.name = name;
        workqueue = new WorkQueue();
        employeedirectory = new EmployeeDirectory();
        useraccountdirectory = new Useraccountdirectory();
        organizationid = count;
        ++count;
    }

    public abstract ArrayList<Role> getSupportedRole();

    public Useraccountdirectory getUseraccountdirectory() {
        return useraccountdirectory;
    }

    public int getOrganizationid() {
        return organizationid;
    }

    public EmployeeDirectory getEmployeedirectory() {
        return employeedirectory;
    }

    public String getName() {
        return name;
    }

    public WorkQueue getWorkqueue() {
        return workqueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkqueue(WorkQueue workqueue) {
        this.workqueue = workqueue;
    }

    @Override
    public String toString() {
        return name;
    }

}

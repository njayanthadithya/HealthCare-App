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
 * @author Rutvi Patel
 */
public abstract class Organization {

    private String organzationName;
    private WorkQueue workqueue;
    private EmployeeDirectory employeedirectory;
    private Useraccountdirectory useraccountdirectory;
    private int organizationid;
    private static int count = 0;
    //private String value;

    public enum Type {

        Admin("Admin Organization"), Doctor("Doctor Organization"), Lab("Lab Organization"), Nurse("Nurse Organization"),
        Manager("Manager Organization"), Physicians("Physicians Organization"), Donor("Donor Organization"),EmgCareAdmin("EmgCareAdmin Organization"),
        EmgCareManager("EmgCareManager Organization"),Driver("Driver Organization"),EmgCareNurse("EmgCareNurse Organization"),
        CCarePhysicians("CCarePhysician Organization"),CCareManager("CCareManager Organization");

        private String value;

        private Type(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

    }

    public Organization(String organzationName) {
        this.organzationName = organzationName;
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

    public String getOrganzationName() {
        return organzationName;
    }

    public WorkQueue getWorkqueue() {
        return workqueue;
    }

    public void setOrganzationName(String organzationName) {
        this.organzationName = organzationName;
    }

    public void setWorkqueue(WorkQueue workqueue) {
        this.workqueue = workqueue;
    }

    public void setEmployeedirectory(EmployeeDirectory employeedirectory) {
        this.employeedirectory = employeedirectory;
    }

    public void setUseraccountdirectory(Useraccountdirectory useraccountdirectory) {
        this.useraccountdirectory = useraccountdirectory;
    }

    public void setOrganizationid(int organizationid) {
        this.organizationid = organizationid;
    }

    @Override
    public String toString() {
        return organzationName;
    }

}

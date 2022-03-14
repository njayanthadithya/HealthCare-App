/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Employee.Employee;
import Business.Network.Network;
import Business.Roles.Role;
import Business.WorkQueue.WorkQueue;

/**
 *
 * @author Rutvi Patel
 */
public class UserAccount {
    
    private String username;
    private String password;
    private Employee employeeUser;
    private Role role;
    private WorkQueue workqueue;
    private boolean enabled = true;
    private Network network;

    public UserAccount() {
        workqueue = new WorkQueue();
    }
    
    
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setEmployeeUser(Employee employeeUser) {
        this.employeeUser = employeeUser;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Employee getEmployeeUser() {
        return employeeUser;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public Network getNetwork() {
        return network;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }

    public WorkQueue getWorkqueue() {
        return workqueue;
    }

    
    
    @Override
    public String toString() {
        return username;
    }
    
    
    
}
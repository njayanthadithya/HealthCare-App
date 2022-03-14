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
 * @author krish
 */
public class Useraccount {
    
    private String username;
    private String password;
    private Employee empuser;
    private Role role;
    private WorkQueue workqueue;
    private boolean enabled = true;
    private Network network;

    public Useraccount() {
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

    public void setEmpuser(Employee empuser) {
        this.empuser = empuser;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Employee getEmpuser() {
        return empuser;
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
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Roles.AdminRole;
import Business.Roles.DriverRole;
import Business.Roles.Role;
import java.util.ArrayList;

/**
 *
 * @author monishmm
 */
public class Driverorganization extends Organization {
        public Driverorganization() {
        super(Type.Driver.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> role = new ArrayList();
        role.add(new DriverRole());
        return role;
    }
}

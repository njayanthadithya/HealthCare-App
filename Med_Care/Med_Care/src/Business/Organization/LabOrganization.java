/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Roles.LabPhysicianRole;
import Business.Roles.Role;
import java.util.ArrayList;

/**
 * @author Rutvi Patel
 */
public class LabOrganization extends Organization{

    public LabOrganization() {
        super(Organization.Type.Lab.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> Role = new ArrayList();
        Role.add(new LabPhysicianRole());
        return Role;
    }
  }

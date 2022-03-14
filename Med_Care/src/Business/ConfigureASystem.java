package Business;

import Business.Employee.Employee;
import Business.Roles.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author Rutvi Patel
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem System = EcoSystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
        Employee employee = System.getEmployeedirectory().createEmployee("sysadmin");
        UserAccount ua = System.getUseraccountdirectory().createAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
        
        return System;
    }
    
}

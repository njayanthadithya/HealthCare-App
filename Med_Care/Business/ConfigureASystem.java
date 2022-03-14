package Business;

import Business.Employee.Employee;
import Business.Roles.SystemAdminRole;
import Business.UserAccount.Useraccount;

/**
 *
 * @author monishmm
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
        Employee employee = system.getEmployeedirectory().createEmployee("sysadmin");
        
        Useraccount ua = system.getUseraccountdirectory().createAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
        
        return system;
    }
    
}

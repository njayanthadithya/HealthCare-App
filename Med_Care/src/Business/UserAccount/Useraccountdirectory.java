/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Employee.Employee;
import Business.Roles.Role;
import java.util.ArrayList;

/**
 *
 * @author Rutvi Patel
 */
public class Useraccountdirectory {
    
    private ArrayList<UserAccount> useraccountlist;

    public Useraccountdirectory() {
        useraccountlist = new ArrayList();
    }

    public ArrayList<UserAccount> getUseraccountlist() {
        return useraccountlist;
    }
    
    public UserAccount authenticateUser(String username, String password){
        for (UserAccount useracc : useraccountlist)
            if (useracc.getUsername().equals(username) && useracc.getPassword().equals(password)){
                return useracc;
            }
        return null;
    }
    
    public UserAccount createAccount(String username, String password, Employee employee, Role role){
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setEmployeeUser(employee);
        userAccount.setRole(role);
        useraccountlist.add(userAccount);
        return userAccount;
    }
    
    public boolean checkIfUsernameIsUnique(String username){
        for (UserAccount useracc : useraccountlist){
            if (useracc.getUsername().equals(username))
                return false;
        }
        return true;
    }
    
    public void removeUserAccount(UserAccount userAccount)
    {
        useraccountlist.remove(userAccount);
    }
}

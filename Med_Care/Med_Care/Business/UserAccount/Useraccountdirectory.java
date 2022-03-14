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
 * @author krish
 */
public class Useraccountdirectory {
    
    private ArrayList<Useraccount> useraccountlist;

    public Useraccountdirectory() {
        useraccountlist = new ArrayList();
    }

    public ArrayList<Useraccount> getUseraccountlist() {
        return useraccountlist;
    }
    
    public Useraccount authenticateUser(String username, String password){
        for (Useraccount useracc : useraccountlist)
            if (useracc.getUsername().equals(username) && useracc.getPassword().equals(password)){
                return useracc;
            }
        return null;
    }
    
    public Useraccount createAccount(String username, String password, Employee employee, Role role){
        Useraccount userAccount = new Useraccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setEmpuser(employee);
        userAccount.setRole(role);
        useraccountlist.add(userAccount);
        return userAccount;
    }
    
    public boolean checkIfUsernameIsUnique(String username){
        for (Useraccount useracc : useraccountlist){
            if (useracc.getUsername().equals(username))
                return false;
        }
        return true;
    }
    
    public void removeUserAccount(Useraccount userAccount)
    {
        useraccountlist.remove(userAccount);
    }
}

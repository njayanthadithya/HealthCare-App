/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Blood;

import java.util.ArrayList;

/**
 *
 * @author Lokesh Balaji
 */
public class Bloodgrouplist {
    
    private ArrayList<Bloodgroup> Bloodgrplist;
    
    public Bloodgrouplist(){
        Bloodgrplist = new ArrayList<Bloodgroup>();
    }

    public ArrayList<Bloodgroup> getBloodgrplist() {
        return Bloodgrplist;
    }

    public void setBloodgrplist(ArrayList<Bloodgroup> Bloodgrplist) {
        this.Bloodgrplist = Bloodgrplist;
    }
    
    public Bloodgroup addBG(Bloodgroup bgrp)
    {
        Bloodgrplist.add(bgrp);
        return bgrp;
    }
    
    public void deleteBG(Bloodgroup bgrp){
        Bloodgrplist.remove(bgrp);
    }  
    
}

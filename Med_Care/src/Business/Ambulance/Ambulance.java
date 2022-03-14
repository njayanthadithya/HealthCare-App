/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Ambulance;


import java.time.LocalDateTime;
import java.util.Date;

/*
 * @author ksahi
 */
public class Ambulance {
    private boolean availability;
    private String ambulanceNo;
    //private String manufactured_year;
    private String serialNo;
    //private String model;
    private String availableInArea;
    //private Date createdOn;
    private String yes = "Yes";
    private String no = "No";

    public Ambulance(boolean availability, String ambulanceNo, String serialNo, String availableInArea) {
        this.availability = availability;
        this.ambulanceNo = ambulanceNo;
        this.serialNo = serialNo;
        this.availableInArea = availableInArea;
    }
    
  


    
    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
    
    public String availability(){
    if (isAvailability()==true){
        return yes;
    }
    else{
    return no;
    }
    }

    public String getAmbulanceNo() {
        return ambulanceNo;
    }

    public void setAmbulanceNo(String ambulanceNo) {
        this.ambulanceNo = ambulanceNo;
    }




    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

  

    public String getAvailableInArea() {
        return availableInArea;
    }

    public void setAvailableInArea(String availableInArea) {
        this.availableInArea = availableInArea;
    }


    

    @Override
    public String toString(){
       return this.ambulanceNo;
    }    
}

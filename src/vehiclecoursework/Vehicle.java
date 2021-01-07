/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiclecoursework;

/**
 *
 * @author w1546167
 */
public abstract class Vehicle{
    private String VehicleID;
    private String Brand;
    private TimeDate EntryTime;
    private int Fees = 3;
   
    public Vehicle(String v, String b, TimeDate e){
        VehicleID = v;
        Brand = b;
        EntryTime = e;
    }
    
    public void setVehicleID(String v){
        VehicleID = v;
    }
    public String getVehicleID(){
        return VehicleID;
    }
    
    
    public void setBrand(String b){
        Brand = b;
    }
    public String getBrand(){
        return Brand;
    }
    
    
    public void setEntryTime(TimeDate e){
        EntryTime = e;
    }
    public TimeDate getEntryTime(){
        return EntryTime;
    }
    

    
    
    public String getVehicleType(){
        return null;
    }
    
    public String getVehicleDetails(){
        return null;
    }

    
    
    public int getFees() {
        return Fees;
    }

    public void setFees(int Fees) {
        this.Fees = Fees;
    }
    
    

    
}


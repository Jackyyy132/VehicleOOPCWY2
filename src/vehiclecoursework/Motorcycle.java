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
public class Motorcycle extends Vehicle {
    private int EngineSize;
    
    public Motorcycle(String v, String b, TimeDate e, int s){
        super(v,b,e);
        EngineSize = s;
    }
    public void setEngineSize(int s){
        EngineSize = s;
    }
    public int getEngineSize(){
        return EngineSize;
    }
    
    
    public String getVehicleType(){
        return "Motorcycle";
    }
    
    
    
    
    public String toString(){
        return "This MOTORCYCLE has Vehicle ID: " + this.getVehicleID() + ". " + " Entered at " + this.getEntryTime() + ". It has an engine size of " + EngineSize;
    }
    
    public String getVehicleDetails(){
        return "The Motorcycle with ID " + this.getVehicleID() + " and engine size " + EngineSize + " will now be removed";
    }

}
    


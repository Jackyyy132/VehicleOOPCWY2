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
public class TimeDate {
    private int Day;
    private int Month;
    private int Year;
    
    
    private int Hours;
    private int Minutes;
    
    public TimeDate(int d, int m, int y, int h, int min){
        Day = d;
        Month = m;
        Year = y;
        
        Hours = h;
        Minutes = min;
    }   

    public int getDay() {
        return Day;
    }
    public void setDay(int d) {
        Day = d;
    }
    
    
    
    
    
    public int getMonth() {
        return Month;
    }
    public void setMonth(int m) {
        Month = m;       
    }
    
    
    
    
    
    
    
    public int getYear() {
        return Year;
    }
    public void setYear(int y) {
        Year = y;       
    }
    
    
    
    
    
    public String toString(){
        return "Date entered: " + Day + ":" + Month + ":" + Year + " Time Entered: " + Hours + ":" + Minutes;
    }

    /**
     * @return the Hours
     */
    public int getHours() {
        return Hours;
    }

    /**
     * @param Hours the Hours to set
     */
    public void setHours(int Hours) {
        this.Hours = Hours;
    }

    /**
     * @return the Minutes
     */
    public int getMinutes() {
        return Minutes;
    }

    /**
     * @param Minutes the Minutes to set
     */
    public void setMinutes(int Minutes) {
        this.Minutes = Minutes;
    }
}


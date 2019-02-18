/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage1;

/**
 *
 * @author mirajul
 */
public class CurrentConditionDisplay implements DisplayData, Observer{
    
    Subject sub;

    private double temperature;
    private double pressure;
    private double humidity;
    
    public CurrentConditionDisplay(Subject sub) {
        this.sub=sub;
        sub.addObserver(this);
    }
    
    @Override
    public void update(double temperature, double pressure, double humidity) {
        this.temperature=temperature;
        this.pressure=pressure;
        this.humidity=humidity;
        display();
    }
    
    
    @Override
    public void display() {
        
        System.out.println("Current: Temp= "+ temperature+ " , Pressure= " + pressure + " , Humidiyty= "+humidity);
    }

    
    
}

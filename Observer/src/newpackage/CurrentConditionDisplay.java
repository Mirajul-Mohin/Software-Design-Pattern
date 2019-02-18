package newpackage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author mirajul
 */
public class CurrentConditionDisplay implements Observer, DisplayData{

    
    private Subject weatherData;
    private double temperature;
    private double pressure;
    private double humidity;
    
    public CurrentConditionDisplay(Subject subject)
    {
        this.weatherData=subject;
        weatherData.addObserver(this);
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
        System.out.println("Current condition: Temp= "+temperature+", Pressure= "+pressure);
    }
    
    
}

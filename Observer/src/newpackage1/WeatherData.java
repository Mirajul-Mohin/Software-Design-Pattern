/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mirajul
 */
public class WeatherData implements Subject{
    
    private double temperature;
    private double pressure;
    private double humidity;
    
    public List<Observer> observers = new ArrayList<>();
    
    public void setState(double temperature, double pressure, double humidity)
    {
        this.temperature=temperature;
        this.pressure=pressure;
        this.humidity=humidity;
        notifysall();
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifysall() {
        
        for(Observer observer: observers)
        {
            observer.update(temperature, pressure, humidity);
        }
        
    }
    
}

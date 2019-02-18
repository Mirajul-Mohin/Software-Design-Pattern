package newpackage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;

/**
 *
 * @author mirajul
 */
public class WeatherData implements Subject{

    
    private ArrayList<Observer> observers= new ArrayList<Observer>() ;
    
    private double temperature;
    private double pressure;
    private double humidity;
    
    public void setStates(double temperature, double pressure, double humidity)
    {
        this.humidity=humidity;
        this.pressure=pressure;
        this.temperature=temperature;
        updateObservers();
    }
    
    
    public void addObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        
     //   observers.indexOf(o);
        
        if(observers.indexOf(o)>0)
        observers.remove(observers.indexOf(o));
    }

    public void notifysAll() {
        
        for(Observer observer: observers)
        {
            observer.update(temperature, pressure,humidity);
        }
    }
    
    public void updateObservers()
    {
        notifysAll();
    }

    
    
}

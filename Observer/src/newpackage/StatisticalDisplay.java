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
public class StatisticalDisplay implements Observer,DisplayData{
    
    private Subject weatherData;
    private double temperature;
    private double total,totalTemperature;
    private double minTemperature=10000;
    private double maxTemperature=-1000;
    
    public StatisticalDisplay(Subject subject)
    {
        this.weatherData=subject;
        weatherData.addObserver(this);
    }
    
    
    
    @Override
    public void update(double temperature, double pressure, double humidity) {
        this.temperature=temperature;
        
        total++;
        totalTemperature+=temperature;
        
        if(temperature>maxTemperature)
            maxTemperature=temperature;
        if(temperature<minTemperature)
            minTemperature=temperature;
        
        
        
        
        display();
    }


    @Override
    public void display() {
        System.out.println("Statistical condition: Current Temp= "+temperature+", Min= " +minTemperature+ ", Max= "+maxTemperature);
    }
    
}

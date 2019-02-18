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
public class ObserverDemo {
    
    public static void main(String[] args) {
        
        WeatherData weatherData= new WeatherData();
        
        new CurrentConditionDisplay(weatherData);
        new StatisticalDisplay(weatherData);
        
        weatherData.setStates(10.0,15.0,20.0);
        weatherData.setStates(15,20,30);
        weatherData.setStates(20,25,40);
        
    }
    
}

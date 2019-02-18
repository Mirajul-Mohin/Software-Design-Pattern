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
public class ObserverDemo {
    
    public static void main(String[] args) {
        
        WeatherData wd= new WeatherData();
        
        new CurrentConditionDisplay(wd);
        
        wd.setState(10, 20, 30);
        wd.setState(20, 40, 50);
    }
    
}

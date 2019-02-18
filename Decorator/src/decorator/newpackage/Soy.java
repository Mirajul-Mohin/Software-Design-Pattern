/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator.newpackage;

/**
 *
 * @author mirajul
 */
public class Soy extends CondimentDecorator{
    
    Coffee coffee;
    
    Soy(Coffee coffee)
            
    {
        this.coffee=coffee;
    }
    
    public String getDescription()
    {
        return coffee.getDescription()+ ", Soy";
    }
    
    public double cost()
    {
        return coffee.cost()+0.9;
    }
    
    
}

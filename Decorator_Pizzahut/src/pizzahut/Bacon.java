/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzahut;

/**
 *
 * @author mirajul
 */
public class Bacon extends CondimentDecorator{
    
    
    Pizza pizza;

    public Bacon(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getDescription() {
        return pizza.getDescription() + ", Bacon";
    }

    public double cost() {
        return 4 + pizza.cost();
    }
    
}

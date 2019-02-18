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
public class Cheese extends CondimentDecorator{
    
    Pizza pizza;

    public Cheese(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getDescription() {
        return pizza.getDescription() + ", Cheese";
    }

    public double cost() {
        return 6 + pizza.cost();
    }
    
}

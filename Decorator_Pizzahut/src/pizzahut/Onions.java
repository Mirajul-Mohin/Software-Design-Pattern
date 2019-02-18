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
public class Onions extends CondimentDecorator{
    
    Pizza pizza;

    public Onions(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getDescription() {
        return pizza.getDescription() + ", Onion";
    }

    public double cost() {
        return 7 + pizza.cost();
    }
    
}

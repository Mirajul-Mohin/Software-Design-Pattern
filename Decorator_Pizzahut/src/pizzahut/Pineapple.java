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
public class Pineapple extends CondimentDecorator{
    
    Pizza pizza;

    public Pineapple(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getDescription() {
        return pizza.getDescription() + ", Cheeese";
    }

    public double cost() {
        return 6 + pizza.cost();
    }
    
}

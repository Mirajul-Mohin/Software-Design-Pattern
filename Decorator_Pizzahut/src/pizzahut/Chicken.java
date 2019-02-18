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
public class Chicken extends CondimentDecorator{
    
    Pizza pizza;

    public Chicken(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getDescription() {
        return pizza.getDescription() + ", Chicken";
    }

    public double cost() {
        return 3 + pizza.cost();
    }
    
}

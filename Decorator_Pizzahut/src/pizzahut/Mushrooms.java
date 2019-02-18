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
public class Mushrooms extends CondimentDecorator{
    
    Pizza pizza;

    public Mushrooms(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getDescription() {
        return pizza.getDescription() + ", Mushroom";
    }

    public double cost() {
        return 8 + pizza.cost();
    }
    
}

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
public class Sausage extends CondimentDecorator {

    Pizza pizza;

    public Sausage(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getDescription() {
        return pizza.getDescription() + ", Sausage";
    }

    public double cost() {
        return 2 + pizza.cost();
    }

}

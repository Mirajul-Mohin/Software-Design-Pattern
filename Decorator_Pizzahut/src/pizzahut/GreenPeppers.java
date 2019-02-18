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
public class GreenPeppers extends CondimentDecorator
{
    
    Pizza pizza;

    public GreenPeppers(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getDescription() {
        return pizza.getDescription() + ", Green pepper";
    }

    public double cost() {
        return 9 + pizza.cost();
    }
    
}

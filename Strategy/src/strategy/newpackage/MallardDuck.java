/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy.newpackage;

/**
 *
 * @author mirajul
 */
public class MallardDuck extends Duck{
    
    MallardDuck()
    {
        fb= new FlyWithWings();
        qb= new Quack();
    }


    @Override
    public void display() {
        System.out.println("I am Mallard Duck");
    }
    
}

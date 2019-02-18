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
public class FlyWithWings implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("I can Fly");
    }
    
    
}

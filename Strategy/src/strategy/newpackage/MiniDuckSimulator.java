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
public class MiniDuckSimulator {
    
    public static void main(String[] args) {
        
        Duck md = new MallardDuck();
        
        md.display();
        md.performFly();
        md.performQuack();
        
        
        
        Duck rd = new RubberDuck();
        rd.display();
        rd.performFly();
        rd.performQuack();
        
        
        
        Duck mod= new ModelDuck();
        mod.display();
        mod.performFly();
        mod.performQuack();
        
        
        mod.setFlyBehavior(new FlyWithRocket());
        mod.performFly();
    }
    
}

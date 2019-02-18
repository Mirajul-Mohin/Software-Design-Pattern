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
public abstract class Duck {
    
    FlyBehavior fb;
    QuackBehavior qb;
    
    
    public void setFlyBehavior(FlyBehavior fb)
    {
        this.fb=fb;
    }
    
    public void setQuackBehavior(QuackBehavior qb)
    {
        this.qb=qb;
    }
    
    
    public abstract void display();
    
    public void swim()
    {
        System.out.println("All Ducks can swim");
    }
    
    
    public void performFly()
    {
        fb.fly();
    }
    
    public void performQuack()
    {
        qb.quack();
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author mirajul
 */
public class MementoDemo {
    
    public static void main(String[] args) {
      
        Originator or= new Originator();
        CareTaker cr = new CareTaker();
        
        or.setState("State-1");
        or.setState("State-2");
        
        cr.addToMemento(or.save());
        
        or.setState("State-3");
        
        cr.addToMemento(or.save());
        
        or.setState("State-4");
        cr.addToMemento(or.save());
        
       // or.getState();
        
        or.restore(cr.getMemento());
        or.restore(cr.getMemento());
        
        
    }
    
    
    
}

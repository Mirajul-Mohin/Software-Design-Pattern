/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mirajul
 */
public class MementoDemo {
    
    
    public static void main(String[] args) {
   
      Originator originator = new Originator();
      CareTaker careTaker = new CareTaker();
      
      originator.setState("State #1");
      originator.setState("State #2");
      careTaker.addMemento(originator.save());
      
      originator.setState("State #3");
      careTaker.addMemento(originator.save());
      
      originator.setState("State #4");
      System.out.println("Current State: " + originator.getState());		
      
      originator.restore(careTaker.getMemento());
      System.out.println("Last saved State: " + originator.getState());
      originator.restore(careTaker.getMemento());
      System.out.println("Second last saved State: " + originator.getState());
   }
}

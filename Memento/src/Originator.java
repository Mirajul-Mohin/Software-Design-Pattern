/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mirajul
 */
public class Originator {
    
    private String state;

   public void setState(String state){
      this.state = state;
       System.out.println("Setting State to: "+ state);
   }

   public String getState(){
      return state;
   }

   public Memento save(){
       System.out.println("Saving to Memento");
      return new Memento(state);
   }

   public void restore(Memento m){
      state = m.getState();
       System.out.println("State after restoring from memento: " + state);
   }
    
}

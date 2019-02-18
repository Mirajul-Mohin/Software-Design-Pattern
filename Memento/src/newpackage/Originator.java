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
public class Originator {
    
    
    private String state;
    
    public String getState()
    {
        return state;
    }
    
    public void setState(String state)
    {
        System.out.println("Setting state to: "+ state);
        this.state=state;
    }
    
    public Memento save()
    {
        System.out.println("Saving State..");
        return new Memento(state);
    }
    
    public void restore(Memento m)
    {
        this.state=m.getState();
        System.out.println("State after restoring from memento: "+ state);
    }

  
    
}

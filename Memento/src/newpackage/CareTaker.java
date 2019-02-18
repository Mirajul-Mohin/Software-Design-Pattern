/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mirajul
 */


public class CareTaker {
    
    int count=0;
    
    private List<Memento> mementoList= new ArrayList<> ();
    
    public void addToMemento(Memento state)
    {
        
        mementoList.add(state);
        count++;
    }
    
    public Memento getMemento()
    {
        count--;
        return mementoList.get(count);
    }
    
}

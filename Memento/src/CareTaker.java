
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mirajul
 */
public class CareTaker {
    
    private int count=0;
    
    private List<Memento> mementoList = new ArrayList<Memento>();

   public void addMemento(Memento state){
      mementoList.add(state);
      count++;
   }

   public Memento getMemento(){
       count--;
      return mementoList.get(count);
      
   }
}

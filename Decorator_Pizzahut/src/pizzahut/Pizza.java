/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzahut;

/**
 *
 * @author mirajul
 */
public abstract class Pizza {
    String description;
    
    public String getDescription()
    {
        return description;
    }
    
    public abstract double cost();
            
}

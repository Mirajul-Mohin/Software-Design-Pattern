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
public class GrilledPizza extends Pizza{
    
    public GrilledPizza()
    {
        description= "Grilled Pizza";
    }
    
    public double cost() {
        return 16;
    }
    
}

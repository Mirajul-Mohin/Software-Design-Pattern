/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

/**
 *
 * @author mirajul
 */
public class RoundHole {
    
    private int radius;
    
    RoundHole(int radius)
    {
         this.radius=radius;
    }
    
    public int getRadius()
    {
        return radius;
    }
    
    public boolean fits(RoundPeg peg)
    {
        return radius>= peg.getRadius();
    }
    
}

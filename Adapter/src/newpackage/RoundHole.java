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
public class RoundHole {
    
    private double radius;
    
    RoundHole(double radius)
    {
        this.radius=radius;
    }
    
    public double getRadius()
    {
        return radius;
    }
    
    public boolean fits(RoundPeg peg)
    {
        return radius >= peg.getRadius();
    }
    
    
}

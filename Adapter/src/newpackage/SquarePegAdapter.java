/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import static java.lang.Math.sqrt;

/**
 *
 * @author mirajul
 */
public class SquarePegAdapter extends RoundPeg{
    
    SquarePeg peg;
    
    SquarePegAdapter(SquarePeg peg)
    {
        this.peg=peg;
    }
    
    public double getRadius()
    {
        return peg.getWidth()*sqrt(2)/2;
    }
    
}

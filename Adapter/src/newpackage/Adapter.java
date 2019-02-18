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
public class Adapter {
    
    public static void main(String[] args)
    {
        RoundHole rh = new RoundHole(5);
        SquarePeg sp = new SquarePeg(4);
        RoundPeg rp = new RoundPeg(6);
        
        boolean bl = rh.fits(rp);
        boolean bl1 = rh.fits(new SquarePegAdapter(sp));
        
        System.out.println(bl);
        System.out.println(bl1);
        
    }
    
}

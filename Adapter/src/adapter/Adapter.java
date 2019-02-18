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
public class Adapter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        RoundHole rh= new RoundHole(5);
        SquarePeg sq=new SquarePeg(4);
        RoundPeg rq= new RoundPeg(6);
        
        boolean bt= rh.fits(new SquarePegAdapter(sq));
        boolean bt1= rh.fits(rq);
        System.out.println(bt);
        System.out.println(bt1);
    }
    
}

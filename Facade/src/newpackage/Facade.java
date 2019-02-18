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
public class Facade {
    
    public static void main(String[] args) {
        
        ShapeMaker sm= new ShapeMaker();
        sm.drawCircle();
        sm.drawCircle();
        sm.drawRec();
        sm.drawSquare();
        
    }
    
}

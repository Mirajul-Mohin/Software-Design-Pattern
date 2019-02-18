/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator.newpackage;

/**
 *
 * @author mirajul
 */
public class Decaf extends Coffee{

    
    Decaf()
    {
        description= "Decaf";
    }
    
    public double cost() {
        return 12;
    }
    
}

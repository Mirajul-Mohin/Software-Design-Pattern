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
public class HouseBlend extends Coffee{

    
    HouseBlend()
    {
        description= "HouseBlend";
    }
    
    public double cost() {
        return 14;
    }
    
}

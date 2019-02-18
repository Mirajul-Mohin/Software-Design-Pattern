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
public class StarBuzz {
    
    
    public static void main(String[] args) {
        
        Coffee coffee1= new HouseBlend();
        System.out.println(coffee1.getDescription() + "$" +coffee1.cost());
        
        Coffee coffee2= new HouseBlend();
        coffee2= new Mocha(coffee2);
        coffee2= new Soy(coffee2);
        System.out.println(coffee2.getDescription()+ "$" + coffee2.cost());
        
    }
}

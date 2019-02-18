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
public class ShapeMaker {
    
    private Shape rectangle;
    private Shape circle;
    private Shape square;

    public ShapeMaker() {
        rectangle= new Rectangle();
        circle= new Circle();
        square= new Square();
    }
    
    public void drawRec()
    {
        rectangle.draw();
    }
    
    public void drawCircle()
    {
        circle.draw();
    }
    public void drawSquare()
    {
        square.draw();
    }
    
    
    
    
}

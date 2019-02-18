package pizzahut;

/**
 *
 * @author mirajul
 */
public class PizzaHut {
    public static void main(String[] args) {

        Pizza pizza2=new GreekPizza();
        System.out.println(pizza2.getDescription() + " $" + pizza2.cost());
        
        Pizza pizza3= new ChicagoPizza();
        pizza3=new Bacon(pizza3);
        pizza3=new Sausage(pizza3);
        System.out.println(pizza3.getDescription() + " $" + pizza3.cost());
        
        Pizza pizza4= new SushiPizza();
        pizza4=new Onions(pizza4);
        pizza4=new Cheese(pizza4);
        pizza4=new GreenPeppers(pizza4);
        System.out.println(pizza4.getDescription() + " $" + pizza4.cost());
        
        
        
    }
    
}

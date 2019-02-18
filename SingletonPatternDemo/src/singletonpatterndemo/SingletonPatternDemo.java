
package singletonpatterndemo;

public class SingletonPatternDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //illegal construct
      //Compile Time Error: The constructor SingleObject() is not visible
      //SingleObject object = new SingleObject();

      //Get the only object available
      
      //SingleObject obj= new SingleObject();
      
      SingleObject object = SingleObject.getInstance();

      //show the message
      object.showMessage();
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singletonpatterndemo;

/**
 *
 * @author mirajul
 */
public class SingleObject {
    
    
//    //Early instatiation
//     //create an object of SingleObject
//   private static SingleObject instance = new SingleObject();
//
//   //make the constructor private so that this class cannot be
//   //instantiated
//   private SingleObject(){}
//
//   //Get the only object available
//   public static SingleObject getInstance(){
//      return instance;
//   }
//
//   public void showMessage(){
//      System.out.println("Hello World!");
//   }
   
    
     //Lazy instatiation
     //create an object of SingleObject
//   private static SingleObject instance =null;
//
//   //make the constructor private so that this class cannot be
//   //instantiated
//   private SingleObject(){}
//
//   //Get the only object available
//   public static synchronized SingleObject getInstance(){
//      if(instance==null)
//      {
//          instance= new SingleObject();
//      }
//      return instance;
//   }
//
//   public void showMessage(){
//      System.out.println("Hello World!");
//   }
   
    
     //Early instatiation
     //create an object of SingleObject
   private static SingleObject instance = null;

   //make the constructor private so that this class cannot be
   //instantiated
   private SingleObject(){}

   //Get the only object available
   public static SingleObject getInstance(){
       
       if(instance==null)
       {
           synchronized(SingleObject.class)
           {
               if(instance==null)
               {
                   instance= new SingleObject();
               }
               
           }
       }
       
      return instance;
   }

   public void showMessage(){
      System.out.println("Hello World!");
   }
   
    
    
}




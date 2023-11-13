/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern;

/**
 *
 * @author MY LAPTOP
 */
public class SingletonPattern {
    private static SingletonPattern instance;
    
    private SingletonPattern(){
        System.out.println("new Object has been created");
    }
    public static SingletonPattern getInstance(){
        if(instance==null){
            instance= new SingletonPattern();
            
        }
                return instance;
            }
            
            
       public void hello(){
            System.out.println("hello from singlton");
        }
    
    
}

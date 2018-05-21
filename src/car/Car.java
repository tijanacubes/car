/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car;

/**
 *
 * @author qa-prepodne
 */
public class Car {
    
    int maxSpeed =120 ;
    int minSpeed = 40 ;
    double weight = 1200; 
    boolean isTheCarOn =false;
    char condition = 'A';
    
    public void printVariables() {
       
         System.out.println("Maksimalna brzina: " + maxSpeed);
         System.out.println("Minimalna brzina: " +minSpeed);
         System.out.println("Tezina: " + weight);
         System.out.println("Pokrenut: " + isTheCarOn);
         System.out.println("Stanje:" + condition);
        
    }
    

    
            

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Car myCar = new Car();
        myCar.printVariables();
//        myCar.changeMaxSpeed();
//        myCar.changeMinSpeed();
//        myCar.changeWeight();
        myCar.printVariables();
        
        
    }
    
}

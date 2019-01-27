/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.davegreen.testgitignore;

/**
 *
 * @author Dave
 */
public class Main
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Dog dog = new Dog("Pug");
        
        System.out.println("The breed of the dog is a " + dog.getBreed() + ".");
        
        dog.setBreed("French Bulldog");
        
        System.out.println("The breed of the dog is now a " + dog.getBreed() + ".");
        
        dog.setBreed("Lab");
        
        System.out.println("The breed of the dog is now a " + dog.getBreed() + ".");
        
        Animal animal = new Animal("Cat");
        
        System.out.println("The type of animal is an " + animal.getType() + ".");
        
        animal.setType("Rabbit");
        
        System.out.println("The type of animal is now a " + animal.getType() + ".");
    }
}

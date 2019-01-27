/*
* This is the animal class
*/

package com.davegreen.testgitignore;

public class Animal
{
    private String type;
    
    public Animal(String type)
    {
        this.type = type;
    }
    
    public String getType()
    {
        return this.type;
    }
    
    public void setType(String newType)
    {
        this.type = newType;
    }
}

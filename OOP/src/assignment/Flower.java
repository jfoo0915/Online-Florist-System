/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

/**
 *
 * @author Lim Zhen Foo
 */
public class Flower extends Product{
    //data member
    private String colour; 

    //constructors
    public Flower() {
    }
    public Flower(String colour) {
        this.colour = colour;
    }
    public Flower( String name, double price, int stock, String colour) {
        super(name, price, stock);
        this.colour = colour;
    }

    //setters and getters
    
    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

  
    //tostring method
    @Override    
    public String toString(){
        return super.toString()+"\t"+ colour;
    }

    
    
}

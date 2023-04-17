/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

/**
 *
 * @author Acer
 */
public class Sticker extends Accessories{
    private String colour;
    private int totalLength;
    
    //constructors

    public Sticker() {
    }

    public Sticker(String colour, int totalLength) {
        this.colour = colour;
        this.totalLength = totalLength;
    }

    public Sticker(String colour, int totalLength, String type) {
        super(type);
        this.colour = colour;
        this.totalLength = totalLength;
    }

    public Sticker( String name, double price, int stock, String type,String colour, int totalLength) {
        super(type,  name, price, stock);
        this.colour = colour;
        this.totalLength = totalLength;
    }
    //setters and getters 

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getTotalLength() {
        return totalLength;
    }

    public void setTotalLength(int totalLength) {
        this.totalLength = totalLength;
    }

    //tostring

    @Override
    public String toString() {
        return super.toString()+"\t"+ colour +"\t"+ totalLength+"m" ;
    }
    
    
}

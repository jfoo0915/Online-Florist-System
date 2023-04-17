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
public class FlowerPot extends Accessories{
    private String size;
    private int weight;
    
    //constructor

    public FlowerPot() {
    }

    public FlowerPot(String size, int weight) {
        this.size = size;
        this.weight = weight;
    }

    public FlowerPot(String size, int weight, String type) {
        super(type);
        this.size = size;
        this.weight = weight;
    }

    public FlowerPot( String name, double price, int stock, String type, String size, int weight) {
        super(type, name, price, stock);
        this.size = size;
        this.weight = weight;
    }
    
    //setters and getters

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    
    //tostring

    @Override
    public String toString() {
        return super.toString()+"\t\t"+size + "\t"+ weight + "g";
    }
    
}

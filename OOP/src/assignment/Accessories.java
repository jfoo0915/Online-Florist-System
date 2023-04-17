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
public class Accessories extends Product{
    private String type;

    //constructors
    public Accessories() {
    }

    public Accessories(String type) {
        this.type = type;
    }

    public Accessories(String type,  String name, double price, int stock) {
        super(name, price, stock);
        this.type = type;
    }

    //setter and getters
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
   
    //tostring 
    @Override
    public String toString() {
        return super.toString()+ "\t"+type;
    }
    
    
    
    
    
}

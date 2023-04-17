/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;
import java.util.ArrayList;
/**
 *
 * @author Acer
 */
public class Product {
    protected static int productCount=1000;
    protected int productID;
    protected String name;
    protected double price;
    protected int stock;

    
    
    public Product() {
    }

    public Product( String name, double price, int stock) {
        this.productCount++;
        this.productID = this.productCount;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public static int getProductCount() {
        return productCount;
    }

    public int getProductID() {
        return productID;
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
 
    //method
   public static void reduceStock(ArrayList<OrderDetails> orderDetails, ArrayList<Product> product){
        for(int i = 0; i<orderDetails.size();i++){
           int index =  orderDetails.get(i).getProduct().getProductID()-1001 ;
           //System.out.println(orderDetails.get(i).getProduct().getProductID());
           //1001 - 1001 = 0 (index)\
           product.get(index).setStock(product.get(index).getStock()-orderDetails.get(i).getOrder().getQuantity());
        }
    }
   
    @Override
    public String toString() {
        return  name + "          \tRM " + price + "\t" + stock;
    }
    
   
}

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
public class Order {
    private int orderID = 1000;
    private int quantity;
    private static int countOrder = 0;
    //constructor

    public Order() {
    }

    public Order(int quantity) {
        this.quantity = quantity;
        countOrder++;
        this.orderID = this.orderID+countOrder;
       
    }
    /*public boolean equals (Object name){
        Employee e = (Employee)name;
        if(this.name.equals(e.name)){
            return true;
        }else return false;
    } */
    //setters and getters 

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public int getCount() {
        return countOrder;
    }

    
  

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public static int getCountOrder() {
        return countOrder;
    }

    public static void setCountOrder(int countOrder) {
        Order.countOrder = countOrder;
    }

     //methods
    public double calculateSubtotal(Product product, int quantity){
        double subtotal = product.getPrice()*quantity;
        return subtotal;
    }
    
    //tostring

    @Override
    public String toString() {
        return  orderID + "\t" + quantity;
    }
    
   
    
}

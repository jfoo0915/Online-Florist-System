/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;
import java.util.ArrayList;
import java.util.Date;
import java.time.LocalDate;
/**
 *
 * @author Lim Zhen Foo
 */
public class OrderDetails {
    private Product product;
    private Order order;
    //private Date orderDate;
    private static double discountRate = 0.05;
    private LocalDate orderDate;

    //constructor
    public OrderDetails() {
    }

    public OrderDetails(Product product, Order order) {
        this.product = product;
        this.order = order;
        orderDate = LocalDate.now();
    }
    
    //setters and getters 

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
    
    public LocalDate getOrderDate() {
        return orderDate;
    }

    public static double getDiscountRate() {
        return discountRate;
    }

    public static void setDiscountRate(double discountRate) {
        OrderDetails.discountRate = discountRate;
    }
     //method
    public double calculateTotal(ArrayList<OrderDetails> orderDetails){
        double total=0;
        
        for(int i=0; i<orderDetails.size(); i++){
            
                double price = orderDetails.get(i).getProduct().getPrice();
                int quantity = orderDetails.get(i).getOrder().getQuantity();
                total = total + (price*quantity);
        }
        return total;
    }
    
    public double calculateDiscount(int count, double price){
        double discount = 0;
        if (count >3 )
            discount = price * discountRate;
        return discount;
    }
    
   
    //tostring

    @Override
    public String toString() {
        //return String.format("%-4d\t%-15s\t%.2f%7d\t%-20s\t%.2d", order.getOrderID(),product.getName(),product.getPrice(),order.getQuantity(),orderDate,order.calculateSubtotal(product, order.getQuantity()));
        return order.getOrderID()+ "\t\t" + product.getName() + "    \tRM "+product.getPrice()+"\t\t"+ order.getQuantity() + "\t"+orderDate + "\tRM "+order.calculateSubtotal(product, order.getQuantity())+"\n";
    }
    
   
    
    
}

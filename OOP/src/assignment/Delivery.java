/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

//import java.text.SimpleDateFormat;
import java.time.LocalDate;
//import java.util.Calendar;


public class Delivery {
    private static int deliveryNo = 1000;
    private Courier courier;
    private String deliveryAddress;
    private LocalDate deliveryDate;
    private LocalDate receivedDate;
    private double deliveryFee;

    public Delivery(){
        deliveryNo++;
    }
    
    public Delivery(Courier courier) {
        this.courier = courier;
        deliveryNo++;
    }

    public static int getDeliveryNo() {
        return deliveryNo;
    }

    public Courier getCourier() {
        return courier;
    }

    public void setCourier(Courier courier) {
        this.courier = courier;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(LocalDate deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public LocalDate getReceivedDate() {
        return receivedDate;
    }

    public void setReceivedDate(LocalDate receivedDate) {
        this.receivedDate = receivedDate;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public double getDeliveryFee() {
        return deliveryFee;
    }

    public void setDeliveryFee(double deliveryFee) {
        this.deliveryFee = deliveryFee;
    }
    
    public void calcDeliveryDate(){
        deliveryDate = LocalDate.now().plusDays(1);  
    }

    public void calcReceivedDate(){
        receivedDate = deliveryDate.plusDays(courier.getDeliveryDay());  
    }
    
   
//    //method 2
//    public void calcReceivedDate(){
//        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//        Calendar c = Calendar.getInstance();
//        c.setTime(deliveryDate);
//        c.add(Calendar.DATE, courier.getDeliveryDay());
//        receivedDate = sdf.format(c.getTime());
//    }
//    public String formatDeliveryDate(){
//        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//         Calendar c = Calendar.getInstance();
//         c.setTime(deliveryDate);
//         return sdf.format(c.getTime());
//    }
    
   public double calcDeliveryFee(double total){
       if(total >= 40){
           deliveryFee = 0;
       }
       else
           deliveryFee = courier.getDeliveryFee();
   
       return deliveryFee;
   }
            
    
    @Override
    public String toString(){
        return String.format(" Delivery No.: %d\n Courier: %s\n Delivery Address: %s\n Estimated Arrival Date: %s  ", deliveryNo, courier.getCourierName(), deliveryAddress, receivedDate);
    }
}




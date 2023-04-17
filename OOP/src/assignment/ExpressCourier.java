/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

/**
 *
 * @author limwj
 */
public class ExpressCourier extends Courier{
    private static double extraFee = 2;

    public ExpressCourier() {}


  
    public ExpressCourier(String courierName, double deliveryFee, int deliveryDay) {
        super(courierName, deliveryFee, deliveryDay);
    }

    public double getExtraFee() {
        return extraFee;
    }
    
    public void calcDeliveryDay(){};
    
   @Override
    public void calcDeliveryFee() {
        this.deliveryFee = deliveryFee += extraFee; 
    }
    
    @Override
    public String toString() {
        return String.format ("%-30sRM %-2.2f \t%-2d days", courierName, deliveryFee, deliveryDay);
    }
    
    /* public String toString() {
        return String.format ("\nCourier: %s \nDelivery Fee: RM %.2f \nDelivery Day: %d days", courierName, calcDeliveryFee(), deliveryDay);
    }*/
    
}

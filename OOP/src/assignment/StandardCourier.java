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
public class StandardCourier extends Courier {
    private static int extraDay = 2;

    public StandardCourier() {
    }

    public StandardCourier(String courierName, double deliveryFee, int deliveryDay) {
        super(courierName, deliveryFee, deliveryDay);
    }

    public static int getExtraDay() {
        return extraDay;
    }
    
    public void calcDeliveryFee() {}
    
    @Override
    public void calcDeliveryDay(){
        this.deliveryDay = deliveryDay += extraDay;
    }
    
    @Override
    public String toString(){
        //if(courierName.length()<)
        return String.format ("%-30sRM %-2.2f \t%-2d days",courierName, deliveryFee, deliveryDay);
    }
    
    /* public String toString(){
        return String.format ("\nCourier: %s \nDelivery Fee: RM %.2f \nDelivery Day: %d days", courierName, deliveryFee, calcDeliveryDay());
    }*/
}

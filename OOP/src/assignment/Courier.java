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
public abstract class Courier {
    protected String courierName;
    protected double deliveryFee;
    protected int deliveryDay;

    public Courier(){}
    
    public Courier(String courierName, double deliveryFee, int deliveryDay) {
        this.courierName = courierName;
        this.deliveryFee = deliveryFee;
        this.deliveryDay = deliveryDay;
    }

    public String getCourierName() {
        return courierName;
    }

    public void setCourierName(String courierName) {
        this.courierName = courierName;
    }

    public double getDeliveryFee() {
        return deliveryFee;
    }

    public void setDeliveryFee(double deliveryFee) {
        this.deliveryFee = deliveryFee;
    }

    public int getDeliveryDay() {
        return deliveryDay;
    }
    
     public void setDeliveryDay(int deliveryDay) {
        this.deliveryDay = deliveryDay;
    }
    
    public abstract void calcDeliveryFee();

    public abstract void calcDeliveryDay();
    
    public abstract String toString();
}

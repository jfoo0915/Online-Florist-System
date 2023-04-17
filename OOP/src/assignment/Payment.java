/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;



import java.time.LocalDate;


public class Payment {
    private static int paymentID = 1000;
    private LocalDate paymentDate;
    private double paymentAmount;
    private PaymentMethod paymentMethod;

    
    public Payment(){}
    
    public Payment(double paymentAmount, PaymentMethod paymentMethod) {
        this.paymentAmount = paymentAmount;
        this.paymentMethod = paymentMethod;
        paymentDate = LocalDate.now();    
        paymentID++;
    }

    public static int getPaymentID() {
        return paymentID;
    }

    public LocalDate getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(LocalDate paymentDate) {
        this.paymentDate = paymentDate;
    }

    public double getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
    
    public String toString(){
        return String.format("\nPayment ID: %d\nPayment Date: %s\nPayment Method: %s\nAmount: %.2f\n", paymentID, paymentDate, paymentMethod, paymentAmount);
    }  
}


//    public static void main(String[] args){
//        System.out.println("Transaction Date: " + java.time.LocalDate.now());
//        System.out.println("Transaction Time: " + java.time.LocalTime.now());
//    }
//}

/*
    public static double getAmount() {
        return String.format("%.2f".amount);
    }
    
    Payment(double val){
        this.amount = 
    }
    
    
    
    public static String processPayment() {
        double amount,total;
        if (amount == total){
            System.out.println("Payment Successfully");
        }
        else{
            System.out.println("Payment Unsuccessfully");
        }
    }
}
    /*
    public void setAmount(double amount) {
        this.amount= amount;
    }
    
    Payment(double val){
        this.amount= Math.round(val * 100)/100.0;
    }
    
    public void paymentDetails(){
        System.out.println("The payment amount is= " + this.amount);
    }

    public void processPayment(){
        System.out.println("Payment Successful");
}

class cardPayment extends Payment{
    String cardName, expDate, cardNo;
    int cvv;

        public cardPayment(double val) {
            super(val);
        }
    
    cardPayment(double value, String cardName, String expDate, String cardNo){
        super(value);
        this.cardName = cardName;
        this.expDate = expDate;
        this.cardNo = cardNo;
        this.cvv = cvv;
    }
    }

class EWallet extends Payment{
    int walletID, PIN;

        public EWallet(double val) {
            super(val);
        }
    
    EWallet(double value, int walletID, int PIN){
        this.walletID = walletID;
        this.PIN = PIN;
    }
    
    
}

class OnlineBank extends Payment{
    int 
            
}

    public String toString(){
        return("");
}
}*/


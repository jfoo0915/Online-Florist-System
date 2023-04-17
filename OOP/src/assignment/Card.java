/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

/**
 *
 * @author user
 */
public class Card extends PaymentMethod{
    
    private String cardType;
    
    public Card(){}

    public Card(String method, String cardType) {
        super(method);
        this.cardType = cardType; 
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    @Override
    public String toString() {
        return (cardType);
    }
    
}


    /*public static void main(){
        //this.setDateTime(Calendar.getInstance().getTime());
        System.out.println("\nType of Card");
        System.out.println("============");
        System.out.println("1. Credit Card");
        System.out.println("2. Debit Card");
        
        int cardType;
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter type of card(1, 2): ");
        cardType = sc.nextInt();
        
        String cardName, expDate, cardNo;
        int cvv;
        
        switch(cardType){
            case 1: 
                System.out.println("\nCredit Card");
                System.out.println("===========");
                System.out.println("Please enter your card details.");
        
                System.out.println("\nCard Details");
                System.out.println("============");
                System.out.print("Name on Card: ");
                cardName = sc.nextLine();
                System.out.print("Card Number: ");
                cardNo = sc.nextLine();
                System.out.print("Expiry Date: ");
                expDate = sc.nextLine();
                System.out.print("CVV: ");
                cvv = sc.nextInt();
                System.out.println("\nCard Match.");
                break;
                
            case 2:
                System.out.println("\nDebit Card");
                System.out.println("===========");
                System.out.println("Please enter your card details.");
        
                System.out.println("\nCard Details");
                System.out.println("============");
                System.out.print("Name on Card: ");
                cardName = sc.nextLine();
                System.out.print("Card Number: ");
                cardNo = sc.nextLine();
                System.out.print("Expiry Date: ");
                expDate = sc.nextLine();
                System.out.print("CVV: ");
                cvv = sc.nextInt();
                System.out.println("\nCard Match.");
                break;
               
            default:
                System.out.println("Invalid option!");
                
        }
        return "response";
    }
}*/
/*
    private void setDateTime(Date time) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
        System.out.println("Please enter your card detail at below.");
        
            
            String cardName, cardType, expDate, cardNo;
            int cvv;
        
            System.out.println("\nCard Details");
            System.out.println("============");
            System.out.print("Name on Card: ");
            cardName = sc.nextLine();
            System.out.print("Card Number: ");
            cardNo = sc.nextLine();
            System.out.print("Card Type(Debit/Credit): ");
            cardType = sc.nextLine();
            System.out.print("Expiry Date: ");
            expDate = sc.nextLine();
            System.out.print("CVV: ");
            cvv = sc.nextInt();
            System.out.println("\nCard Match.");
           
    }

    private void setDateTime(Date time) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
*/

/*

public class Card {
    private String = CardName;
    private int = CardNumber;
    private String = CardType;
    private int = CardPin;
    private int = CVV;
    
    
}

public Card(){
}

public Card(String CardType, String CardNumber, int CardPin, int cvv ){
    this.CardName = CardName;
    this.CardType = type;  
    this.CardNumber = CardNumber;
    this.CardPin = CardPin;
}
*/


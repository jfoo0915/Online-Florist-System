/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;


/**
 *
 * @author user Yun Xuan
 */


public abstract class PaymentMethod {
    protected String method;

    public PaymentMethod(){}

    public PaymentMethod(String method) {
        this.method = method;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }
    
    public abstract String toString();

}
    
//    //Payment Method Menu
//    public static void PayMethodMenu() {
//        System.out.println("\nPayment Method Menu");
//        System.out.println("===================");
//        System.out.println("1. Add payment method");
//        System.out.println("2. Delete payment method");
//        System.out.println("3. Update payment method");
//        System.out.println("4. View payment method");
//        System.out.print("\nSelect your choice");
//    }
//    
//    public static void PayMethod() {
//        System.out.println("\nPayment Method");
//        System.out.println("==============");
//        System.out.println("1. Credit/Debit Card");
//        System.out.println("2. Online Banking");
//        System.out.println("3. E-Wallet");
//    }
//
//    public static void main (String[] args){
//        //Card cardM;
//        
//        ArrayList <String> p = new ArrayList<String>();
//        p.add("Card Payment");
//        p.add("Online Banking");
//        p.add("E-Wallet Payment");
//        
//        ArrayList <String> cardM = new ArrayList<String>();
//        cardM.add("Debit Card");
//        cardM.add("Credit Card");
//        
//        ArrayList <String> bankM = new ArrayList<String>();
//        bankM.add("Maybank2u");
//        bankM.add("CIMB Clicks");
//        bankM.add("Public Bank");
//        
//        ArrayList <String> walletM = new ArrayList<String>();
//        walletM.add("Touch'n Go E-Wallet");
//        walletM.add("GrabPay Wallet");
//        walletM.add("Boost Wallet");
//        
//        System.out.println();
//        System.out.println("\n**************");
//        System.out.println("Payment Method");
//        System.out.println("**************");
//        for(int i = 0; i < p.size(); i++){
//            System.out.println((i+1)+ ". " + p.get(i).toString()); 
//        }
//        
//        System.out.println();
//        System.out.println("\n************");
//        System.out.println("Card Payment");
//        System.out.println("************");
//        for(int i = 0; i < cardM.size(); i++){
//            System.out.println((i+1) + ". " + cardM.get(i).toString());
//        }
//        
//        System.out.println();
//        System.out.println("\n**************");
//        System.out.println("Online Banking");
//        System.out.println("**************");
//        for(int i = 0; i < bankM.size(); i++){
//            System.out.println((i+1) + ". " + bankM.get(i).toString());
//        }
//        
//        System.out.println();
//        System.out.println("\n********");
//        System.out.println("E-Wallet");
//        System.out.println("********");
//        for(int i = 0; i < walletM.size(); i++){
//            System.out.println((i+1) + ". " + walletM.get(i).toString());
//        }
//        
//        //CRUD
//        PayMethodMenu();
//        Scanner sc = new Scanner(System.in);
//        int method = sc.nextInt();
//        
//        switch(method){
//            case 1:
//                addPayMethod(method);
//                backToPayMethodMenu = true;
//                break;
//            case 2:
//                deletePayMethod(method);
//                backToPayMethodMenu = true;
//                break;
//            case 3:
//                updatePayMethod(method);
//                backToPatMethodMenu = true;
//                break;
//            case 4:
//                displayPayMethod(method);
//                backToPayMethodMenu = backToPrevious();
//                break;
//            case 5:
//                backToPayMethodMenu = false;
//                break;
//            default:
//                System.out.println("Inavlid Input! Please try again.");
//                break;
//        }
//        
//    }
//    
//    public static void addPayMethod(ArrayList<String> cardM) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("\nAdd Payment Method");
//        System.out.println("==================");
//        System.out.println("\nPayment Method: ");
//        System.out.println("1. Credit/Debit Card");
//        System.out.println("2. Online Banking");
//        System.out.println("3. E-Wallet");
//        
//        int payMethod;
//        System.out.print("Select a payment method: ");
//        payMethod = sc.nextInt();
//        String CType, bank, wallet; 
//        switch(payMethod){
//            case 1:
//                sc.nextLine();
//                    System.out.print("\nEnter the Card Type: ");
//                    CType = sc.nextLine();
//                    cardM.add(CType);
//                    cardM.get(cardM.size() - 1);
//                    System.out.println("\nNew Card Payment created!");
//                    sc.nextLine();
//                    break;
//                    
//            case 2:
//                sc.nextLine();
//                    System.out.print("\nEnter new bank: ");
//                    bank = sc.nextLine();
//                    bankM.add(bankName);
//                    bankM.get(bankM.size() - 1);
//                    System.out.println("\nNew Online Banking payment method is created!");
//                    sc.nextLine();
//                    break;
//                    
//            case 3:
//                sc.nextLine();
//                    System.out.print("\nEnter new E-Wallet: ");
//                    wallet = sc.nextLine();
//                    cardM.add(walletM);
//                    cardM.get(walletM.size() - 1);
//                    System.out.println("\nNew E-Wallet payment method is created!");
//                    sc.nextLine();
//                    break;
//            
//            default:
//                System.out.println("Invalid Input! Please try agian. ");
//                sc.nextLine();
//                break;
//        }
//    }
//    
//    
//    
//    public static void displayPayMethod(ArrayList <String> p) {
//            System.out.println();
//            System.out.println("\n**************");
//            System.out.println("Payment Method");
//            System.out.println("**************");
//            System.out.println("1. Credit/Debit Card");
//            System.out.println("2. Online Banking");
//            System.out.println("3. E-Wallet");
//            
//            int option3;
//            System.out.print("Please select a payment method to display(1, 2, 3): ");
//            Scanner sc = new Scanner(System.in);
//            option3 = sc.nextInt();
//            
//            switch(option3){
//                case 1: 
//                    System.out.println("\n=================");
//                    System.out.println("Credit/Debit Card");
//                    System.out.println("=================");
//                    for(int i = 0; i < p.size(); i++){
//                        System.out.println((i+1)+ ". " + p.get(i).toString()); 
//                    }
//                    break;
//                    
//                case 2:
//                    System.out.println("\n==============");
//                    System.out.println("Online Banking");
//                    System.out.println("==============");
//                    for(int i = 0; i < p.size(); i++){
//                        System.out.println((i+1)+ ". " + p.get(i).toString()); 
//                    }
//                    break;
//                    
//                case 3:
//                    System.out.println("\n========");
//                    System.out.println("E-Wallet");
//                    System.out.println("========");
//                    for(int i = 0; i < p.size(); i++){
//                        System.out.println((i+1)+ ". " + p.get(i).toString()); 
//                    }
//                    break;
//                    
//                default:
//                    System.out.println("Invalid input! Please try again.");
//                    sc.nextLine();
//                    break;
//            }
//    }
//     
//    //Delete Payment Method
//     public static void deletePayMethod(ArrayList <String> p) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("\nDelete Payment Method");
//        System.out.println("=====================");
//        
//        int choice, delete;
//        boolean valid = false;
//            while(!valid){
//            //try {
//                    System.out.print("Select the payment method you want to delete: ");
//                    choice = sc.nextInt();
//                    //Delete Card Method
//                    if (choice == 1){
//                        System.out.print("Please choose to delete: ");
//                        delete = sc.nextInt();
//                        if (delete == 1) {
//                            System.out.println("\nAre you confirm to delete this?");
//                            char confirm = sc.next().charAt(0);
//                            if (confirm == 'Y' || confirm == 'y'){
//                                sc.nextLine();
//                                p.remove(choice - 1);
//                                valid = true;
//                                System.out.println("\nPayment method is successful deleted!");
//                                break;
//                            }
//                            else if(choice == 0){
//                                break;
//                            }
//                            else {
//                                System.out.println("\nInvalid input! Please try again.");
//                                sc.nextLine();
//                            }
//                        }
//                    }
//                    //Delete Online Banking
//                    else if(choice == 2){
//                        System.out.print("Please choose to delete: ");
//                        delete = sc.nextInt();
//                        if (delete == 1) {
//                            System.out.println("\nAre you confirm to delete this?");
//                            char confirm = sc.next().charAt(0);
//                            if (confirm == 'Y' || confirm == 'y'){
//                                sc.nextLine();
//                                p.remove(choice - 1);
//                                valid = true;
//                                System.out.println("\nPayment method is successful deleted!");
//                                break;
//                            }
//                            else if(choice == 0){
//                                break;
//                            }
//                            else {
//                                System.out.println("\nInvalid input! Please try again.");
//                                sc.nextLine();
//                            }
//                        }
//                    }
//                    //delete E-wallet
//                    else if(choice == 3){
//                        System.out.print("Please choose to delete: ");
//                        delete = sc.nextInt();
//                        if (delete == 1) {
//                            System.out.println("\nAre you confirm to delete this?");
//                            char confirm = sc.next().charAt(0);
//                            if (confirm == 'Y' || confirm == 'y'){
//                                sc.nextLine();
//                                p.remove(choice - 1);
//                                valid = true;
//                                System.out.println("\nPayment method is successful deleted!");
//                                break;
//                            }
//                            else if(choice == 0){
//                                break;
//                            }
//                            else {
//                                System.out.println("\nInvalid input! Please try again.");
//                                sc.nextLine();
//                            }
//                        }
//                    }
//                    
//         
//                        
//                //catch(Exception e){
//                //    System.out.println("\nInvalid input! Please try again.");
//                //    sc.nextLine();
//                //}   
//            }
//        }
//                
//        
//        //Update Payment Method
//        public static void updatePayMethod(ArrayList <String> p) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("\nUpdate Payment Method");
//        System.out.println("=====================");
//        
//        String cardM, bankM, walletM;
//        int option,choice1,choice2, choice3;
//        boolean valid = false;
//        
//        do{
//            try{
//                System.out.print("\nSelect a payment method to update: ");
//                option = sc.nextInt();
//                if(option == 0){
//                    break;
//                }
//                else if (option == 1){
//                    valid = true;
//                    boolean validPart = false;
//                    while(!validPart){
//                        System.out.println("\nSelect the bank you want to update: ");
//                        System.out.println("1. ");
//                        //Update card payment method
//                        if(option == 1){
//                            System.out.println("\n1. Debit Card");
//                            System.out.println("2. Credit Card");
//                            System.out.print("\nSelect a card type you want to update: ");
//                            validPart = true;
//                            choice1 = sc.nextInt();
//                            //Debit Card
//                            if(choice1 == 1) { 
//                                System.out.print("\nEnter the new card type: ");
//                                cardM = sc.nextLine();
//                                p.set(0, cardM);
//                            }
//                            //Credit Card
//                            else if (choice1 == 2){
//                                System.out.print("\nEnter the new card type: ");
//                                cardM = sc.nextLine();
//                                p.set(1, cardM);
//                            }
//                            else{
//                                System.out.println("Invalid input! Please try again!");
//                                sc.nextLine();
//                            }
//                        }
//                    }
//                }
//                //Update Online Banking Payment Method
//                else if (option == 2) {
//                    System.out.println("1. Maybank2u");
//                    System.out.println("2. CIMB Clicks");
//                    System.out.println("3. Public Bank");
//                    System.out.print("Select the online banking payment you want to update: ");
//                    choice2 = sc.nextInt();
//                    switch(choice2){
//                        case 1:
//                            System.out.print("\nEnter the new online bank: ");
//                            bankM = sc.nextLine();
//                            p.set(0, bankM);
//                            break;
//                            
//                        case 2:
//                            System.out.print("\nEnter the new online bank: ");
//                            bankM = sc.nextLine();
//                            p.set(1, bankM);
//                            break;
//                            
//                        case 3:
//                            System.out.print("\nEnter the new online bank: ");
//                            bankM = sc.nextLine();
//                            p.set(2, bankM);
//                            break;
//                        
//                        default:
//                            System.out.println("Invalid Input! Please try again");
//                            sc.nextLine();
//                    
//                    }
//                }
//                else if (option == 3){
//                    System.out.println("1. Touch'n Go E-Wallet");
//                    System.out.println("2. GrabPay Wallet");
//                    System.out.println("3. Boost Wallet");
//                    System.out.print("Please select the wallet you want to update");
//                    choice3 = sc.nextInt();
//                    
//                    switch(choice3){
//                        case 1:
//                            System.out.print("Enter new wallet name: ");
//                            walletM = sc.nextLine();
//                            p.set(0, walletM);
//                            break;
//                            
//                        case 2:
//                            System.out.print("Enter new wallet name: ");
//                            walletM = sc.nextLine();
//                            p.set(1, walletM);
//                            break;
//                            
//                        case 3:
//                            System.out.print("Enter new wallet name: ");
//                            walletM = sc.nextLine();
//                            break;
//                            
//                        default:
//                            System.out.println("Invalid Input! Please try again!");
//                            sc.nextLine();
//                    }
//                }
//                else{
//                    System.out.println("Invalid Input! Please try again.");
//                    sc.nextLine();
//                    }
//            
//                cardM = sc.nextLine();
//            }   
//            
//            
//            
//            
//            catch (Exception ex){
//                System.out.print("\nIncorrect input! String required!");
//                scanner.nextLine();
//        
//    }while(input);
//    payMethod.set(,
//}
//}
//}
        
  /*      
        //CRUD
        PayMethodMenu();
        Scanner sc = new Scanner(System.in);
        int choice4 = sc.nextInt();
    switch(choice4){
        case 1: 
            addPayMethod(method);
            backToPayMethodMenu = true;
            break;
            
        
        
    
    
    public static void addPayMethod() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nAdd Payment Method");
        System.out.println("==================");
        System.out.println("\nPayment Method: ");
        System.out.println("1. Credit/Debit Card");
        System.out.println("2. Online Banking");
        System.out.println("3. E-Wallet");
        
        int payMethod;
        boolean valid = true;
        do{ 
            try{
                System.out.print("\nSelect the payment method: ");
                payMethod = sc.nextInt();
                String Ctype;
                switch(payMethod){

                    case 1:
                    sc.nextLine();
                    System.out.print("\nEnter the Card Type: ");
                    type = sc.nextLine();
                    p.add(new CardMethod (Ctype);
                    p.get(p.size()-1);
                    System.out.println("\nNew Card Payment created!");
                    sc.nextLine();
                    break;
                    
case 2:
    sc.nextLine();
        System.out.print("\nEnter the bank name: ");
        type = sc.nextLine();            
        p.add(new OnlineMethod (BName);            
        c.get(p.size()-1);
        System.out.println("\nNew Online Banking created!");
        sc.nextLine();
        break;  

case 3:
 sc.nextLine();
        System.out.print("\nEnter the E-Wallet name: ");
        type = sc.nextLine();            
        p.add(new WalletMethod (wallet);            
        c.get(p.size()-1);
        System.out.println("\nNew E-Wallet created!");
        sc.nextLine();
        break;  

default:
    valid = false;
    System.out.println("\nInvalid input!");
    sc.nextLine();
    break;
            }
 
        }
        catch(Exception e){
            valid = false;
            System.out.println("\nInvalid input! Please try again. ");
            sc.nextLine();
    }while(!valid);
    backToPrevious();
}
}
}
}
}
    
    //public cardPay(String cardType) {
    //    super(cardType);
    //}





    
    /*    
    public static void displayPayMethod(ArrayList<String> p) {
        System.out.println();
        System.out.println("\n**************");
        System.out.println("Payment Method");
        System.out.println("**************");
        for(int i = 0; i < p.size(); i++){
        System.out.println((i+1)+ ". " + p.get(i).toString()); 
    }
        
        
    }
}
            p.add(new CardMethod("Debit Card"));
        p.add(new CardMethod("Credit Card"));
        p.add(new OnlineMethod("Maybank2u"));
        p.add(new OnlineMethod("CIMB Clicks"));
        p.add(new OnlineMethod("Public Bank"));
        p.add(new WalletMethod("Touch'n Go E-Wallet"));
        p.add(new WalletMethod("GrabPay Wallet"));
        p.add(new WalletMethod("Boost Wallet"));
    
    
            p.add(new PayMethod("Card Payment"));
        p.add(new PayMethod("Online Banking"));
        p.add(new PayMethod("E-Wallet Payment"));
        p.add(new CardMethod("Debit Card");
        p.add(new CardMethod("Credit Card"));
        p.add(new OnlineMethod("Maybank2u"));
        p.add(new OnlineMethod("CIMB Clicks"));
        p.add(new OnlineMethod("Public Bank"));
        p.add(new WalletMethod("Touch'n Go E-Wallet"));
        p.add(new WalletMethod("GrabPay Wallet");
        p.add(new WalletMethod("Boost Wallet");
    //CRUD Payment Method
    PayMethodMenu();
    int choice4 = sc sc.nextInt();
    switch(choice4){
        case 1: 
            addPayMethod(method);
            backToPayMethodMenu = true;
            break;
        case 2:
            deletePayMethod(method);
            backToPayMethodMenu = true;
            break;
        case 3:
            updatePayMethod(method);
            backToPatMethodMenu = true;
            break;
        case 4:
            displayPayMethod(method);
            backToPayMethodMenu = backToPrevious();
            break;
        case 5:
            backToPayMethodMenu = false;
            backToStaffMenu = true;
            break;
        default:
            System.out.println("Inavlid Input! Please try again.");
            break;
}
    
            
    
    //Payment Method Menu
    public static void PayMethodMenu() {
        System.out.println("\nPayment Method Menu");
        System.out.println("===================");
        System.out.println("1. Add payment method");
        System.out.println("2. Delete payment method");
        System.out.println("3. Update payment method");
        System.out.println("4. View payment method");
        System.out.println("\nSelect your choice");
    }
    
    public static void addPayMethod() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nAdd Payment Method");
        System.out.println("==================");
        System.out.println("\nPayment Method: ");
        System.out.println("1. Credit/Debit Card");
        System.out.println("2. Online Banking");
        System.out.println("3. E-Wallet");
        
        int payMethod;
        boolean valid = true;
        do{ 
            try{
                System.out.print("\nSelect the payment method: ");
                payMethod = sc.nextInt();
                String Ctype;
                switch(payMethod){

                    case  1:
                    sc.nextLine();
                    System.out.print("\nEnter the Card Type: ");
                    type = sc.nextLine();
                    p.add(new CardMethod (Ctype);
                    c.get(p.size()-1);
                    System.out.println("\nNew Card Payment created!");
                    sc.nextLine();
                    break;

case 2:
    sc.nextLine();
        System.out.print("\nEnter the bank name: ");
        type = sc.nextLine();            
        p.add(new OnlineMethod (BName);            
        c.get(p.size()-1);
        System.out.println("\nNew Online Banking created!");
        sc.nextLine();
        break;  

case 3:
 sc.nextLine();
        System.out.print("\nEnter the E-Wallet name: ");
        type = sc.nextLine();            
        p.add(new WalletMethod (wallet);            
        c.get(p.size()-1);
        System.out.println("\nNew E-Wallet created!");
        sc.nextLine();
        break;  

default:
    valid = false;
    System.out.println("\nInvalid input!");
    sc.nextLine();
    break;
            }
 
        }
        catch(Exception e){
            valid = false;
            System.out.println("\nInvalid input! Please try again. ");
            sc.nextLine();
    }while(!valid);
    backToPrevious();
}

    
    public static void displayPayMethod() {
            System.out.println();
            System.out.println("\n**************");
            System.out.println("Payment Method");
            System.out.println("**************");
            for(int i = 0; i < p.size(); i++){
                System.out.println((i+1)+ ". " + p.get(i).toString()); 
}
        }
    }
    
    public static void deletePayMethod() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nDelete Payment Method");
        System.out.println("=====================");
        
        int choice;
        boolean valid = false;
            while(!valid){
                try{
                    System.out.print("Select the payment method you want to delete or enter 0 to back to previous menu: ");
                    choice = sc.nextInt();
                    if (choice >= 1 && choice <= p.size()){
                        System.out.println("\nAre you confirm to delete this?");
                        char confirm = sc.next().charAt(0);
                        if (confirm == 'Y' || confirm == 'y'){
                            sc.nextLine();
                            p.remove(choice - 1);
                            valid = true;
                            System.out.println("\nPayment metho is successful deleted!");
                            backToPrevious();
                            break;
}
else if(choice == 0){
break;
    }
else {
    System.out.println("\nInvalid input! Please try again.");
    sc.nextLine();
}
catch(Exception e){
    System.out.println("\nInvalid input! Please try again.");
    sc.nextLine();
}
}
}

    
    public static void updatePayMethod() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nUpdate Payment Method");
        System.out.println("=====================");
        
        String name = "";
        int choice;
        do{
            try{
                System.out.print("\nCName: ");
                CType = scanner.nextLine();
                input = false;
            }   
            catch (Exception ex){
                System.out.print("\nIncorrect input! String required!");
                scanner.nextLine();
        
    }while(input);
    payMethod.set(
}
    
    class CardPayment extends Payment{
    CardPayment(double val){
        super(val);
}
    
    public void paymentDetails() {
        System.out.println("The payment amount is ");
    }
    
}

class OnlineBanking extends Payment {
   OnlineBanking(double val){
       super(val);
   }
   public void paymentDetails() {
       System.out.println("The payment amount is " +);
   }
}

class EWallet extends Payment {
    EWallet(double val){
        super(val);
    }
    public void paymentDetails() {
        System.out.println("The payment amount is " + );
    }
}

}*/



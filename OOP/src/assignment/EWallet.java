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
public class EWallet extends PaymentMethod{
    private String eWalletType;
    
    //constructor 
    public EWallet(){}

    //add super()
    public EWallet(String method, String eWalletType) {
        super(method);
        this.eWalletType = eWalletType;
    }
    
    
    //setter and getter
    //no set and get for super class 

    public String geteWalletType() {
        return eWalletType;
    }

    public void seteWalletType(String eWalletType) {
        this.eWalletType = eWalletType;
    }

    
    //to string 
    @Override
    public String toString() {
        return (eWalletType);
    }
}
    
//    public static void main(String[] args){
//        System.out.println("\n========");
//        System.out.println("E-WALLET");
//        System.out.println("========");
//        System.out.println("1. Touch'n Go E-Wallet");
//        System.out.println("2. GrabPay Wallet");
//        System.out.println("3. Boost Wallet");
//       
//        int wallet;
//        Scanner sc = new Scanner(System.in);
//        System.out.print("\nPlease select an option(Eg: 1,2,3): ");
//        wallet = sc.nextInt();
//
//        String walletID, PIN;
//        double receive;
//        
//        switch(wallet) {
//            case 1:
//               sc.nextLine();
//               System.out.println("\n*******************");
//               System.out.println("Touch'n Go E-Wallet");
//               System.out.println("*******************");
//               System.out.println("Please login to your account.");
//               System.out.print("Please enter E-Wallet ID: ");
//               walletID = sc.nextLine(); 
//               System.out.print("Please enter your 6-digit PIN: ");
//               PIN = sc.nextLine();
//               System.out.println("\nLogin Successfully!");
//               System.out.print("Amount Pay: RM ");
//               receive = sc.nextInt();
//               
//               break;
//               
//            case 2:
//               sc.nextLine();
//               System.out.println("\n**************");
//               System.out.println("GrabPay Wallet");
//               System.out.println("**************");
//               System.out.print("Please enter E-Wallet ID: ");
//               walletID = sc.nextLine(); 
//               System.out.print("Please enter your 6-digit PIN: ");
//               PIN = sc.nextLine();
//               System.out.println("\nLogin Successfully!");
//               break;
//               
//            case 3:
//               sc.nextLine();
//               System.out.println("\n************");
//               System.out.println("Boost Wallet");
//               System.out.println("************");
//               System.out.print("Please enter E-Wallet ID: ");
//               walletID = sc.nextLine(); 
//               System.out.print("Please enter your 6-digit PIN: ");
//               PIN = sc.nextLine();
//               System.out.println("\nLogin Successfully!");
//               break;
//               
//            default:
//                System.out.println("\nInvalid Input, please try again!");
//        } 
//    }
//}

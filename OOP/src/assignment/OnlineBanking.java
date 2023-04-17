/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;
//import java.util.Random;

/**
 *
 * @author user Yun Xuan
 */
public class OnlineBanking extends PaymentMethod{
    private String bankName;
    

    public OnlineBanking() {
    }

    public OnlineBanking(String method, String bankName) {
        super(method);
        this.bankName = bankName;
    }
    
    //set andget 

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

 
    @Override
    public String toString() {
        return (bankName);
    }
}
    
//     public static void main(String[] args) {
//         System.out.println("\n==============");
//         System.out.println("Online Banking");
//         System.out.println("==============");
//         System.out.println("1. Maybank2u");
//         System.out.println("2. CIMB Clicks");
//         System.out.println("3. Public Bank");
//     
//     int bank;
//     Scanner sc = new Scanner(System.in);
//            System.out.print("\nPlease enter the bank(Exp:1,2,3): ");
//            bank = sc.nextInt();
//            String bankName, BPswd, Tac, rTAC;
//            
//            switch(bank){
//                case 1:
//                    System.out.println("\n*********");
//                    System.out.println("Maybank2u");
//                    System.out.println("*********");
//                    sc.nextLine();
//                    System.out.print("Username: ");
//                    bankName = sc.nextLine();
//                    System.out.print("Password: ");
//                    BPswd = sc.nextLine();
//                    rTAC = generateTAC();
//                    System.out.print("Enter TAC No: ");
//                    Tac = sc.nextLine();
//                    if (Tac.equals(rTAC)){
//                        System.out.println("TAC Number Match.");
//                        System.out.println("\nPayment Successfully!");
//                    }
//                    else {
//                        System.out.println("TAC Number not match! Please try again.");
//                    }
//                    break;
//                    
//                case 2:
//                    System.out.println("\n***********");
//                    System.out.println("CIMB Clicks");
//                    System.out.println("***********");
//                    sc.nextLine();
//                    System.out.print("Enter your bank username: ");
//                    bankName = sc.nextLine();
//                    System.out.print("Enter password: ");
//                    BPswd = sc.nextLine();
//                    rTAC = generateTAC();
//                    System.out.print("Enter TAC No: ");
//                    Tac = sc.nextLine();
//                    if (Tac.equals(rTAC)){
//                        System.out.println("TAC Number Match.");
//                        System.out.println("\nPayment Successfully!");
//                    }
//                    else {
//                        System.out.println("TAC Number not match! Please try again.");
//                    }
//                    break;
//                    
//                case 3:
//                    System.out.println("\n***********");
//                    System.out.println("Public Bank");
//                    System.out.println("***********");
//                    sc.nextLine();
//                    System.out.print("Enter your bank username: ");
//                    bankName = sc.nextLine();
//                    System.out.print("Enter password: ");
//                    BPswd = sc.nextLine();
//                    rTAC = generateTAC();
//                    System.out.print("Enter TAC No: ");
//                    Tac = sc.nextLine();
//                    if (Tac.equals(rTAC)){
//                        System.out.println("TAC Number Match.");
//                        System.out.println("\nPayment Successfully!");
//                    }
//                    else {
//                        System.out.println("TAC Number not match! Please try again.");
//                    }
//                    break;
//                    
//                default:
//                    System.out.println("Invalid input! Please try again.");
//            } 
//    }
//     
//     public static String generateTAC(){
//         Random rnd = new Random();
//         int RTac = rnd.nextInt(999999);
//         System.out.println("Your TAC no. is " + RTac);
//         return String.format("%06d", RTac);
//    }
//}
//
//     
//
//
//
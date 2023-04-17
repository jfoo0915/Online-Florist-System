package assignment;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class CombineAssignment {

    public static void main(String[] args) {

        //identifiers
        int currentCustomer;
        double deliveryFee;
 
        ArrayList<Courier> courier = new ArrayList<>();
        createCourier(courier);
        
        //Create Delivery
        ArrayList<Delivery> delivery = new ArrayList<>();
        
        //Create user
        ArrayList<Staff> staff = new ArrayList<>();
        ArrayList<Customer> customer = new ArrayList<>();
        createStaff(staff);
        createCustomer(customer);
        
        //Create product
        ArrayList<Product> product = new ArrayList<>();
        createProduct(product);
        
        //create Order arraylist
        ArrayList<Order> order = new ArrayList<>();
        ArrayList<OrderDetails> orderDetails = new ArrayList<>();
        
          //create payment method
        ArrayList<PaymentMethod> paymentMethod = new ArrayList<>();
        createPayMethod(paymentMethod);
        
        //Create payment
        ArrayList<Payment> payment = new ArrayList<>();
        
        //Log in
        Scanner sc = new Scanner(System.in);
        boolean backToMainMenu = false;
        do{
            boolean valid = false;
            mainMenu();
            int choice_main = 0;
            while(!valid){
                try{
                    System.out.print("\nSelect your choice: ");
                    choice_main = sc.nextInt();
                    sc.nextLine();
                    if(choice_main > 4 ||choice_main < 1){
                        System.out.println("Invalid choice. Please select again.");
                    }
                    else
                        break;
                }catch(Exception e){
                    System.out.println("Invalid choice. Please select again.");
                    sc.nextLine();
                }
            }
            boolean backToCourierMenu = false;
            boolean backToStaffMenu = false;
            boolean backToPaymentMethod = false;
            //Log in as Staff or Cutomer
            switch (choice_main){
                //Log In as Staff
                case 1:
                    System.out.println("\n============");
                    System.out.println("Staff Log in");
                    System.out.print("============");
                    staffLogIn(staff);
                    int choice_staff = 0;
                    do{
                        boolean check = false;
                        staffMenu();
                        while(!check){
                            try{
                                System.out.print("\nSelect your choice: "); 
                                choice_staff = sc.nextInt();
                                sc.nextLine();
                                if(choice_staff > 4 ||choice_staff < 1){
                                    System.out.println("Invalid choice. Please select again.");
                                }
                                 else
                                    break;
                            }
                            catch(Exception e){
                                System.out.println("Invalid choice. Please select again.");
                                sc.nextLine();
                            }
                        }
                        //Staff Menu
                        switch (choice_staff) {
                            //Product CRUD Menu
                            case 1: 
                                int option=0;
                                //operation start 
                                do{
                                crudProduct();
                                boolean input=true;
                                do{
                                    try{
                                        System.out.print("\nPlese insert a number to proceed: ");
                                        option = sc.nextInt();
                                        input = false;
                                    }
                                    catch (Exception ex){
                                        System.out.print("\nIncorrect input: interger required");
                                        sc.nextLine();
                                    }
                                }while(input);
                                int staff_input=0;
                                switch(option){
                                    case 1: //add product
                                        displayProduct();
                                        staff_input=addProduct(product);

                                        switch(staff_input){
                                            case 1: //add flower
                                                //input name
                                                addFlower(product);
                                                break;
                                            case 2://add accessories

                                                displayAccessories();
                                                int user_choice = addAccessories(product);
                                                switch(user_choice){
                                                    case 1: //add sticker
                                                        addSticker(product);
                                                        break;
                                                    case 2: //flower pot
                                                        addFlowerPot(product);
                                                        break;
                                                    case 3: //add other accessories
                                                        addOther(product);
                                                        break;
                                                    default: System.out.print("\nInvalid input");
                                                }
                                                break;

                                            default: System.out.print("\nInvalid input");
                                        }// end of add option
                                        System.out.println("Your product have been added! ");
                                        break;
                                    case 2: //uview product
                                        viewProduct(product);

                                        break; //end of view product 
                                    case 3: //edit product
                                        viewProduct(product);


                                        int index = 1;
                                        input=true;
                                        do{
                                            try{
                                                System.out.print("\nPlease choose a number to edit: ");
                                                index = sc.nextInt();
                                                input = false;
                                            }
                                            catch (Exception ex){
                                                System.out.print("\nIncorrect input: interger required");
                                                sc.nextLine();
                                            }
                                            if(index <= product.size())
                                                input = false;
                                            else {
                                                input = true;
                                                System.out.print("\nInvalid input!");
                                            }

                                        }while(input);

                                        index = index - 1;
                                        staff_input = editProduct(product);
                                        switch(staff_input){
                                            case 1: //change to flower
                                                //input name
                                                updateFlower(product, index);
                                                break;
                                            case 2://change to accessories
                                                int userInput = updateAss(product);
                                                switch(userInput){
                                                    case 1: //add sticker
                                                        updateSticker(product, index);

                                                        break;
                                                    case 2: //change to flower pot
                                                        updateFlowerPot(product, index);

                                                        break;
                                                    case 3: //change to other accessories
                                                        updateOther(product, index);

                                                        break;
                                                    default: System.out.print("\nInvalid input");
                                                }
                                               break;
                                            default: System.out.print("\nInvalid input");
                                        }
                                        System.out.println("Your product have been updated! ");
                                        break; //end of edit product 
                                        
                                    case 4:
                                        //remove product 
                                        removeProduct(product);
                                        System.out.println("Your product have been removed! ");
                                        break;
                                    case 5:
                                        //clear product
                                        product.clear();
                                        System.out.println("Your product is clear! ");
                                        break;
                                    case 6:
                                        break;
                                    default:
                                        System.out.println("Invalid input! ");

                                    } //end of CRUD
                                }while(option!=6);
                                backToStaffMenu = true;
                                break;

                            //Courier CRUD Menu
                            case 2:
                                do{
                                    courierMenu();
                                    int choice3 = 0;
                                    boolean isInteger = false;
                                    while(!isInteger){
                                        try{
                                            System.out.print("\nSelect your choice: "); 
                                            choice3 = sc.nextInt();
                                            isInteger = true;
                                        }
                                        catch(Exception e){
                                            System.out.println("Invalid choice. Please select again.");
                                            sc.nextLine();         
                                        }
                                    }
                                    switch(choice3){
                                        case 1:
                                            addCourier(courier);
                                            backToCourierMenu = true;
                                            break;
                                        case 2:
                                            deleteCourier(courier);
                                            backToCourierMenu = true;
                                            break;
                                        case 3:
                                            updateCourier(courier);
                                            backToCourierMenu = true;
                                            break;
                                        case 4:
                                            displayCourier(courier);
                                            backToCourierMenu = backToPrevious();
                                            break;
                                        case 5:
                                            backToCourierMenu = false;
                                            backToStaffMenu = true;
                                            break;
                                        default:
                                            System.out.println("Invalid choice. Please select again.");
                                            sc.nextLine();
                                            backToCourierMenu = true;
                                    }
                                }while(backToCourierMenu);
                                break;
                            //Payment method CRUD menu
                            case 3:
                                do{
                                    paymentMenu();
                                    boolean isInteger = false;
                                    int choice4=0;
                                    while(!isInteger){
                                        try{
                                            System.out.print("\nEnter your choice:");
                                            choice4 = sc.nextInt();
                                            isInteger = true;
                                        }
                                        catch(Exception e){
                                          System.out.println("Invalid choice. Please select again.");
                                          sc.nextLine();  
                                        }
                                    }
                                    switch(choice4){
                                        case 1:
                                            addPayMethod(paymentMethod);
                                            backToPaymentMethod = true;
                                            break; //completed
                                        case 2:
                                            deletePayMethod(paymentMethod);
                                            backToPaymentMethod = true;
                                            break;
                                        case 3:
                                            updatePayMethod(paymentMethod);
                                            backToPaymentMethod = true;
                                            break;
                                        case 4:
                                            displayPayMethod(paymentMethod);
                                            backToPaymentMethod = backToPrevious();
                                            break;
                                        case 5:
                                            backToPaymentMethod = false;
                                            backToStaffMenu = true;
                                            break;
                                        default: 
                                            System.out.print("The input is invalid! ");
                                            backToPaymentMethod = true;
                                    }
                                    }while (backToPaymentMethod);
                                break;
                            case 4:
                                backToStaffMenu = false;
                                backToMainMenu = true;
                                break;
                            default:
                                break;
                        }
                    }while(backToStaffMenu);
                    break;

                //customer log in + order
                case 2:
                    currentCustomer = customerLogIn(customer);
                    //customer order start--------------------------------------------------------------------------------- 

                    int customer_input = 0;

                    do{

                    displayOrderMenu();
                    boolean input=true;
                        do{
                            try{
                                System.out.print("\nPlese insert a number to proceed: ");
                                customer_input = sc.nextInt();
                                input = false;
                                }
                        catch (Exception ex){
                                System.out.print("\nIncorrect input: interger required");
                                sc.nextLine();
                                }
                        }while(input);

                    switch(customer_input){
                        case 1: //order flower
                            displayFlower(product);
                            ArrayList<Product> cloneFlower = new ArrayList<>();
                                    for(int i=0; i<product.size(); i++){
                                        if(product.get(i) instanceof Flower)
                                           cloneFlower.add(product.get(i));
                                           //cloneProduct.add(product.get(i));
                                    }
                            makeOrderFlower(product,cloneFlower,order,orderDetails);
                            System.out.println("Your order have been added to cart! ");

                            break;
                        case 2: //order ass
                            displayAccessories(product);
                            ArrayList<Product> cloneAss = new ArrayList<>();
                                    for(int i=0; i<product.size(); i++){
                                        if(product.get(i) instanceof Accessories)
                                            cloneAss.add(product.get(i));
                                    }

                            makeOrderAss(product,cloneAss,order,orderDetails);
                            System.out.println("Your order have been added to cart! ");
                            break;

                        case 3:
                            manageMyOrder();

                            int user_input = 0;
                            input = true;
                            do{
                                try{
                                    System.out.print("\nPlease insert a number: ");
                                    user_input = sc.nextInt();
                                    input = false;
                                }
                                catch (Exception ex){
                                    System.out.print("\nIncorrect input: interger required");
                                    sc.nextLine();
                                }
                            }while(input);


                            //manage order update , view , delete , remove
                            switch(user_input){
                            case 1: //update
                                //edit order
                            int index = editOrder(orderDetails);
                            index = index - 1; //chose the no. of order

                            //display the product to change and user input
                            displayProduct();

                            input = true;
                            do{
                                try{
                                    System.out.print("\nPlese insert a number to choose the product you want: ");
                                    customer_input = sc.nextInt();//pick new product
                                    input = false;
                                }
                                catch (Exception ex){
                                    System.out.print("\nIncorrect input: interger required");
                                    sc.nextLine();
                                }
                            }while(input);


                            switch(customer_input){
                                case 1: //change to flower 
                                    displayFlower(product);

                                    ArrayList<Product> cloneProductupd = new ArrayList<>();
                                    for(int i=0; i<product.size(); i++){
                                        if(product.get(i) instanceof Flower)
                                            cloneProductupd.add(product.get(i));
                                    }
                                    //update order
                                    updateOrderFlower(orderDetails, cloneProductupd, order, index);
                                    /*for(OrderDetails od: orderDetails){
                                    od.editOrder(index, option2, cloneProduct, order, orderDetails, quantity);
                                    }*/
                                    break;
                                case 2: //change to ass
                                    displayAccessories(product);
                                    ArrayList<Product> cloneProductupd2 = new ArrayList<>();
                                    for(int i=0; i<product.size(); i++){
                                        if(product.get(i) instanceof Accessories)
                                            cloneProductupd2.add(product.get(i));
                                    }
                                    updateOrderAss(orderDetails, cloneProductupd2, order, index);

                                    /*
                                    for(OrderDetails od: orderDetails){
                                    od.editOrder(index, option2, cloneProduct2, order, orderDetails, quantity);
                                    }*/
                                    break;
                                default :
                                    System.out.println("Invalid input");
                            }
                            System.out.println("Your order have been updated! ");


                            break;
                            case 2: //view
                                viewOrderDetails(orderDetails);
                                break;
                            case 3: //remove
                                removeOrderDetails(orderDetails);
                                System.out.println("Your order have been removed! ");
                                break;
                            case 4: //clear order
                                orderDetails.clear();
                                System.out.println("Your order is clear! ");
                                break;
                            default :
                                System.out.print("\nInvalid input");
                            } break;
                        case 4:
                            break;
                        default:
                            System.out.print("\nYour input is out of range. Please enter again");


                    }

                    } while(customer_input !=4);
                    double total = displayTotalAndDiscount(orderDetails);
                    //customer order end ---------------------------------------------------------------------------------
                    selectCourier(courier, delivery, customer, currentCustomer);
                    deliveryFee = delivery.get(delivery.size()- 1).calcDeliveryFee(total); //add this for deliveryFee
                    //---------------------------------------------------------------------------------------------------------
                    //payment
                     //get total after discount
                    double grandTotal = calculateGrandTotal(deliveryFee, total);
                    method(payment, paymentMethod, grandTotal);
                    Product.reduceStock(orderDetails, product);
                    orderDetails.clear();

                    //show delivery status
                    showDeliveryDetail(delivery);
                    backToMainMenu = backToMainMenu(); //TO SEE THE RESULT OF REDUCE STOCK , WHEN LOG IN AS OTHER CUSTOMER THE STOCK IS NOT SAME AS ORIGINAL, IF TERMINATE THE PROGRAM THEN CAN'T SEE THE RESULT
                    break;

                case 3:
                    System.out.println("\n=================");
                    System.out.println("Customer Register");
                    System.out.print("=================");
                    customerRegister(customer);
                    backToMainMenu = true;
                    break;

                case 4:
                    System.out.println("\n*********** THANK YOU ***********");
                    System.out.println();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please select again.");
                    break;
            }
        }while(backToMainMenu);
        

           
    }
//method --------------------------------------------------------------------------------------------------------------------------
    
     public static void mainMenu(){
        System.out.println();
        System.out.println("*********************");
        System.out.println("*  LLK Flower Shop  *");
        System.out.println("*********************");
        System.out.println("\nWelcome to LLK Flower Shop!\n");
        System.out.println("1. Log in as staff");
        System.out.println("2. Log in as customer");
        System.out.println("3. Register as customer");
        System.out.println("4. Exit program");
    }
     public static void staffLogIn(ArrayList<Staff> s){
        Scanner sc = new Scanner(System.in);
        String id, pwd;
        boolean valid = false;       
        while (!valid){
            System.out.print("\nEnter your staff id: ");
            id = sc.nextLine();
            System.out.print("Enter your password: ");
            pwd = sc.nextLine();
            valid = s.get(0).logIn(id,pwd);
        }      
    }
    public static void showCustomer(ArrayList<Customer> c){
        System.out.println();
        System.out.println("\t\t******************");
        System.out.println("\t\t  Customer List   ");
        System.out.println("\t\t******************");
        System.out.println("\n   Customer Name    " + "\t\tCustomer ID" + "\t\t\tCustomer Address" );
        System.out.println("=========================================================================================================");
        for(int i=0; i < c.size(); i++){
            System.out.println((i+1)+ ". " + c.get(i).toString());
        }
    }
    
    public static int customerLogIn(ArrayList<Customer> c){
        showCustomer(c);
        Scanner sc = new Scanner(System.in);
        String id, pwd;
        boolean valid = false; 
        int currentCustomer = 0;
        
        while(!valid){
            System.out.print("\nEnter your customer id: ");
            id = sc.nextLine();
            for(int i = 0; i < c.size();i++){
                if(c.get(i).getCustID().equals(id)){
                    while(!valid){
                        System.out.print("Enter your password: ");
                        pwd = sc.nextLine();
                        valid = c.get(i).logIn(id, pwd); 
                        currentCustomer = i;
                    }
                    break;
                } 
            }
            if(valid) 
                break;
            else
                System.out.println("User not found. Please try again.");
        }
        return currentCustomer;
    } 
    
    public static void customerRegister(ArrayList<Customer> c){
        Scanner sc = new Scanner(System.in);
        String name, address, id, pwd;
        System.out.print("\nEnter your name: ");
        name = sc.nextLine();
        System.out.print("Set your customer id: ");
        id = sc.nextLine();
        System.out.print("Set your password: ");
        pwd = sc.nextLine();
        System.out.print("Enter your delivery address: ");
        address = sc.nextLine();
        c.add(new Customer(name, id, pwd, address));
        System.out.println("\nYou have successfully register as a customer!");
    }
    
    public static void staffMenu(){
        System.out.println("\nStaff");
        System.out.println("========");
        System.out.println("1. Product ");
        System.out.println("2. Courier service");
        System.out.println("3. Payment method");
        System.out.println("4. Back to main menu");
    }
    
    public static void courierMenu(){
        System.out.println("\nCourier Service Menu");
        System.out.println("=======================");
        System.out.println("1. Add courier service");
        System.out.println("2. Delete courier service");
        System.out.println("3. Update courier service");
        System.out.println("4. View courier service");
        System.out.println("5. Back to staff menu");   
    }
    
    public static void createCourier(ArrayList<Courier> c){
        c.add(new StandardCourier ("PosLaju Standard", 5.00, 6));
        c.add(new StandardCourier ("JNT Delivery", 4.00, 7));
        c.add(new ExpressCourier ("PosLaju Express", 5.00, 4));
        c.add(new ExpressCourier ("GDEX Express", 7.00, 3));
    }
    
    public static void createStaff(ArrayList<Staff> u){
        u.add(new Staff("Wen Jing", "2011687", "1234"));
    }
    
    public static void createCustomer(ArrayList<Customer> u){
        u.add(new Customer("Alice Lee", "AliceLee123", "1234", "30, Lorong Galing 7, 26000 Petaling Jaya, Selangor"));
    }
    
public static void addCourier(ArrayList<Courier> c) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\tAdd Courier Service");
        System.out.println("\t===================");
        System.out.println("\nCourier type: \n");
        System.out.println("\t1. Standard courier");
        System.out.println("\t2. Express courier");
         
        int type;
        boolean valid = false;
       while(!valid){
            try {
                System.out.print("\nSelect the courier type: "); 
                type = sc.nextInt();
                String name;
                boolean isDouble = false;
                boolean isInteger = false;
                double deliveryFee = 0;
                int deliveryDays = 0;
                switch(type){

                    case 1:
                    sc.nextLine();
                    System.out.print("\nEnter the courier name: ");
                    name = sc.nextLine(); 
                    while(!isDouble){
                        try{
                            System.out.print("Enter the delivery fee: ");
                            deliveryFee = sc.nextDouble();
                            isDouble = true;
                        }
                        catch(Exception e){
                                System.out.println("\nInvalid input! Not a double value! ");
                                sc.nextLine();
                        }
                    }
                    while(!isInteger){
                        try{
                            System.out.print("Enter the delivery days needed (exclude extra 2 days): ");
                            deliveryDays = sc.nextInt();
                            isInteger = true;
                        }
                        catch(Exception e){
                            System.out.println("\nInvalid input! Not an integer! ");
                            sc.nextLine();
                        }
                    }
                    c.add(new StandardCourier (name, deliveryFee, deliveryDays));
                    c.get(c.size() - 1).calcDeliveryDay();
                    System.out.println("\nNew courier created!");
                    sc.nextLine();
                    valid = true;
                    break;
                
                    case 2:
                        sc.nextLine();
                        System.out.print("\nEnter the courier name: ");
                        name = sc.nextLine();

                            while(!isDouble){
                                try{
                                    System.out.print("Enter the delivery fee (exclude extra charge of RM 2): ");
                                    deliveryFee = sc.nextDouble();
                                    isDouble = true;
                                }catch(Exception e){
                                    System.out.println("\nInvalid input! Not a double value! ");
                                    sc.nextLine();
                                }
                            }
                            while(!isInteger){
                                try{
                                    System.out.print("Enter the delivery days needed: ");
                                    deliveryDays = sc.nextInt();
                                    isInteger = true;
                                }
                                catch(Exception e){
                                    System.out.println("\nInvalid input! Not an integer! ");
                                    sc.nextLine();
                                }
                            }
                        c.add(new ExpressCourier(name, deliveryFee, deliveryDays)); 
                        c.get(c.size() - 1).calcDeliveryFee();
                        System.out.println("\nNew courier created!");
                        sc.nextLine();
                        valid = true;
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
                System.out.println("\nInvalid input! Please try again! ");
                sc.nextLine();
            }
        }
        backToPrevious();
    }
    
public static void deleteCourier(ArrayList<Courier> c) {
        displayCourier(c);
        Scanner sc = new Scanner(System.in);
        System.out.println("\nDelete Courier Service");
        System.out.print("=============================");
        
        int choice;
        boolean valid = false;
            while(!valid){
            try {
               System.out.print("\nSelect the courier you want to delete or enter 0 to back to previous menu: "); 
                choice = sc.nextInt();
                if(choice >= 1 && choice <= c.size()){
                    System.out.println("\nAre you sure you want to delete this courier? (Y/N) ");
                    char input = sc.next().charAt(0); 
                    if (input == 'Y'){
                        sc.nextLine();
                        c.remove(choice - 1);  
                        valid = true;
                        System.out.println("\nCourier deleted!");
                        backToPrevious();
                        break;
                    }
                    else if(input == 'N'){
                        valid = false;
                    } 
                    else{
                        System.out.println("\nInvalid input!");
                        valid = false;
                    }
                }
                else if(choice == 0){
                    break;
                }
                else 
                    System.out.println("Invalid input! Please try again! ");
                    sc.nextLine();
            }
            catch(Exception e){
                System.out.println("\nInvalid input! Please try again! ");
                sc.nextLine();
            }
            }
    }
    
    public static void updateCourier(ArrayList<Courier> c) {
        boolean back = false;
        do{
        displayCourier(c);
        Scanner sc = new Scanner(System.in);
        System.out.println("\nUpdate Courier Service");
        System.out.print("=============================");

        int choice;
        String name;
        double fee;
        int days;
        boolean valid = false;
        while(!valid){
        try{
           System.out.print("\nSelect the courier you want to update or press 0 to back to previous menu: "); 
            choice = sc.nextInt();
           if(choice == 0){
               backToPrevious();
               break;
           }
           else if (choice >= 1 && choice <= c.size()){
                valid = true;
                boolean validPart = false;
                while(!validPart){
                    System.out.println("\nWhich part you want to update? "); 
                    System.out.println("(a) courier's name");
                    System.out.println("(b) courier's delivery fee");
                    System.out.println("(c) courier's delivery day");
                    System.out.println("(d) back to select courier");
                    System.out.print("\nSelect the part (a/b/c/d): "); 
                    char part = sc.next().charAt(0);

                    if(part == 'a'){ 
                        validPart = true;
                        sc.nextLine();
                        System.out.print("\nEnter the new courier name: ");
                        name = sc.nextLine();
                        c.get(choice - 1 ).setCourierName(name);
                        System.out.println("\nCourier updated!");
                        backToPrevious();
                    }
                    else if(part == 'b'){
                        validPart = true;
                        boolean isDouble = false;
                        while(!isDouble){
                            try{
                                System.out.print("\nEnter the new delivery fee (exclude extra charge of RM 2 if express courier): ");
                                fee = sc.nextDouble();
                                isDouble = true;
                                System.out.println("\nCourier updated!");
                                c.get(choice - 1 ).setDeliveryFee(fee);
                                c.get(choice - 1 ).calcDeliveryFee();
                                backToPrevious();
                            }
                            catch(Exception e){
                                System.out.println("Invalid input! Not a double value! ");
                                sc.nextLine();
                            }
                        }
                    }
                    else if(part == 'c'){ 
                        validPart = true;
                        boolean isInteger = false;
                        while(!isInteger){
                            try{
                                System.out.print("\nEnter the new delivery days needed (exclude extra 2 days if standard courier): ");
                                days = sc.nextInt();
                                isInteger = true;
                                System.out.println("\nCourier updated!");
                                c.get(choice - 1 ).setDeliveryDay(days);
                                c.get(choice - 1 ).calcDeliveryDay();
                                backToPrevious();
                            }
                            catch(Exception e){
                                System.out.println("Invalid input! Not an integer! ");
                                sc.nextLine();  
                            }
                        }
                    }
                    else if(part == 'd'){
                        validPart = true;
                        back = true;
                    }
                    else{
                        System.out.println("Invalid input! Not a valid part! ");
                        sc.nextLine();  
                    }//end if else for select part
                }//end while loop for invalid part
            }
            else{
                System.out.println("Invalid input! Not a valid choice! ");
                sc.nextLine();  
            }//end if else for select choice
        }
        catch(Exception e){
         System.out.println("Invalid input! Please try again! ");
         sc.nextLine();
        }
        }//end while loop for invalid choice 
        }while(back);
    }
    
    public static boolean backToPrevious(){
        Scanner sc = new Scanner(System.in);
        boolean back = false;
        char input;
        do{
            System.out.print("\nEnter 'Y' to go back to previos menu: ");
            input = sc.next().charAt(0);
            if(input == 'Y'){
                back =  true;
            }
            else{
                System.out.println("Invalid input!");
                sc.nextLine();
            }
        }while(input != 'Y');
        return true;
    }
    
    //not used
    public static boolean backToMainMenu(){
        Scanner sc = new Scanner(System.in);
        boolean back = false;
        char input;
        do{
        System.out.println("\nBack to main menu (Y/N) ?"); 
        input = sc.next().charAt(0);
        if(input == 'Y'){
            back =  true;
        }
        else if(input == 'N'){  
            System.out.println("\n------------------------------------THANK YOU--------------------------------------\n");
            System.exit(0);
        }
        else{
            System.out.println("Invalid input! Please enter only Y or N: ");
            input = sc.next().charAt(0);
        }
        return back;
        }while(input != 'Y' || input != 'N');   
    }
    
    public static void displayCourier(ArrayList<Courier> c) {
        System.out.println();
        System.out.println("\t\t******************");
        System.out.println("\t\t  Courier Service");
        System.out.println("\t\t******************");
        System.out.println("\n   Courier    " + "\t\t\tDelivery Fee" + "\tDelivery Days" );
        System.out.println("=================================================================");
        for(int i=0; i < c.size(); i++){
            System.out.println((i+1)+ ". " + c.get(i).toString());
        }
    }
    
    public static void selectCourier(ArrayList<Courier> c, ArrayList<Delivery> d, ArrayList<Customer> cust, int currentCustomer){
       Scanner sc = new Scanner(System.in);
       displayCourier(c);
       boolean valid = false;
       int choice = 0;
       while(!valid){
        try{
            System.out.print("\nSelect courier (1 - 4): ");
            choice = sc.nextInt();
            valid = true;
            if (choice < 1 || choice > 4){
             System.out.println("Invalid courier! Please choose again!");
             valid = false;
             sc.nextLine();
            }
         } 
         catch(Exception e){
            System.out.println("Invalid courier! Please choose again!");
            valid = false;
            sc.nextLine();
        }
       }
       System.out.println("Courier selected.");
       
        //Address confirmation
       d.add(new Delivery (c.get(choice-1)));
       d.get(d.size()-1).setDeliveryAddress(cust.get(currentCustomer).getCustAddress());
       System.out.println("\nYour current delivery address is: " + d.get(d.size() - 1).getDeliveryAddress());
       do{
        System.out.print("\nDo you want to change your address (Y/N) ? ");
        char reply = sc.next().charAt(0);
        sc.nextLine();
            if(reply == 'Y' || reply == 'y'){
                System.out.println("Enter your new delivery address: ");
                String address = sc.nextLine();
                d.get(d.size() - 1).setDeliveryAddress(address);
                System.out.println("\nYour delivery address is successfully changed!");
                break;
            }
            else if(reply == 'N' || reply == 'n'){
                break;
            }
            else{
                System.out.print("Invalid input! Please enter only 'Y' or 'N'.\n");
                valid = false;
            }
        }while(!valid);
    }
    
    public static void showDeliveryDetail(ArrayList<Delivery> d){
        Scanner sc = new Scanner(System.in);
        char input;
        do{
            System.out.print("\nEnter 'Y' to check your delivery status: ");
            input = sc.next().charAt(0);
            if(input == 'Y'){
                break;
            }
            else{
                System.out.println("Invalid input!");
                sc.nextLine();
            }
        }while(input != 'Y');
        
        System.out.println("\n-----------------------------------------------------------------------");
        System.out.println("\n\t\t\t===============");
        System.out.println("\t\t\tDelivery Status");
        System.out.println("\t\t\t===============");
        
        d.get(d.size() - 1).calcDeliveryDate();
        d.get(d.size() - 1).calcReceivedDate();
        System.out.println("\n"+ d.get(d.size() - 1).toString());
        System.out.println("\nStatus: ");
        System.out.println(d.get(d.size() - 1).getDeliveryDate().minusDays(1) + "\tSender is preparing to ship your parcel.");
        System.out.println(d.get(d.size() - 1).getDeliveryDate() + "\tParcel shipped out.\n");
        System.out.println("\n-----------------------------------------------------------------------\n\n");
    }
    
    //Order module method --------------------------------------------------------------------------------------------------------------
   public static void createProduct(ArrayList product){
        product.add(new Flower("Rose",5.00,500,"Red"));
        product.add(new Flower("Lily",6.00,300,"White"));
        product.add(new Flower("Orchid",7.00,600,"Purple"));
        product.add(new Sticker("Sticker",5.00,250,"Decoration","Yellow",300));
        product.add(new Sticker("Sticker",6.00,250,"Decoration","Yellow",600));
        product.add(new Sticker("Sticker",7.00,250,"Decoration","Yellow",900));
        product.add(new Sticker("Sticker",5.00,250,"Decoration","Green",300));
        product.add(new Sticker("Sticker",6.00,250,"Decoration","Green",600));
        product.add(new Sticker("Sticker",7.00,250,"Decoration","Green",900));
        product.add(new FlowerPot("Flower pot", 10.00, 100, "Tools", "Small",500));
        product.add(new FlowerPot("Flower pot", 15.00, 100, "Tools", "Medium",600));
        product.add(new FlowerPot("Flower pot", 20.00, 100, "Tools", "Big",700));
    }
    public static void crudProduct(){
        System.out.println("\nCRUD Product\n"
            + "1. Add Product\n"
            + "2. View Product\n"
                + "3. Update Product\n"
                + "4. Remove Product\n"
                + "5. Clear all product\n"
                + "6. Exit\n");
    }
    
    public static int addProduct(ArrayList product){
        Scanner scanner = new Scanner(System.in);
        boolean input = true;
        int user_choice = 1;
                do{
                    try{
                        System.out.print("\nPlese insert a number to choose the product to add: ");
                        user_choice = scanner.nextInt();
                        input = false;
                    }
                    catch (Exception ex){
                        System.out.print("\nIncorrect input: interger required");
                        scanner.nextLine();
                    }
                        if(user_choice <= 2)
                            input = false;
                        else {
                            input = true;
                            System.out.print("\nInvalid input!");
                        }
                }while(input);
                return user_choice;
    }
    public static void addFlower(ArrayList product){
        Scanner scanner = new Scanner(System.in);                
        String name = ""; 
        String colour = "";
        double price = 0;
        int stock = 0;
        boolean input = true;
        
        do{
            try{
                System.out.print("\nFlower name: ");
                name = scanner.nextLine();
                input = false;
            }
            catch (Exception ex){
                System.out.print("\nIncorrect input: string required");
                scanner.nextLine();
            }

        }while (input);
        //input price
        input = true;
        do{
            try{
                System.out.print("\nPrice(RM): ");
                price = scanner.nextDouble();
                input = false;
            }
            catch (Exception ex){
                System.out.print("\nIncorrect input: double required");
                scanner.nextLine();
            }

        }while (input);
        //input stock
        input = true;
        do{
            try{
                System.out.print("\nStock: ");
                stock = scanner.nextInt();
                input = false;
            }
            catch (Exception ex){
                System.out.print("\nIncorrect input: integer required");
                scanner.nextLine();
            }

        }while (input);
        //input colour
        String space = scanner.nextLine(); //catch space
        input = true;
        do{
            try{
                System.out.print("\nColour: ");
                colour = scanner.nextLine();
                input = false;
            }
            catch (Exception ex){
                System.out.print("\nIncorrect input: string required");
                scanner.nextLine();
            }

        }while (input);
        product.add(new Flower(name,price,stock,colour));
    }
    
    
    public static void displayAccessories(){
        System.out.println("\n"
            + "1. Sticker\n"
            + "2. Flower pot\n"
                + "3. Others\n");
    }
    public static int addAccessories(ArrayList product){
        Scanner scanner = new Scanner(System.in);
        int user_choice = 1;
        boolean input = true;
        do{
            try{
                System.out.print("\nPlese insert a number to choose the Accessories to add: ");
                user_choice = scanner.nextInt();
                input = false;
            }
            catch (Exception ex){
                System.out.print("\nIncorrect input: interger required");
                scanner.nextLine();
            }
                if(user_choice <= 3)
                    input = false;
                else {
                    input = true;
                    System.out.print("\nInvalid input!");
                }
        }while(input);
        return user_choice;
    }
    public static void edit(int index,ArrayList product){
        
    }
    public static void addSticker(ArrayList product){
        Scanner scanner = new Scanner(System.in);
        String colour = "";
        double price = 0;
        int stock = 0;
        int totalLength=0;
        //input price
        boolean input = true;
        do{
            try{
                System.out.print("\nPrice(RM): ");
                price = scanner.nextDouble();
                input = false;
            }
            catch (Exception ex){
                System.out.print("\nIncorrect input: double required");
                scanner.nextLine();
            }

        }while (input);
        //input stock
        input = true;
        do{
            try{
                System.out.print("\nStock: ");
                stock = scanner.nextInt();
                input = false;
            }
            catch (Exception ex){
                System.out.print("\nIncorrect input: integer required");
                scanner.nextLine();
            }

        }while (input);
        //input colour
        String space = scanner.nextLine();
        input = true;
        do{
            try{
                System.out.print("\nColour: ");
                colour = scanner.nextLine();
                input = false;
            }
            catch (Exception ex){
                System.out.print("\nIncorrect input: String required");
                scanner.nextLine();
            }

        }while (input);
        //input length

        input = true;
        do{
            try{
                System.out.print("\nLength(m): ");
                totalLength = scanner.nextInt();
                input = false;
            }
            catch (Exception ex){
                System.out.print("\nIncorrect input: integer required");
                scanner.nextLine();
            }

        }while (input);
        //product.add(new Sticker("Sticker",5.00,250,"Decoration","Yellow",300));
        product.add(new Sticker("Sticker",price,stock,"Decoration",colour,totalLength));
        
    }
    public static void addFlowerPot(ArrayList product){
        Scanner scanner = new Scanner(System.in);
        double price = 0;
        int stock = 0;
        String size = "";
        int weight=0;
        //input price
        boolean input = true;
        do{
            try{
                System.out.print("\nPrice(RM): ");
                price = scanner.nextDouble();
                input = false;
            }
            catch (Exception ex){
                System.out.print("\nIncorrect input: double required");
                scanner.nextLine();
            }

        }while (input);
        //input stock
        String space = scanner.nextLine();
        input = true;
        do{
            try{
                System.out.print("\nStock: ");
                stock = scanner.nextInt();
                input = false;
            }
            catch (Exception ex){
                System.out.print("\nIncorrect input: integer required");
                scanner.nextLine();
            }
        }while(input);
        //input size
        
        space = scanner.nextLine();
        input = true;
        do{
            try{
                System.out.print("\nSize: ");
               
                size = scanner.nextLine();
                
                input = false;
            }
            catch (Exception ex){
                System.out.print("\nIncorrect input: string required");
                scanner.nextLine();
            }

        }while (input);
        //input weight
        
        input = true;
        do{
            try{
                System.out.print("\nWeight(g): ");
                weight = scanner.nextInt();
                input = false;
            }
            catch (Exception ex){
                System.out.print("\nIncorrect input: integer required");
                scanner.nextLine();
            }
        }while(input);

        //product.add(new FlowerPot("Flower pot", 10.00, 100, "Tools", "Small",500)); price stock size weight
        product.add(new FlowerPot("Flower pot",price,stock,"Tools",size,weight));
    }
    public static void addOther(ArrayList product){
        Scanner scanner = new Scanner(System.in);
        String type = "";
        String name = "";
        double price = 0;
        int stock = 0;
        //input type

        boolean input = true;
        do{
            try{
                System.out.print("\nType: ");
                type = scanner.nextLine();
                input = false;
            }
            catch (Exception ex){
                System.out.print("\nIncorrect input: string required");
                scanner.nextLine();
            }
        }while(input);
        //input name
        
        input = true;
        do{
            try{
                System.out.print("\nName: ");
                name = scanner.nextLine();
                input = false;
            }
            catch (Exception ex){
                System.out.print("\nIncorrect input: string required");
                scanner.nextLine();
            }
        }while(input);
        //input price
        input = true;
        do{
            try{
                System.out.print("\nPrice(RM): ");
                price = scanner.nextDouble();
                input = false;
            }
            catch (Exception ex){
                System.out.print("\nIncorrect input: double required");
                scanner.nextLine();
            }

        }while (input);
        //input stock
        input = true;
        do{
            try{
                System.out.print("\nStock: ");
                stock = scanner.nextInt();
                input = false;
            }
            catch (Exception ex){
                System.out.print("\nIncorrect input: integer required");
                scanner.nextLine();
            }
        }while(input);
        //public Accessories(String type,  String name, double price, int stock) {
        product.add(new Accessories(type,name,price,stock));
    }
    public static void viewProduct(ArrayList product){
        int count = 1;
                for (int i = 0; i<product.size();i++){
                     
                System.out.print(count+".");
                System.out.println(product.get(i));
                count++;
            }
    }
    public static int editProduct(ArrayList product){
    Scanner scanner = new Scanner(System.in);
    
    displayProduct();
    boolean input = true;
    int option2 = 1;
    do{
        try{
            System.out.print("\nPlese insert a number to choose the product to add: ");
            option2 = scanner.nextInt();
            input = false;
        }
        catch (Exception ex){
            System.out.print("\nIncorrect input: interger required");
            scanner.nextLine();
        }
            if(option2 <= 2)
                input = false;
            else {
                input = true;
                System.out.print("\nInvalid input!");
            }
    }while(input);
    return option2;
    }
    public static void updateFlower(ArrayList product, int index){
    Scanner scanner = new Scanner(System.in);
    String name = ""; 
    String colour = "";
    double price = 0;
    int stock = 0;
    boolean input = true;
    String space;
    do{
        try{
            System.out.print("\nFlower name: ");
            name = scanner.nextLine();
            input = false;
        }
        catch (Exception ex){
            System.out.print("\nIncorrect input: string required");
            scanner.nextLine();
        }

    }while (input);
    //input price
    input = true;
    do{
        try{
            System.out.print("\nPrice(RM): ");
            price = scanner.nextDouble();
            input = false;
        }
        catch (Exception ex){
            System.out.print("\nIncorrect input: double required");
            scanner.nextLine();
        }

    }while (input);
    //input stock
    input = true;
    do{
        try{
            System.out.print("\nStock: ");
            stock = scanner.nextInt();
            input = false;
        }
        catch (Exception ex){
            System.out.print("\nIncorrect input: integer required");
            scanner.nextLine();
        }

    }while (input);
    //input colour
    space = scanner.nextLine();
    input = true;
    do{
        try{
            System.out.print("\nColour: ");
            colour = scanner.nextLine();
            input = false;
        }
        catch (Exception ex){
            System.out.print("\nIncorrect input: string required");
            scanner.nextLine();
        }

    }while (input);
    product.set(index,new Flower(name,price,stock,colour));
    }
    public static int updateAss(ArrayList product){
        displayAccessories();
        int option2=0; 
        Scanner scanner = new Scanner(System.in);
        boolean input = true;
        do{
            try{
                System.out.print("\nPlese insert a number to choose the Accessories to add: ");
                option2 = scanner.nextInt();
                input = false;
            }
            catch (Exception ex){
                System.out.print("\nIncorrect input: interger required");
                scanner.nextLine();
            }
                if(option2 <= 3)
                    input = false;
                else {
                    input = true;
                    System.out.print("\nInvalid input!");
                }
        }while(input);
        return option2;
    }
    public static void updateSticker(ArrayList product, int index){
    Scanner scanner = new Scanner(System.in);
    String colour = "";
    double price = 0;
    int stock = 0;
    int totalLength=0;
    //input price
    boolean input = true;
    do{
        try{
            System.out.print("\nPrice(RM): ");
            price = scanner.nextDouble();
            input = false;
        }
        catch (Exception ex){
            System.out.print("\nIncorrect input: double required");
            scanner.nextLine();
        }

    }while (input);
    //input stock
    input = true;
    do{
        try{
            System.out.print("\nStock: ");
            stock = scanner.nextInt();
            input = false;
        }
        catch (Exception ex){
            System.out.print("\nIncorrect input: integer required");
            scanner.nextLine();
        }

    }while (input);
    //input colour
    String space = scanner.nextLine();
    input = true;
    do{
        try{
            System.out.print("\nColour: ");
            colour = scanner.nextLine();
            input = false;
        }
        catch (Exception ex){
            System.out.print("\nIncorrect input: String required");
            scanner.nextLine();
        }

    }while (input);
    //input length

    input = true;
    do{
        try{
            System.out.print("\nLength(m): ");
            totalLength = scanner.nextInt();
            input = false;
        }
        catch (Exception ex){
            System.out.print("\nIncorrect input: integer required");
            scanner.nextLine();
        }

    }while (input);
    //product.add(new Sticker("Sticker",5.00,250,"Decoration","Yellow",300));
    product.set(index,new Sticker("Sticker",price,stock,"Decoration",colour,totalLength));
    }
    public static void updateFlowerPot(ArrayList product, int index){
    Scanner scanner = new Scanner(System.in);
    double price = 0;
    int stock = 0;
    String size = "";
    int weight=0;
    //input price
    boolean input = true;
    do{
        try{
            System.out.print("\nPrice: ");
            price = scanner.nextDouble();
            input = false;
        }
        catch (Exception ex){
            System.out.print("\nIncorrect input: double required");
            scanner.nextLine();
        }

    }while (input);
    //input stock
    String space = scanner.nextLine();
    input = true;
    do{
        try{
            System.out.print("\nStock: ");
            stock = scanner.nextInt();
            input = false;
        }
        catch (Exception ex){
            System.out.print("\nIncorrect input: integer required");
            scanner.nextLine();
        }
    }while(input);
    //input size
    space = scanner.nextLine();
    input = true;
    do{
        try{
            System.out.print("\nSize: ");
            size = scanner.nextLine();
            input = false;
        }
        catch (Exception ex){
            System.out.print("\nIncorrect input: string required");
            scanner.nextLine();
        }

    }while (input);
    //input weight
    
    input = true;
    do{
        try{
            System.out.print("\nWeight(g): ");
            weight = scanner.nextInt();
            input = false;
        }
        catch (Exception ex){
            System.out.print("\nIncorrect input: integer required");
            scanner.nextLine();
        }
        
    }while(input);
    product.set(index,new FlowerPot("Flower pot",price,stock,"Tools",size,weight));
    }
    public static void updateOther(ArrayList product, int index){
        Scanner scanner = new Scanner(System.in);
        String type = "";
        String name = "";
        double price = 0;
        int stock = 0;
        //input type
        
        boolean input = true;
        do{
            try{
                System.out.print("\nType: ");
                type = scanner.nextLine();
                input = false;
            }
            catch (Exception ex){
                System.out.print("\nIncorrect input: string required");
                scanner.nextLine();
            }
        }while(input);
        //input name

        input = true;
        do{
            try{
                System.out.print("\nName: ");
                name = scanner.nextLine();
                input = false;
            }
            catch (Exception ex){
                System.out.print("\nIncorrect input: string required");
                scanner.nextLine();
            }
        }while(input);
        //input price
        input = true;
        do{
            try{
                System.out.print("\nPrice: ");
                price = scanner.nextDouble();
                input = false;
            }
            catch (Exception ex){
                System.out.print("\nIncorrect input: double required");
                scanner.nextLine();
            }

        }while (input);
        //input stock
        input = true;
        do{
            try{
                System.out.print("\nStock: ");
                stock = scanner.nextInt();
                input = false;
            }
            catch (Exception ex){
                System.out.print("\nIncorrect input: integer required");
                scanner.nextLine();
            }
        }while(input);
        //public Accessories(String type,  String name, double price, int stock) {
        product.set(index,new Accessories(type,name,price,stock));
    }
    public static void removeProduct(ArrayList product){
        Scanner scanner = new Scanner(System.in);
        int count = 1;
                for (int i = 0; i<product.size();i++){
                     
                System.out.print(count+".");
                System.out.println(product.get(i));
                count++;
                }
                
                
                int index = 1;
                boolean input=true;
                do{
                    try{
                        System.out.print("\nPlease choose a number to remove: "); 
                        index = scanner.nextInt();
                        input = false;
                    }
                    catch (Exception ex){
                        System.out.print("\nIncorrect input: interger required");
                        scanner.nextLine();
                    }
                    if(index <= product.size())
                        input = false;
                    else {
                        input = true;
                        System.out.print("\nInvalid input!");
                    }

                }while(input);
                index = index - 1;
                product.remove(index);
    }
    
    //method for customer make order -------------------------------------------------------------------
    
    public static void makeOrderFlower(ArrayList product, ArrayList<Product> cloneProduct,ArrayList order, ArrayList orderDetails){
        Scanner scanner = new Scanner(System.in);
                boolean input;
                int user_choice = 1;
                
                input = true;
                do{
                    try{
                        System.out.print("\nPlese insert a number to choose the flower you want: ");
                        user_choice = scanner.nextInt();
                        input = false;
                    }
                    catch (Exception ex){
                        System.out.print("\nIncorrect input: interger required");
                        scanner.nextLine();
                    }
//                    int count = 0;
//                    for (int i =0; i<product.size(); i++){
//                        if(product.get(i) instanceof Flower){
//                            count++;
//                        }
//                    }
                        if(user_choice <= cloneProduct.size())
                            input = false;
                        else {
                            input = true;
                            System.out.print("\nInvalid input!");
                        }

                    
                    
                }while(input);
                user_choice = user_choice - 1;
                input = true;
                int quantity = 1;
                
                do{
                            try{
                            System.out.print("\nQuantity: ");
                            quantity = scanner.nextInt();
                            input = false;
                            }
                            catch (Exception ex){
                                System.out.print("\nIncorrect input: interger required");
                            scanner.nextLine();
                            }
                        if(quantity<=cloneProduct.get(user_choice).getStock())
                            input = false;
                        else {
                            input = true;
                            System.out.print("\nIncorrect input: The quantity is out of range of stock");
                        }
                        
                        }while(input);
                order.add(new Order(quantity));
                makeOrder(user_choice,cloneProduct,order,orderDetails);
                
    }
    public static void displayOrderMenu(){
        System.out.println("\nOrder\n"
            + "1. Flower\n"
            + "2. Accessories\n"
                + "3. Manage my order\n"
                + "4. Complete order");
    }
    public static void displayProduct(){
        System.out.println("\n"
            + "1. Flower\n"
            + "2. Accessories\n");
    }
    public static void manageMyOrder(){
        System.out.println("Manage my order: \n"
            + "1. Update Order\n"
            + "2. View Order\n"
                + "3. Remove Order\n"
                + "4. Clear Order");
    }
    public static void displayFlower(ArrayList product){
        System.out.println("Flower\t\t\tPrice\tStock\tColour");
        int count = 1;
        for (int i =0; i<product.size(); i++){
            if(product.get(i) instanceof Flower){
                System.out.print(count+".");
                System.out.println(product.get(i));
                count++;
            }
            
        }
    }
    
    
    
    public static void makeOrder(int user_choice, ArrayList cloneProduct, ArrayList<Order> order,ArrayList orderdetails){
        
        int index=0;
        for(Order o :order){
             index = o.getCount()-1;
        }
        
        for(int j=0; j<cloneProduct.size();j++){
            if(j==(user_choice))
                orderdetails.add(new OrderDetails((Product)cloneProduct.get(j),(Order)order.get(index)));
        }
    }
    
    public static void makeOrderAss(ArrayList product, ArrayList<Product> cloneProduct2,ArrayList order, ArrayList orderDetails){
        Scanner scanner = new Scanner(System.in);
                boolean input;
                int user_choice = 1;
                input = true;
                do{
                    try{
                        System.out.print("\nPlese insert a number to choose the accessories you want: ");
                        user_choice = scanner.nextInt();
                        input = false;
                    }
                    catch (Exception ex){
                        System.out.print("\nIncorrect input: interger required");
                        scanner.nextLine();
                    }
//                        int count = 0;
//                    for (int i =0; i<product.size(); i++){
//                        if(product.get(i) instanceof Accessories){
//                            count++;
//                        }
//                    }
                        if(user_choice <= cloneProduct2.size())
                            input = false;
                        else {
                            input = true;
                            System.out.print("\nInvalid input!");
                        }
                    
                    
                }while(input);
                user_choice = user_choice - 1;
                input = true;
                int quantity = 1;
                do{
                            try{
                            System.out.print("\nQuantity: ");
                            quantity = scanner.nextInt();
                            input = false;
                            }
                            catch (Exception ex){
                                System.out.print("\nIncorrect input: interger required");
                            scanner.nextLine();
                            }
                        if(quantity<=cloneProduct2.get(user_choice).getStock())
                            input = false;
                        else {
                            input = true;
                            System.out.print("\nIncorrect input: The quantity is out of range of stock");
                        }
                        
                        }while(input);
                
                order.add(new Order(quantity));
                makeOrder(user_choice,cloneProduct2,order,orderDetails);
    }
    public static void viewOrderDetails(ArrayList orderDetails){
        System.out.print("   Order ID\tProduct Name\tPrice\t   Quantity\tOrder Date\tTotal Price\n");
                    System.out.print(orderDetails.toString());
    }
    public static void removeOrderDetails(ArrayList<OrderDetails> orderDetails){
        Scanner scanner = new Scanner(System.in); 
        for(int i=0; i<orderDetails.size();i++){
                    System.out.print((i+1)+"."+orderDetails.get(i));
                }
        
                    int index = 1;
                    boolean input = true;
                    do{
                        try{
                                System.out.print("\nPlease insert a number to remove the order: ");
                                index = scanner.nextInt();
                                input = false;
                            }
                        catch (Exception ex){
                                System.out.print("\nIncorrect input: interger required");
                                scanner.nextLine();
                            }
                            if(index>=1&&index<=orderDetails.size())
                                input = false;
                            else {
                                input = true;
                                System.out.print("\nIncorrect input: The number does not exist");
                            }
                    }while(input);
                    
                    
                     
                    index = index - 1;
                    orderDetails.remove(index);
                    
    }
    
    public static int editOrder(ArrayList<OrderDetails> orderDetails){
        
                Scanner scanner = new Scanner(System.in);     
                System.out.print("   Order ID\tProduct Name\tPrice\t   Quantity\tOrder Date\tTotal Price\n");
                for(int i=0; i<orderDetails.size();i++){
                    System.out.print((i+1)+"."+orderDetails.get(i));
                }
                //System.out.print(orderDetails.toString());
                int index = 1;
                //check this ------------------------------------------------------------------------------
                boolean input = true;
                do{
                 try{
                        System.out.print("\nPlese insert the number to edit the order: ");
                        index = scanner.nextInt();
                        input = false;
                    }
                    catch (Exception ex){
                        System.out.print("\nIncorrect input: interger required");
                        scanner.nextLine();
                    }
                if(index>=1&&index<=orderDetails.size())
                    input = false;
                else {
                    input = true;
                    System.out.print("\nIncorrect input: The number does not exist");
                }
                }while(input);
        return index;
    }
    public static void displayAccessories(ArrayList product){
//        System.out.println("Accessories\t\tPrice\tStock\tType\t\tColour\tTotal length");
        int count = 1;
//        for (int i =0; i<product.size(); i++){
//            if(product.get(i) instanceof Sticker){
//                System.out.print(count+".");
//                System.out.println(product.get(i));
//                count++;
//            }
//            
//        }
//        System.out.println("Accessories\t\tPrice\tStock\tType\tSize\tWeight");
//        for (int i =0; i<product.size(); i++){
//            if(product.get(i) instanceof FlowerPot){
//                System.out.print(count+".");
//                System.out.println(product.get(i));
//                count++;
//            }
//           
//        }
        System.out.println("\n  Product\t\t\tPrice\tStock\t\tDescription");
        for (int i =0; i<product.size(); i++){
            if(product.get(i) instanceof Accessories){
                System.out.print(count+".");
                System.out.println(product.get(i).toString());
                count++;
            }
           
        }
    }
    
    public static void updateOrderFlower(ArrayList orderDetails, ArrayList<Product> cloneProductupd, ArrayList order,int index){
        Scanner scanner = new Scanner(System.in); 
        int user_choice = 1;
        boolean input = true;
        do{
            try{
                System.out.println("Plese insert a number to choose the flower you want: ");
                user_choice = scanner.nextInt();
                input = false;
            }
            catch (Exception ex){
                System.out.print("\nIncorrect input: interger required");
                scanner.nextLine();
            }
        }while(input);


        input = true;
        user_choice = user_choice - 1 ;
        int quantity = 1;
        do{
            try{
            System.out.print("\nQuantity: ");
            quantity = scanner.nextInt();
            input = false;
            }
            catch (Exception ex){
                System.out.print("\nIncorrect input: interger required");
            scanner.nextLine();
            }
        if(quantity<=cloneProductupd.get(user_choice).getStock())
            input = false;
        else {
            input = true;
            System.out.print("\nIncorrect input: The quantity is out of range of stock");
        }

        }while(input);
        editOrder(index,user_choice,cloneProductupd,order,orderDetails,quantity);
    }
    
    public static void updateOrderAss(ArrayList orderDetails, ArrayList<Product> cloneProductupd2, ArrayList order,int index){
        Scanner scanner = new Scanner(System.in); 
        int user_choice = 1;
        boolean input = true;
        do{
            try{
                System.out.println("Plese insert a number to choose the accessories you want: ");
                user_choice = scanner.nextInt();
                input = false;
            }
            catch (Exception ex){
                System.out.print("\nIncorrect input: interger required");
                scanner.nextLine();
            }
        }while(input);

        user_choice = user_choice - 1;
        int quantity = 1;
        input = true;
        do{
            try{
            System.out.print("\nQuantity: ");
            quantity = scanner.nextInt();
            input = false;
            }
            catch (Exception ex){
                System.out.print("\nIncorrect input: interger required");
            scanner.nextLine();
            }
        if(quantity<=cloneProductupd2.get(user_choice).getStock())
            input = false;
        else {
            input = true;
            System.out.print("\nIncorrect input: The quantity is out of range of stock");
        }

        }while(input);

        editOrder(index,user_choice,cloneProductupd2,order,orderDetails,quantity);
    }
    
    public static void editOrder( int index, int option2, ArrayList product, ArrayList<Order> order,ArrayList orderdetails, int quantity){
        Order[] cloneOrder = new Order[1];
        cloneOrder[0] = new Order();
        cloneOrder[0].setOrderID(order.get(index).getOrderID());
        cloneOrder[0].setQuantity(quantity);
        order.set(index, cloneOrder[0]);
        OrderDetails[] cloneOrderDetails = new OrderDetails[1];
        cloneOrderDetails[0] = new OrderDetails((Product)product.get(option2),(Order)order.get(index));
        orderdetails.set(index, cloneOrderDetails[0]);
        //orderdetails.set(index, order.get(option2));
        
    }
    
     
    public static double displayTotalAndDiscount(ArrayList<OrderDetails> od){
        Scanner sc = new Scanner(System.in);       
        double total = od.get(od.size()- 1).calculateTotal(od);
        System.out.printf("\nTotal: RM %.2f", total);
        
        //get discount
        double discount = od.get(od.size()- 1).calculateDiscount(od.size(), total);
        System.out.printf("\nDiscount: RM %.2f", discount);
        System.out.println("\n");
        
        char input;
        do{
            System.out.print("\nEnter 'Y' to proceed to select courier. ");
            input = sc.next().charAt(0);
            if(input == 'Y'){
                break;
            }
            else{
                System.out.println("Invalid input!");
                sc.nextLine();
            }
        }while(input != 'Y');
        return total - discount;
    }
    
    public static double calculateGrandTotal(double deliveryFee, double total){
        Scanner sc = new Scanner(System.in);  
        System.out.printf("\nTotal(after discount): RM %.2f", total);
        System.out.printf("\nDelivery Fee: RM %.2f", deliveryFee);
        
        double grandTotal = total + deliveryFee;
        System.out.printf("\nGrand total: RM %.2f", grandTotal);
        System.out.println("\n");
        
        char input;
        do{
            System.out.print("\nEnter 'Y' to proceed to payment. ");
            input = sc.next().charAt(0);
            if(input == 'Y'){
                break;
            }
            else{
                System.out.println("Invalid input!");
                sc.nextLine();
            }
        }while(input != 'Y');
        return grandTotal;
    }
    
    
  //Payment---------------------------------------------------------------------------------------------------------------------
     public static void createPayMethod(ArrayList<PaymentMethod> p){
         //card
         p.add(new Card("Card","Debit Card"));
         p.add(new Card("Card","Credit Card"));
         
         //e-wallet
         p.add(new EWallet("E-Wallet","Touch'n Go"));
         p.add(new EWallet("E-Wallet","Grab Pay"));
         p.add(new EWallet("E-Wallet","Boost"));
         
         p.add(new OnlineBanking("Online Banking","Maybank2u"));
         p.add(new OnlineBanking("Online Banking","CIMB Clicks"));
         p.add(new OnlineBanking("Online Banking","Public Bank"));      
    } 
    
      public static void paymentMenu(){
        System.out.println("\nPayment");
        System.out.println("=======");
        System.out.println("1. Add Payment Method");
        System.out.println("2. Delete Payment Method");
        System.out.println("3. Update Payment Method");
        System.out.println("4. View Payment Method");
        System.out.println("5. Back to Staff Menu");
    }
    
    public static void payMethod(){
        System.out.println("\nPayment Method");
        System.out.println("==============");
        System.out.println("1. Credit/Debit Card");
        System.out.println("2. Online Banking");
        System.out.println("3. E-Wallet");
    }
    
    public static void method(ArrayList<Payment> p, ArrayList<PaymentMethod> m, double a){
        payMethod();
        double amount = a;
        int payMethod;
        Scanner sc = new Scanner(System.in);
        boolean valid = true;
        do{
            try{
                System.out.print("\nPlease select a payment method: ");
                payMethod = sc.nextInt();
                sc.nextLine();

                switch(payMethod) {
                    case 1: 
                        card(p, m, amount);
                        break;

                    case 2:
                        onlineBank(p, m, amount);
                        break;

                    case 3:
                        eWallet(p,m, amount);
                        break;
                    
                    default:
                        System.out.println("\nInvalid Input! Please try again!");
                        valid = false;
                        break;
                }
            }catch(Exception e){
                System.out.println("\nInvalid Input! Please try again!");
                valid = false;
                sc.nextLine();
            }
        }while(!valid);
        System.out.println(p.get(p.size()-1).toString());
    }
    
    public static void card(ArrayList<Payment> p, ArrayList<PaymentMethod> m, double amount){
        System.out.println("\n============");
        System.out.println("Type of Card");
        System.out.println("============");
        System.out.println("1. Credit Card");
        System.out.println("2. Debit Card");
        
        int cardType;
        Scanner sc = new Scanner(System.in);
        //try catch
        boolean valid = true;
        do{
            try{
                System.out.print("\nPlease enter type of card(1, 2): ");
                cardType = sc.nextInt();
                String cardNo, pin;

                switch(cardType){
                    case 1: 
                        System.out.println("\n***********");
                        System.out.println("Credit Card");
                        System.out.println("***********");
                        System.out.println("Please enter your card details.");

                        System.out.println("\nCard Details");
                        System.out.println("============");
                        sc.nextLine();
                        System.out.print("Card Number: ");
                        cardNo = sc.nextLine();
                        System.out.print("Enter pin: ");
                        pin = sc.nextLine();
                        System.out.println("\nPayment Successful!"); 
                        p.add(new Payment(amount, m.get(0)));
                        break;

                    case 2:
                        System.out.println("\n**********");
                        System.out.println("Debit Card");
                        System.out.println("**********");
                        System.out.println("Please enter your card details.");

                        System.out.println("\nCard Details");
                        System.out.println("============");
                        System.out.print("Card Number: ");
                        cardNo = sc.nextLine();
                        System.out.print("Enter pin: ");
                        pin = sc.nextLine();
                        System.out.println("\nPayment Successful!");
                        p.add(new Payment(amount, m.get(1)));
                        break;

                    default:
                        System.out.println("Invalid option!");
                        valid = false;
                }
        }catch(Exception e){
            System.out.println("Invalid option!");
            valid = false;
            sc.nextLine();
        }
        }while(!valid);    
    }
    
    
    public static void eWallet(ArrayList<Payment> p, ArrayList<PaymentMethod> m, double amount){
        System.out.println("\n========");
        System.out.println("E-WALLET");
        System.out.println("========");
        System.out.println("1. Touch'n Go E-Wallet");
        System.out.println("2. GrabPay Wallet");
        System.out.println("3. Boost Wallet");
       
        
        int wallet;
        Scanner sc = new Scanner(System.in);
        boolean valid = true;
        do{
            try{
            System.out.print("\nPlease select an option(Eg: 1,2,3): ");
            wallet = sc.nextInt();

            String walletID, PIN;
            double receive = 0;
            boolean enough = false;
            switch(wallet) {
                case 1:
                   sc.nextLine();
                   System.out.println("\n*******************");
                   System.out.println("Touch'n Go E-Wallet");
                   System.out.println("*******************");
                   System.out.println("Please login to your account.");
                   System.out.print("Please enter E-Wallet ID: ");
                   walletID = sc.nextLine(); 
                   System.out.print("Please enter your 6-digit PIN: ");
                   PIN = sc.nextLine();
                   System.out.println("\nLogin Successfully!");
                   System.out.printf("\nAmount: RM %.2f", amount);
                   while(!enough){
                        System.out.print("\nAmount Pay: RM ");
                        receive = sc.nextDouble();
                        if(receive == amount)
                            enough = true;
                        else
                            System.out.println("Amount incorrect!");
                   }
                   System.out.println("\nPayment Successful!");
                   p.add(new Payment(amount, m.get(2)));
                   break;

                case 2:
                   sc.nextLine();
                   System.out.println("\n**************");
                   System.out.println("GrabPay Wallet");
                   System.out.println("**************");
                   System.out.print("Please enter E-Wallet ID: ");
                   walletID = sc.nextLine(); 
                   System.out.print("Please enter your 6-digit PIN: ");
                   PIN = sc.nextLine();
                   System.out.println("\nLogin Successfully!");
                   System.out.printf("\nAmount: RM %.2f", amount);
                   while(!enough){
                        System.out.print("\nAmount Pay: RM ");
                        receive = sc.nextDouble();
                        if(receive == amount)
                            enough = true;
                        else
                            System.out.println("Amount incorrect!");
                   }
                   System.out.println("\nPayment Successful!");
                   p.add(new Payment(amount, m.get(3)));
                   break;

                case 3:
                   sc.nextLine();
                   System.out.println("\n************");
                   System.out.println("Boost Wallet");
                   System.out.println("************");
                   System.out.print("Please enter E-Wallet ID: ");
                   walletID = sc.nextLine(); 
                   System.out.print("Please enter your 6-digit PIN: ");
                   PIN = sc.nextLine();
                   System.out.println("\nLogin Successfully!");
                   System.out.printf("\nAmount: RM %.2f", amount);
                   while(!enough){
                        System.out.print("\nAmount Pay: RM ");
                        receive = sc.nextDouble();
                        if(receive == amount)
                            enough = true;
                        else
                            System.out.println("Amount incorrect!");
                   }
                   p.add(new Payment(amount, m.get(4)));
                   break;

                default:
                    System.out.println("\nInvalid Input, please try again!");
                    valid = false;
            }
            }catch(Exception e){
                System.out.println("\nInvalid Input, please try again!");
                valid = false;
                sc.nextLine();
            }
        }while(!valid);
    }
    
    
    public static void onlineBank(ArrayList<Payment> p, ArrayList<PaymentMethod> m, double amount) {
         System.out.println("\n==============");
         System.out.println("Online Banking");
         System.out.println("==============");
         System.out.println("1. Maybank2u");
         System.out.println("2. CIMB Clicks");
         System.out.println("3. Public Bank");
     
     int bank;
     Scanner sc = new Scanner(System.in);
            System.out.print("\nPlease enter the bank(Exp:1,2,3): ");
            bank = sc.nextInt();
            String bankName, BPswd, Tac, rTAC;
            boolean match = false;
            
            switch(bank){
                case 1:
                    System.out.println("\n*********");
                    System.out.println("Maybank2u");
                    System.out.println("*********");
                    sc.nextLine();
                    System.out.print("Username: ");
                    bankName = sc.nextLine();
                    System.out.print("Password: ");
                    BPswd = sc.nextLine();
                    rTAC = generateTAC();
                    while(!match){
                        System.out.print("Enter TAC No: ");
                        Tac = sc.nextLine();
                        if (Tac.equals(rTAC)){
                            System.out.println("TAC Number Match.");
                            System.out.println("\nPayment Successful!");
                            p.add(new Payment(amount, m.get(5)));
                            match = true;
                        }
                        else {
                            System.out.println("TAC Number not match! Please try again.\n");
                        }
                    }
                    break;
                    
                case 2:
                    System.out.println("\n***********");
                    System.out.println("CIMB Clicks");
                    System.out.println("***********");
                    sc.nextLine();
                    System.out.print("Enter your bank username: ");
                    bankName = sc.nextLine();
                    System.out.print("Enter password: ");
                    BPswd = sc.nextLine();
                    rTAC = generateTAC();
                    System.out.print("Enter TAC No: ");
                    Tac = sc.nextLine();
                    while(!match){
                        System.out.print("Enter TAC No: ");
                        Tac = sc.nextLine();
                        if (Tac.equals(rTAC)){
                            System.out.println("TAC Number Match.");
                            System.out.println("\nPayment Successful!");
                            p.add(new Payment(amount, m.get(6)));
                            match = true;
                        }
                        else {
                            System.out.println("TAC Number not match! Please try again.\n");
                        }
                    }
                    break;
                    
                case 3:
                    System.out.println("\n***********");
                    System.out.println("Public Bank");
                    System.out.println("***********");
                    sc.nextLine();
                    System.out.print("Enter your bank username: ");
                    bankName = sc.nextLine();
                    System.out.print("Enter password: ");
                    BPswd = sc.nextLine();
                    rTAC = generateTAC();
                    System.out.print("Enter TAC No: ");
                    Tac = sc.nextLine();
                    while(!match){
                        System.out.print("Enter TAC No: ");
                        Tac = sc.nextLine();
                        if (Tac.equals(rTAC)){
                            System.out.println("TAC Number Match.");
                            System.out.println("\nPayment Successful!");
                            p.add(new Payment(amount, m.get(m.indexOf(7))));
                            match = true;
                        }
                        else {
                            System.out.println("TAC Number not match! Please try again.\n");
                        }
                    }
                    break;
                    
                default:
                    System.out.println("Invalid input! Please try again.");
            } 
    }
     
     public static String generateTAC(){
         Random rnd = new Random();
         int RTac = rnd.nextInt(999999);
         System.out.println("Your TAC no. is " + RTac);
         return String.format("%06d", RTac);
    }
              
    
    public static void receipt() {
        System.out.println("\nRECEIPT");
        System.out.println("=======");
        
    }

     public static void displayPayMethod(ArrayList payMethod){
        int count = 1;
        System.out.println("\n");
                for (int i = 0; i<payMethod.size();i++){
                System.out.print(count+".");
                System.out.println(payMethod.get(i));
                count++;
            }
    }
     
     public static void addPayMethod(ArrayList<PaymentMethod> cardM) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nAdd Payment Method");
        System.out.println("==================");
        System.out.println("\nPayment Method: ");
        System.out.println("1. Credit/Debit Card");
        System.out.println("2. Online Banking");
        System.out.println("3. E-Wallet");
        
        int payMethod;
        System.out.print("\nSelect a payment method: ");
        payMethod = sc.nextInt();
        String CType, bank, wallet; 
        switch(payMethod){
            case 1:
                sc.nextLine();
                    System.out.print("\nEnter the Card Type: ");
                    CType = sc.nextLine();
                    cardM.add(new Card("Card", CType));
                    cardM.get(cardM.size() - 1);
                    System.out.println("\nNew Card Payment created!");
                    sc.nextLine();
                    break;
                    
            case 2: //add bank
                sc.nextLine();
                    System.out.print("\nEnter new bank: ");
                    bank = sc.nextLine();
                    cardM.add(new OnlineBanking ("Online Banking", bank));
                    System.out.println("\nNew Online Banking payment method is created!");
                    sc.nextLine();
                    break;
                    
            case 3: //public EWallet(int account, String eWalletType, int password)
                sc.nextLine();
                    System.out.print("\nEnter new E-Wallet type: ");
                    wallet = sc.nextLine(); 
                    cardM.add(new EWallet("E-wallet", wallet));
                    System.out.println("\nNew E-Wallet payment method is created!");
                    sc.nextLine();
                    break;
            
            default:
                System.out.println("Invalid Input! Please try agian. ");
                sc.nextLine();
                break;
        }
    }
     public static void deletePayMethod(ArrayList p) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nDelete Payment Method");
        System.out.println("=====================");
        displayPayMethod(p);
        int choice = 0;
        boolean valid = false;
            while(!valid){
                try{
                    System.out.print("\nSelect the payment method you want to delete or enter 0 to back to previous menu: ");
                    choice = sc.nextInt();
                }
                catch(Exception e){
                    System.out.println("\nInvalid input! Please try again.");
                    sc.nextLine();
                }
                    if (choice >= 1 && choice <= p.size()){
                        System.out.println("\nAre you confirm to delete this?(y/n)");
                        char confirm = sc.next().charAt(0);
                    
                        if (confirm == 'Y' || confirm == 'y'){
                            sc.nextLine();
                            p.remove(choice - 1);
                            valid = true;
                            System.out.println("\nPayment method is successful deleted!");
                            
                            break;
                        }
                        
                        else {
                            System.out.println("\nInvalid input! Please try again.");
                            sc.nextLine();
                        }

                        }
                    else if(choice == 0){
                            valid = false;
                        break;
                            }
        }
     }

//    public static void displayCard(ArrayList<Card> c){
//    System.out.println("\n============");
//        System.out.println("Type of Card");
//        System.out.println("============");
//        for(int i = 0, i < c.size(); i++){  
//            c.get(i)
//        }
//    }
     public static void updatePayMethod(ArrayList p) {  
        Scanner sc = new Scanner(System.in);
        System.out.println("\nUpdate Payment Method");
        System.out.println("=====================");
        System.out.print("\nPayment Method: ");
        displayPayMethod(p);
        int choice = 0;
        boolean valid = false;
        while(!valid){
            try{
                System.out.print("Select the payment method you want to update or enter 0 to back to previous menu: ");
                choice = sc.nextInt();
                valid = true;
            }
            catch(Exception e){
                System.out.println("\nInvalid input! Please try again.");
                sc.nextLine();
            }
        }
        sc.nextLine();
        System.out.print("\nEnter new payment method: ");
        String method = sc.nextLine();
        p.set(choice - 1, method);
     }
}
   
//            case 2:
//                sc.nextLine();
//                System.out.print("\nEnter new bank: ");
//                bank = sc.nextLine();
//                cardM.add(new OnlineBanking ("Online Banking", bank));
//                System.out.println("\nNew Online Banking payment method is created!");
//                sc.nextLine();
//                break;
//            case 2: //add bank
//                sc.nextLine();
//                System.out.print("\nEnter new bank: ");
//                bank = sc.nextLine();
//                cardM.add(new OnlineBanking ("Online Banking", bank));
//                System.out.println("\nNew Online Banking payment method is created!");
//                sc.nextLine();
//                break;
//                    
//            case 3: //public EWallet(int account, String eWalletType, int password)
//                sc.nextLine();
//                System.out.print("\nEnter new E-Wallet type: ");
//                wallet = sc.nextLine(); 
//                cardM.add(new EWallet("E-wallet", wallet));
//                System.out.println("\nNew E-Wallet payment method is created!");
//                sc.nextLine();
//                break;
//            
//            default:
//                System.out.println("Invalid Input! Please try agian. ");
//                sc.nextLine();
//                break;
//        }
//        String name = "";
//        String CType;
//        int choice;
//        boolean input = true;
//        do{
//            try{
//                System.out.print("\nCName: ");
//                CType = scanner.nextLine();
//                input = false;
//            }   
//            catch (Exception ex){
//                System.out.print("\nIncorrect input! String required!");
//                scanner.nextLine();
//        
//                }
//        }while(input);
//    payMethod.set(
//}
//}
//
//System.out.println("\n============");
//        System.out.println("Type of Card");
//        System.out.println("============");
//        System.out.println("1. Credit Card");
//        System.out.println("2. Debit Card");
//        
//        int cardType;
//        Scanner sc = new Scanner(System.in);
//        //try catch
//        boolean valid = true;
//        do{
//            try{
//                System.out.print("Please enter type of card(1, 2): ");
//                cardType = sc.nextInt();
//                String cardNo, pin;
//
//                switch(cardType){
//                    case 1: 
//                        System.out.println("\n***********");
//                        System.out.println("Credit Card");
//                        System.out.println("***********");
//                        System.out.println("Please enter your card details.");
//
//                        System.out.println("\nCard Details");
//                        System.out.println("============");
//                        sc.nextLine();
//                        System.out.print("Card Number: ");
//                        cardNo = sc.nextLine();
//                        System.out.print("Enter pin: ");
//                        pin = sc.nextLine();
//                        System.out.println("\nPayment Successful!"); 
//                        break;
//
//                    case 2:
//                        System.out.println("\n**********");
//                        System.out.println("Debit Card");
//                        System.out.println("**********");
//                        System.out.println("Please enter your card details.");
//
//                        System.out.println("\nCard Details");
//                        System.out.println("============");
//                        System.out.print("Card Number: ");
//                        cardNo = sc.nextLine();
//                        System.out.print("Enter pin: ");
//                        pin = sc.nextLine();
//                        System.out.println("\nPayment Successful!"); 
//                        break;
//
//                    default:
//                        System.out.println("Invalid option!");
//                        valid = false;
//                }
//        }catch(Exception e){
//            System.out.println("Invalid option!");
//            valid = false;
//            sc.nextLine();
//        }
//        }while(!valid);     
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
public class Customer extends User{
    private String custID;
    private String custPassword;
    private String custAddress;
    

    public Customer(){}

    public Customer(String name, String custID, String custPassword, String custAddress) {
        super(name);
        this.custID = custID;
        this.custPassword = custPassword;
        this.custAddress = custAddress;
    }
    
    public String getCustID() {
        return custID;
    }

    public void setCustID(String custID) {
        this.custID = custID;
    }

    public String getCustPassword() {
        return custPassword;
    }

    public void setCustPassword(String custPassword) {
        this.custPassword = custPassword;
    }

    public String getCustAddress() {
        return custAddress;
    }

    public void setCustAddress(String custAddress) {
        this.custAddress = custAddress;
    }


    @Override
    public boolean logIn(String id, String password){
        if(this.custID.equals(id) && this.custPassword.equals(password)){
            System.out.println("Log in success!");
            return true;
        }
        else if (this.custID.equals(id) && !this.custPassword.equals(password)){
            System.out.println("Password incorrect! Please try again.\n");
            return false;
        }
           return false;   
    }
   
   
    @Override
    public String toString(){
        return String.format("%-20s \t%-20s \t%-50s", name, custID, custAddress);
    }
}

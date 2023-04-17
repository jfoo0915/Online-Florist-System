/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;


public class Staff extends User {
    private String staffID;
    private String staffPassword;

    public Staff(){}
    
    public Staff(String name, String staffID, String staffPassword) {
        super(name);
        this.staffID = staffID;
        this.staffPassword = staffPassword;
    }

    public String getStaffID() {
        return staffID;
    }

    public void setStaffID(String staffID) {
        this.staffID = staffID;
    }

    public String getStaffPassword() {
        return staffPassword;
    }

    public void setStaffPassword(String staffPassword) {
        this.staffPassword = staffPassword;
    }
    
    @Override
    public boolean logIn(String id, String password){
        if(this.staffID.equals(id) && this.staffPassword.equals(password)){
            System.out.println("Log in success!");
            return true;
        }
        else if (this.staffID.equals(id) && !this.staffPassword.equals(password)){
            System.out.println("Password incorrect! Please try again.");
            return false;
        }
        else  System.out.println("User not found. Please try again.");
            return false;       
    }
    
    @Override
    public String toString(){
        return("\nStaff name: " + name + "\nStaff ID: " + staffID);
    }
    
}

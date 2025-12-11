/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package amanahbookingsystem;


public class AmanahBookingSystem {

  
    public static void main(String[] args) {
        Resident[] res = new Resident[2];
        for(int i = 0; i<res.length; i++){
            res[i] = new LocalResident();
            System.out.println("Enter details for Resident " + (i+1));
            res[i].addResident();
            System.out.println("");
        }   
        for(int i = 0; i<res.length; i++){
            System.out.println("Info for Resident " + (i+1) + ": ");
            res[i].displayDetails();
            System.out.println("");
        }
        
    }
    
}

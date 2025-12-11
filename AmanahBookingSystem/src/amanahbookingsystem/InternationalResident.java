/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package amanahbookingsystem;

import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class InternationalResident extends Resident{
    private String country;
    private int passportNumber;
    
   public void setCountry(){
       Scanner input = new Scanner(System.in);
       String country;
       System.out.print("Enter country: ");
       country = input.nextLine();
       this.country = country;
   }
   
   public void setPassport(){
       Scanner input = new Scanner(System.in);
       int passNum;
       System.out.print("Enter passport number: ");
       passNum = input.nextInt();
       passportNumber = passNum;
   }
   
   @Override
   public void addResident(){
       super.addResident();
       setCountry();
       setPassport();
   }
   
   @Override
   public void displayDetails(){
       super.displayDetails();
       System.out.println("Country: " + country);
       System.out.println("Passport number: " + passportNumber);
   }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package amanahbookingsystem;
import java.util.*;

/*TODO: 
1. Search method utk resident by name or faculty 
2. Update resident records (Use getters to check bilik to ada penghuni dulu, then bru update, tu tujuan getID() tu.)
3. Delete resident records (Same method as above but kene copy whole array buat array baru. Look it up.)
4. Check-in and check-out dates, just letak dlm superclass Resident tu.
5. View residents by room or by block, use getRoom() utk tgk spe yg ada dlm satu bilik, getBlock() utk tgk brp org yg menduduki satu block tu.
6. Room occupancy report by block, basically utk check brp bilik yg penuh utk satu block tu.
*/

public class Resident {
    private String residentID, name, faculty, block, roomNum;
    private int yearOfStudy;
   
    //Semua setter ni utk letak value
    public void setID(){
        Scanner input = new Scanner(System.in);
        String resID;
        System.out.print("Enter Resident ID: ");
        resID = input.nextLine();
        residentID = resID;
    }
   
    
    public void setName(){
        Scanner input = new Scanner(System.in);
        String name;
        System.out.print("Enter name: ");
        name = input.nextLine();
        this.name = name;
    }
    
    public void setFac(){
        Scanner input = new Scanner(System.in);
        String fac;
        System.out.print("Enter faculty: ");
        fac = input.nextLine();
        faculty = fac;
    }
    
    public void setYear(){
        Scanner input = new Scanner(System.in);
        int year;
        System.out.print("Enter year of study: ");
        year = input.nextInt();
        input.nextLine();
        yearOfStudy = year;
    }
    
    public void setBlock(){
        Scanner input = new Scanner(System.in);
        String block;
        System.out.print("Enter apartment block: ");
        block = input.nextLine();
        this.block = block;
    }
    
    public void setRoomNum(){
        Scanner input = new Scanner(System.in);
        String room;
        System.out.print("Enter room number: ");
        room = input.nextLine();
        roomNum = room;
    }
    
    //Getter2 ni penting masa nak buat deletion and semakan bilik
    public String getID(){
        return residentID;
    }
    
    public String getBlock(){
        return block;
    }
    
    public String getRoomNum(){
        return roomNum;
    }

    public void addResident(){
        setID();
        setName();
        setFac();
        setYear();
        setBlock();
        setRoomNum();
    }
    public void displayDetails(){
        System.out.println("ID: " + residentID);
        System.out.println("Name: " + name);
        System.out.println("Faculty: " + faculty);
        System.out.println("Year of Study: " + yearOfStudy);
        System.out.println("Apartment block: " + block);
        System.out.println("Room number: " + roomNum);

    }
        
}




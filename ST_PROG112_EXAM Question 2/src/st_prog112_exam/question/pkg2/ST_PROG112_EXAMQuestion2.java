/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package st_prog112_exam.question.pkg2;

import java.util.Scanner;

public class ST_PROG112_EXAMQuestion2 {


    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in); 
        
        System.out.print("Enter the accident vehicle type: ");
        String VehicleType = myObj.nextLine(); 
        
        System.out.print("Enter the city for the vehicle accidents: ");
        String City = myObj.nextLine(); 
                
        System.out.print("Enter the total "+VehicleType+" accidents for Cape Town: ");
        String TotalAccidents = myObj.nextLine(); 
        
        Road_Accidents_report Road_Accidents_report = new Road_Accidents_report();
        Road_Accidents_report.show(VehicleType, City, TotalAccidents);
        
    }
    
}

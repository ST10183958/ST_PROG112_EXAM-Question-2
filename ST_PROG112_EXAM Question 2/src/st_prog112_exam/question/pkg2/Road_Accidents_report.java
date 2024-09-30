/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package st_prog112_exam.question.pkg2;

/**
 *
 * @author eiyo
 */
public class Road_Accidents_report extends Road_Accidents{

    public void show(String VehicleType, String City, String TotalAccidents) {
        System.out.println("\b");
        System.out.println("VEHICLE ACCIDENT REPORT");
        System.out.println("********************");
        System.out.println("VEHICLE TYPE: "+VehicleType);
        System.out.println("CITY: "+City);
        System.out.println("ACCIDENT TOTAL: "+TotalAccidents);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keyboard_inputs;

import java.util.Scanner;

/**
 *
 * @author nilu
 */
public class Course_Checking_System {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        
        System.out.print("Enter Your course name: ");
        String Course_Name= scanner.nextLine();
                
        System.out.print("Enter your Quiz grades out of 25= ");
        double Quiz_Grade= scanner.nextDouble();
        
        System.out.print("Enter your Assignment grades out of 25= ");
        double Assignment_Grade= scanner.nextDouble();
        
        System.out.print("Enter your Final exam grades out of 25= ");
        double FinalExam_Grade= scanner.nextDouble();
        
        System.out.print("Enter your project grades out of 25= ");
        double Project_Grade= scanner.nextDouble();
        
        System.out.println("Course: " + Course_Name);
        System.out.println("Quiz: " + Quiz_Grade + "/ 25");
        System.out.println("Assignment: " + Assignment_Grade + "/ 25");
        System.out.println("Thank you for using this software");
        System.out.println("Final: " + FinalExam_Grade + "/ 25");
        System.out.println("Project: " + Project_Grade + "/ 25");
        
        double AverageGrade= (FinalExam_Grade + Quiz_Grade)/ 2.0; 
        
        double Percentage_Quiz_Final= (AverageGrade * 100)/ 25; 
        System.out.println("Percentage of quiz and final exam= " + Percentage_Quiz_Final + "/ 100 %");
        
        double Overall_Grade= (Quiz_Grade + Assignment_Grade + FinalExam_Grade + Project_Grade) / 4;
        
        double Overall_Percentage= (Overall_Grade * 100)/ 25;
        System.out.println("Overall_Percentage= " + Overall_Percentage + "/ 100 %");
        
        if(Overall_Percentage < 50 || Percentage_Quiz_Final < 50 ) {
            System.out.println("Student would fail the exam");
        } else {
            System.out.println("Student would pass the exam");
        }
        
        
             
       
        
    }
    
}

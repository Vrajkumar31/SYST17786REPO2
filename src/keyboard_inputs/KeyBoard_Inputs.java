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
public class KeyBoard_Inputs {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 1 - 9, Enter 0 to quit");
        int number = 0;
        String text = "";
        do{
            number = scanner.nextInt();
            switch(number)
            {
                case 2: text = "move down"; 
                case 4: text="move left"; break;
                case 6: text= "move right"; break;
                case 8: text= "move up" ; break;
                case 1:
                case 3:
                case 7:
                case 9: text= "diagonal moves not allowed";break;
                case 0: System.exit(0);
                default: text = "bad input";
                                
            }
            System.out.println(text);
            
        }while(number != 0);
    }
    
}


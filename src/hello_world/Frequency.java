/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello_world;

/**
 *
 * @author nilu
 */
public class Frequency {
    
    public static void main(String[] args) {
        
        int [] freqTable= new int[10];
        int randomNumber= 0;
        
        for(int i=0; i <100; i++){
            randomNumber=(int)(Math.random()*10)+1;
            freqTable[randomNumber-1]++;
            
        }
    }
    
}

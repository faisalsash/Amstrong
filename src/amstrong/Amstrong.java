/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amstrong;

/**
 *
 * @author AMMAH
 */
public class Amstrong {

    /**
     * @param args the command line arguments
     */
    	public static void main(String args[]) 
     { 
       int num;
                num = 3;
       int n = num; //use to check at last time 
       int check=0,remainder; 
       while(num > 0) 
       { 
         remainder = num % 10; 
         check = check + (int)Math.pow(remainder,3); 
         num = num / 10; 
       } 
       if(check == n) 
         System.out.println(n+" is an Armstrong Number"); 
       else 
         System.out.println(n+" is not an Armstrong Number"); 
     } 
    
}

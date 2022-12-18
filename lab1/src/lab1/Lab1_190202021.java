
package lab1;

import java.util.Scanner;

/**
 *
 * @author Feyzanur
 */
public class Lab1_190202021 {

    
    public static void main(String[] args) {
        
        int fact=1;
        for(int i=2;i<=10;i++){
            fact=fact*i;
        }
        System.out.println("10!="+fact);
        System.out.println(" ");
        
        System.out.println("3 kelime giriniz");
        
        String kelime1;
        String kelime2;
        String kelime3;
        
        Scanner scn = new Scanner(System.in);
        kelime1 = scn.next();
        kelime2 = scn.next();
        kelime3 = scn.next();
        
        System.out.println(kelime1+"\\"+kelime2+"\\"+kelime3);


    }
    
}

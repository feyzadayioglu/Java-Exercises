//Feyzanur Dayıoğlu-190202021
package lab3;

import java.util.Scanner;

/**
 *
 * @author Feyzanur
 */
public class Lab3_190202021 {

   
    public static void main(String[] args) {
        String s;
        int sayi=0;
        System.out.println("Cümleyi giriniz: ");
        
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        int sonindex=s.length()-1;
       
        //Cümledeki ünlü harfleri silip ekrana yazan kod parçacığı
        for(int i=0;i<=sonindex;i++){
       if(s.charAt(i)!='a'&& s.charAt(i)!='e'&&s.charAt(i)!='i'&&
       s.charAt(i)!='o'&&s.charAt(i)!='u'&&s.charAt(i)!='A'&&
       s.charAt(i)!='E'&&s.charAt(i)!='I'&&s.charAt(i)!='U'&&s.charAt(i)!='O')
           
            System.out.print(s.charAt(i));
        }
        //cümledeki 'a' sayılarını yazan kod parçacığı
        for(int i=0;i<=sonindex;i++){
           if(s.charAt(i)=='a') 
            sayi++;
               
        }
        System.out.println("\nCümledeki a sayıları: "+sayi+" adettir.");
    }
    
}

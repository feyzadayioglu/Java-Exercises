
package lab2;

import java.util.Scanner;

/**
 *
 * @author Feyzanur
 */
public class Lab2_190202021 {

    
    public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);
        /* 
         //calisma1.1
         int x,k;
         int sonuc=1;
         
        System.out.println("Lutfen ussu alinacak degeri giriniz");
        x=sc.nextInt();
       
        System.out.println("Lutfen us degerini giriniz");
        k=sc.nextInt();
      
        for(int i=0;i<k;i++){
          sonuc=sonuc*x;
      
        }
        System.out.println("cevap:"+sonuc);
         */
        /* //calisma1.2
        int x=Integer.parseInt(args[0]);
        int k=Integer.parseInt(args[1]);
        int sonuc=1;
        for(int i=0;i<k;i++){
          sonuc=sonuc*x;
      
        }
        
        System.out.println("cevap:"+sonuc);
        */
                
        
        
        
        
        //calisma2
                
        System.out.println("Lutfen bir deger giriniz : ");
          int miktar,kalan;
          int sayi=0;
          boolean a;
          
           miktar= sc.nextInt();
           kalan=miktar%5;
           a=kalan<3;
           if(kalan>=3){
             miktar+=5-kalan;  
             kalan=5-kalan;
           }
               
           else
          miktar-=kalan;
                
          sayi+=miktar/50;
          miktar=miktar%50;
          sayi+=miktar/25;
          miktar=miktar%25;
          sayi+=miktar/10;
          miktar=miktar%10;
          sayi+=miktar/5;
          miktar=miktar%5;        
          if(a)
          System.out.println(sayi+" kagit para - "+kalan+" TL nizi yedim :)");
          else{
              
          System.out.println(sayi+" kagit para - "+kalan+" TL mi yediniz :(");
        
                
        }
       
    }
    
}

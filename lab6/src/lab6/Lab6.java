
package lab6;
//Feyzanur Dayıoğlu-190202021
import java.util.Scanner;
 

/**
 *
 * @author Feyzanur
 */
public class Lab6 {
  
   //çalışma-1
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int Boyut;
         System.out.println("Dizinin eleman sayısını giriniz");
         Boyut=sc.nextInt();
         int[] dizi=new int[Boyut];
         
         for(int i=0;i<dizi.length;i++){
             dizi[i]=sc.nextInt();
         }
         
         elemanYazdir(dizi);
    }
    
public static void elemanYazdir(int [] s){
    for(int i=0;i<s.length;i++){
        System.out.print(2*s[i]+" ");
    }
}
    
    /*
    //çalışma-2
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        
        int i=0;
        
         int[] dizi=new int[100];
        
       
       
        System.out.println("Lütfen bir sayı giriniz. "
                    + "Eğer çıkmak istiyorsanız 0’a basınız. ");
        dizi[i] = sc.nextInt();
        while(dizi[i]!=0){
            i++;
            System.out.println("Lütfen bir sayı giriniz. "
                    + "Eğer çıkmak istiyorsanız 0’a basınız. ");
            dizi[i] = sc.nextInt();
            
        }
        elemanYazdir(dizi);
    }
    
    public static void elemanYazdir(int [] s){
    for(int i=0;i<s.length/2;i++){
       int tmp=s[2*i];
       s[2*i]=s[2*i+1];
       s[2*i+1]=tmp;
    }
      for(int i=0;i<s.length;i++){
          if(s[i]!=0)
        System.out.print(s[i]+" ");
    }
}
    
    
    */
    
}

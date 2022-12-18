//feyzanur dayıoğlu-190202021
package lab5;

import java.util.Scanner;

/**
 *
 * @author Feyzanur
 */
public class Lab5_190202021 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //çalışma-1
        int i=0;
        int gecici;
        int m,n;
        int[] sayi = new int[100];
        int uzunluk;
        System.out.println("Lütfen bir sayı giriniz. "
                    + "Eğer çıkmak istiyorsanız 0’a basınız. ");
        sayi[i] = sc.nextInt();
        while(sayi[i]!=0){
            i++;
            System.out.println("Lütfen bir sayı giriniz. "
                    + "Eğer çıkmak istiyorsanız 0’a basınız. ");
            sayi[i] = sc.nextInt();
            
        }
       
        for(int k = 0; k <i-1 ; k++)
        {
            for(int l = k+1; l < i; l++)
            {
                if(sayi[l] < sayi[k]) {
                    gecici = sayi[k];
                    sayi[k] = sayi[l];
                    sayi[l] = gecici;
                }
            }
        }
       
       uzunluk=i-2;
        if(uzunluk%2==1){
            m=(uzunluk+1)/2;
        
        System.out.println("Girilen sayıların medyanı:" +sayi[m]);
        }
        if(uzunluk%2==0){
            n=uzunluk/2;
        System.out.println("Girilen sayıların medyanı:" +sayi[n]+","+sayi[n+1]);
        }
        
     /*
        //çalışma-2
        int [] dizi=new int[100];
        int i=0;
        int j;
        
        int sayi1=-1;
        int sayi2=-1;
        int enbuyukfark=0;
        System.out.println("Lütfen ekrana tek basamaklı sayılar giriniz. "
                + "Eğer çıkmak istiyorsanız -1’e basınız. ");
        dizi[i] = sc.nextInt();
        while(dizi[i]!=-1){
            i++;
            dizi[i] = sc.nextInt();
        }
        for( j=0;j<i-1;j++){
            
            
            
            if(Math.abs(dizi[j+1]-dizi[j])>enbuyukfark){
                enbuyukfark=Math.abs(dizi[j+1]-dizi[j]);
                sayi1=dizi[j];
                sayi2=dizi[j+1];
        }
        
        }
        
    System.out.println("Ardışık sayılar arasındaki en büyük fark "+enbuyukfark+
           " dır.Bu fark "+sayi1+" ve "+sayi2+" sayıları arasında oluşmuştur.");
     */   
    /*
    //calışma-3
    String s="Java Programlama Dersi Fall 2012";
        System.out.print(s.substring(0,s.indexOf("Programlama Dersi"))); 
        System.out.print(s.substring(s.indexOf("Fall"),s.length()));
        System.out.println(" ");
    */
    }
    
}

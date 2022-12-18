
package lab4;

import java.util.Scanner;

/**
 *
 * @author Feyzanur
 */
public class Lab4_190202021 {

    
    public static void main(String[] args) {
        /*
         //calışma-1
         int[][] dizi = new int[3][3];
         int i,j;
         int ciftsayi=0;
         int ucunkati=0;
         Scanner sc = new Scanner(System.in);
         System.out.println("3x3 lük dizi tanımlayın");
         for(i=0;i<3;i++){
             for(j=0;j<3;j++){
                 dizi[i][j] = sc.nextInt();
                 
                 if(dizi[i][j]%2==0){
                     ciftsayi++;
                 }
                 if(dizi[i][j]!=0 && dizi[i][j]%3==0){
                     ucunkati++;
                 }
             }
         }
         System.out.println(+ciftsayi+" tane çift sayı vardır.");
         System.out.println("3 ün katı olan "+ucunkati+" tane sayı vardır.");
                 
        */
        
        //çalışma-2
        int[] dizi = new int[100];
        int i;
        int j=0;
        int enbuyuk=0;
        
        int adet;
        int[] kontrol = new int[20];
        kontrol[j]=0;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dizinin uzunluğunu belirleyin");
        adet=sc.nextInt();
        for(i=0;i<adet;i++){
            dizi[i] = sc.nextInt();
        }
        for(i=0;i<adet;i++){
            if( dizi[i]<dizi[i+1]){
                kontrol[j]++;      
            }else 
                if(dizi[i]==dizi[i+1]){
                enbuyuk=kontrol[j];
                j++;
                kontrol[j]=0; 
                }
            
            else  
                if(kontrol[j]>enbuyuk){
                enbuyuk=kontrol[j];
                j++;
                kontrol[j]=0;
            }
          
            
        }
        System.out.println("en uzun artan dizinin uzunluğu: "+enbuyuk);

    }
    
}

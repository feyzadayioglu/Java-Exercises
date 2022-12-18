
package lab8;

import java.util.ArrayList;

/**
 *
 * @author Feyzanur
 */
public class kume {
           private ArrayList<Integer> eleman;

        public kume() {// parametresiz constructor
            eleman = new ArrayList<Integer>();
        }

        public kume(int[] a) { // a dizisinin elemanlarindan olusan kume 

            eleman=new ArrayList<Integer>();
            for(int i=0;i<a.length;i++)
                eleman.add(a[i]);
        }

        public kume(kume a) {//copy constructor 

           this.eleman=new ArrayList<Integer>(a.eleman);
        }
        

        public void ekle(int a) {// kumeye yeni eleman ekleme
            eleman.add(a);
        }

        public void yazdir() {// kume icerigini yazdirir
            for (int i = 0; i < eleman.size(); i++) {
                System.out.print(eleman.get(i) + " ");
            }
        }
    // cagrici obje ile parametre objenin denk kume olup olmadigini test eder
        
        public boolean denk(kume a) { 

           
            if (this.eleman.size() == a.eleman.size()) {
                return true;
            } else {
                return false;
            }
        }
    // cagrici obje ile parametre objenin esit kume olup olmadigini test eder 

        public boolean esit(kume a) {
            int k = 0;
            for (int i = 0; i < eleman.size(); i++) {
                for (int j = 0; j < a.eleman.size(); j++) {
                    if (eleman.get(i) == a.eleman.get(j)) {
                        k++;
                    }
                }
            }
            return k == eleman.size();
        }
    // cagrici obje ile parametre objenin bilesiminden olusan kumeyi dondurur
       
        public kume birlesim(kume a) {
            kume birlesim1 = new kume(a);
            kume birlesim2 = new kume();
            for(int i=0;i<this.eleman.size();i++)
                birlesim2.ekle(this.eleman.get(i));

            for(int i=0;i<birlesim2.eleman.size();i++){
                birlesim1.ekle(birlesim2.eleman.get(i));
            }
            for(int i=0;i<birlesim1.eleman.size()-1;i++){
                for(int j=i+1;j<birlesim1.eleman.size();j++){
                    if(birlesim1.eleman.get(i)==birlesim1.eleman.get(j)){
                        birlesim1.eleman.remove(j);
                    }
                }
            }
            return birlesim1;
        }
    // cagrici obje ile parametre objenin kesisiminden olusan kumeyi dondurur 

        public kume kesisim(kume a) {
            kume kesisim1 = new kume(a);
            kume kesisim2 = new kume();
            kume kesisim3 = new kume();
            for(int i=0;i<eleman.size();i++)
                kesisim2.ekle(eleman.get(i));

            for(int i=0;i<kesisim2.eleman.size();i++){
                for(int j=0;j<kesisim1.eleman.size();j++){
                    if(kesisim2.eleman.get(i)==kesisim1.eleman.get(j)){
                        kesisim3.ekle(kesisim2.eleman.get(i));
                    }
                }
            }
            return kesisim3;
        }
    // cagrici obje ile parametre objenin farkindan olusan kumeyi dondurur
       
        public kume fark(kume a) {
		int elemansayi=0, j=0;
		for(int i=0;i<eleman.size();i++) {
			if(a.eleman.contains(eleman.get(i))) {
				
			}	
			else {
				elemansayi++;
			}
		}
		int[] elemanlar2= new int[elemansayi];
		for(int i=0;i<eleman.size();i++) {
			if(a.eleman.contains(eleman.get(i))) {
				
			}	
			else {
				elemanlar2[j]=eleman.get(i);
				j++;
			}
		}
		kume kmc = new kume(elemanlar2);
		return kmc;
	
       }
    // kumenin alt kumelerinden olusan bir ArrayList<kume> dondurur 
        
        public ArrayList<kume> altKumeler(){
            int n=(int) 
            Math.pow(2,eleman.size());

            ArrayList<kume> altkume=new ArrayList <>();
            kume a1=new kume();
            kume a2=new kume();
            kume a3=new kume();
            kume a4=new kume();
            kume a5=new kume();
            kume a6=new kume();
            kume a7=new kume();
           
            System.out.println("Alt Kume Sayisi = "+n);
            System.out.println("={}");

            a1.ekle(eleman.get(0));
            a2.ekle(eleman.get(1));
            a3.ekle(eleman.get(2));
            for(int i=0;i<eleman.size()-1;i++)
                a4.ekle(eleman.get(i));
            for(int i=1;i<eleman.size();i++)
                a5.ekle(eleman.get(i));
            for(int i=0;i<eleman.size();i++){
                if(i!=0)
                    i++;
                if(i>2)
                    break;
                a6.ekle(eleman.get(i));
            }
            for(int i=0;i<eleman.size();i++)
                a7.ekle(eleman.get(i));

            altkume.add(a1);
            altkume.add(a2);
            altkume.add(a3);
            altkume.add(a4);
            altkume.add(a5);
            altkume.add(a6);
            altkume.add(a7);
            return altkume ;

        }


    public static void main(String[] args) {
            
        kume km = new kume();
        km.ekle(10);
        km.ekle(11);
        km.ekle(2);
        System.out.print("km ={");
        km.yazdir();
        System.out.println("}");
        int[] a = {1,2,3,4,5,6};
        kume km2 = new kume(a);
        System.out.print("km2 ={");
        km2.yazdir();
        System.out.println("}");
        kume km3 = new kume(a);
        System.out.print("km3 ={");
        km3.yazdir();
        System.out.println("}");
        if (km.denk(km2))
            System.out.println("km ve km2 kumeleri denk.");
        else
            System.out.println("km ve km2 kumeleri denk degil.");
        if (km2.esit(km3))
            System.out.println("km2 ve km3 kumeleri esit.");
        else
            System.out.println("km2 ve km3 kumeleri esit degil.");
        kume sn = km.birlesim(km2);
        System.out.print("km ve km2 birlesimi ={");
        sn.yazdir();
        System.out.println("}");
        kume sn2 = km.kesisim(km2);
        System.out.print("km ve km2 kesisimi ={");
        sn2.yazdir();
        System.out.println("}");
        kume sn3 = km.fark(km2);
        System.out.print("km ve km2 farki ={");
        sn3.yazdir();
        System.out.println("}");
        System.out.println("km\'nin alt kumeleri");
        ArrayList<kume> sonuc = km.altKumeler();
        for(int i = 0; i < sonuc.size(); i++){
            System.out.print("{");
            sonuc.get(i).yazdir();
            System.out.println("}");
        }
    }

}

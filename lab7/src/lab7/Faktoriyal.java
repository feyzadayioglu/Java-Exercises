// 190202021 Feyzanur Dayıoğlu
package lab7;

/**
 *
 * @author Feyzanur
 */
public class Faktoriyal {
    
    private int deger;
    private int sonuc = 1;
    
    
    /**
     * Faktoriyali bulunmak istenen
     * değeri atar
     * @param deger
     */
    public void setDeger(int deger){
        this.deger = deger;
    }
    /**
     * Faktoriyali bulunmak istenen
     * dönderir
     * @return
     */
    public int getDeger(){
        int result = deger;
        return result;
    }
    
    /** 
     * Girilen değerin faktorial değerini Islemlerim
     * class ındaki methodları kullanarak 
     * hesaplayıp sonuc parametresine yazdırır
     */    
    public void hesapla(){
        Islemlerim hesap = new Islemlerim(sonuc);
        int i = 1;
        while(i!=deger+1){
            sonuc *= (int) hesap.carp(i);
            i++;
        }
        
    }
    
    /**
     * Degeri ve sonucu ekrana yazdırır
     */
    public void ekranaYazdir(){        
        System.out.println("Sayi: "+deger);
        System.out.println("Faktöriyeli: "+sonuc);
    }
    
}

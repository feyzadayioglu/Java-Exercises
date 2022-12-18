// 190202021 Feyzanur Dayıoğlu
package lab7;

/**
 *
 * @author Feyzanur
 */
public class Daire {
     
    // Class parametreleri
    public double PI=3.14;
    public int yaricap;
    
    /**
     * Constructor
     * @param yaricap Dairenin yarıçapı
     */
    public Daire(int yaricap){
        this.yaricap = yaricap;
    }
    
    /**
     * Dairenin alanını Islemlerim class ındaki 
     * methodları kullanarak hesaplar
     * @return alanı double cinsinden dondurur
     */
    public double  alanHesapla(){
        Islemlerim yariCap = new Islemlerim(yaricap);
        Islemlerim pi = new Islemlerim(PI);
        return pi.carp( yariCap.carp(yaricap) );
    }
    
    /**
     * Dairenin çevresini Islemlerim class ındaki 
     * methodları kullanarak hesaplar
     * @return cevreyi double cinsinden dondurur
     */
    public double cevreHesapla(){
        Islemlerim sabitDeger = new Islemlerim(2);
        Islemlerim pi = new Islemlerim(PI);
        return sabitDeger.carp( pi.carp(yaricap) );
    }
    
    /**
     * Bir dairenin cevresinin alanından büyüyk
     * olup olmadığını Islemlerim class ındaki 
     * methodları kullanarak belirler
     * @return boolean değer dönderir
     */
    public boolean cevreAlandanBuyuktur(){
        Daire daire = new Daire(yaricap);
        Islemlerim kontrol = new Islemlerim(daire.cevreHesapla());
        if (kontrol.buyukdur(daire.alanHesapla())) {
            System.out.println("Cevre alandan buyuktur");
            return true;
        } else {
        return false;
        }
        
    }
    
    /**
     * Bir dairenin cevresinin alanından küçük
     * olup olmadığını ıslemlerim class ındaki 
     * methodları kullanarak belirler
     * @return boolean değer dönderir
     */
    public boolean cevreAlandanKucuktur(){
      Daire daire = new Daire(yaricap);
      Islemlerim kontrol = new Islemlerim(daire.cevreHesapla());
      if (kontrol.kucuktur(daire.alanHesapla())) {
          System.out.println("Cevre alandan kucuktur"); 
          return true;
        } else {
        return false;
        }
    
    }
    
    /**
     * Dairenin alanını ve çevresini ekrana yazdırır.
     */
    public void ekranaYazdir(){
       Daire daire = new Daire(yaricap);
       System.out.println("Dairenin Alani: "+daire.alanHesapla());
       System.out.println( "Dairenin Cevresi: "+daire.cevreHesapla());
               
    }
    
}

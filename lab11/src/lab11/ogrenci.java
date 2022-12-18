//Feyzanur Dayıoğlu 190202021
package lab11;

/**
 *
 * @author Feyzanur
 */

public abstract class ogrenci extends ders implements kisi {
    String isim=new String();
    
    int numara;
    int arkadasSayisi;
    int dersSayisi;

    
    public void isimYazdir(){
        System.out.println(isim);
    }
    public abstract void dersSayisi();
    public abstract void arkadasSayisi();
    
}
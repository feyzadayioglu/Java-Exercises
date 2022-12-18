//Feyzanur Dayıoğlu 190202021
package lab11;

/**
 *
 * @author Feyzanur
 */
public abstract class lisansUstu extends ogrenci {
    int aldigiBurs;
    int kira;
    int okuduguKitap;
    public abstract void aldigiBursYazdir();
    @Override
    public void dersSayisi() {
        System.out.println("lisans üstü öğrencisinin ders sayisi "+dersSayisi);    
    }

    @Override
    public void arkadasSayisi() {
        System.out.println("lisans üstü öğrencisinin arkadas sayisi  "+arkadasSayisi);    
    }
    @Override
    public void isimYazdir(String isim) {
        System.out.println("lisans öğrencisi ismi "+isim);   
    }
}

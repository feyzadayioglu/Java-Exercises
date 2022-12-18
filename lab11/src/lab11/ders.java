//Feyzanur Dayıoğlu 190202021
package lab11;

/**
 *
 * @author Feyzanur
 */
public class ders {
   int ders1;
   int ders2;
   int ders3;
   String dersAdi1=new String();
   String dersAdi2=new String();
   int kaldigiDersSayisi;

    public int getDers1() {
        return ders1;
    }

    public void setDers1(int ders1) {
        this.ders1 = ders1;
    }

    public int getDers2() {
        return ders2;
    }

    public void setDers2(int ders2) {
        this.ders2 = ders2;
    }

    public int getDers3() {
        return ders3;
    }

    public void setDers3(int ders3) {
        this.ders3 = ders3;
    }

    public String getDersAdi1() {
        return dersAdi1;
    }

    public void setDersAdi1(String dersAdi1) {
        this.dersAdi1 = dersAdi1;
    }

    public String getDersAdi2() {
        return dersAdi2;
    }

    public void setDersAdi2(String dersAdi2) {
        this.dersAdi2 = dersAdi2;
    }

    public int getKaldigiDersSayisi() {
        return kaldigiDersSayisi;
    }

    public void setKaldigiDersSayisi(int kaldigiDersSayisi) {
        this.kaldigiDersSayisi = kaldigiDersSayisi;
    }
   
    public void ortHesapla(){
        System.out.println((ders1+ders2+ders3)/3); 
    }
    public void dersYazdir(){
        System.out.println(dersAdi1+dersAdi2); 
    }
    public void basarisizDers(){
        System.out.println("basarısız ders sayısı : "+kaldigiDersSayisi);
    }
    
}

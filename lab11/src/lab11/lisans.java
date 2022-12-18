//Feyzanur Dayıoğlu 190202021
package lab11;

/**
 *
 * @author Feyzanur
 */
public class lisans extends ogrenci {
    int kahveSayisi;
    int parasi;
    String gomlekMarkasi=new String();
    String bolum=new String();

    public String getGomlekMarkasi() {
        return gomlekMarkasi;
    }

    public void setGomlekMarkasi(String gomlekMarkasi) {
        this.gomlekMarkasi = gomlekMarkasi;
    }
    

    public int getKahveSayisi() {
        return kahveSayisi;
    }

    public void setKahveSayisi(int kahveSayisi) {
        this.kahveSayisi = kahveSayisi;
    }

    public int getParasi() {
        return parasi;
    }

    public void setParasi(int parasi) {
        this.parasi = parasi;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }
    public String bolumYazdir(){
        return bolum;
    }
    @Override
    public void dersSayisi() {
        System.out.println("lisans öğrencisi ders sayisi "+dersSayisi);
    }

    @Override
    public void arkadasSayisi() {
        System.out.println("lisans öğrencisi arkadaş sayısı "+arkadasSayisi);
    }

    @Override
    public void isimYazdir(String isim) {
        System.out.println("lisans öğrencisi ismi "+isim);   
    }
    
}
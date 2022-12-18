//Feyzanur Dayıoğlu 190202021
package lab11;

/**
 *
 * @author Feyzanur
 */
public class idariPersonel extends personel {
    int emekliligeKalanYil;
    int isiniSevmePuani;
    int sahipOlduguKonutSayisi;

    public int getEmekliligeKalanYil() {
        return emekliligeKalanYil;
    }

    public void setEmekliligeKalanYil(int emekliligeKalanYil) {
        this.emekliligeKalanYil = emekliligeKalanYil;
    }
    
    public int isiniSevmePuaniYazdir(){
        return isiniSevmePuani;
    }
    @Override
    public void personelOzYazdir() {
        System.out.println("bu personelin id si "+personelID);
        System.out.println("bu personelin emekliliğe kalan yılı "+emekliligeKalanYil);
        System.out.println("bu personelin aylık çalışma saati "+aylikCalismaSaati);
    }

    @Override
    public void isimYazdir(String isim) {
        System.out.println("Bu personelin ismi "+this.isim);
    }
    
}

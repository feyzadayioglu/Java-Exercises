//Feyzanur Dayıoğlu 190202021
package lab11;

/**
 *
 * @author Feyzanur
 */
public class akademikPersonel extends personel {

    int memnuniyetNumarasi;
    int ogrenciSayisi;
    int verilenToplamPuan;
    public int memnuniyetNumarasiYAzdir(){
        return verilenToplamPuan/ogrenciSayisi;
    }
    public void isimYazdir(String isim) {
        System.out.println("personelin ismi "+this.isim);
    }

    @Override
    public void personelOzYazdir() {
        System.out.println("personelin id si  "+personelID);
        System.out.println("personelin çalıştığı yıl "+calistigiYil);
        System.out.println("personelin aylık çalışma saati "+aylikCalismaSaati);
    }
    
}


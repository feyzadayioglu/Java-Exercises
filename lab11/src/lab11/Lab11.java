//Feyzanur Dayıoğlu 190202021
package lab11;

/**
 *
 * @author Feyzanur
 */
public class Lab11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        lisans ogr1=new lisans();
        master ogr2= new master();
        akademikPersonel personel1=new akademikPersonel();
        idariPersonel personel2=new idariPersonel();
        ogr1.setDers1(50);
        ogr1.setDers2(60);
        ogr1.setDers3(80);
        ogr1.ortHesapla();
        ogr2.setBurc("basak");
        ogr2.burcYazdir();;
        ogr2.setKaldigiDersSayisi(4);
        ogr2.basarisizDers();
        personel1.setMaas(5500);
        personel1.setZam(700);
        personel1.maasArttir();
        personel2.setAylikCalismaSaati(140);
        personel2.setCalistigiYil(10);
        personel2.setPersonelID(122856721);
        personel2.setEmekliligeKalanYil(20);
        personel2.personelOzYazdir();
    
    }
    
}

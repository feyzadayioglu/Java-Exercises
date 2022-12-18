//Feyzanur Dayıoğlu 190202021
package lab10;

import java.util.Vector;

/**
 *
 * @author Feyzanur
 */
public class Autopark {
     Vector<Automobile> sayarpark=new Vector<>(3); 
    static long otoparkKasasi = 0;
    long icerdeKalinanZaman;
    static float para;
    Autopark(int size){
        otoparkKasasi = 0;
        
    }
    public void girisYap(Automobile oto) {
        
        if (sayarpark.size()!=3) {
            sayarpark.add(oto);
            oto.girisZamani=System.currentTimeMillis();
        }
        else{
            System.out.println(oto.license+" park edilmedi. ");
        }
    }
    public void cikisYap(Automobile oto) {
       icerdeKalinanZaman=System.currentTimeMillis()-oto.girisZamani;
       Autopark.para=((float)icerdeKalinanZaman/100)*10;
       sayarpark.remove(oto);
        System.out.println(oto.license+" "+icerdeKalinanZaman+" kadar içerde kaldı ve "+para+" TL ödedi");
        if (!sayarpark.contains(oto)) {
            System.out.println("Araç bulunamadı..."); 
        }
        
    }
    
    public static void kasaBilgi() {
        System.out.println("Kasaya "+para+" kadar para girdi..");
    }

    
}

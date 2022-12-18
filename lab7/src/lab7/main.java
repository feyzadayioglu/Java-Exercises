// 190202021 Feyzanur Dayıoğlu
package lab7;

import java.util.Scanner;

/**
 *
 * @author Feyzanur
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        System.out.print("Dairenin yaricapini giriniz: ");
        Scanner giris = new Scanner(System.in);
        int yari_cap=giris.nextInt();
        Daire daire = new Daire(yari_cap);
        daire.ekranaYazdir();
        daire.cevreAlandanBuyuktur();
        daire.cevreAlandanKucuktur();
        
        System.out.print("Faktoriyeli alinacak sayi: ");
        Scanner giris2 = new Scanner(System.in);
        int fak = giris2.nextInt();
        Faktoriyal faktoriyel = new Faktoriyal();
        faktoriyel.setDeger(fak);
        faktoriyel.hesapla();
        faktoriyel.ekranaYazdir();
    }
    
}

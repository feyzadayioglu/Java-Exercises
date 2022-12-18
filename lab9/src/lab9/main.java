//Feyzanur Dayıoğlu 190202021
package lab9;
/**
 *
 * @author Feyzanur
 */
public class main {

    
    public static void main(String[] args) {
        Daire d1 = new Daire(1, 1);
        Daire d2 = new Daire(2, 3, 2);
        Dortgen dortgen = new Dortgen(2, 2);

        System.out.println(d1.alan());
        System.out.println(d2.alan());
        System.out.println(dortgen.alan());

        

        d1.enUst();
        d2.enUst();
        dortgen.enUst();
       
        d1.listele();
        
        System.out.println(d2.sil());
        dortgen.listele();
        
    }
    
}

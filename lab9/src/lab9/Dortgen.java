//Feyzanur Dayıoğlu 190202021
package lab9;

/**
 *
 * @author Feyzanur
 */
public class Dortgen extends Sekil {
        int x,y;
    int en=1,boy=1;
    String sekilisim="Dörtgen";

    public Dortgen(int x, int y) {
        super(x,y);
        System.out.println("Dörtgen yaratildi");
        super.sekilisim=this.sekilisim;
        this.varlik=varlikID;
        sekils.add(this);

    }

    public Dortgen(int x, int y, int en, int boy) {
        super(x,y);
        this.en = en;
        this.boy = boy;

        System.out.println("Dörtgen yaratildi");
        super.sekilisim=this.sekilisim;
        this.varlik=varlikID;
        sekils.add(this);


    }

    @Override
    float alan() {
return en*boy;
    }

    @Override
    float cevre() {

        return (en+boy)*2;
    }

    boolean sil() {
        int a=this.varlik;
        return super.sil(a);
    }
    
}

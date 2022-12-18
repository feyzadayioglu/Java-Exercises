//Feyzanur Dayıoğlu 190202021
package lab9;

/**
 *
 * @author Feyzanur
 */
public class Daire extends Sekil {
    int x,y;
    int r=1;
    String sekilisim="Daire";

    public Daire(int x, int y, int r) {
        super(x,y);
        this.r = r;
        System.out.println("Daire yaratildi");
        super.sekilisim=this.sekilisim;
        this.varlik=varlikID;
        sekils.add(this);

    }

    public Daire(int x, int y) {
        super(x,y);
        System.out.println("Daire yaratildi");
        super.sekilisim=this.sekilisim;
        this.varlik=varlikID;
        sekils.add(this);

    }

    @Override
    float alan() {


        return (float)(Math.PI*r*r);
    }

    @Override
    float cevre() {

        return (float) (2*r*Math.PI);
    }


    boolean sil() {

        return super.sil(this.varlik);
    }
}

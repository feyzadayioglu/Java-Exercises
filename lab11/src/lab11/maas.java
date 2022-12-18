//Feyzanur Dayıoğlu 190202021
package lab11;

/**
 *
 * @author Feyzanur
 */
public class maas {
    int maas;
    int zam;
    int eksiZam;

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }

    public int getZam() {
        return zam;
    }

    public void setZam(int zam) {
        this.zam = zam;
    }

    public int getEksiZam() {
        return eksiZam;
    }

    public void setEksiZam(int eksiZam) {
        this.eksiZam = eksiZam;
    }

    
    
    public  void maasAzalt(){
        System.out.println("personelin eksik zamlı maaşı "+(maas-eksiZam));
    }
    public void maasArttir(){
        System.out.println("personelin zamlı maaşı "+(maas+zam));
    }
    public void maasYazdir(){
        System.out.println("pesonelin maası "+maas);
    }
    
}

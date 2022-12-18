//Feyzanur Dayıoğlu 190202021
package lab11;

/**
 *
 * @author Feyzanur
 */
public abstract class personel extends maas implements kisi{
    int personelID;
    int calistigiYil;
    int aylikCalismaSaati;

    public int getPersonelID() {
        return personelID;
    }

    public void setPersonelID(int personelID) {
        this.personelID = personelID;
    }

    public int getCalistigiYil() {
        return calistigiYil;
    }

    public void setCalistigiYil(int calistigiYil) {
        this.calistigiYil = calistigiYil;
    }

    public int getAylikCalismaSaati() {
        return aylikCalismaSaati;
    }

    public void setAylikCalismaSaati(int aylikCalismaSaati) {
        this.aylikCalismaSaati = aylikCalismaSaati;
    }
    
    public abstract void personelOzYazdir();
}
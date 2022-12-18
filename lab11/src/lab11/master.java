//Feyzanur Dayıoğlu 190202021
package lab11;

/**
 *
 * @author Feyzanur
 */
public class master extends lisansUstu{
    int yaptıgiProjeSayisi;
    int gomlekSayisi;
    String burc=new String();

    public int getYaptıgiProjeSayisi() {
        return yaptıgiProjeSayisi;
    }

    public void setYaptıgiProjeSayisi(int yaptıgiProjeSayisi) {
        this.yaptıgiProjeSayisi = yaptıgiProjeSayisi;
    }

    public int getGomlekSayisi() {
        return gomlekSayisi;
    }

    public void setGomlekSayisi(int gomlekSayisi) {
        this.gomlekSayisi = gomlekSayisi;
    }

    public String getBurc() {
        return burc;
    }

    public void setBurc(String burc) {
        this.burc = burc;
    }
    
    public void burcYazdir(){
        System.out.println("master üstü öğrencisinin burcu "+burc);
    }
    public void gomlekSayisiYazdir(){
        System.out.println("master üstü öğrencisinin gömlek sayısı "+gomlekSayisi);
    }
    @Override
    public void aldigiBursYazdir() {
        System.out.println("master üstü öğrencisinin aldığı burs "+aldigiBurs);    
    }
    
    
    
}

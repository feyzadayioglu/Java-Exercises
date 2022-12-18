//Feyzanur Dayıoğlu 190202021
package lab10;

/**
 *
 * @author Feyzanur
 */
public final class Automobile implements Arac{
    double fuel;
    double speed;
    String license;
    long girisZamani;
    int arac_sayisi=0;
    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public long getGirisZamani() {
        return girisZamani;
    }

    public void setGirisZamani(long girisZamani) {
        this.girisZamani = girisZamani;
    }

    public int getArac_sayisi() {
        return arac_sayisi;
    }

    public void setArac_sayisi(int arac_sayisi) {
        this.arac_sayisi = arac_sayisi;
    }
    
    public Automobile(){
       arac_sayisi++;
       fuel=0;
       speed=0;
       license=null;
    }
    public Automobile(double f, double s, String l){
       arac_sayisi++;
       this.fuel=f;
       this.speed=s;
       this.license=l;
    } 
    public Automobile(String l) {
        this.setLicense(l);}

    @Override
    public void hizlan(double hizlanmaOrani) {
        if (hizlanmaOrani>0 && hizlanmaOrani<=1) {
            if ((speed+=36000000*hizlanmaOrani)<300) {
                speed+=(36000000*hizlanmaOrani);
            }
        }
        else{
            System.out.println("hız değişmedi ");
        }
    }

    @Override
    public void yavasla(double yavaslamaOrani) {
        
    }

    @Override
    public void stop() {
        speed=0;
        System.out.println("Araç durdu");
    }

    
}

/*
//ÇALIŞMA 1
    public int recursiveTopl(int n) {
		if(n <= 2)
			return 1;
		return 3 * recursiveTopl((n/2)) + n;
	}*/

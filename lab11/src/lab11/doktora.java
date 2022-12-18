//Feyzanur Dayıoğlu 190202021
package lab11;

/**
 *
 * @author Feyzanur
 */
public class doktora extends lisansUstu {
    String dogumAyi=new String();
    String favDersi=new String();
    String favParfumMarkasi=new String();
    public String dogumAyiYazdir(){
        return dogumAyi;
    }
    public void favParfumMarkasiYazdir(){
        System.out.println("doktora öğrencisinin en sevdiği parfüm markası "+favParfumMarkasi);
    }
    public void favDersiYazdir(){
        System.out.println("doktora öğrencisinin en sevdiği ders "+favDersi);
    } 
    @Override
    public void aldigiBursYazdir() {
        System.out.println("doktora öğrencisinin aldığı burs "+aldigiBurs);    
    }

   
    
}
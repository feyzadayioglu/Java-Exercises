//Feyzanur Dayıoğlu 190202021
package lab9;

import java.util.ArrayList;

/**
 *
 * @author Feyzanur
 */
public class Sekil {
    int x, y;
    static int varlikID = -1;
    int varlik=-1;
   static ArrayList<Sekil> sekils = new ArrayList<>();
    String sekilisim="";

    public Sekil(int x, int y) {
        this.x = x;
        this.y = y;
        varlikID++;
    }

    float alan() {


        return 0;
    }

    float cevre() {


        return 0;
    }

    void listele(){

        for(int i = 0; i<sekils.size();i++){
            
            System.out.println(sekils.get(i).varlik+"sirada yaratildi");
            System.out.println("Sekil Sinifi: "+sekils.get(i).sekilisim);
            System.out.println("X: "+sekils.get(i).x);
            System.out.println("Y: "+sekils.get(i).y);
            
            
        }
    }
    void enUst(){


        System.out.println("Sekil sinifi: "+sekils.get(sekils.size()-1).sekilisim);
        System.out.println("X: "+sekils.get(sekils.size()-1).x);
        System.out.println("Y: "+sekils.get(sekils.size()-1).y);
        System.out.println("Alan:"+sekils.get(sekils.size()-1).alan());
        System.out.println("Cevre:"+sekils.get(sekils.size()-1).cevre());

    }
    boolean sil(int varlikID){
        for (int i=0; i<sekils.size();i++){
            if(sekils.get(i).varlik==varlikID){
                sekils.remove(i);
                return  true;
            }

        }

        return false;
    }
    
}

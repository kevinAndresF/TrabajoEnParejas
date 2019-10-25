package model;
import java.util.ArrayList;

public class Paleognato extends Bird{

    private ArrayList<String> senses = new String("touch", "hearing");
    
    private int palateBones;

    public Paleognato(String name, ArrayList senses, double tailLength, double bonesDensity, String metabolicRange, int palateBones){

        super(name, tailLength, bonesDensity, metabolicRange);
        this.palateBones = palateBones;
        this.senses = senses;
    }

    /**
     * @return the senses
     */
    public ArrayList<String> getSenses() {
        return senses;
    }

    /**
     * @return the palateBones
     */
    public int getPalateBones() {
        return palateBones;
    }
 
}
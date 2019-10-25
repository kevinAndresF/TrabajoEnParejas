package model;
import java.util.ArrayList;

public class Ratites extends Paleognato{

    private ArrayList<String> senses = new String("smell", "view");

    //private boolean fly = false;
    private boolean	quilla ;

    public Ratites(String name, ArrayList senses, double tailLength, double bonesDensity, String metabolicRange, int palateBones, boolean quilla){

    super(name, senses, tailLength, bonesDensity, metabolicRange, palateBones);
    this.quilla = quilla;

    }

    public boolean getQuilla(){
        return quilla;
    }
    
    /**
     * @return the senses
     */
    public ArrayList<String> getSenses() {
        return senses;
    }

}
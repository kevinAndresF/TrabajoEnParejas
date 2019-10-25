package model; 
import java.util.ArrayList;

public class Tinamues extends Paleognato{

	private ArrayList<String> senses = new String("taste");

	private double speedOnEarth;

	public Tinamues(String name, ArrayList senses, double tailLength, double bonesDensity, String metabolicRange, int palateBones, double speedOnEarth){

		super(name, senses, tailLength, bonesDensity, metabolicRange, palateBones);
		this.speedOnEarth = speedOnEarth;

	}

	/**
	 * @return the senses
	 */
	public ArrayList<String> getSenses() {
		return senses;
	}

	/**
	 * @return the speedOnEarth
	 */
	public double getSpeedOnEarth() {
		return speedOnEarth;
	}

	
}
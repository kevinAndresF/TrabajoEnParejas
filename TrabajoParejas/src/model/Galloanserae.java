package model; 

import java.util.ArrayList;

abstract public class Galloanserae extends Neognatos{

	private ArrayList<String> senses = new String("view", "touch", "smell", "hearing");

	public  String DOMESTIC = "Domestic";
	public static String HUNTANIMAL= "Hunted";
	public static String MONOGAM = "Monogam";
	public static String POLYGAM = "Polygam" ;

	private String reproductionType ; 

	private String lifeType;



	public Galloanserae(String name, ArrayList senses, double tailLength, double bonesDensity, String metabolicRange, double thirdToeLength, int numberOfLegBones, String reproductionType, String lifeType){

		super(name, senses, tailLength, bonesDensity, metabolicRange, thirdToeLength, numberOfLegBones);
		this.reproductionType = reproductionType;
		this.lifeType = lifeType;
	}

	/**
	 * @return the senses
	 */
	public ArrayList<String> getSenses() {
		return senses;
	}

	/**
	 * @return the reproductionType
	 */
	public String getReproductionType() {
		return reproductionType;
	}

	/**
	 * @return the lifeType
	 */
	public String getLifeType() {
		return lifeType;
	}

}
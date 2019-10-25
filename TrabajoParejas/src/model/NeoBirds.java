import model; 

import java.util.ArrayList;

public class NeoBirds extends Neognatos{

	private ArrayList<String> senses = new String("view", "touch", "smell", "taste");
	
	private int numberOfLegs;
	private int numberOfToes;

	public NeoBirds(String name, ArrayList senses, double tailLength, double bonesDensity, String metabolicRange, double thirdToeLength, int numberOfLegBones, int numberOfLegs, int numberOfToes){

		super(name, senses, tailLength, bonesDensity, metabolicRange, thirdToeLength, numberOfLegBones);
		this.numberOfLegs = numberOfLegs;
		this.numberOfToes = numberOfToes;

	}

	/**
	 * @return the senses
	 */
	public ArrayList<String> getSenses() {
		return senses;
	}
	
	/**
	 * @return the numberOfLegs
	 */
	public int getNumberOfLegs() {
		return numberOfLegs;
	}

	/**
	 * @return the numberOfToes
	 */
	public int getNumberOfToes() {
		return numberOfToes;
	}
}
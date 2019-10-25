import java.util.ArrayList;

import model;

public class Neognato extends Neornithes{

	private ArrayList<String> senses = new String("view", "touch", "smell");
	
	private double thirdToeLength;
	private int numberOfLegBones;

	public Neognato(String name, ArrayList senses, double tailLength, double bonesDensity, String metabolicRange, double thirdToeLength, int numberOfLegBones){

		super(name,tailLength, bonesDensity, metabolicRange);
		this.thirdToeLength = thirdToeLength;
		this.senses = senses;
		this.numberOfLegBones = numberOfLegBones;
	}

	/**
	 * @return the senses
	 */
	public ArrayList<String> getSenses() {
		return senses;
	}

	/**
	 * @return the numberOfLegBones
	 */
	public int getNumberOfLegBones() {
		return numberOfLegBones;
	}

	/**
	 * @return the thirdToeLength
	 */
	public double getThirdToeLength() {
		return thirdToeLength;
	}

}
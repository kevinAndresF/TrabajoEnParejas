

import model;

public class Neornithes{

		
	public static final String LOW= "Low";
	public static final String MID= "Mid";
	public static final String HIGH= "High"; 

	private String name;
	private double tailLength;
	private double bonesDensity;
	private String metabolicRange;

	public Neornithes(String name, double tailLength, double bonesDensity, String metabolicRange){

		this.bonesDensity = bonesDensity;
		this.tailLength = tailLength;
		this.metabolicRange = metabolicRange;
		this.name = name;

	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the bonesDensity
	 */
	public double getBonesDensity() {
		return bonesDensity;
	}

	/**
	 * @return the metabolicRange
	 */
	public String getMetabolicRange() {
		return metabolicRange;
	}

	/**
	 * @return the tailLength
	 */
	public double getTailLength() {
		return tailLength;
	}

}
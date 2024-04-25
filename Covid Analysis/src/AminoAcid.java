/**
 * This class stores allows the user to and retrieve Amino Acid data.
 * 
 * COSC 1437.200
 * 
 * @author Brooke Pottle
 */
import java.util.ArrayList;

public class AminoAcid {
	
	private String fullName;
	private String aminoOneLetter;
	private String aminoThreeLetter;
	private ArrayList<String> aminoCodons;
	
	/**
	 * This is the constructor for the amino acid class
	 * @param name	    this is the full name of the amino acid
	 * @param letter3   this is the 3 letter abbreviation 
	 * @param letter1	this is the 1 letter abbreviation 
	 * @param codons	this is the array list of codons for this amino acid 
	 * @author Brooke pottle
	 */
	public AminoAcid(String name, String letter3, String letter1, ArrayList<String> codons) {
		fullName = name;
		aminoThreeLetter = letter3;
		aminoOneLetter = letter1;
		aminoCodons = codons;
	}
	
	public AminoAcid() {
		fullName = "";
		aminoOneLetter = "";
		aminoThreeLetter = "";
		
	}
	
	public void setName(String name) {
		fullName = name;
	}
	
	public void setOneLetter(String letter1) {
		aminoOneLetter = letter1;
	}
	
	public void setThreeLetter(String letter3) {
		aminoThreeLetter = letter3;
	}
	
	public String getName() {
		return fullName;
	}
	
	public String getOneLetter() {
		return aminoOneLetter;
	}
	
	public String getThreeLetter() {
		return aminoThreeLetter;
	}
	
	public String getCodon(int num) {
		return aminoCodons.get(num);
		
	}
	
	public ArrayList<String> getCodons() {
		return aminoCodons;
	}
	
	public int getListSize() {
		return aminoCodons.size();
	}
	
	public String toString() {
		return "The codons for " + fullName + "(" + 
				aminoOneLetter + ") are:" + aminoCodons;
	}
	
}

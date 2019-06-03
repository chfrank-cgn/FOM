// Aufg_12_01.java

import java.util.*;

public class Aufg_12_01 {

	public static void main(String[] args) {

		HashMap<String, Double> stadt = new HashMap<String, Double>();
		
		// Add values
		stadt.put("Koeln",30.5);
		stadt.put("Wuppertal",19.3);
		stadt.put("Bonn",25.5);

		// Get values manually
		System.out.println("Temperatur in Koeln: "+stadt.get("Koeln")+" Grad");
		System.out.println("Temperatur in Bonn: "+stadt.get("Bonn")+" Grad");
		System.out.println("Temperatur in Wuppertal: "+stadt.get("Wuppertal")+" Grad");

		// for-each loop
		for (String city : stadt.keySet()) {
			System.out.println("Temperatur in "+city+" "+stadt.get(city)+" Grad");
		}

	}
}


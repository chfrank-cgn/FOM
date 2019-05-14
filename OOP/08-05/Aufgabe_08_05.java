// Aufgabe_08_05.java

public class Aufgabe_08_05 {

	public static void main(String[] args) {
		
		// Zebra und Pinguin erzeugen
		ZooTier pinguin = new Pinguin("Linux",50,true);
		ZooTier zebra = new Zebra("Horse",200,40);

		// polymorphe Methode aufrufen
		polymorpheMethode(pinguin);
		polymorpheMethode(zebra);
		
	}
	
	public static void polymorpheMethode(ZooTier t) {
				
		System.out.println("Name " + t.name);
		System.out.println("Gewicht " + t.gewicht);

	}

}


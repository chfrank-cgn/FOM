
public class AuftragMain {

	public static void main(String[] args) {
		
		Auftrag[] aufArray = new Auftrag[5];
		
		aufArray[0] = new Auftrag("Klimaanlage reparieren", "Dr. Mueller", 3);
		aufArray[1] = new Auftrag("Gluehbirne wechseln", "Frau Trulla", 2);
		aufArray[2] = new Auftrag("Kartenautomat updaten", "Herr Hilbert");
		aufArray[3] = new Auftrag("Klospuelung reparieren", "Peter Puller");
		aufArray[4] = new Auftrag("Alarmanlage einbauen", "Chef", 1);
		
		// Array durchlaufen (z.B. mit for each-Schleife), dann
		// alle Auftraege mit Prioritaet 1 ausgeben
		
		for (Auftrag auftrag : aufArray) {

			System.out.println(auftrag.titel + " - " + auftrag.auftragGeber + " - " + auftrag.prioritaet);

		}

	}
	

}


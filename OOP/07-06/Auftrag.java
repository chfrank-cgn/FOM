public class Auftrag {

	// private removed, so that we can print in main
	String titel;
	String auftragGeber;
	int prioritaet;

	public Auftrag(String titel, String auftragGeber, int prioritaet) {

		this.titel = titel;
		this.auftragGeber = auftragGeber;
		this.prioritaet = prioritaet;

	}

	public Auftrag(String titel, String auftragGeber) {

		// In a constructor, this refers to an existing constructr, too
		this(titel, auftragGeber, 3);

	}

}


public class ArithOp {

	public static void main(String[] args) {

	int sekunden=0, minuten=0, stunden=0, tage=0;
	sekunden = Tools.intEingabe();

	// Berechnungen mit arithmetischen Operatoren
	// Ganzzahlige Division

	tage = sekunden / 86400;
        sekunden = sekunden - (tage * 86400);

	stunden = sekunden / 3600;
	sekunden = sekunden - (stunden * 3600);

	minuten = sekunden / 60;
	sekunden = sekunden - (minuten * 60);

	System.out.println("Das sind");
	System.out.println(tage + " Tage und");
	System.out.println(stunden + " Stunden und");
	System.out.println(minuten + " Minuten und");
	System.out.println(sekunden + " Sekunden");

	}
}


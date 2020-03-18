class Element {
    char wert;
    Element naechstes;
    
    // Konstruktor 
    public Element(char w) {
        wert      = w;
        naechstes = null;
    }
}

public class EinfacheListe {

	// Verweis auf Listenkopf
	Element kopf;
	
	public EinfacheListe(){

		kopf = new Element('L');
		kopf.naechstes = new Element('I');
		kopf.naechstes.naechstes = new Element('S');
		kopf.naechstes.naechstes.naechstes = new Element('T');
		kopf.naechstes.naechstes.naechstes.naechstes = new Element('E');		
		showListe();
		
		// das k-te Element bestimmen
		char wert = getElement(3);
		System.out.println("3-tes Element: "+wert);
		
		// Element mit bestimmtem Wert suchen
		int i = searchElement('T');
		System.out.println("Gesuchtes Element T an Position: "+i);
		
		// das k-te Element loeschen
		deleteElement(3);
		showListe();
	}
	
	/* das k-te Element bestimmen */
	private char getElement(int k) {
		Element ptr = kopf;
		int i = 1;
		while ((i<k) && (ptr.naechstes != null)) {
			i = i + 1;
			ptr = ptr.naechstes;
                }
		return ptr.wert;
	}

	/* Element mit bestimmtem Wert suchen */
	private int searchElement(char wert){
		Element ptr = kopf;
		int i = 1;
		while ((ptr.wert != wert) && (ptr.naechstes != null)) {
			i = i + 1;
			ptr = ptr.naechstes;
                }
		return i;
	}
	
	/* das k-te Element loeschen */
	private void deleteElement(int k){
		Element ptr = kopf;
		Element prev = kopf;
		int i = 1;
		while ((i<k) && (ptr.naechstes != null)) {
			i = i + 1;
			prev = ptr;
			ptr = ptr.naechstes;
		}
		prev.naechstes = ptr.naechstes;
	}
	
	/* Liste ausgeben */
	private void showListe(){
		Element ptr = kopf;
		System.out.println("Value: "+ptr.wert);
		while (ptr.naechstes != null) {
			ptr = ptr.naechstes;
			System.out.println("Value: "+ptr.wert);
		}
	}
	
	public static void main(String[] args) {
		
		new EinfacheListe();

	}
}


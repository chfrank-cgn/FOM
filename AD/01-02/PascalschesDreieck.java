public class PascalschesDreieck {

	public static void main(String[] args) {
		// Einzelwert bei Position 4,2 ausgeben
		int wert = pas(4 , 2);
		System.out.println("----------------------------" );		
		System.out.println("Zahl ist "+wert);
	}
		
	public static int pas(int zeile, int spalte) {
		if (spalte==0 || spalte==zeile)
			return 1;
		else
			return pas(zeile-1,spalte) + pas(zeile-1,spalte-1);
	}	
		
}


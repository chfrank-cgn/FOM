public class LazarschesQuadrat { 

	public static void main(String[] args) { 
		// Das liefert den Wert 7 
		int wert = lazarQuadrat( 3, 2, 5);  
		System.out.println("Zahl ist "+wert); 

	} 

	public static int lazarQuadrat(int zeile, int spalte, int groesse) {
		if(spalte==0 || spalte==groesse || zeile==0 || zeile == groesse) {
			return 1;
		} else {
			return lazarQuadrat(zeile-1, spalte,  groesse) +lazarQuadrat(zeile-1, spalte-1,  groesse); 
		}
	}
}


public class FakultaetRekursiv {

	public static void main(String[] args) {
		int erg = fakultaetRekursiv(4);
		System.out.println("Ergebnis: "+erg);
	}
	
	private static int fakultaetRekursiv(int x){
		if(x==1) {
			return 1;
		} else {
			return x * fakultaetRekursiv(x-1);
		}
	}

}


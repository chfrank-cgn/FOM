// Aufg_10_01.java

public class Aufg_10_01 {

	public static void main(String[] args) {
		
		int zaehler = 100;
		int nenner = 2;
		int result = 0;

		System.out.println("Zaehler " + zaehler);
		
		try {
			result = zaehler / nenner;
		} catch (ArithmeticException e) {
			System.err.println(e.getMessage());
			nenner = 1;
		} finally {
			System.out.println("Nanner " + nenner);
			System.out.println("Resultat " + result);
		}

	}
	
}


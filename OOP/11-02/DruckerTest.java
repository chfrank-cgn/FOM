
public class DruckerTest {

	public static void main(String[] args) {
		
		// Standardkonstruktor aufrufen
		Laserdrucker laserdrucker1 = new Laserdrucker();
		try {
			// Laserdrucker laserdrucker2 = laserdrucker1.clone();
			
			System.out.println("Seiten Laserdrucker 1: "+laserdrucker1.getSeiten());
			laserdrucker1.drucke("Dies ist ein Test.");
			laserdrucker1.drucke("Dies ist ein Test.");
			System.out.println("Seiten Laserdrucker 1: "+laserdrucker1.getSeiten());
			
			Laserdrucker laserdrucker2 = laserdrucker1.clone();

			System.out.println("Seiten Laserdrucker 2: "+laserdrucker2.getSeiten());
			laserdrucker2.drucke("Dies ist ein Test.");
			System.out.println("Seiten Laserdrucker 2: "+laserdrucker2.getSeiten());
			
		} catch (CloneNotSupportedException e) {
			System.err.println(e.getMessage());
		}				

	}

}


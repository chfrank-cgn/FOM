// Datei: FahrzeugTest.java

public class FahrzeugTest{
	
   public static void main (String args[]){

      // Einen PKW erzeugen
      System.out.println ("Pkw");

      Pkw audi = new Pkw();


      // Ein Motorrad erzeugen
      System.out.println ("Motorrad");

      Motorrad yamaha = new Motorrad();

      //Rufen Sie die print-Methoden der beiden Fahrzeuge auf

     audi.print();
     yamaha.print();

   }
}


import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.text.*;

public class Aufg_10_02{
	
   public static Date pruefeDatum (String datum) throws ParseException {
	   
      // Eine auf die Rechnerlokation abgestimmte Instanz der Klasse
      // DateFormat wird erzeugt.
      DateFormat df = new SimpleDateFormat("EEE MMM dd kk:mm:ss zzz yyyy");

      // strenge Datumspruefung einschalten
      df.setLenient (false);

      // Datum Ueberpruefen und in ein Date-Objekt wandeln.
      // Die Methode parse() wirft eine ParseException, wenn in
      // datum kein gueltiges Datum steht.
      Date d = df.parse (datum);
      return d;
   }

   public static void main (String[] args){
	   
      String testDatum = "Tue May 21 08:05:36 EDT 2019"; 
      
      Date datum = null;

      try {
          datum = pruefeDatum(testDatum);
      } catch (ParseException pe) {
          System.err.println("Parse error");
      }

      if (datum == null) {
         System.out.println("Falsches Datum " + testDatum);
      } else {
         System.out.println("Datum " + datum);
      }
  }
}


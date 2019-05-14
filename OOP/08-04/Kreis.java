// Datei: Kreis.java

public class Kreis extends GeometrischeFigur {

      private double radius;

      public double berechneFlaeche() {
          return Math.PI * radius * radius;
      }

      public double berechneUmfang() {
          return 2 * Math.PI * radius;
      }

      public Kreis(int radius) {
          this.radius = radius;
      }
}


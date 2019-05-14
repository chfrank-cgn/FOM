// Datei: Rechteck.java

public class Rechteck extends GeometrischeFigur {

      private double length;
      private double width;

      public double berechneFlaeche() {
          return width * length;
      }

      public double berechneUmfang() {
          return (2 * width) + (2 * length);
      }

      public Rechteck(double length, double width) {
          this.length = length;
          this.width = width;
      }
}


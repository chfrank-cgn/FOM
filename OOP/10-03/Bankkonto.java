// Bankkonto.java

public class Bankkonto {

  private double kontoStand;

  public Bankkonto() {
    this.kontoStand = 0.0;
  }

  public void einzahlen (double betrag) throws TransaktionsException {
    if (betrag < 0) throw new TransaktionsException();
    this.kontoStand = this.kontoStand + betrag;
  }

  public void auszahlen (double betrag) throws TransaktionsException {
    if (betrag < 0) throw new TransaktionsException();
    if (this.kontoStand < betrag) throw new TransaktionsException();
    this.kontoStand = this.kontoStand - betrag;
  }
      
  public double getKontostand() {
    return this.kontoStand;
  }

}


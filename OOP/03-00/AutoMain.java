public class AutoMain {

    public static void main(String[] args) { 

       Auto car1 = new Auto();
       Auto car2 = new Auto();
       car1.ANZAHL = 0;

       car1.ps = 100;
       car1.hersteller = "BMW";
       Auto.ANZAHL++;

       car2.ps = 50;
       car2.hersteller = "Smart";
       Auto.ANZAHL++;

       System.out.println("Hersteller 1 "+car1.hersteller);
       System.out.println("Hersteller 2 "+car2.hersteller);
       System.out.println("Anzahl "+Auto.ANZAHL);

    }

}

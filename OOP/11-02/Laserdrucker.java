
public class Laserdrucker implements Drucker, Cloneable {

   private int pageRemaining = 100;

   public void drucke(String s) {
      if (pageRemaining > 0) {
         System.out.println(s);
         this.pageRemaining--;
      }
   }

   public int getSeiten() {
      return this.pageRemaining;
   }

   public Laserdrucker clone() throws CloneNotSupportedException {
      return (Laserdrucker) super.clone();
   }
}


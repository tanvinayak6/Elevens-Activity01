/**
 * This is a class that tests the Card class.
 */
public class CardTester {

 /**
  * The main method in this class checks the Card operations for consistency.
  * @param args is not used.
  */
 public static void main(String[] args) {
  /* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
   Card c = new Card("2", "hearts", 3);
   Card s = new Card("A"," hearts", 8);
   Card x = new Card("2", "hearts", 3);
   System.out.println(c);
   System.out.println(s);
   System.out.println(x);
   System.out.println(c.matches(x));
 }
}

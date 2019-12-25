/**
 * Main
 */

public class Main {

   public static void main(final String[] args) {
      LinkedList<Integer> x = new LinkedList<>();
      x = x.pushBack(5);
      x = x.pushBack(8);
      x = x.pushBack(10);
      x = x.pushBack(7);
      x = x.pushBack(2);

      x.printAll();
   }
}
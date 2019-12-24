/**
 * Main
 */
package linked_list;

public class Main {

   public static void main(final String[] args) {
      LinkedList<Integer> x = new LinkedList<Integer>();

      x = x.pushBack(5);
      x = x.pushBack(8);
      x = x.pushBack(10);
      x = x.pushBack(7);
      x = x.pushBack(2);
      x.printAll();

      System.out.println();
      System.out.println(x.at(4));

      x = x.remove(4);
      System.out.println();
      x.printAll();
   }
}
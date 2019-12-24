/**
 * LinkedList
 */
package linked_list;

public class LinkedList<T> {

   private Node<T> head;

   private int length = 0;

   public static class Node<T> {

      private T value;

      private Node<T> next;

      public Node(final T val) {
         setValue(val);

         setNext(null);
      }

      public Node<T> getNext() {
         return next;
      }

      public void setNext(final Node<T> next) {
         this.next = next;
      }

      public T getValue() {
         return value;
      }

      public void setValue(final T value) {
         this.value = value;
      }
   }

   public LinkedList() {
   }

   public int getLength() {
      return this.length;
   }

   public LinkedList<T> pushBack(final T value) {
      final Node newNode = new Node(value);

      if (this.head == null) {
         this.head = newNode;
      } else {
         Node curr = this.head;
         while (curr.getNext() != null) {
            curr = curr.getNext();
         }
         curr.setNext(newNode);
      }
      length = length + 1;
      return this;
   }

   public LinkedList<T> remove(final int index) {

      Node del;
      Node curr;
      if (index >= this.length) {
         return this;
      }

      if (index == 0) {
         del = this.head;
         this.head = this.head.getNext();
      } else {
         int i = 0;
         curr = this.head;
         while (i < index - 1) {
            curr = curr.getNext();
            i = i + 1;
         }
         del = curr.getNext();
         curr.setNext(del.getNext());
      }
      del = null;
      length = length - 1;
      return this;
   }

   private T at(LinkedList<T> linkedList, final int index) {

      Node<T> curr = linkedList.head;
      int i = 0;
      while (i < index && i < linkedList.length) {
         curr = curr.getNext();
         i = i + 1;
      }

      return (T) curr.getValue();
   }

   public T at(final int index) {
      return at(this, index);
   }

   public void printAll() {
      Node curr = this.head;

      while (curr != null) {
         System.out.println(curr.getValue());
         curr = curr.getNext();
      }
   }
}

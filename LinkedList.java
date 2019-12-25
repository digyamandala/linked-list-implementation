/**
 * LinkedList
 */

public class LinkedList<T> {

   private Node<T> head;

   private Node<T> tail;

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
      final Node<T> newNode = new Node<T>(value);

      if (this.head == null) {
         this.tail = newNode;
         this.head = newNode;
      } else {
         tail.setNext(newNode);
         tail = tail.getNext();
      }
      length = length + 1;
      return this;
   }

   public LinkedList<T> remove(final int index) {

      Node<T> del, curr;
      if (index >= this.length) {
         return this;
      }

      if (index == 0) {
         del = this.head;
         this.head = this.head.getNext();
         if (length == 1) {
            tail = null;
         }
      } else {
         int i = 0;
         curr = this.head;
         while (i < index - 1) {
            curr = curr.getNext();
            i = i + 1;
         }
         del = curr.getNext();
         curr.setNext(del.getNext());
         if (del == tail) {
            tail = curr;
         }
      }
      del = null;
      length = length - 1;
      return this;
   }

   public T at(final int index) {
      return at(this, index);
   }

   private T at(LinkedList<T> linkedList, final int index) {
      Node<T> curr = linkedList.head;
      int i = 0;

      if (index == length - 1) {
         return tail.getValue();
      }
      while (i < index && i < linkedList.length) {
         curr = curr.getNext();
         i = i + 1;
      }

      return curr.getValue();
   }

   public void printAll() {
      Node<T> curr = this.head;

      while (curr != null) {
         System.out.println(curr.getValue());
         curr = curr.getNext();
      }
   }
}

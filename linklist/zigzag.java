public class LinkedList {
  public static class Node {
      int data;
      Node next;

      public Node(int data) {
          this.data = data;
          this.next = null;
      }
  }

  public static Node head;

  public void addFirst(int data) {
      Node newNode = new Node(data);
      if (head == null) {
          head = newNode;
          return;
      }
      newNode.next = head;
      head = newNode;
  }

  public void print() {
      Node temp = head;
      while (temp != null) {
          System.out.print(temp.data + " -> ");
          temp = temp.next;
      }
      System.out.println("null");
  }

  public void zigZag() {
      // if (head == null || head.next == null) {
      //     return;
      // }

      // find mid
      Node slow = head;
      Node fast = head.next;
      while (fast != null && fast.next != null) {
          slow = slow.next;
          fast = fast.next.next;
      }
      Node mid = slow;

      // reverse 2nd half
      Node curr = mid.next;
      mid.next = null;
      Node prev = null;
      Node next;
      while (curr != null) {
          next = curr.next;
          curr.next = prev;
          prev = curr;
          curr = next;
      }

      Node left = head;
      Node right = prev;
      Node nextL, nextR;

      // alt merge - zigzag merge
      while (left != null && right != null) {
          nextL = left.next;
          left.next = right;
          nextR = right.next;
          right.next = nextL;

          left = nextL;
          right = nextR;
      }
  }

  public static void main(String[] args) {
      LinkedList ll = new LinkedList();
      ll.addFirst(1);
      ll.addFirst(2);
      ll.addFirst(3);
      ll.addFirst(4);
      ll.addFirst(5);

      ll.print(); // Print original list
      ll.zigZag();
      ll.print(); // Print zigzagged list
  }
}

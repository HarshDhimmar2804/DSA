import java.util.Deque;
import java.util.LinkedList;

public class StacktoQueue {// O(1)
  static class stack {
    Deque<Integer> deque = new LinkedList<>();

    public void push(int data) {
      deque.addLast(data);
    }

    public int pop() {
      return deque.removeLast();
    }

    public int peek() {
      return deque.getLast();
    }
  }

  static class queue {
    Deque<Integer> deque = new LinkedList<>();

    public void add(int data) {
      deque.addLast(data);
    }

    public int remove() {
      return deque.removeFirst();
    }

    public int peek() {
      return deque.getFirst();
    }
  }

  public static void main(String[] args) {
    // stack s = new stack();
    // s.push(1);
    // s.push(2);
    // s.push(3);
    // System.out.println("Peek is " + s.peek());
    // System.out.println(s.pop());
    // System.out.println(s.pop());
    // System.out.println(s.pop());

    queue q = new queue();
    q.add(1);
    q.add(2);
    q.add(3);
    System.out.println("Peek is " + q.peek());
    System.out.println(q.remove());
    System.out.println(q.remove());
    System.out.println(q.remove());
  }
}

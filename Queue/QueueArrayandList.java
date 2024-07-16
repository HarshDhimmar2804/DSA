public class QueueArrayandList {
  static class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  static class Queue {
    static Node head = null;
    static Node tail = null;

    // static int arr[];
    // static int size;
    // static int rear;
    // static int front;

    // Queue(int n) {
    // arr = new int[n];
    // size = n;
    // rear = -1;
    // front = -1;
    // }

    public static boolean isEmpty() {
      // return rear == -1 && front == -1;
      return head == null && tail == null;
    }

    // public static boolean isFull() {
    // return (rear + 1) % size == front;
    // }

    // add
    public static void add(int data) {// o(1)
      // if (isFull()) {
      // System.out.println("Queue is full");
      // return;
      // }
      // add 1st element
      // if (front == -1) {
      // front = 0;
      // }
      // rear = (rear + 1) % size;
      // arr[rear] = data;

      Node newNode = new Node(data);
      if (head == null) {
        head = tail = newNode;
        return;
      }
      tail.next = newNode;
      tail = newNode;
    }

    // remove
    public static int remove() {// o(n) -> now this is o(1)
      if (isEmpty()) {
        System.out.println("empty queue");
        return -1;
      }
      // int result = arr[front];
      // // last el delete
      // if (rear == front) {
      // rear = front = -1;
      // } else {
      // front = (front + 1) % size;
      // }
      // return result;

      int front = head.data;
      // single element
      if (head == null) {
        head = tail = null;
      } else {
        head = head.next;
      }
      return front;
    }

    // peek
    public static int peek() {// o(1)
      if (isEmpty()) {
        System.out.println("empty queue");
        return -1;
      }
      // return arr[front];
      return head.data;
    }
  }

  public static void main(String[] args) {
    // This is for array
    // Queue q = new Queue(5);
    // q.add(1);
    // q.add(2);
    // q.add(3);
    // System.out.println(q.remove());
    // q.add(4);
    // System.out.println(q.remove());
    // q.add(5);

    // while (!q.isEmpty()) {
    // System.out.println(q.peek());
    // q.remove();
    // }

    // This for link-list
    Queue q = new Queue();
    q.add(1);
    q.add(2);
    q.add(3);

    while (!q.isEmpty()) {
      System.out.println(q.peek());
      q.remove();
    }

  }
}

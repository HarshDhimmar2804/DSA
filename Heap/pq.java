import java.util.*;

public class pq {
  static class Student implements Comparable<Student> { // overriding
    String name;
    int rank;

    public Student(String name, int rank) {
      this.name = name;
      this.rank = rank;
    }

    @Override
    public int compareTo(Student s2) {
      return this.rank - s2.rank;
    }
  }

  public static void main(String[] args) {
    PriorityQueue<Student> pq = new PriorityQueue<>();
    // PriorityQueue<Integer> pq = new PriorityQueue<>();
    // PriorityQueue<>(Comparator.reverseOrder());//reverse

    pq.add(new Student("A", 4));// o(logn)
    pq.add(new Student("B", 5));
    pq.add(new Student("C", 2));
    pq.add(new Student("D", 12));
    while (!pq.isEmpty()) {
      System.out.println(pq.peek().name + "->" + pq.peek().rank);// o(1)
      pq.remove();// o(logn)
    }

    // pq.add(3);// o(logn)
    // pq.add(4);
    // pq.add(1);
    // pq.add(7);
    // while (!pq.isEmpty()) {
    // System.out.println(pq.peek());// o(1)
    // pq.remove();// o(logn)
    // }
  }
}

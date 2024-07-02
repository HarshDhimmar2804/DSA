import java.util.*;

public class problems {
  public static void swap(ArrayList<Integer> list, int idx1, int idx2) {
    int temp = list.get(idx1);
    list.set(idx1, list.get(idx2));
    list.set(idx2, temp);
  }

  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(2);
    list.add(5);
    list.add(9);
    list.add(3);
    list.add(6);

    System.out.println(list);
    Collections.sort(list);// ascending
    System.out.println(list);

    // descending
    Collections.sort(list, Collections.reverseOrder());// comperator fnx logic
    System.out.println(list);

    // int idx1 = 1, idx2 = 3;
    // System.out.println(list);
    // swap(list, idx1, idx2);
    // System.out.println(list);

    // // Reverse o(n)
    // for (int i = list.size() - 1; i >= 0; i--) {
    // System.out.print(list.get(i) + " ");
    // }
    // System.out.println();

    // Max num - o(n)
    // int max = Integer.MIN_VALUE;
    // for (int i = 0; i < list.size(); i++) {
    // // if (max < list.get(i)) {
    // // max = list.get(i);
    // // }

    // max = Math.max(max, list.get(i));
    // }
    // System.out.println("Max element = " + max);
  }
}

import java.util.ArrayList;

public class arrayList {
  public static void main(String[] args) {
    // java collection framework
    ArrayList<Integer> list = new ArrayList<>();
    ArrayList<String> list2 = new ArrayList<>();
    ArrayList<Boolean> list3 = new ArrayList<>();

    list.add(1);// o(1)
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);

    list.add(1, 10);// o(n)

    System.out.println(list.size());
    // print the arraylist
    for (int i = 0; i < list.size(); i++) {
      System.out.print(list.get(i) + " ");
    }
    System.out.println();

    // System.out.println(list);

    // Get operation - o(1)
    // int ele = list.get(2);
    // System.out.println(ele);

    // Delete
    // list.remove(2);
    // System.out.println(list);

    // Set
    // list.set(2, 10);
    // System.out.println(list);

    // Contains
    // System.out.println(list.contains(1));
    // System.out.println(list.contains(11));
  }
}

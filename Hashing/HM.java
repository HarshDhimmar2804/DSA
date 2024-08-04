import java.util.*;

public class HM {
  public static void main(String[] args) {
    // // create
    // HashMap<String, Integer> hm = new HashMap<>();

    // // Insert - O(1)
    // hm.put("India", 100);
    // hm.put("China", 150);
    // hm.put("US", 50);

    // System.out.println(hm);

    // // Get - O(1)
    // // int population = hm.get("India");
    // // System.out.println(population);
    // // System.out.println(hm.get("Indonasia"));

    // // Containskey - O(1)
    // // System.out.println(hm.containsKey("India"));// true
    // // System.out.println(hm.containsKey("Indonasia"));// false

    // // remove - O(1)
    // System.out.println(hm.remove("India"));
    // System.out.println(hm);

    // // size
    // System.out.println(hm.size());

    // // Is Empty
    // hm.clear();
    // System.out.println(hm.isEmpty());

    HashMap<String, Integer> hm = new HashMap<>();

    hm.put("India", 100);
    hm.put("China", 150);
    hm.put("US", 50);
    hm.put("Indonesia", 6);
    hm.put("Nepal", 5);

    // Iterate
    Set<String> keys = hm.keySet();
    System.out.println(keys);

    for (String k : keys) {
      System.out.println("Keys=" + k + ",value=" + hm.get(k));
    }
  }
}

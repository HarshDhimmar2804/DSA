import java.util.*;

public class waterContainer {

  public static int storeWater(ArrayList<Integer> height) {
    int maxWater = 0;
    // brute force - o(n^2)
    for (int i = 0; i < height.size(); i++) {
      for (int j = i + 1; j < height.size(); j++) {
        int ht = Math.min(height.get(i), height.get(j));
        int width = j - i;
        int currWater = ht * width;
        maxWater = Math.max(maxWater, currWater);
      }
    }
    return maxWater;
  }

  // 2 pointer approach-o(n)
  public static int storeWater1(ArrayList<Integer> height) {
    int maxWater = 0;
    int i = 0;
    int j = height.size() - 1;
    while (i < j) {
      // calculate area
      int ht = Math.min(height.get(i), height.get(j));
      int width = j - i;
      int currWater = ht * width;
      maxWater = Math.max(maxWater, currWater);

      // update pointer
      if (height.get(i) < height.get(j)) {
        i++;
      } else {
        j--;
      }
    }
    return maxWater;
  }

  public static void main(String[] args) {
    ArrayList<Integer> height = new ArrayList<>();
    height.add(1);
    height.add(8);
    height.add(6);
    height.add(2);
    height.add(5);
    height.add(4);
    height.add(8);
    height.add(3);
    height.add(7);

    System.out.println(storeWater1(height));
  }
}

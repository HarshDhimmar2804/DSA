import java.lang.reflect.Array;
import java.util.*;

public class array {
  public static int linearSearch(String menu[], String key) {
    for (int i = 0; i < menu.length; i++) {
      if (menu[i] == key) {
        return i;
      }
    }
    return -1;
  }

  public static int largest(int numbers[]) {
    int max = Integer.MIN_VALUE;// for -infinite
    int min = Integer.MAX_VALUE;// for +infinite
    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] > max) {
        max = numbers[i];
      }
      if (numbers[i] < min) {
        min = numbers[i];
      }
    }
    System.out.println("Smallest value: " + min);
    return max;
  }

  public static int binarySearch(int numbers[], int key) {
    int start = 0;
    int end = numbers.length - 1;
    while (start <= end) {
      int mid = (start + end) / 2;
      if (numbers[mid] == key) {
        return mid;
      }
      if (numbers[mid] < key) {
        start = mid + 1;
      } else {
        end = mid - 1;
      }
    }
    return -1;
  }

  public static void reverse(int numbers[]) {
    int first = 0, last = numbers.length - 1;
    while (first < last) {
      int temp = numbers[first];
      numbers[first] = numbers[last];
      numbers[last] = temp;
      first++;
      last--;
    }
  }

  public static void pair(int numbers[]) {
    int tp = 0;
    for (int i = 0; i < numbers.length; i++) {
      int curr = numbers[i];
      for (int j = i + 1; j < numbers.length; j++) {
        System.out.print("(" + curr + "," + numbers[j] + ")");
        tp++;
      }
      System.out.println();
    }
    System.out.println("Total number of pairs: " + tp);
  }

  public static void subArray(int numbers[]) {
    int tp = 0;
    for (int i = 0; i < numbers.length; i++) {
      int start = i;
      for (int j = i; j < numbers.length; j++) {
        int end = j;
        for (int k = start; k <= end; k++) {
          System.out.print(numbers[k] + "");
        }
        tp++;
        System.out.println();
      }
      System.out.println();
    }
    System.out.println("Total number of sub array: " + tp);
  }

  public static void maxsubArray(int numbers[]) {
    int maxSum = Integer.MIN_VALUE;
    for (int i = 0; i < numbers.length; i++) {
      int start = i;
      for (int j = i; j < numbers.length; j++) {
        int end = j;
        int currSum = 0;
        for (int k = start; k <= end; k++) {
          currSum += numbers[k];
        }
        System.out.println(currSum);
        if (maxSum < currSum) {
          maxSum = currSum;
        }
      }
      System.out.println();
    }
    System.out.println("Maximum sum:" + maxSum);
  }

  public static void prefixmaxsubArray(int numbers[]) {
    int maxSum = Integer.MIN_VALUE;
    int prefix[] = new int[numbers.length];

    numbers[0] = prefix[0];
    // calculate prefix sum
    for (int i = 1; i < prefix.length; i++) {
      prefix[i] = prefix[i - 1] + numbers[i];
    }

    for (int i = 0; i < numbers.length; i++) {
      int start = i;
      for (int j = i; j < numbers.length; j++) {
        int end = j;
        int currSum = 0;
        currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
        if (maxSum < currSum) {
          maxSum = currSum;
        }
      }
    }
    System.out.println("Maximum sum:" + maxSum);
  }

  public static void kadans(int numbers[]) {
    int max = Integer.MIN_VALUE;
    int cur = 0;

    for (int i = 0; i < numbers.length; i++) {
      cur += numbers[i];
      if (cur < 0) {
        cur = 0;
      }
      max = Math.max(cur, max);
    }
    System.out.println("Maximum sum:" + max);
  }

  public static boolean duplicateNum(int numbers[]) {
    for (int i = 0; i < numbers.length; i++) {
      for (int j = i + 1; j < numbers.length; j++) {
        if (numbers[i] == numbers[j]) {
          return true;
        }
      }
    }
    return false;
  }

  public static int trappedWater(int height[]) {
    int n = height.length;
    // calculate max left most boundary
    int leftMax[] = new int[n];
    leftMax[0] = height[0];
    for (int i = 1; i < n; i++) {
      leftMax[i] = Math.max(height[i], leftMax[i - 1]);// left side
    }
    // calculate max right most boundary
    int rightMax[] = new int[n];
    rightMax[n - 1] = height[n - 1];
    for (int i = n - 2; i >= 0; i--) {
      rightMax[i] = Math.max(height[i], rightMax[i + 1]);// rigth side
    }
    int trappedWater = 0;
    for (int i = 0; i < n; i++) {
      // calculate waterlevel=min(max left most boundary,min left most boundary)
      int waterlevel = Math.min(leftMax[i], rightMax[i]);
      // calculate trappedwater = waterlevel-height[i]
      trappedWater += waterlevel - height[i];
    }
    return trappedWater;
  }

  public static int buysellStock(int prices[]) {
    int maxProfit = 0;
    int buyPrice = Integer.MAX_VALUE;

    for (int i = 0; i < prices.length; i++) {
      if (buyPrice < prices[i]) {
        int profit = prices[i] - buyPrice;
        maxProfit = Math.max(profit, maxProfit);
      } else {
        buyPrice = prices[i];
      }
    }
    return maxProfit;
  }

  public static int maxAreawithmostContainer(int[] height) {
    int max = 0;
    int left = 0;
    int right = height.length - 1;
    while (left <= right) {
      int area = 0;
      int length = Math.min(height[left], height[right]);
      int breadth = Math.abs(left - right);
      area = length * breadth;
      max = Math.max(area, max);
      if (height[left] <= height[right]) {
        left++;
      } else {
        right--;
      }
    }
    return max;
  }

  public static ArrayList<Integer> lonelyNumbers(int array[]) {
    ArrayList<Integer> list = new ArrayList<>();// take a list array
    if (array.length == 1) {
      list.add(array[0]);
      return list; // Return empty list if input array is empty
    }
    Arrays.sort(array);// sort the array

    for (int i = 0; i < array.length; i++) {
      if (i == 0) {
        if (array[i + 1] != array[i] + 1 && array[i + 1] != array[i]) {
          list.add(array[i]);
        }
      } else if (i == array.length - 1) {
        if (array[i - 1] != array[i] - 1 && array[i - 1] != array[i]) {
          list.add(array[i]);
        }
      } else {
        if (array[i - 1] != array[i] - 1 && array[i - 1] != array[i] && array[i + 1] != array[i] + 1
            && array[i + 1] != array[i]) {
          list.add(array[i]);
        }
      }
    }
    return list;
  }

  public static void main(String[] args) {
    int array[] = { 10, 6, 5, 8 };
    System.out.println(lonelyNumbers(array));

    // int height[] = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
    // System.out.println(maxAreawithmostContainer(height));

    // int prices[] = { 7, 1, 5, 3, 6, 4 };
    // System.out.println(buysellStock(prices));

    // int height[] = { 4, 2, 0, 6, 3, 2, 5 };
    // System.out.println(trappedWater(height));

    // int numbers[] = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };
    // boolean dup = duplicateNum(numbers);
    // System.out.println(dup);

    // int numbers[] = { -2, -3, 4 - 1, -2, 1, 5, -3 };
    // kadans(numbers);

    // prefixmaxsubArray(numbers);
    // maxsubArray(numbers);
  }
}

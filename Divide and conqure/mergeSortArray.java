public class mergeSortArray {
  public static int[] mergeArray(int[] arr1, int[] arr2) {
    int n = arr1.length;
    int m = arr2.length;
    int[] temp = new int[n + m];
    int i = 0;
    int j = 0;
    int k = 0;
    while (i < n && j < m) {
      if (arr1[i] < arr2[j]) {
        temp[k++] = arr1[i++];
      } else {
        temp[k++] = arr2[j++];
      }
    }
    while (i < n) {
      temp[k++] = arr1[i++];
    }
    while (j < m) {
      temp[k++] = arr2[j++];
    }
    return temp;
  }

  static int count = 0;

  public static int[] mergeArray2(int[] left, int[] right) {
    int n = left.length;
    int m = right.length;
    int[] temp = new int[n + m];
    int i = 0;
    int j = 0;
    int k = 0;
    while (i < n && j < m) {
      if (left[i] < right[j]) {
        temp[k++] = left[i++];
      } else {
        temp[k++] = right[j++];
        count += (n - i);
      }
    }
    while (i < n) {
      temp[k++] = left[i++];
    }
    while (j < m) {
      temp[k++] = right[j++];
    }
    return temp;
  }

  public static int[] mergeSort(int[] arr, int si, int ei) {
    if (si == ei) {
      int[] ba = new int[1];
      ba[0] = arr[si];
      return ba;
    }
    int mid = si + (ei - si) / 2;
    int[] left = mergeSort(arr, si, mid);
    int[] right = mergeSort(arr, mid + 1, ei);
    int[] res = mergeArray(left, right);
    return res;
  }

  public static int[] countInversion(int[] arr, int si, int ei) {
    if (si == ei) {
      int[] ba = new int[1];
      ba[0] = arr[si];
      return ba;
    }
    int mid = si + (ei - si) / 2;
    int[] left = countInversion(arr, si, mid);
    int[] right = countInversion(arr, mid + 1, ei);
    int[] res = mergeArray2(left, right);
    return res;
  }

  public static void main(String[] args) {
    int[] arr1 = { 4, 1, 7, 2, 9, 5 };
    int[] res = countInversion(arr1, 0, 5);
    // int[] res = mergeSort(arr1, 0, 5);
    // int[] arr2 = { 2, 4, 7, 10, 18, 20 };
    // int[] res = mergeArray(arr1, arr2);
    // for (int i = 0; i < res.length; i++) {
    // System.out.print(res[i] + " ");
    // }

    System.out.println(count);
  }
}

import java.util.*;

public class Strings {
  public static void printLetter(String str) {
    for (int i = 0; i < str.length(); i++) {
      System.out.print(str.charAt(i) + " ");
    }
    System.out.println();
  }

  public static boolean isPalindrome(String str) {
    for (int i = 0; i < str.length() / 2; i++) {
      int n = str.length();
      if (str.charAt(i) != str.charAt(n - i - 1)) {
        return false;
      }
    }
    return true;
  }

  public static float getShortestPath(String path) {
    int x = 0, y = 0;
    for (int i = 0; i < path.length(); i++) {
      char dir = path.charAt(i);
      // south
      if (dir == 'S') {
        y--;
      } // North
      else if (dir == 'N') {
        y++;
      } // west
      else if (dir == 'W') {
        x--;
      } // east
      else {
        x++;
      }
    }
    int x2 = x * x;
    int y2 = y * y;
    return (float) Math.sqrt(x2 + y2);
  }

  public static String subString(String str, int si, int ei) {
    String subString = "";
    for (int i = si; i < ei; i++) {
      subString += str.charAt(i);
    }
    return subString;
  }

  public static String toUppercase(String str) {
    StringBuilder sb = new StringBuilder("");
    char ch = Character.toUpperCase(str.charAt(0));
    sb.append(ch);
    for (int i = 1; i < str.length(); i++) {
      if (str.charAt(i) == ' ' && i < str.length() - 1) {
        sb.append(str.charAt(i));
        i++;
        sb.append(Character.toUpperCase(str.charAt(i)));
      } else {
        sb.append(str.charAt(i));
      }
    }
    return sb.toString();
  }

  public static String compress(String str) {
    String newStr = "";
    for (int i = 0; i < str.length(); i++) {
      Integer count = 1;
      while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
        count++;
        i++;
      }
      newStr += str.charAt(i);
      if (count > 1) {
        newStr += count.toString();
      }
    }
    return newStr;
  }

  public static int findloweCaseVowelCount(String str) {
    int len = str.length();
    int vowelCount = 0;
    for (int i = 0; i < len; i++) {
      char ch = str.charAt(i);
      if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
        vowelCount++;
      }
    }
    return vowelCount;
  }

  public static void anagram(String str1, String str2) {
    str1 = str1.toLowerCase();
    str2 = str2.toLowerCase();

    // check string length
    if (str1.length() == str2.length()) {
      // convert char array
      char[] char1 = str1.toCharArray();
      char[] char2 = str2.toCharArray();
      // sort the char array
      Arrays.sort(char1);
      Arrays.sort(char2);
      boolean result = Arrays.equals(char1, char2);
      if (result) {
        System.out.println(str1 + " and " + str2 + " are anagrams of each other.");
      } else {
        System.out.println(str1 + " and " + str2 + " are not anagrams of each other.");
      }
    } else {
      System.out.println(str1 + " and " + str2 + " are not anagrams of each other.");
    }
  }

  public static void main(String[] args) {
    String str1 = "race";
    String str2 = "care";
    anagram(str1, str2);
    // Scanner sc = new Scanner(System.in);
    // String str = sc.next();
    // System.out.println(findloweCaseVowelCount(str));

    // String str = "aaabbcccdd";
    // System.out.println(compress(str));

    // String str = "hi, i am harsh";
    // System.out.println(toUppercase(str));

    // Use of StringBuilder: to avoid immutability
    // StringBuilder sb = new StringBuilder("");
    // for (char ch = 'a'; ch <= 'z'; ch++) {
    // sb.append(ch);
    // }
    // System.out.println(sb);
    // System.out.println(sb.length());

    // String fruits[] = { "apple", "mango", "banana" };
    // String largest = fruits[0];
    // for (int i = 0; i < fruits.length; i++) {
    // if (largest.compareTo(fruits[i]) < 0) {
    // largest = fruits[i];
    // }
    // }
    // System.out.println(largest);
    // String str = "HelloWorld";
    // System.out.println(str.substring(0, 5));
    // System.out.println(subString(str, 0, 5));

    // String s1 = "Harsh";
    // String s1Intern = s1.intern();(intern method)
    // String s2 = "Harsh";
    // String s3 = new String("Harsh");
    // String s3Intern = s3.intern();

    // if (s1Intern == s3Intern) {
    // System.out.println("Equal");
    // } else {
    // System.out.println("not equal");
    // }

    // if (s1 == s2) {
    // System.out.println("Equal");
    // } else {
    // System.out.println("Not equal");
    // }

    // if (s1 == s3) {
    // System.out.println("Equal");
    // } else {
    // System.out.println("Not equal");
    // }

    // if (s1.equals(s3)) {
    // System.out.println("Equal");
    // } else {
    // System.out.println("Not equal");
    // }

    // String path = "WNEENESENNN";
    // System.out.println(getShortestPath(path));

    // String str = "noon";// racecar , madam
    // System.out.println(isPalindrome(str));
    // Scanner sc = new Scanner(System.in);

    // String firstName = "Harsh";
    // String lastName = "Dhimmar";
    // String fullName = firstName + " " + lastName;

    // printLetter(fullName);
    // System.out.println("Hello, My name is " + fullName);
    // String name;
    // // name = sc.next();//take one word
    // name = sc.nextLine();// take whole line
    // System.out.println(name.length());
    // System.out.println("My name is " + name);

    // char ch[] = { 'a', 'b', 'c', 'd' };
    // String str = "abcd";
    // String str1 = new String("xyz");
    // System.out.println(ch);
    // System.out.println(str);
    // System.out.println(str1);
  }
}

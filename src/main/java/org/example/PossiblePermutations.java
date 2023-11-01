package org.example;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class PossiblePermutations {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter text");
    String text = sc.nextLine();
    printPermutn(text, "");
    sc.close();
  }

  static void printPermutn(String str, String ans) {

    // If string is empty
    if (str.length() == 0) {
      System.out.print(ans + " ");
      return;
    }

    for (int i = 0; i < str.length(); i++) {

      // ith character of str
      char ch = str.charAt(i);

      // Rest of the string after excluding
      // the ith character
      String ros = str.substring(0, i) +
          str.substring(i + 1);

      // Recursive call
      printPermutn(ros, ans + ch);
    }
  }

}

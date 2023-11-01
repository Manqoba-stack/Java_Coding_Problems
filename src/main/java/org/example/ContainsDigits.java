package org.example;

import java.util.Arrays;
import java.util.List;

import java.util.Scanner;

public class ContainsDigits {
  public static void parse(String[] args) {

    System.out.println("Provide a piece of text: ");
    Scanner sc = new Scanner(System.in);

    String words = sc.nextLine();
    sc.close();
    boolean containsNum = false;
    for (char r : words.toCharArray()) {
      if (isNumber(r)) {
        containsNum = true;
        break;
      }
    }
    if (containsNum) {
      System.out.println("text contains a digit");
    } else {
      System.out.println("text does not contain a digit");
    }

  }

  private static boolean isNumber(int character) {
    // List<Integer> numbers = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
    // if (numbers.contains(Character.valueOf(character))) {
    // System.out.println(character);
    char min = '0';
    char max = '9';
    if (character >= min && character <= max) {
      return true;
    }
    return false;
  }
}

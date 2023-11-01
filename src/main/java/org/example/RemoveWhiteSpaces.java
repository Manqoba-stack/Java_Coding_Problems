package org.example;

import java.util.Scanner;

public class RemoveWhiteSpaces {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a piece of text ");

    char[] strChars = sc.nextLine().toCharArray();
    sc.close();
    StringBuilder b = new StringBuilder();
    for (char c : strChars) {
      if (c != ' ') {
        b.append(c);
      }
    }
    System.out.println("here's your text " + b);
  }
}

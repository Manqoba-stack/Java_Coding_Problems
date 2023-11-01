package org.example;

import java.util.Scanner;

public class CountCharacter {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a piece of text ");
    char[] text = sc.nextLine().toCharArray();
    System.out.println("Which character do you wish to count?");

    char answer = sc.nextLine().charAt(0);
    int count = 0;
    for (char c : text) {
      if (c == answer) {
        count++;
      }
    }
    System.out.println(answer + " is repeated " + count + " times");
    sc.close();
  }
}

package org.example;

import java.util.List;
import java.util.LinkedList;

import java.util.Scanner;
import java.util.stream.Stream;

public class Palindrome {
  public static void main(String[] args) {

    System.out.println("Enter a palindrome:");
    Scanner sc = new Scanner(System.in);
    String text = sc.nextLine();

    LinkedList<Character> toList= new LinkedList<>();
    for (char ch : text.toCharArray()) {
      toList.add(ch);

    }
//    System.out.println(toList);
    System.out.println(isPalindrome(toList) ? "is palindrome " : "not a palindrome");

  }

  public static boolean isPalindrome(LinkedList<Character> text ) {

    char before = text.remove(0);
    char after = text.remove(text.size()-1);
    if (before == after) {
      System.out.println("size "+text.size());
        return text.size() <= 1 || isPalindrome(text);
      } else {
        return false;
      }

    }



}

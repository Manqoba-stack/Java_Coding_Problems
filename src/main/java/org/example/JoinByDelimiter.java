package org.example;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class JoinByDelimiter {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter text followed by delimiter");
    String[] text = sc.nextLine().split(" ");
    StringBuilder b = new StringBuilder();
    List<String> words = Arrays.asList(text);
    Iterator<String> wordsIterator = words.iterator();
    System.out.println("Enter the delimiter ");
    char delimiter = sc.nextLine().charAt(0);
    while (wordsIterator.hasNext()) {
      b.append(wordsIterator.next() + delimiter);
    }
    b.deleteCharAt(b.lastIndexOf("" + delimiter));

    System.out.println(b);
    sc.close();
  }
}

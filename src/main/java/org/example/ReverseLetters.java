package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.*;

public class ReverseLetters {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String[] words = sc.nextLine().split(" ");
    sc.close();
    List<String> stringList = Arrays.asList(words);
    // System.out.println(stringList.toString());
    // stringList.stream().collect(Collectors.groupingBy(Function.identity(),
    // Collectors.counting())).entrySet()
    // .forEach(System.out::println);
    stringList.stream().forEachOrdered((word) -> {
      System.out.println(word + " reversed is " + reverse(word));
    });
  }

  private static String reverse(String word) {
    String newWord = "";

    for (int i = word.length() - 1; i >= 0; i--) {
      newWord += word.charAt(i);
    }
    return newWord;
  }
}

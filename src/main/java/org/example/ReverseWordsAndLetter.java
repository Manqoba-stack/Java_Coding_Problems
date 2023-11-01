package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ReverseWordsAndLetter {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("enter a sentence");
    String[] words = sc.nextLine().split(" ");

    List<String> listWords = Arrays.asList(words);
    Collections.reverse(listWords);
    List<String> reversedSentence = new ArrayList<>();
    listWords.stream().forEach((word) -> {
      reversedSentence.add(reverse(word));
    });
    reversedSentence.forEach((word) -> {
      System.out.print(word + " ");
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

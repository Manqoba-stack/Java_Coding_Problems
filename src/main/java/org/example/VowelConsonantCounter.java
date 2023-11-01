package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class VowelConsonantCounter {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a piece of text");
    char[] words = sc.nextLine().toCharArray();
    sc.close();
    // Arrays.stream(words).forEach((letter) -> {
    // System.out.println(letter);
    // });
    List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');

    int consonant = 0;
    int vowel = 0;
    for (char c : words) {
      System.out.println(c);
      if (vowels.contains(c)) {
        vowel++;
      } else if (!vowels.contains(c) && c >= 97 && c <= 122) {
        consonant++;
      }

    }
    System.out.println("number of vowels in text " + vowel);
    System.out.println("number of consonants in text " + consonant);

  }
}

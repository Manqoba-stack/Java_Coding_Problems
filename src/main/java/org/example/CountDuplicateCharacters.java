package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountDuplicateCharacters {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter any word or sentence to get number of duplicate letters in it");

    String words = sc.nextLine();

    Map<Character, Integer> frequentLetter = new HashMap<>();
    sc.close();

    for (int i = 0; i < words.length(); i++) {
      char ch = words.charAt(i);

      if (ch == ' ') {
        continue;
      }
      frequentLetter.compute(ch, (k, v) -> (v == null) ? 1 : ++v);
    }
    for (Map.Entry<Character, Integer> c : frequentLetter.entrySet()) {

      if (c.getValue() > 1) {

        System.out.println(c.getKey() + " " + c.getValue());
      }
    }
  }

}

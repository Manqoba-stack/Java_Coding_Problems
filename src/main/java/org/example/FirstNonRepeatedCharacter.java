package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.Iterator;

public class FirstNonRepeatedCharacter {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Provide word or sentence ");

    String word = sc.nextLine();
    sc.close();
    Map<Character, Integer> repeatingChar = new LinkedHashMap<>();

    List<Character> answer = new ArrayList<>();
    for (int i = 0; i < word.length(); i++) {
      char ch = word.charAt(i);
      if (ch != ' ') {

        repeatingChar.compute(ch, (k, v) -> (v == null) ? 1 : ++v);
      }

    }

    repeatingChar.forEach((key, value) -> {
      if (value == 1) {
        answer.add(key);

      }
    });
    System.out.println("first non-repeating character: " + answer.get(0));

  }
}

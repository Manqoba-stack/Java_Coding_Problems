package org.example;

import java.util.Scanner;

public class ConvertTo {
  public static void main(String[] args) {
    System.out.println("What number do you want to convert? ");

    Scanner sc = new Scanner(System.in);
    String answer = sc.nextLine();

    System.out.println("converted to int   : " + Integer.valueOf(answer));
    System.out.println("converted to double: " + Double.valueOf(answer));
    System.out.println("converted to long  : " + Long.valueOf(answer));
    System.out.println("converted to float : " + Float.valueOf(answer));
    sc.close();
  }
}

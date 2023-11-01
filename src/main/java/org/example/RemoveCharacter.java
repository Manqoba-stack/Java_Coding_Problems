package org.example;

import java.util.Scanner;

public class RemoveCharacter {
    public static void main(String []args)
    {
        System.out.println("Enter text");
        Scanner sc=new Scanner(System.in);

        String text=sc.nextLine();
        System.out.println("Enter character to remove");
        String character= sc.nextLine();
        StringBuilder builder=new StringBuilder();
        for(char ch: text.toCharArray())
        {
            if(ch!=character.charAt(0))
            {
                builder.append(ch);

            }
        }
        System.out.println(builder);
    }
}

package org.example;

import java.util.*;
import java.util.stream.Stream;

public class RemoveDuplicate {
    public static void main(String[] args)
    {
        System.out.print("Enter text and duplicate letter will be removed");
        Scanner sc=new Scanner(System.in);
        String text=sc.nextLine();
       System.out.println(remove_Duplicates(text));
    }
    public static String remove_Duplicates(String text)
    {
        LinkedList<String> list = new LinkedList<>();
        for(char ch:text.toCharArray())
        {
            list.add(String.valueOf(ch));

        }
        Set<String>s=new HashSet<String>(list);

        return String.join("",s);

    }

//       List<String>li=new LinkedList<>();
//        for(char ch:text.toCharArray())
//        {
//
//
//        }
//        List<String> textlst = new LinkedList<>(Arrays.asList(text));
//
//        System.out.println(textlst);
//        }

    }



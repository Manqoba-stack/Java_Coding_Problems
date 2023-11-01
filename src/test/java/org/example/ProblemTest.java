package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;

public class ProblemTest {

    @Test
    public void test_Palindrome()
    {
        LinkedList<Character>list=new LinkedList<>(Arrays.asList('a','b','b','a'));
        Assertions.assertTrue(Palindrome.isPalindrome(list));
    }


}

package com.dstanton;

public class Main {

    public static void main(String[] args) {

//        System.out.printf("reversedNumber(1234) returns %d%n", NumberPalindrome.reverseNumber(1234));
//        System.out.printf("reversedNumber(-1234) returns %d%n", NumberPalindrome.reverseNumber(-1234));
        testIsPalindrome(111);
        testIsPalindrome(-111);
        testIsPalindrome(123);
        testIsPalindrome(-123);
        testIsPalindrome(123321);
        testIsPalindrome(-123321);
        testIsPalindrome(100);
        testIsPalindrome(1);

    }

    private static void testIsPalindrome(int number){

        System.out.printf("isPalindrome(%d) returned %b%n",
                number, NumberPalindrome.isPalindrome(number));

    }
}

package com.dstanton;

public class NumberPalindrome {
    public static boolean isPalindrome(int number){
        int leastSignificantDigit = 0;
        int reversed = 0;

        if (number < 0) number *= -1;

        int workNumber = number;


        while (workNumber > 0){
            leastSignificantDigit = workNumber % 10;
            reversed *= 10;
            reversed += leastSignificantDigit;
            workNumber /= 10;
        }

        if (number == reversed){
            return true;
        } else {
            return false;
        }
    }



}

package com.assignment;

import java.util.*;

public class RomanToInteger {

    public static int romanToInt(String s) {
        Map<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            int currentValue = romanValues.get(currentChar);

            if (i + 1 < s.length() && currentValue < romanValues.get(s.charAt(i + 1))) {
                result -= currentValue;
            } else {
                result += currentValue;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Roman numeral: ");
        String romanNumeral = sc.nextLine().toUpperCase();
        
        
        int integerValue = romanToInt(romanNumeral);
        System.out.println("The integer value of the Roman numeral is: " + integerValue);
        
        
    }
}

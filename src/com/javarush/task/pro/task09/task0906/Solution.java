package com.javarush.task.pro.task09.task0906;

import java.util.regex.Pattern;

/* 
Двоичный конвертер
*/

public class Solution {
    public static void main(String[] args) {
        int decimalNumber = Integer.MAX_VALUE;
        System.out.println("Десятичное число " + decimalNumber + " равно двоичному числу " + toBinary(decimalNumber));
        String binaryNumber = "1111111111111111111111111111111";
        System.out.println("Двоичное число " + binaryNumber + " равно десятичному числу " + toDecimal(binaryNumber));
    }

    public static String toBinary(int decimalNumber) {
        //напишите тут ваш код
        if (decimalNumber <= 0) {
            return "";
        }

        String binaryNumber = "";
        while (decimalNumber > 0) {
            int reminder = decimalNumber % 2;
            binaryNumber = reminder + binaryNumber;
            decimalNumber /= 2;
        }
        return binaryNumber;
    }

    public static int toDecimal(String binaryNumber) {
        //напишите тут ваш код
        if (binaryNumber == null || binaryNumber.isEmpty()) {
            return 0;
        }

        int decimalNumber = 0;
        int length = binaryNumber.length();
        for (int i = 0; i < length; i++) {
            char binaryDigit = binaryNumber.charAt(length - i - 1);
            if (binaryDigit == '1') {
                decimalNumber += Math.pow(2, i);
            }
        }
        return decimalNumber;
    }
}

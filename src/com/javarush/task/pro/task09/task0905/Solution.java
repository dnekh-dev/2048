package com.javarush.task.pro.task09.task0905;

import java.util.regex.Pattern;

/* 
Восьмеричный конвертер
*/

public class Solution {
    public static void main(String[] args) {
        int decimalNumber = 21;
        System.out.println("Десятичное число " + decimalNumber + " равно восьмеричному числу " + toOctal(decimalNumber));
        int octalNumber = 25;
        System.out.println("Восьмеричное число " + octalNumber + " равно десятичному числу " + toDecimal(octalNumber));
    }

    public static int toOctal(int decimalNumber) {
        //напишите тут ваш код
        if (decimalNumber == 0) {
            return 0;
        }

        int octalNumber = 0;
        int placeValue = 1; // This keeps track of the place value (units, tens, hundreds, etc.)

        while (decimalNumber > 0) {
            int remainder = decimalNumber % 8; // Find remainder when divided by 8
            octalNumber += remainder * placeValue; // Add the remainder to the correct place value
            decimalNumber /= 8; // Reduce the decimal number by dividing it by 8
            placeValue *= 10; // Increase the place value by a factor of 10
        }

        return octalNumber;
    }

    public static int toDecimal(int octalNumber) {
        //напишите тут ваш код
        int decimalNumber = 0;
        int placeValue = 1; // This keeps track of the place value (units, tens, hundreds, etc.)

        while (octalNumber > 0) {
            int digit = octalNumber % 10; // Extract the last digit of the octal number
            decimalNumber += digit * placeValue; // Convert it to decimal and add to the result
            octalNumber /= 10; // Reduce the octal number by removing the last digit
            placeValue *= 8; // Increase the place value by a factor of 8
        }
        return decimalNumber;
    }
}

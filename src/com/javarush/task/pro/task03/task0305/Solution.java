package com.javarush.task.pro.task03.task0305;

import java.util.Scanner;

/* 
Три числа
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();
        int thirdNumber = sc.nextInt();
        if (firstNumber == secondNumber && secondNumber == thirdNumber) {
            System.out.println(firstNumber + " " + secondNumber + " " + thirdNumber);
        } else if (firstNumber == thirdNumber) {
            System.out.println(firstNumber + " " + thirdNumber);
        } else if (secondNumber == thirdNumber) {
            System.out.println(secondNumber + " " + thirdNumber);
        } else if (firstNumber == secondNumber) {
            System.out.println(firstNumber + " " + secondNumber);
        }
    }
}

package com.javarush.task.pro.task05.task0505;

import java.util.Arrays;
import java.util.Scanner;

/* 
Reverse
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        int[] numbers;
        int n = sc.nextInt();
        if (n > 0) {
            int size = n;
            numbers = new int[size];
            int i = 0;
            while (n > 0) {
                int num = sc.nextInt();
                numbers[i] = num;
                i++;
                n--;
            }
            if (size % 2 == 0) {
                for (int j = numbers.length - 1; j >= 0; j--) {
                    System.out.println(numbers[j]);
                }
            } else {
                for (int j = 0; j < numbers.length; j++) {
                    System.out.println(numbers[j]);
                }

            }
        }
    }
}

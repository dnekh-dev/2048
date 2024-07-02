package com.javarush.task.pro.task05.task0507;

import java.util.Arrays;
import java.util.Scanner;

/* 
Максимальное из N чисел
*/

public class Solution {
    public static int[] array;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num > 0) {
            array = new int[num];
            for (int i = 0; i < array.length; i++) {
                array[i] = sc.nextInt();
            }
            int maxValue = Integer.MIN_VALUE;
            for (int i = 0; i < array.length; i++) {
                if (array[i] > maxValue) {
                    maxValue = array[i];
                }
            }
            System.out.println(maxValue);
        }
    }
}

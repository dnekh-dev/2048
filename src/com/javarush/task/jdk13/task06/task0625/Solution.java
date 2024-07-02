package com.javarush.task.jdk13.task06.task0625;

import java.util.Scanner;

/* 
Минимальная сумма
*/

public class Solution {
    public static int[][] array = new int[3][3];

    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        for (int h = 0; h < array.length; h++) {
            for (int l = 0; l < array[h].length; l++) {
                array[h][l] = sc.nextInt();
            }
        }

        int sumOfHeight = 0;
        int sumOfLength = 0;
        for (int h = 0; h < array.length; h++) {
            for (int l = 0; l < array[h].length; l++) {
                if (l == 0) {
                    sumOfHeight += array[h][l];
                }
                if (h == 0) {
                    sumOfLength += array[h][l];
                }
            }
        }
        System.out.println(sumOfHeight);
        System.out.println(sumOfLength);
    }
}

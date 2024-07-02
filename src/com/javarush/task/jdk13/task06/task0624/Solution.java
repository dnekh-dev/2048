package com.javarush.task.jdk13.task06.task0624;

import java.util.Scanner;

/* 
Максимальный элемент
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

        int max = Integer.MIN_VALUE;
        for (int h = 0; h < array.length; h++) {
            for (int l = 0; l < array[h].length; l++) {
                if (max < array[h][l]) {
                    max = array[h][l];
                }
            }
        }
        System.out.println(max);
    }
}

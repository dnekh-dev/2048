package com.javarush.task.pro.task05.task0511;

import java.util.Scanner;

/* 
Создаем двумерный массив
*/

public class Solution {
    public static int[][] multiArray;

    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        multiArray = new int[height][];
        for (int i = 0; i < height; i++) {
            multiArray[i] = new int[sc.nextInt()];
        }

//        for (int h = 0; h < multiArray.length; h++) {
//            for (int l = 0; l < multiArray[h].length; l++) {
//                System.out.print(multiArray[h][l] + " ");
//            }
//            System.out.println();
//        }
    }
}

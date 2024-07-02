package com.javarush.task.jdk13.task06.task0627;

import java.util.Scanner;

/* 
Вот это переворот!
*/

public class Solution {
    public static int[][] array = new int[3][3];

    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);

        //fill the array
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        //flipping the array around main diagonal
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                //temporary variable for helping to shift value between arrays cell
                int buffer = 0;
                if (i > j) {
                    buffer = array[i][j];
                    array[i][j] = array[j][i];
                    array[j][i] = buffer;
                }
            }
        }

        //output on console
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}

package com.javarush.task.jdk13.task06.task0632;

import java.util.Scanner;

/* 
Пирамида
*/

public class Solution {
    public static char[][] array;

    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);

        int height = sc.nextInt();
        array = new char[height][];

        //calculate size of inner arrays
        for (int i = 0; i < array.length; i++) {
            array[i] = new char[height * 2 - 1];
        }

        //fill inner arrays with whitespace characters
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = ' ';
            }
        }

        //add logic for drawing a pyramid
        for (int i = array.length - 1, k = 0; i >= 0; i--, k++) {
            for (int j = 0 + k; j < array[i].length - k; j++) {
                array[i][j] = '#';
            }
        }

        //output the result on console
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}

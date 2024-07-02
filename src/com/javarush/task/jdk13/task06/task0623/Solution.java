package com.javarush.task.jdk13.task06.task0623;

/* 
Знакомство с двумерным массивом
*/

public class Solution {
    public static int[][] array;//напишите тут ваш код

    public static void main(String[] args) {
        //напишите тут ваш код
        array = new int[2][3];
        for (int h = 0; h < array.length; h++) {
            for (int l = 0; l < array[h].length; l++) {
                array[h][l] = (int) ((Math.random() + 1) * 10);
                System.out.println(array[h][l]);
            }
        }
    }
}

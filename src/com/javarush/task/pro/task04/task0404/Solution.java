package com.javarush.task.pro.task04.task0404;

/* 
Заполненный прямоугольник
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код

        int h = 0;
        int l = 0;
        while (h < 5) {
            while (l < 10) {
                if (l == 9) {
                    System.out.println("Q");
                } else {
                    System.out.print("Q");
                }
                l++;
            }
            l = 0;
            h++;
        }
    }
}
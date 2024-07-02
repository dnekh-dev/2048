package com.javarush.task.pro.task04.task0405;

/* 
Незаполненный прямоугольник
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код

        int h = 0;
        int otterL = 0;
        int innerL = 0;
        while (h < 10) {
            while (otterL < 20) {
                if (h == 0 || h == 9) {
                    System.out.print("Б");
                } else {
                    while (innerL < 20) {
                        if (innerL > 0 && innerL < 19) {
                            System.out.print(" ");
                        } else {
                            System.out.print("Б");
                        }
                        innerL++;
                    }
                }
                otterL++;
            }
            System.out.println();
            innerL = 0;
            otterL = 0;
            h++;
        }
    }
}
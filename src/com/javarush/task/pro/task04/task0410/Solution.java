package com.javarush.task.pro.task04.task0410;

import java.util.Scanner;

/*
Второе минимальное число из введенных
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);

        int fMin = Integer.MAX_VALUE;
        int sMin = Integer.MAX_VALUE;
        int count = 0;

        while(sc.hasNextInt()) {
            int input = sc.nextInt();
            count++;

            if (input < fMin) {
                sMin = fMin;
                fMin = input;
            } else if (input < sMin && input != fMin) {
                sMin = input;
            }
        }

        if (count >= 2) {
                 System.out.println(sMin);
                }
    }
}
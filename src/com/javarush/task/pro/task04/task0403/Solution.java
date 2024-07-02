package com.javarush.task.pro.task04.task0403;

import java.util.Scanner;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        String input = "";
        int sum = 0;
        while (true) {
            input = sc.nextLine();
            if (input.equals("ENTER")) {
                break;
            }
            sum += Integer.parseInt(input);
        }
        System.out.println(sum);
    }
}
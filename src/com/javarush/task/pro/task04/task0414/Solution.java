package com.javarush.task.pro.task04.task0414;

import java.util.Scanner;

/* 
Хорошего не бывает много
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int number = Integer.parseInt(sc.nextLine());
        do {
            System.out.println(str);
            if (number <= 0 || number >= 5) {
                break;
            }
            number--;
        } while (number > 0);
    }
}
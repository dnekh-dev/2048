package com.javarush.task.pro.task03.task0314;

import java.util.Scanner;

/* 
Сломанная клавиатура
*/

public class Solution {
    public static String secret = "AmIGo";

    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        if (secret.equalsIgnoreCase(input)) {
            System.out.println("доступ разрешен");
        } else {
            System.out.println("доступ запрещен");
        }
        //напишите тут ваш код
    }
}

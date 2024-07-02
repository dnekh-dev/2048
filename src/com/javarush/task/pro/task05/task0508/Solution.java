package com.javarush.task.pro.task05.task0508;

import java.util.Scanner;

/*
Удаляем одинаковые строки
*/

public class Solution {
    public static String[] strings;

    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        strings = new String[6];

        for (int i = 0; i < strings.length; i++) {
            strings[i] = sc.nextLine();
        }

        // Создаем массив для отслеживания повторяющихся элементов
        boolean[] duplicates = new boolean[strings.length];

        // Отмечаем все повторяющиеся элементы
        for (int i = 0; i < strings.length; i++) {
            if (strings[i] == null) {
                continue;
            }
            for (int j = i + 1; j < strings.length; j++) {
                if (strings[j] != null && strings[i].equals(strings[j])) {
                    duplicates[i] = true;
                    duplicates[j] = true;
                }
            }
        }

        // Заменяем все отмеченные элементы на null
        for (int i = 0; i < strings.length; i++) {
            if (duplicates[i]) {
                strings[i] = null;
            }
        }

        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }
    }
}
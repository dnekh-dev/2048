package com.javarush.task.pro.task05.task0512;

/* 
Создаем мультимассив
*/

public class Solution {

    public static int[][][] multiArray = new int[][][]{{{4, 8, 15}, {16}}, {{23, 42}, {}}, {{1}, {2}, {3}, {4, 5}}};

    public static void main(String[] args) {
        //напишите тут ваш код
        for (int h = 0; h < multiArray.length; h++) {
            for (int l = 0; l < multiArray[h].length; l++) {
                for (int d = 0; d < multiArray[h][l].length; d++) {
                    System.out.print(multiArray[h][l][d] + " ");
                }
            }
        }
    }
}

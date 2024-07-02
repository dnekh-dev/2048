package com.javarush.task.pro.task06.task0606;

/* 
Универсальный солдат
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static void universalMethod(){
        System.out.println("No param");
    }

    //напишите тут ваш код
    public static void universalMethod(String param){
        System.out.println("String param " + param);
    }

    public static void universalMethod(char param){
        System.out.println("Character param " + param);
    }

    public static void universalMethod(byte param){
        System.out.println("Byte param " + param);
    }

    public static void universalMethod(short param){
        System.out.println("Short param " + param);
    }

    public static void universalMethod(int param){
        System.out.println("Integer param " + param);
    }

    public static void universalMethod(Long param){
        System.out.println("Long param " + param);
    }

    public static void universalMethod(float param){
        System.out.println("Float param " + param);
    }

    public static void universalMethod(Double param){
        System.out.println("Double param " + param);
    }

    public static void universalMethod(Boolean param){
        System.out.println("Boolean param " + param);
    }
}

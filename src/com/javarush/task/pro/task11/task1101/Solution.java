package com.javarush.task.pro.task11.task1101;

/* 
Солнечная система — наш дом
*/

public class Solution {

    public static void main(String[] args) {

        SolarSystem solarSystem = new SolarSystem();

        System.out.println("Человечество живет в Солнечной системе.");
        System.out.printf("Ее возраст около %d лет.\n", solarSystem.age);
        System.out.printf("В Солнечной системе %d известных планет.\n", solarSystem.planetsCount);
        System.out.printf("Как и большинство звездных систем, состоит из %d звезды.\n", solarSystem.starsCount);
        System.out.printf("Звезды по имени %s.\n", solarSystem.starName);
        System.out.printf("Расстояние к центру галактики составляет %d световых лет.\n", solarSystem.galacticCenterDistance);
        System.out.println("Каждый обитатель Солнечной системы должен знать эту информацию!");

    }
}

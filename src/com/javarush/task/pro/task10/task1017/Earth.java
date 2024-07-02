package com.javarush.task.pro.task10.task1017;

/* 
Создание материков
*/

public class Earth {
    public static void main(String[] args) {
        //напишите тут ваш код
        Africa africa = new Africa(30_370_000);
        Antarctica antarctica = new Antarctica(14_000_000);
        Australia australia = new Australia(8_600_000);
        Eurasia eurasia = new Eurasia(54_759_000);
        NorthAmerica northAmerica = new NorthAmerica(24_709_000);
        SouthAmerica southAmerica = new SouthAmerica(17_840_000);
    }
}

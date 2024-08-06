package com.javarush.task.pro.task03.task0311;

import java.util.Scanner;

/*
Высокая точность
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        Scanner console = new Scanner(System.in);
        double a = console.nextDouble();
        double b = console.nextDouble();

        if (Math.abs(b - a) < 0.000001) {
            System.out.println("числа равны");
            // напишите тут ваш код
        } else {
            System.out.println("числа не равны");
        }
    }
}

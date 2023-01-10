package com.javastart.lesson1;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {

        int a = 0; // Начальное значение диапазона - "от"
        int b = 100; // Конечное значение диапазона - "до"

        int secretNumber = a + (int) (Math.random() * b); // Генерация числа от 0 до 100
        System.out.println("Угадайте число от 1 до 100");
        Scanner scanner = new Scanner(System.in);
        int userNumber = scanner.nextInt();


        while (userNumber != secretNumber) {

            if (userNumber > secretNumber) {
                System.out.println("Введенное вами число больше того, что загадал компьютер");
                userNumber = scanner.nextInt();
                if (userNumber==secretNumber){
                    System.out.println("Вы угадали!");
                }
            } else if (userNumber < secretNumber){
                System.out.println("Введенное вами число меньше того, что загадал компьютер");
                userNumber = scanner.nextInt();
                if (userNumber==secretNumber){
                    System.out.println("Вы угадали!");
                }
            }
        }


    }
}

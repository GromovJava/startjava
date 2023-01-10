package com.javastart.lesson1;

public class Cycle {

    public static void main(String[] args) {

        for (int i = 0; i < 21; i++) {  //Выведите на консоль с помощью цикла for все числа от [0, 20]
            System.out.println(i);
        }

        int counter = 6;
        while (counter>-7) {             // Выведите на консоль с помощью цикла while все числа от [6, -6]
            System.out.println(counter);
            counter--;
        }

        int counter2 = 10;
        int summa = 0;
        do {                             //Выведите на консоль с помощью цикла do-while сумму всех нечетныхчисел от [10, 20]
           if (counter2 % 2 != 0) {
               int x = counter2;
               summa+=x;
               counter2++;
           } else {
               counter2++;
           }
        } while (counter2<21);
        System.out.println(summa);
    }

}

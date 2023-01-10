package com.javastart.lesson1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int counter = 0;
        while (counter<10) {
            System.out.println("Введите 2 числа");
            Scanner scanner = new Scanner(System.in);
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            System.out.println("1 - сложить \n" +
                    "2 - вычесть \n" +
                    "3 - умножить \n" +
                    "4 - разделить \n" +
                    "5 - остаток от деления ");

            int action = scanner.nextInt();

            if (action == 1){
                System.out.println(add(x,y));
            } else if (action == 2) {
                System.out.println(sub(x,y));
            } else if (action == 3) {
                System.out.println(mult(x,y));
            } else if (action == 4) {
                System.out.println(div(x,y));
            } else if (action == 5) {
                System.out.println(div2(x,y));
            }
            counter++;
        }


    }
    public static int add (int x, int y) {
        int sum = x + y;
        return sum;
    }

    public static int sub (int x, int y) {
        int sum = x - y;
        return sum;
    }

    public static int div (int x, int y) {
        int sum = x / y;
        return sum;
    }

    public static int mult (int x, int y) {
        int sum = x * y;
        return sum;
    }

    public static int div2 (int x, int y) {
        int sum = x % y;
        return sum;
    }

}

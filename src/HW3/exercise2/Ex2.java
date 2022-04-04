package HW3.exercise2;

import java.util.Arrays;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
        ex4();
        ex5();
        ex6();
    }

    //задание 1
    public static void ex1() {
        System.out.println("Задание 1");
        int x = 1;
        while (x < 100) {
            if (x % 2 != 0)
                System.out.println(x);
            x++;
        }
        System.out.println("------------");
    }

    //задание 2
    public static void ex2() {
        System.out.println("Задание 2");
        int x = 1;
        while (x < 100) {
            if (x % 3 == 0 || x % 5 == 0) {
                if (x % 3 == 0 && x % 5 == 0)
                    System.out.println(x + " - делится на 3 и на 5");
                else if (x % 3 == 0)
                    System.out.println(x + " - делится на 3");
                else if (x % 5 == 0)
                    System.out.println(x + " - делится на 5");

            }
            x++;
        }
        System.out.println("------------");
    }

    //задание 3
    public static void ex3() {
        System.out.println("Задание 3");
        System.out.println("Проверка, что сумма первого и второго числа, равна третьему");
        System.out.println("Введите первое число");
        Scanner scan = new Scanner(System.in);
        int numb1 = scan.nextInt();
        System.out.println("Введите второе число");
        int numb2 = scan.nextInt();
        System.out.println("Введите их сумму");
        int numb3 = scan.nextInt();
        if ((numb1 + numb2) == numb3)
            System.out.println("сумма двух чисел равна третьему");
        else
            System.out.println("сумма двух чисел не равна третьему");
        System.out.println("------------");
    }

    //задание 4
    public static void ex4() {
        System.out.println("Задание 4");
        System.out.println("Проверка, что первое число меньше второго, которое меньше третьего");
        System.out.println("Введите первое число");
        Scanner scan = new Scanner(System.in);
        int numb1 = scan.nextInt();
        System.out.println("Введите второе число");
        int numb2 = scan.nextInt();
        System.out.println("Введите третье");
        int numb3 = scan.nextInt();
        if (numb1 < numb2 && numb2 < numb3)
            System.out.println("true");
        else
            System.out.println("false");
        System.out.println("------------");
    }

    //задание 5
    public static void ex5() {
        System.out.println("Задание 5");
        int[] arr = new int[]{32, 2, 3, 3};
        System.out.println("Массив " + Arrays.toString(arr));
        if (arr[0] == 3 || arr[(arr.length - 1)] == 3)
            System.out.println("true");
        else
            System.out.println("false");
        System.out.println("------------");
    }

    //задание 6
    public static void ex6() {
        System.out.println("Задание 6");
        int[] arr = new int[]{32, 2, 2, 31};
        System.out.println("Массив " + Arrays.toString(arr));
        boolean result = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1 || arr[i] == 3)
                result = true;
        }
        System.out.println(result ? "В массиве есть 1 или 3" : "В массиве нет 1 или 3");


        System.out.println("------------");
    }
}

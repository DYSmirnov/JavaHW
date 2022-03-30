package HW1;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {

// задание 1
        System.out.println("Задание 1");
        System.out.println("Я");
        System.out.println("хорошо");
        System.out.println("знаю \nJava.");
        System.out.println("------------");


//задание 2
        System.out.println("Задание 2");
        int arg1 = 46;
        int arg2 = 10;
        double arg3 = 3;

        double res2 = (arg1 + arg2) * (arg2 / arg3);
        System.out.println(res2);


        int argum1 = 29;
        int argum2 = 4;
        int argum3 = -15;
        int result2 = argum1 * argum2 * argum3;
        System.out.println(result2);
        System.out.println("------------");


//задание 3
        System.out.println("Задание 3");
        int number = 10500;
        double res3 = (number * 1.0 / arg2) / arg2;
        System.out.println(res3);
        System.out.println("------------");


//задание 4
        System.out.println("Задание 4");
        double x = 3.6;
        double y = 4.1;
        double z = 5.9;
        double res4 = x * y * z;
        System.out.println(res4);
        System.out.println("------------");


//задание 5
        System.out.println("Задание 5");
        System.out.println("Введите первое число");
        Scanner scan = new Scanner(System.in);
        int numb1 = scan.nextInt();
        System.out.println("Введите второе число");
        int numb2 = scan.nextInt();
        System.out.println("Введите третье число");
        int numb3 = scan.nextInt();
        System.out.println(numb1);
        System.out.println(numb2);
        System.out.println(numb3);
        System.out.println("------------");


//задание 6
        System.out.println("Задание 6");
        System.out.println("Введите число для проверки");
        int numb = scan.nextInt();
        if (numb % 2 == 0 && numb < 101) {
            System.out.println("Четное");
        } else if (numb % 2 != 0) {
            System.out.println("Нечетное");
        } else {
            System.out.println("Выход за диапазон");
        }
        if (numb % 2 != 0) {
            System.out.println(numb);
        }
    }

    //System.out.println("------------");


}


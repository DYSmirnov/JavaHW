package HW2.Calculator1;

import java.util.Scanner;

public class forDouble {
    public static void main() {
        //сканируем ввод и выбираем тип действия
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число");
        double numb1 = scan.nextDouble();

        System.out.println("Введите второе число");
        double numb2 = scan.nextDouble();

        System.out.println("Введите тип действия " +
                " сложение - sum," +
                " вычитание - sub, " +
                " умножение - multi," +
                " деление - div.");
        Scanner scan1 = new Scanner(System.in);
        String actionType = scan1.nextLine();

        switch (actionType) {
            case ("sum"):
                sum(numb1, numb2);
                break;
            case ("sub"):
                sub(numb1, numb2);
                break;
            case ("multi"):
                multi(numb1, numb2);
                //break;
            case ("div"):
                div(numb1, numb2);
                break;

        }
    }


    public static void sum(double a, double b) {
        System.out.println(a + b);

    }

    public static void sub(double a, double b) {
        System.out.println(a - b);
    }

    public static void multi(double a, double b) {
        System.out.println(a * b);
    }

    public static void div(double a, double b) {
        System.out.println(a / b);
    }
}


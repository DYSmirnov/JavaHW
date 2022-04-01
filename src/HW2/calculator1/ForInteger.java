package HW2.calculator1;

import java.util.Scanner;

public class ForInteger {
    public static void main() {
        //сканируем ввод и выбираем тип действия
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число");
        int numb1 = scan.nextInt();

        System.out.println("Введите второе число");
        int numb2 = scan.nextInt();

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
            default:
                System.out.println("Что-то пошло не так");

        }
    }


    public static void sum(int a, int b) {
        System.out.println(a + b);

    }

    public static void sub(int a, int b) {
        System.out.println(a - b);
    }

    public static void multi(int a, int b) {
        System.out.println(a * b);
    }

    public static void div(int a, int b) {
        System.out.println(a * 1.0 / b);
    }
}

package HW6.ex4;

import java.util.Scanner;

public class Parent {
    private int dig;

    public int setDig() {
        System.out.println("Введите число");
        Scanner scan = new Scanner(System.in);
        int dig = scan.nextInt();
        return dig;
    }
}

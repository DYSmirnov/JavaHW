package HW2.Calculator1;

import java.util.Scanner;

public class MainCalc {


    public static void main(String[] args) {
        //=======считываем и выбираем тип данных
        System.out.println("Введите тип данных int, long, double:");
        Scanner scan = new Scanner(System.in);
        String numbType = scan.nextLine();

        switch (numbType) {
            case ("int"):
                forInteger.main();
                break;
            case ("long"):
                forLong.main();
                break;
            case ("double"):
                forDouble.main();
                break;
        }
    }

}

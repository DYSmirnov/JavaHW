package HW2.calculator1;

import java.util.Scanner;

public class MainCalc {


    public static void main(String[] args) {
        //=======считываем и выбираем тип данных
        System.out.println("Введите тип данных int, long, double:");
        Scanner scan = new Scanner(System.in);
        String numbType = scan.nextLine();

        switch (numbType) {
            case ("int"):
                ForInteger.main();
                break;
            case ("long"):
                ForLong.main();
                break;
            case ("double"):
                ForDouble.main();
                break;
            default:
                System.out.println("Что-то пошло не так");
        }
    }

}

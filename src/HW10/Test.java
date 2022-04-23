package HW10;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        File file1 = new File("src/HW10/files/exercise1.txt");
        File file2 = new File("src/HW10/files/output_ex2.txt");
        File file3 = new File("src/HW10/files/output_ex3.txt");
        String stringEx2 = "    @\t@@";


        System.out.println("===Задание 1===");
        Exercise.ex1(file1).forEach(System.out::println);

        System.out.println("===Задание 2===");
        Exercise.ex2(file2, stringEx2);

        System.out.println("===Задание 3===");
        Exercise.ex3(file1, file2, file3);

        System.out.println("===Задание 4===");
        Exercise.ex4(file3);
    }
}

package HW6.ex5;

import java.util.Scanner;

public class Parent {
    private int age;
    private String name;
    public Scanner scan = new Scanner(System.in);

    public void setAge() {
        System.out.println("Введите возраст");
        int age = scan.nextInt();
        setAge(age);
    }

    public void setName() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        System.out.println(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println(name);
    }
}

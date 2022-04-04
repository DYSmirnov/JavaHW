package HW3.exercise3.constructor;

public class Tree {
    private String name;
    private boolean alive;
    private int age;

    public Tree(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Tree(String name, boolean alive, int age) {
        this.name = name;
        this.alive = alive;
        this.age = age;
    }

    public Tree() {
        System.out.println("Пустой конструктор без параметров сработал");
    }

    public void treeInfo() {
        System.out.println("Дереву " + name + " " + age + " лет, оно " + (alive ? "живое" : "не живое"));
    }
}

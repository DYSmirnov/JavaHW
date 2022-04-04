package HW3.exercise3.constructor;

import java.util.Calendar;

public class House {
    private int floors;
    private int year;
    private String name;

    public House(int floors, int year, String name) {
        this.floors = floors;
        this.year = year;
        this.name = name;
    }

    public void getInfo() {
        System.out.println("House was built in " + year + " year.");
        System.out.println("House has " + floors + " floors.");
        System.out.println("House name " + name + ".");
    }

    public int age() {
        int yearNow = Calendar.getInstance().get(Calendar.YEAR);
        return yearNow - year;
    }

    public String ageInfo() {
        int yearNow = Calendar.getInstance().get(Calendar.YEAR);
        return "Дому " + name + " " + (yearNow - year) + " лет.";
    }
}

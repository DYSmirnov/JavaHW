package HW7;

public class Test {
    public static void main(String[] args) {
        Plane plane = new Plane("Yak", 5, 2.3, 3);
        plane.getInfo();

        Plane plane2 = new Plane("Il", 15);
        plane2.getInfo();
        plane2.setWeightWing(10, 11);
        plane2.getInfo();
    }
}

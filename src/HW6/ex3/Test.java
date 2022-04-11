package HW6.ex3;

public class Test {
    public static void main(String[] args) {

        Car car1 = new Car(10, "BMV", 'b', 160);
        Truck track1 = new Truck(100, "Iveco", 'w', 100, 6, 1000);
        car1.outPut();
        track1.outPut();
        track1.newWheels(4);
        track1.outPut();
        Car test = new Truck(100, "Iveco", 'w', 100, 6, 1000);
        test.outPut();


    }
}

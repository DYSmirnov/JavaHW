package HW6.ex3;

public class Truck extends Car {
    private int wheels;
    private int maxWeight;

    public void newWheels(int wheelsNew) {
        this.wheels = wheelsNew;
        System.out.println("Новое количество колес: " + wheels);
    }

    public Truck(int w, String m, char c, float s, int wheels, int maxWeight) {
        super(w, m, c, s);
        this.wheels = wheels;
        this.maxWeight = maxWeight;
    }

    @Override
    public void outPut() {
       super.outPut();
        System.out.println("Максисальный вес - " + maxWeight + " и у неё - " + wheels + " колеса");
    }

}

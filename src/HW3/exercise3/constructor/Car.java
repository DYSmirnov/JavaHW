package HW3.exercise3.constructor;

public class Car {
    private String color;
    private String name;
    private int weight;

    public Car(String color){
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Car(String color, int weight){
        this.color = color;
        this.weight = weight;
    }

    public Car(){
    }

    public void CarInfo(){
        System.out.println("Car name:" + name +
                " Color:" + color +
                " Weight:" + weight);
    }
}

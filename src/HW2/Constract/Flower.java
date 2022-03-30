package HW2.Constract;

public class Flower {
    String name;
    String color;
    double price;

    public Flower(){

    }


    public Flower(String name, String color, double price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return this.name + " " + this.color + " Price: " + this.price;
    }
}

package HW2.Constract;

public class mainConstr {
    public static void main(String[] args) {
        Flower tulip1 = new Flower("Tulip", "Red", 2);
        Flower tulip2 = new Flower();
        tulip2.setColor("Pink");
        tulip2.setName("Tulip");
        System.out.println(tulip1.toString());
        System.out.println(tulip2.toString());
    }
}

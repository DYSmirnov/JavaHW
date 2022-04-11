package HW7;

public class Plane {
    private String name;
    private int places;
    Wing wing = new Wing();

    public Plane() {
    }

    public Plane(String name, int places) {
        this.name = name;
        this.places = places;
    }

    public Plane(String name, int places, double leftWing, double rightWing) {
        this.name = name;
        this.places = places;
        setWeightWing(leftWing, rightWing);
    }

    public void setWeightWing(double leftWing, double rightWing) {
        wing.setWeightLeft(leftWing);
        wing.setWeightRight(rightWing);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPlaces() {
        return places;
    }

    public void setPlaces(int places) {
        this.places = places;
    }

    public void getInfo(){
        System.out.println("Plane name: " + name);
        System.out.println("aircraft capacity - " + places);
        System.out.println("weight of the left wing - " + wing.getWeightLeft());
        System.out.println("weight of the right wing - " + wing.getWeightRight());
    }


    class Wing {
        private double weightLeft;
        private double weightRight;

        public double getWeightLeft() {
            return weightLeft;
        }

        public void setWeightLeft(double weightLeft) {
            this.weightLeft = weightLeft;
        }

        public double getWeightRight() {
            return weightRight;
        }

        public void setWeightRight(double weightRight) {
            this.weightRight = weightRight;
        }

        public Wing(double weightLeft, double weightRight) {
            this.weightLeft = weightLeft;
            this.weightRight = weightRight;
        }

        public Wing(){};
    }
}

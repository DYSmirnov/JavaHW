package HW6.ex1_2;

public abstract class Human implements IBankTitle {
    private String firstName;
    private String lastName;

    public Human() {

    }

    public String getFirstName() {
        return firstName;
    }


    public String getLastName() {
        return lastName;
    }


    public Human(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public abstract void printInfo();
}

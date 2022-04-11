package HW6.ex1_2;

public class Employee extends Human {

    private String bankTitle;

    public Employee(String firstName, String lastName, String bankTitle) {
        super(firstName, lastName);
        this.bankTitle = bankTitle;
    }

    @Override
    public String getBankTitle() {
        return bankTitle;
    }


    @Override
    public void printInfo() {
        System.out.println(getClass().getSimpleName() + " " + getFirstName() + " " + this.getLastName() + " " + getClass().getSimpleName().toLowerCase()  + " " + getBankTitle());
    }
}

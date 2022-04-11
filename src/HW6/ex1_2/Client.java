package HW6.ex1_2;


public class Client extends Human {
    private String bankTitle;

    public Client() {
    }

    public Client(String firstName, String lastName, String bankTitle) {
        super(firstName, lastName);
        this.bankTitle = bankTitle;
    }

    @Override
    public String getBankTitle() {
        return bankTitle;
    }


    @Override
    public void printInfo() {
        System.out.println("Client info: " + getFirstName() + " " + this.getLastName() + " client " + getBankTitle());
    }
}

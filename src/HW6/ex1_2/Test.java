package HW6.ex1_2;

public class Test {
    public static void main(String[] args) {
        Client clientTest1 = new Client("Ivan", "Ivamov", "Sber");
//        Client clientTest2 = new Client("Petr", "Petrov", "VTB");
        Employee clientTest2 = new Employee("Petr", "Petrov", "VTB");
        System.out.println(clientTest1.getFirstName() + " " + clientTest1.getLastName()+ " " + clientTest1.getBankTitle());
        clientTest1.printInfo();
        clientTest2.printInfo();
    }


}

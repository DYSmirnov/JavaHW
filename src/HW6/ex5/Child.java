package HW6.ex5;

public class Child extends Parent {

    @Override
    public void setName() {
        System.out.println("Введите имя");
        String name = scan.nextLine();
        super.setName(name);
    }
}

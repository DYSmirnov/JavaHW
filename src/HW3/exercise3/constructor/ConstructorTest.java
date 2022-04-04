package HW3.exercise3.constructor;

public class ConstructorTest {
    public static void main(String[] args) {

        //проверка первого задания Study
        System.out.println("Задание 1");
        Study testStudy = new Study("Изучение Java - это просто!");
        System.out.println(testStudy.printCourse());
        System.out.println("------------");

        //проверка второго задания Car
        System.out.println("Задание 2");
        Car testCar1 = new Car("Red", 1000);
        testCar1.setName("BMW");
        Car testCar2 = new Car("Black");
        testCar1.CarInfo();
        testCar2.CarInfo();
        System.out.println("------------");

        //проверка третьего задания House
        System.out.println("Задание 3");
        House testHouse1 = new House(10, 2000, "New House");
        House testHouse2 = new House(24, 2015, "House House");
        testHouse1.getInfo();
        System.out.println("Дому House House " + testHouse2.age() + " лет.");
        System.out.println(testHouse1.ageInfo());
        System.out.println("------------");

        //проверка третьего задания Tree
        System.out.println("Задание 4");
        Tree tree1 = new Tree();
        Tree tree2 = new Tree("Дуб", 50);
        Tree tree3 = new Tree("Ель", true, 15);
        Tree tree4 = new Tree("Клен", false, 15);
        tree2.treeInfo();
        tree3.treeInfo();
        tree4.treeInfo();
        System.out.println("------------");
    }


}

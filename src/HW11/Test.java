package HW11;

public class Test {
    public static void main(String[] args) {


        System.out.println("===Задание 1===");
        for (int i = 0; i < 10; i++) {
            FirstThread th = new FirstThread();
            System.out.println(th.getName() + " - " + th.getState());
            th.start();
            try {
                th.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(th.getName() + " - " + th.getState());
        }

        System.out.println("===Задание 3===");
        Counter count = new Counter();
        for (int i = 0; i < 100; i++) {
            ThreadCounter counter = new ThreadCounter(count);
            counter.start();
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(count.getCount());


        System.out.println("===Задание 4===");
        ThreadName threadName2 = new ThreadName();
        Thread thread1 = new Thread(threadName2);
        Thread thread2 = new Thread(threadName2);
        thread1.start();
        thread2.start();

    }

}

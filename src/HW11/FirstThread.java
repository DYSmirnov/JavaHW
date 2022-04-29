package HW11;

public class FirstThread extends Thread {


    @Override
    public void run() {
        System.out.println();
        for (int i = 0; i < 101; i++) {
            System.out.println(Thread.currentThread().getName() + " - " + Thread.currentThread().getState() + " - " + i);
        }

    }
}



package HW11;

public class ThreadName implements Runnable {

    @Override
    public synchronized void run() {
        while (true) {
            notify();
            System.out.println(Thread.currentThread().getName());
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

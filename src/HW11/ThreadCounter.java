package HW11;

public class ThreadCounter extends Thread {
    private Counter counter;

    public ThreadCounter(Counter counter) {
        this.counter = counter;


    }
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}

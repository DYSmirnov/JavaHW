package HW11;

public class Name {
    public synchronized void name(){
        while (true){
            try {
                notify();
                System.out.println(Thread.currentThread().getName());
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

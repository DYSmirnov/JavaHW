package HW11;

public class ThreadName implements Runnable {
    Name flag = new Name();
    @Override
    public void run() {
       flag.name();
    }
}

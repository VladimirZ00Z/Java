package Task4;

public class PrintNameThread implements Runnable {
    private String name;
    private static final Object monitor = new Object();

    public PrintNameThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        try {
            while (true) {
                synchronized (monitor) {
                    monitor.notifyAll();
                    monitor.wait();
                    System.out.println("Имя потока: " + name);
                }

            }
        } catch (InterruptedException e) {
            System.out.println("PrintNameThread error");
        }
    }
}

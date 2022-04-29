public class NameThread extends Thread {
    @Override
    public void run() {
        synchronized (System.out) {
            int i = 0;
            while (i < 50) {
                i++;
                System.out.println("Name of thread: " + currentThread().getName());
                System.out.notify();
                try {
                    System.out.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
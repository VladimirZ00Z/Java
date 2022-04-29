package Task4;

public class TestPrintNameThread {
    public static void main(String[] args) {
        PrintNameThread thread1 = new PrintNameThread("tread1");
        PrintNameThread thread2 = new PrintNameThread("tread2");

        new Thread(thread1).start();
        new Thread(thread2).start();
    }
}

public class TestThread {
    public static void main(String[] args) {

        System.out.println("Задание 1,2");
        for (int i = 0; i < 10; i++) {
            HundredThread thread = new HundredThread();
            System.out.println(thread.getName() + ": " + thread.getState());
            thread.start();
            System.out.println(thread.getName() + ": " + thread.getState());
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(thread.getName() + ": " + thread.getState());

        }

        System.out.println("Задание 3");
        Counter counter = new Counter();
        for (int i = 0; i < 100; i++) {
            CountThread thread = new CountThread(counter);
            thread.start();
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("count = " + counter.getCount());

        System.out.println("Задание 4");
        NameThread thread1 = new NameThread();
        NameThread thread2 = new NameThread();
        thread1.start();
        thread2.start();

    }
}

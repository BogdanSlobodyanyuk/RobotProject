package src.com.ua.lesson32;

public class Main {
    public static void main(String[] args) {
        ThreadRunnable tr1 = new ThreadRunnable();
        Thread thread1 = new Thread(tr1);
        thread1.setName("thread-1");
        Thread thread2 = new Thread(tr1);
        thread2.setName("thread-2");
        thread1.start();
        thread2.start();


    }
}

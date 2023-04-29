package src.com.ua.lesson32;

public class ThreadRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i < 11; i++) {
            System.out.println("Thread: " + Thread.currentThread().getName() + "  Output: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

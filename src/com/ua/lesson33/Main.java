package src.com.ua.lesson33;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            try {
                while (true) {
                    int randomNumber = new Random().nextInt(1, 11);
                    System.out.println(randomNumber);
                    Thread.sleep(1000);
                    if (randomNumber == 5) {
//                        throw new InterruptedException();          -   There is another way to interrupt a thread
                        Thread.currentThread().interrupt();
                        Thread.sleep(0);
                    }
                }
            } catch (InterruptedException e) {
                System.out.println("We found number 5 and Thread was interrupted");
            }
        });

        t1.start();

    }
}

package src.com.ua.Lesson34;

import java.util.Random;
import java.util.concurrent.Callable;

public class RandomNumberCallable implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        Thread.sleep(new Random().nextInt(1000));
       return new Random().nextInt(1,50);
    }
}

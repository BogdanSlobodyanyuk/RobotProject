package src.com.ua.Lesson34;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {


        List<Callable<Integer>> callables = new ArrayList<>();
        Callable<Integer> callable = new RandomNumberCallable();

        ExecutorService executorService = Executors.newFixedThreadPool(10);

        for (int i = 0; i < 100; i++) {
            callables.add(callable);
        }

        List<Future<Integer>> futures = executorService.invokeAll(callables);
     //   Future<Integer> futures = executorService.submit(callable);


        for (Future<Integer> future : futures) {
            System.out.println(future.get());
        }

        executorService.shutdownNow();
    }
}

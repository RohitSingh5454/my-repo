package AbhinavSirLabWork.Multithreading.FutureAndCompFuture;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class WhyNotFuture {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(10);
        Future<List<Integer>> future1 = service.submit(() -> {
            System.out.println("Thread name "+Thread.currentThread().getName());
            delay(1);
            return Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        });
        Future<List<Integer>> future2 = service.submit(() -> {
            System.out.println("Thread name "+Thread.currentThread().getName());
            delay(1);
            return Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        });
        Future<List<Integer>> future3 = service.submit(() -> {
            System.out.println("Thread name "+Thread.currentThread().getName());
            delay(1);
            return Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        });
        List<Integer> list = future1.get();
        System.out.println(list);
    }
    private static void  delay(int min) {
        try {
            TimeUnit.MINUTES.sleep(min);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

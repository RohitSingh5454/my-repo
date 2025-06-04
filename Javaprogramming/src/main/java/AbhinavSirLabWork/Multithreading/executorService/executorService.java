package AbhinavSirLabWork.Multithreading.executorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class executorService {
    public static void main(String[] args) {
        ExecutorService executorService= Executors.newSingleThreadExecutor();
        executorService.execute(new Task1());
        executorService.execute(new Task2());
        executorService.shutdown();
    }
}

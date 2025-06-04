package AbhinavSirLabWork.Multithreading.callable;

import java.time.LocalDateTime;
import java.util.concurrent.*;

public class callableFutureEg {
    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {
        ExecutorService executorService= Executors.newFixedThreadPool(1);
        Future<String> future=executorService.submit(new Work("Demo-Task"));
        String completedThread=future.get(10, TimeUnit.SECONDS);
        System.out.println("Thread completed "+completedThread);
    }
}
class Work implements Callable<String>{
     String name;
     public Work(String name){
         this.name=name;
     }
    @Override
    public String call() throws Exception {
        System.out.println("Task["+name+"] executedOn"+ LocalDateTime.now().toString());
        return name;
    }
}

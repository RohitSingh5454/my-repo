package AbhinavSirLabWork.Multithreading.callable;

import java.util.concurrent.*;

public class Mycallable2 implements Callable<Long> {
    long number;
    @Override
    public Long call() throws Exception {
       return number*2;
    }
    public Mycallable2(){
        super();
    }
    public Mycallable2(long number){
        this.number=number;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Long input=20L;
        ExecutorService executorService= Executors.newSingleThreadExecutor();
        Callable<Long> callable=new Mycallable2(input);
        Future<Long> future=executorService.submit(callable);
        System.out.println(future.get());
    }
}

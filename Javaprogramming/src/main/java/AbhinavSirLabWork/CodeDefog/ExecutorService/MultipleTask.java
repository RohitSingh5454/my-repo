package AbhinavSirLabWork.CodeDefog.ExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultipleTask {
    public static void main(String[] args) {
        int core=Runtime.getRuntime().availableProcessors();
        ExecutorService executorService= Executors.newFixedThreadPool(core);
        ExecutorService executorService1=Executors.newCachedThreadPool();
        for (int i=0;i<10;i++){
            //Thread th=new Thread(new Thread1());
            //executorService.execute(new Thread1());
            executorService1.execute(new Thread1());
           // th.start();
        }
        System.out.println("Thread name "+Thread.currentThread().getName());
    }
}

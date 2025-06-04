package AbhinavSirLabWork.Multithreading.callable;

import com.google.common.util.concurrent.Futures;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.*;

public class MyCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
       Thread.sleep(1000);
       return Thread.currentThread().getName();
    }

    public static void main(String[] args) {
        ExecutorService executorService= Executors.newFixedThreadPool(20);
        List<Future<String>> futureList=new ArrayList<Future<String>>();
        Callable<String> callable=new MyCallable();
        for (int i=0;i<34;i++){
            Future<String> future= executorService.submit(callable);
            futureList.add(future);
        }
        for (Future<String> future:futureList){
            try {
                System.out.println(new Date()+" "+future.get());
            }
            catch (InterruptedException | ExecutionException ex){
                ex.printStackTrace();
            }
        }
        executorService.shutdown();
    }
}

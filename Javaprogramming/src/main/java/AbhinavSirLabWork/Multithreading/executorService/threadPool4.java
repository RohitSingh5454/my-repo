package AbhinavSirLabWork.Multithreading.executorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class threadPool4 {
    public static void main(String[] args) {
        ExecutorService service= Executors.newFixedThreadPool(10);
        for (int i=0;i<100;i++){
            service.execute(new Thread1());
        }
        try {
            Thread.sleep(10000);
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }
    }
}
class Thread1 implements Runnable{

    @Override
    public void run() {
        System.out.println("Thread name "+Thread.currentThread().getName());
    }
}

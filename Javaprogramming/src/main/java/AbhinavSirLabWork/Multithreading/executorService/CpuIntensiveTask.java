package AbhinavSirLabWork.Multithreading.executorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CpuIntensiveTask {
    public static void main(String[] args) {
       int core= Runtime.getRuntime().availableProcessors();
        System.out.println(core);
        ExecutorService service= Executors.newFixedThreadPool(core);
        // submit the task
        for (int i=0;i<20;i++){
            service.execute(new Thread2());
        }
    }
}
class Thread2 implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}

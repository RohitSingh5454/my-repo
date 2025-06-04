package AbhinavSirLabWork.Multithreading.executorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import static java.util.concurrent.TimeUnit.SECONDS;

public class scheduledExecutor {
    public static void main(String[] args) {
        ScheduledExecutorService service= Executors.newScheduledThreadPool(10);
        //for scheduling task
        service.schedule(new Thread4(),10, SECONDS);
        // task to run repeatedly after 10 sec
        service.scheduleAtFixedRate(new Thread4(),15,10,SECONDS);
        // task to run repeatedly 10 sec after previous task is complete
        service.scheduleWithFixedDelay(new Thread4(),15,10,SECONDS);
    }
}
class Thread4 implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}

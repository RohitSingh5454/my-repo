package AbhinavSirLabWork.Multithreading.executorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedthreadPool {
    public static void main(String[] args) {
        ExecutorService service= Executors.newCachedThreadPool();
        for (int i=0;i<70;i++){
            service.execute(new Thread3());
        }
    }
}
class Thread3 implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}

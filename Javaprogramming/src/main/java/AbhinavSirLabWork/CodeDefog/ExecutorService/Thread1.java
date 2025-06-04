package AbhinavSirLabWork.CodeDefog.ExecutorService;

public class Thread1 implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}

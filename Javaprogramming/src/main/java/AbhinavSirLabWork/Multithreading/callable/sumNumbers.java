package AbhinavSirLabWork.Multithreading.callable;

import java.util.concurrent.*;

/*public class sumNumbers implements Callable<Integer> {
    int number;
    int sum=0;
    sumNumbers(int num){
        this.number=num;
    }
    @Override
    public Integer call() throws Exception {
        for (int i=0;i<number;i++){
            sum=sum+i;
            try {
                Thread.sleep(100);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("["+Thread.currentThread().getName()+"] "+sum);
        return sum;
    }
}*/
class returnValueUsingCallable{
    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {
        ExecutorService executorService= Executors.newSingleThreadExecutor();
       // Callable<Integer> integerCallable=new sumNumbers(10);
        Future<Integer> sumValue=executorService.submit(()->{
            int sum=0;
            for (int i=0;i<6;i++){
                sum=sum+i;
                try {
                    Thread.sleep(2000);
                }
                catch (InterruptedException ex){
                    ex.printStackTrace();
                }
            }

            System.out.println("["+Thread.currentThread().getName()+"] of sum "+sum);
            return sum;
        });
        sumValue.get(1,TimeUnit.SECONDS);
        while (!sumValue.isDone()){
            System.out.println("Task is still not done..");
            Thread.sleep(200);
           // sumValue.cancel(true);
        }
        System.out.println(sumValue.get());
        executorService.shutdown();
    }
}

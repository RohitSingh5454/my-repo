package AbhinavSirLabWork.Multithreading.executorService;

public class Task1 extends Thread{
    public void run(){
        System.out.println("\nTask1 started");
        for (int i=101;i<=199;i++){
            System.out.println(i);
            System.out.println("\nTask1 done");
        }
    }
}
class Task2 implements Runnable{

    @Override
    public void run() {
        System.out.println("\nTask2 started");
        for (int i=1;i<=100;i++){
            System.out.println(i);
            System.out.println("\nTask2 done");
        }
    }
}

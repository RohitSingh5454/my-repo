package AbhinavSirLabWork.javaConceptOfTheDay.Multithreading.DefiningThread;

public class UsageClass {
    class MyThread1 extends Thread{
        public void run(){
            System.out.println("Keep some task here MyThread1....");
        }
    }
    class MyThread2 implements Runnable{
        @Override
        public void run() {
            System.out.println("keep some task here MyThread2....");
        }
    }

    public static void main(String[] args) {
        MyThread1 t1=new UsageClass().new MyThread1();
        MyThread2 t2=new UsageClass().new MyThread2();
        t1.start();
        Thread th=new Thread(t2);
        th.start();
    }
}

package AbhinavSirLabWork.Multithreading;

public class Lab752 {
    public static void main(String[] args) {
        MyThread740 thread1=new MyThread740();
        MyThread740 thread2=new MyThread740();
        Thread t1=new Thread(thread1);
        Thread t2=new Thread(thread2);
        t1.setName("Rohit");
        t2.setName("Banjaara");
        t1.start();
        t2.start();
    }
}
class MyThread740 implements Runnable{

    @Override
    public void run() {
        Thread th=Thread.currentThread();
        for (int i=1;i<=10;i++){
            System.out.println("Thread name " +th.getName()+" Thread state " +th.getState()+ " Thread group "+ th.getThreadGroup());
        }
    }
}

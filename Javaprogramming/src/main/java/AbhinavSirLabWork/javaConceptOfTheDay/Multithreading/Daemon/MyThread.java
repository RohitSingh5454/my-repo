package AbhinavSirLabWork.javaConceptOfTheDay.Multithreading.Daemon;

public class MyThread extends Thread{
    public void run(){
        for (int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        MyThread t1=new MyThread();
        t1.setDaemon(true);
        t1.start();
    }
}

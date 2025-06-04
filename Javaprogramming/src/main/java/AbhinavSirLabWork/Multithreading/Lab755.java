package AbhinavSirLabWork.Multithreading;

public class Lab755 {
    public static void main(String[] args) {
        MyThread t1=new MyThread("Hey");
        MyThread t2=new MyThread("Hello");

    }
}
class MyThread extends Thread{
    MyThread(String tname){
        super(tname);
        start();
    }
    public void run(){
        Thread th=Thread.currentThread();
        ThreadGroup tg=th.getThreadGroup();
        System.out.println("Thread "+th +"\t"+"Thread group "+tg.getName());
    }
}

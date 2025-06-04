package AbhinavSirLabWork.Multithreading;

public class Lab757 {
    public static void main(String[] args) {
      //
        ThreadGroup tg=new ThreadGroup("Somnath");
       // Thread tname=new Thread("Sanjana");
        MyThread123 t1=new MyThread123(tg,"Hello");
        MyThread123 t2=new MyThread123(tg,"Hai");
        t1.setPriority(5);
        t2.setPriority(7);
    }
}
class MyThread123 extends Thread{
    MyThread123(ThreadGroup tg,String tname){
        super(tg,tname);
        start();
    }

    public void run(){
        Thread th=Thread.currentThread();
        System.out.println("Thread name " +th.getName() + " Thread group name " +th.getThreadGroup() );
    }
}

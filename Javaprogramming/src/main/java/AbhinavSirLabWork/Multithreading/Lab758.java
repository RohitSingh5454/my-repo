package AbhinavSirLabWork.Multithreading;

public class Lab758 {
    public static void main(String[] args) {
        ThreadGroup tg=new ThreadGroup("Lobster");
        Bup b1=new Bup(tg,"Aman");
    }
}
class Bup implements Runnable{
    Bup(ThreadGroup tg,String tn){
        Thread t3=new Thread(tg,this,tn);
        t3.start();

    }

    @Override
    public void run() {
        Thread th=Thread.currentThread();
        ThreadGroup tg=th.getThreadGroup();
        System.out.println("Current thread "+th);
        System.out.println("Thread group "+tg);
    }
}

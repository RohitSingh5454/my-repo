package AbhinavSirLabWork.Multithreading;

public class Lab759 {
    public static void main(String[] args) {
        ThreadGroup tg=new ThreadGroup("kamal");
        OurTh obz=new OurTh(tg);
    }
}
class OurTh implements Runnable{
    OurTh(ThreadGroup tg){
        Thread th=new Thread(tg,this);
        th.start();
    }

    @Override
    public void run() {
        Thread th=Thread.currentThread();
        ThreadGroup tg=th.getThreadGroup();
        System.out.println("Current thread "+th.getName());
        System.out.println("thread group"+tg);
    }
}

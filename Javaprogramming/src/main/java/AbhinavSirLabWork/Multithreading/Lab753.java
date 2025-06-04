package AbhinavSirLabWork.Multithreading;

public class Lab753 {
    public static void main(String[] args) {
        RohThread t1=new RohThread();
        RohThread t2=new RohThread();
       /* t1.start();
        t2.start();*/
    }
}


class RohThread extends Thread{

    RohThread(){
        this.start();
    }
    public void run(){
        Thread th=Thread.currentThread();
        ThreadGroup tg=th.getThreadGroup();
        System.out.println("current thread "+th.getName());
        System.out.println("Thread group "+tg.getName());
    }
}

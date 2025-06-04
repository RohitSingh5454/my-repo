package AbhinavSirLabWork.Multithreading;

public class Lab754 {
    public static void main(String[] args) {
        Cp c1=new Cp();
        Cp c2=new Cp();
    }
}
class Cp implements Runnable{
    Cp(){
        Thread th1=new Thread(this);
        th1.start();
    }

    @Override
    public void run() {
        Thread th=Thread.currentThread();
        ThreadGroup tg=th.getThreadGroup();
        System.out.println("Thread current "+th +" "+"Thread group "+tg.getName());

    }
}

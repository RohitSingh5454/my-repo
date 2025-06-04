package AbhinavSirLabWork.Multithreading;

public class Lab756 {
    public static void main(String[] args) {
        Nope n1=new Nope("Kokila");
        Nope n2=new Nope("post");


    }
}
class Nope implements Runnable{
    Nope(String tname){
        Thread t=new Thread(this,tname);
        t.start();
    }

    @Override
    public void run() {
        Thread th=Thread.currentThread();
        ThreadGroup tg=th.getThreadGroup();
        System.out.println("Current thread "+th +"\t"+"Thread group"+tg);
    }
}

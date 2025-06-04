package AbhinavSirLabWork.Multithreading;

public class CaseTest {
    public static void main(String[] args) {
        Hello h1=new Hello();
        Thread t1=new Thread(h1);
        Thread t2=new Thread(h1);
        Thread t3=Thread.currentThread();
        System.out.println(t3);
        t1.setName("R");
        t2.setName("K");
        t2.start();
        t1.start();

    }
}
class Hello implements Runnable{

    synchronized void m1() {
        System.out.println("Hello");
    }
    synchronized void m2(){
        System.out.println("Bye Bye");
    }

    @Override
    public void run() {
        this.m1();
        this.m2();
    }
}
package AbhinavSirLabWork.Multithreading;

public class Lab760 {
    public static void main(String[] args) {
        //ThreadGroup tg=new ThreadGroup("jonty");
        NewThread n1=new NewThread();
        NewThread n2=new NewThread();
        n1.setName("gope");
        n2.setName("cat");
        n1.start();
        n2.start();

    }
}
class NewThread extends Thread{


    @Override
    public void run() {
        Thread thx=Thread.currentThread();
        ThreadGroup tg=thx.getThreadGroup();
        System.out.println("currentthread "+thx);
        System.out.println("thread group "+tg);

    }
}

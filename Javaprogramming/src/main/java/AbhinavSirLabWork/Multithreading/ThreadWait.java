package AbhinavSirLabWork.Multithreading;

public class ThreadWait {
    public static void main(String[] args) throws IllegalThreadStateException {
        Roh r1=new Roh();
        r1.run();

            }
}
class Roh implements Runnable {


    @Override
    public void run() throws IllegalThreadStateException {
        Thread t1=Thread.currentThread();

        System.out.println("Currenrt thread "+t1.getName());
        System.out.println("Thread state "+t1.getState());

    }
}


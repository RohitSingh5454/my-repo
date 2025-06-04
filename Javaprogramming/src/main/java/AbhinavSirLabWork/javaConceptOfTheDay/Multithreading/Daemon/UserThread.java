package AbhinavSirLabWork.javaConceptOfTheDay.Multithreading.Daemon;

public class UserThread extends Thread{
    public void run(){
        System.out.println("This is user thread");
    }
}
class DaemonThread extends Thread {
    public DaemonThread() {
         setDaemon(true);
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("This is Daemon thread "+i);
        }
    }
}
class MainClass{
    public static void main(String[] args) {
        DaemonThread daemon=new DaemonThread();
        daemon.start();
        UserThread userThread=new UserThread();
        userThread.start();
    }
}
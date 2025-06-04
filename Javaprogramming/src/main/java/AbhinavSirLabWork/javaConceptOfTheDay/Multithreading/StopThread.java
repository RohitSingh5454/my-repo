package AbhinavSirLabWork.javaConceptOfTheDay.Multithreading;

public class StopThread {
    public static void main(String[] args) {
      MyThread myThread=new MyThread();
      myThread.start();
      try {
          Thread.sleep(1000);
      }catch (Exception ex){
          ex.printStackTrace();
      }
      myThread.stopRunning();
        // using interrupt method
        myThread.interrupt();
    }

}
class MyThread extends Thread{
    private volatile boolean flag=true;
    public void stopRunning(){
        flag=false;
    }
//    public void run(){
//        while (flag){
//            System.out.println("Thread is running");
//        }
//        System.out.println("Thread is stopped");
//    }
    public void run(){
        while (!Thread.interrupted()){
            System.out.println("Thread is running");
        }
        System.out.println("Thread is stopeed");
    }
}

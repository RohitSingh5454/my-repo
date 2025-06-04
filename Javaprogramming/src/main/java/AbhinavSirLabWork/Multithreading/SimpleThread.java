package AbhinavSirLabWork.Multithreading;

public class SimpleThread {
    public static void main(String[] args) {

    }
}
class ThreadPow{
    public static int i=10;
    String name;
    public synchronized void m3() throws InterruptedException {
        Thread t=Thread.currentThread();
        for (int i=0;i<5;i++){
            i=i+10;
            System.out.println("Hello" +t.getName()+" "+ " "+this.name+i);
            Thread.sleep(500);
        }
        Integer i1=new Integer(5);

        synchronized (i1){
            i1=i1+10;
            System.out.println(i1);
        }
    }
    public synchronized static void m4(){
        System.out.println(Thread.currentThread().getName());
    }

}
class ThreadGen implements Runnable{
    ThreadPow obj;
    public ThreadGen(ThreadPow obj){
        this.obj=obj;
    }

    @Override
    public void run() {
              try {
                  this.obj.m3();
                  ThreadPow.m4();
              } catch (InterruptedException e) {
                  e.printStackTrace();
              }
    }
}
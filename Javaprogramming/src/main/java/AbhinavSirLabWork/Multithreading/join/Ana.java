package AbhinavSirLabWork.Multithreading.join;

public class Ana extends Thread{
    public void run(){
        for (int i=0;i<3;i++){
            System.out.println(Thread.currentThread().getName());
        }
    }
}
class B{
    public static void main(String[] args) {
        Ana t1=new Ana();
        Ana t2=new Ana();
        Ana t3=new Ana();
        t1.setName("thread-1");
        t2.setName("thread-2");
        t3.setName("thread-3");
        t2.start();
        try {
            t2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        t1.start();
        t3.start();
    }
}

package AbhinavSirLabWork.Multithreading;

public class StaticMethodSynchronization {
    public static void Sync(){
        try {
            Thread.sleep(600);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        Thread t1=new Thread(()->{
                StaticMethodSynchronization.Sync();
        });
        Thread t2=new Thread(()->{
            StaticMethodSynchronization.Sync();
        });
        t1.start();
        t1.setName("A");
        t2.start();
        t2.setName("B");
    }
}

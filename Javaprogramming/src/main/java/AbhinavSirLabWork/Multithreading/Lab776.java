package AbhinavSirLabWork.Multithreading;

public class Lab776 {
    public static void main(String[] args) {
        Runnable r=new Runnable() {
            @Override
            public void run() {
                Thread th=Thread.currentThread();
                for (int i=0;i<10;i++){
                    System.out.println(th.getName() +"\t" +i);
                }
            }};

        Thread th1=new Thread();
        Thread th2=new Thread();
        th1.start();
        th2.start();
    }
}

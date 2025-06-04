package AbhinavSirLabWork.Multithreading;

public class DeadlockProgram {

       String str1 ="manoj";
       String str2="suresh";
        Thread th1=new Thread(){
            public void run(){
                while (true)
                synchronized (str1){
                    try {
                        System.out.println(Thread.currentThread().getName() +" locked "+str1);
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    synchronized (str2){
                        System.out.println(Thread.currentThread().getName() +" locked " +str2);
                        System.out.println(str1+str2);
                    }
                }
            }
        };
        Thread th2=new Thread(){
            public void run(){
                while (true)
                    synchronized (str2){
                        System.out.println(Thread.currentThread().getName() + "locked "+str2);
                        synchronized (str1){
                            System.out.println(Thread.currentThread().getName() + "locked "+str1);
                            System.out.println(str1+str2);
                        }
                    }
            }
        };
    public static void main(String[] args) {
        DeadlockProgram obj1=new DeadlockProgram();
        obj1.th1.start();
        obj1.th2.start();
    }
}

package AbhinavSirLabWork.javaConceptOfTheDay.thread;

public class detectDeadlock {
    synchronized void methodOne (detectDeadlock d1) throws InterruptedException {
        Thread t1=Thread.currentThread();
        System.out.println(t1.getName()+" is executing method one");
        try {
            Thread.sleep(1000);
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }
    }
    synchronized void methodTwo(detectDeadlock d2){
        Thread t2=Thread.currentThread();
        System.out.println(t2.getName()+" is executing method two");
        try {
            Thread.sleep(10000);
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }
    }
}

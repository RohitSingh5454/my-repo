package AbhinavSirLabWork.javaConceptOfTheDay.Multithreading;

public class Shared {
    synchronized void methodOne(Shared s1){
      Thread th1=Thread.currentThread();
        System.out.println("Thread name is "+th1.getName()+" is executing thread one");
        try {
            Thread.sleep(2000);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(th1.getName()+ " is calling method two");
        s1.methodTwo(this);
    }
    synchronized void methodTwo(Shared s2){
        Thread th2=Thread.currentThread();
        System.out.println("Thread name is "+th2.getName()+" is executing thread two");
        try{
            Thread.sleep(2000);
        }catch (Exception ex){
            ex.printStackTrace();
        }
        System.out.println(th2.getName()+ " is calling method one");
        s2.methodOne(this);
    }
}
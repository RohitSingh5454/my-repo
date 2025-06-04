package AbhinavSirLabWork.javaConceptOfTheDay.Multithreading;

import java.util.List;

public class OddEven {
    public static void main(String[] args) {
        SharedClass s1= new SharedClass();
     OddThread t1=new OddThread(20,s1);
     t1.setName("Odd thread");
     t1.start();
     EvenThread t2=new EvenThread(20,s1);
     t2.setName("Even thread");
     t2.start();
    }
}
class OddThread extends Thread {
    int limit;
    SharedClass sharedClass;
    public OddThread(int limit,SharedClass sharedClass){
        this.limit=limit;
        this.sharedClass=sharedClass;
    }

    public void run() {
       int oddNo=1;
       while (oddNo<=limit){
           System.out.println("Odd numbers are "+oddNo);
           oddNo=oddNo+2;
       }

    }
}
class EvenThread extends Thread{
    int limit;
    SharedClass sharedClass;
    public EvenThread(int limit,SharedClass sharedClass){
        this.limit=limit;
        this.sharedClass=sharedClass;
    }
    public void run(){
      int evenNo=2;
      while (evenNo<=limit){
          System.out.println("Even numbers are "+evenNo);
          evenNo=evenNo+2;
      }
    }
}
class SharedClass {
    boolean isOddPrinted = false;

    synchronized void printOdd(int number) {
        while (isOddPrinted) {
            try {
                wait();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + " odd numbers " + number);
        isOddPrinted = true;
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        notify();
    }

    synchronized void printEven(int number) {
        while (!isOddPrinted) {
            try {
                wait();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + " Even numbers " + number);
        isOddPrinted = false;
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        notify();
    }
}

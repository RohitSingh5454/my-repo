package AbhinavSirLabWork.Multithreading;

public class Lab766 {
    public static void main(String[] args) {
        Circle c2=new Circle();
        Circle c3=new Circle();
        Thread thn=new Thread(new Hbo(c2));
        thn.start();
        Thread thx=new Thread(new Hbo(c3));
        thx.start();
    }
}

class Hbo extends Thread{
    Circle c1=null;
    Hbo(Circle c1){
        this.c1=c1;
    }
    public void run(){
        c1.m99();
    }


}
class Circle{
          static void m99() {
              synchronized (Circle.class) {

                  Thread t7 = Thread.currentThread();
                  for (int i = 0; i < 5; i++) {
                      System.out.println("current thread is " + t7.getName() + " " + i);
                      try {
                          Thread.sleep(500);
                      } catch (Exception e) {
                          e.printStackTrace();
                      }
                  }
              }
          }
}


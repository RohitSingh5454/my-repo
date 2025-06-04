package AbhinavSirLabWork.Multithreading;

public class Lab767 {
    public static void main(String[] args) {
           HeyDude obj1=new HeyDude();
           HeyDude obj2=new HeyDude();
           MyThread420 t1=new MyThread420(obj1);
           MyThread420 t2=new MyThread420(obj2);
           t1.start();
           t2.start();
    }
}
class MyThread420 extends Thread{
    HeyDude obj1=new HeyDude();
    MyThread420(HeyDude h){
        this.obj1=h;
    }
    public  void run(){
        HeyDude.show();
    }
}
class HeyDude{
    static void show(){
        Thread th=Thread.currentThread();
        synchronized (HeyDude.class){
        for (int i=1;i<=5;i++){
            System.out.println(th.getName() +" -show "+i);
            try {
                Thread.sleep(10000);
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
    }}
}
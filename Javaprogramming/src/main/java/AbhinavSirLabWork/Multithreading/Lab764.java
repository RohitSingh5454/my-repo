package AbhinavSirLabWork.Multithreading;

public class Lab764 {
    public static void main(String[] args) {
        Hello99 obx1=new Hello99();
        Hello99 obx2=new Hello99();
        MyThread34 th1=new MyThread34(obx1);
        MyThread34 th2=new MyThread34(obx2);
        th2.start();
        th1.start();
    }
}
class MyThread34 extends Thread{
    Hello99 obj1=null;
    MyThread34(Hello99 ob){
        this.obj1=ob;
    }
    public void run(){
        obj1.show();
    }
}
class Hello99{
    synchronized void show(){
        Thread th=Thread.currentThread();
        for (int i=1;i<=5;i++){
            System.out.println(th.getName() +" show ");
            try {
                Thread.sleep(1000);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
package AbhinavSirLabWork.Multithreading;

public class Lab751 {
    public static void main(String[] args) {
        MyThread15 obj1=new MyThread15();
        MyThread15 obj2=new MyThread15();
        MyThread15 obj3=new MyThread15();
        obj1.start();
        obj2.start();
        obj3.start();
        try {
            Thread.sleep(700);
        }catch (Exception e){
            System.out.println("Exception caught");
        }

    }
}


class MyThread15 extends Thread{

    public void run(){
        Thread th=Thread.currentThread();
        for (int i=1;i<=10;i++){
            System.out.println("Current thread "+th.getName());
            System.out.println("Get State "+th.getState());
        }

    }

}

package AbhinavSirLabWork.Multithreading;

public class Lab762 {
    public static void main(String[] args) throws InterruptedException{
        Bus b1=new Bus();
        b1.start();
        Thread.sleep(10000);
        System.out.println(b1.getName()+"Thread name 2nd");
        System.out.println(b1.getState() +"Thread state ");

    }
}
class Bus extends Thread{
    public void run(){
        Thread th=Thread.currentThread();
        for (int i=0;i<10;i++){
            System.out.println("name==="+th.getName() +"state==="+th.getState());
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                  e.printStackTrace();
            }
        }

    }
}

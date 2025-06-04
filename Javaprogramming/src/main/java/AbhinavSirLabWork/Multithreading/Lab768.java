package AbhinavSirLabWork.Multithreading;

public class Lab768 {
    public static void main(String[] args) {
        Squash sq1=new Squash();
        Squash sq2=new Squash();
        Thread th1=new Thread(new Box(sq1));
        Thread th2=new Thread(new Box(sq2));
        th1.start();
        th2.start();

    }
}
class Box extends Thread{
    Squash sq;
    Box(Squash sq){
        this.sq=sq;
    }
    public void run(){
        sq.Rest();
    }

}
class Squash{
    synchronized void Rest(){
        Thread t1=Thread.currentThread();
        for (int i=0;i<5;i++){
            System.out.println("current thread "+t1.getName()+" "+i);

        try {

           // wait(1000);
            Thread.sleep(1000);
        }
        catch (Exception e){

        }}
    }
}

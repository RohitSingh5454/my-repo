package AbhinavSirLabWork.Multithreading;

import java.util.ArrayList;

public class Lab769 {
    public static void main(String[] args) {
       Hero h1=new Hero();
       Hero h2=new Hero();
       Thread th1=new Thread(new ThreadB(h1));
       Thread th2=new Thread(new ThreadB(h2));
       th1.start();
       th2.start();

    }
}
class ThreadB extends Thread{
    Hero he;
    ThreadB(Hero he){
        this.he=he;
    }

    public void run(){
       he.stop();
    }

}
class Hero{
    synchronized void stop(){
        ArrayList<Integer> a1=new ArrayList<>();
        Thread t=Thread.currentThread();
        for (int i=0;i<5;i++){
            System.out.println("current thread "+t.getName()+" "+i+"\t"+this);
        try {
            wait(800);
        }catch (Exception e){
            e.printStackTrace();
        }
    }}
}

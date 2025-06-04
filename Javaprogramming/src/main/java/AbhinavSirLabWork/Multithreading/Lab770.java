package AbhinavSirLabWork.Multithreading;

import java.util.ArrayList;

public class Lab770 {
    public static void main(String[] args) {
        Hexa h1=new Hexa();
        Hexa h2=new Hexa();
       // Thread t1=new Thread(new Bpo(h1));
        //Thread t2=new Thread(new Bpo(h2));
        Bpo t2=new Bpo(h1);
        Bpo t3=new Bpo(h2);
        t3.start();
        t2.start();

    }
}
class Bpo extends Thread{
    Hexa hs;
    Bpo(Hexa hs){
        this.hs=hs;
    }
    public void run(){
        hs.Sign();
    }

}
class Hexa{
    void Sign(){
        ArrayList<Integer> al=new ArrayList<>();
        synchronized (al){
            Thread t1=Thread.currentThread();
            for (int i=0;i<5;i++){
                System.out.println("current thread "+t1.getName()+" "+i+ this);
                try {
                    al.wait(1000);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
    }
}
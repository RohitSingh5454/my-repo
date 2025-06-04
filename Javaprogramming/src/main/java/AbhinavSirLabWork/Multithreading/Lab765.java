package AbhinavSirLabWork.Multithreading;

public class Lab765 {
    public static void main(String[] args) {
         Scorpio s1=new Scorpio();
         Scorpio s2=new Scorpio();
         Thread th3=new Thread(new Hey(s1));
         Thread th4=new Thread(new Hey(s1));
         th3.start();
         th4.start();
    }
}
class Hey extends Thread{
    Scorpio s1=null;
    Hey(Scorpio s1){
        this.s1=s1;
    }
    public void run(){
           s1.m86();
    }
}
class Scorpio{

    void m86(){
        Thread t1=Thread.currentThread();
        synchronized (this){

            for (int i=0;i<5;i++){
                System.out.println("current thread name "+t1.getName()+i+this);
                try {
                    Thread.sleep(400);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
    }}



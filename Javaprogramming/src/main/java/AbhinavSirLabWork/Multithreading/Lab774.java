package AbhinavSirLabWork.Multithreading;

public class Lab774 {
    public static void main(String[] args) {
        Thread th=Thread.currentThread();
        MyThread45 obTh=new MyThread45();
        obTh.setDaemon(true);
        obTh.start();
        for (char ch='A';ch<'L';ch++){
            System.out.println(th.getName()+"\t\t"+ch+"\t"+th.isDaemon());
            try {
                Thread.sleep(500);
            }catch (Exception e){
                e.printStackTrace();
            }
        }

    }
}
class MyThread45 extends Thread{
    public void run(){
        for (int i=0;i<20;i++){
            System.out.println(getName()+"\t" +i+" "+isDaemon());
            try {
                Thread.sleep(500);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}

package AbhinavSirLabWork.Multithreading;

public class Lab750 {
    public static void main(String[] args) {
        System.out.println("main started");
        Thread t1=Thread.currentThread();
        ThreadGroup tg=t1.getThreadGroup();
        System.out.println(tg);
        System.out.println(t1);
        for (int i=0;i< args.length;i++){
            String st =args[i];
            System.out.println(t1.getId() + "\t"+ t1.getName() +"\t"+tg.getName());
        }
        System.out.println("main completed");
    }
}

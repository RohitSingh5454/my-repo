package AbhinavSirLabWork.javaConceptOfTheDay.Multithreading;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

public class DetectDeadlocks {
    public static void main(String[] args) {
        final Shared s1=new Shared();
        final Shared s2=new Shared();
        Thread t1=new Thread(){
            @Override
            public void run() {
                s1.methodOne(s2);
            }
        };
        Thread t2= new Thread(() -> s2.methodTwo(s1));
        t1.start();
        t2.start();
        try {
            Thread.sleep(5000);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        ThreadMXBean bean= ManagementFactory.getThreadMXBean();
        long[] ids=bean.findMonitorDeadlockedThreads();
        if (ids!=null){
            ThreadInfo[] threadInfos= bean.getThreadInfo(ids);
            for (ThreadInfo threadInfo:threadInfos){
                System.out.println(threadInfo.getThreadName());
                System.out.println(threadInfo.getThreadId());
                System.out.println(threadInfo.getLockName());
                System.out.println(threadInfo.getLockOwnerId());
                System.out.println(threadInfo.getLockOwnerName());
            }
        }
        else {
            System.out.println("No deadlock confirmed");
        }
    }
}

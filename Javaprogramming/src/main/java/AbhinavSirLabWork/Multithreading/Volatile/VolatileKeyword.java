package AbhinavSirLabWork.Multithreading.Volatile;

public class VolatileKeyword {
      public static int a=0;

    public static void main(String[] args) {
        Thread t1=new Thread(()->{
           int local_counter=a;
           while (local_counter<10)
               if (local_counter!=a){
                   System.out.println("T1 local counter is changed");
                   local_counter=a;
               }
        });
        Thread t2=new Thread(()->{
            int local_counter=a;
            while (local_counter<10){
                if (local_counter!=a){
                    System.out.println("T2 local counter is changed");
                    a=a+local_counter;
                }
            }
        });
    }

}
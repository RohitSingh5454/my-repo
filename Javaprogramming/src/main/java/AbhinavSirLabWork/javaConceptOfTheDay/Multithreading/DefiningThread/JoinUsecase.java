package AbhinavSirLabWork.javaConceptOfTheDay.Multithreading.DefiningThread;

public class JoinUsecase {
    public static void main(String[] args) throws InterruptedException {
        final Thread t1=new Thread(){
            @Override
            public void run() {
               for (int i=0;i<=10;i++){
                   System.out.println(i);
               }
                System.out.println("Numbers from 0 to 1000 are printed");
            }
        };
        final Thread t2=new Thread(){
            @Override
            public void run() {
                try {
                    t1.join(5000);
                }catch (InterruptedException ex){
                    ex.printStackTrace();
                }
                for(int i = 11; i <= 20; i++)
                {
                    System.out.println(i);
                }
                System.out.println("Numbers from 1001 to 2000 are printed");
            }
        };
        final Thread t3=new Thread(){
            @Override
            public void run() {
                try {
                    t2.join(6000);
                }catch (InterruptedException ex){
                    ex.printStackTrace();
                }
                for(int i = 21; i <= 30; i++)
                {
                    System.out.println(i);
                }

                System.out.println("Numbers from 2001 to 3000 are printed");
            }
        };
        t3.start();
        t2.start();
        t1.start();
        t3.join();
        System.out.println("Task is confirmed");
    }
}

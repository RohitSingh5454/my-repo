package AbhinavSirLabWork.Multithreading;

public class Threading {
    public static void main(String[] args) throws InterruptedException {


        PrintEven t1 = new PrintEven();
        PrintStar t2 = new PrintStar();

        t1.start();
        t2.start();

    }


}


class PrintEven extends Thread{

    public void run(){

        for(int i =0;i<100;i++){

            if(i%2==0){
                System.out.println(i+ "  "+Thread.currentThread().getName());


            }

        }

    }

}

class PrintStar extends Thread{

    public void run(){

        for(int i =0;i<50;i++){

            if(i%2==0){
                System.out.println("****"+"  "+Thread.currentThread().getName());


            }

        }

    }

}


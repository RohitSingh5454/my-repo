package AbhinavSirLabWork.javaConceptOfTheDay.Multithreading.DefiningThread;

public class UsageClass1 {
    public static void main(String[] args) {
        new Thread() {
            public void run() {
                System.out.println("Keep some task here");
            }
        }.start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Keep some task here");
            }
        }).start();
    }
}
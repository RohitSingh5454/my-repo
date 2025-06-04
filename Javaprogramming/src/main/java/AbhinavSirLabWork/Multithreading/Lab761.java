package AbhinavSirLabWork.Multithreading;

public class Lab761 {
    public static void main(String[] args) {
        OpenThread o1=new OpenThread();
        OpenThread o2=new OpenThread();
        o1.setPriority(10);
        o2.setPriority(9);

    }
}
class OpenThread extends Thread{

}

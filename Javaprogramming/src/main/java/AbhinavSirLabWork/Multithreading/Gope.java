package AbhinavSirLabWork.Multithreading;

public class Gope {
    void m5(){
        synchronized (this.getClass())
        {

        }
    }
   static void m6(){
        synchronized (Gope.class){

        }
   }
}

package InterviewPreparation;

public abstract class abstractClassinMain {
    //abstract void cbI();
    public void get(){
        System.out.println("hello world");
    }
}
class Bpm extends abstractClassinMain {
    public static void main(String[] args) {
        Bpm ob1=new Bpm();
        ob1.get();
    }

}
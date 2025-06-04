package AbhinavSirLabWork.InterviewCoding.Impetus_Technologies;

public class abstractImplementation implements Xyz {
    @Override
    public void show() {
        System.out.println("It will show you the correct path");
    }

    @Override
    public void run() {
        System.out.println("Animal will run according to food");
    }
}
 interface Xyz{
    void show();
    void run();
       static void main(String[] args) {
         abstractImplementation implementation=new abstractImplementation();
         implementation.run();
         implementation.show();
     }
}
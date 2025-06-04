package Abstract;

public class Thailand {
    public static void main(String[] args) {
    PhiPhi obj3=new PhiPhi(10);
     obj3.Give();
    }
}
abstract class Bangkok{
    int a=78;
    void Give(){
        System.out.println("Hello->Give");
    }
    Bangkok(int a){
        //this.a=a;
        System.out.println("Bangkok->Wonderful City");
    }
    {
        System.out.println("Hello->Non static block");
    }
    static {
        System.out.println("Hello->Static block");
    }

}
class PhiPhi extends Bangkok{
    PhiPhi(int a){
        super(a);

    }
}

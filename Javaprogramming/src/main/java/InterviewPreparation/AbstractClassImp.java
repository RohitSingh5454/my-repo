package InterviewPreparation;

public abstract class AbstractClassImp {
    abstract void Gp();
}
class A extends AbstractClassImp{
public static void main(String[]args){
        A objx=new A();
        objx.Gp();
        }

    @Override
    void Gp() {
        System.out.println("Provide detail");
    }
}

package AbhinavSirLabWork.Exception;

public class CheckWithSuperSub {
    void doSomething() throws NullPointerException{

    }
}
class Sub extends CheckWithSuperSub{
    void doSomething() throws ArithmeticException{

    }
}
class main{
    public static void main(String[] args) {
        CheckWithSuperSub obj1=new CheckWithSuperSub();
        try {
            obj1.doSomething();
        }catch (NullPointerException e)
        {
            System.out.println("Null pointer exception");
        }catch (ArithmeticException e){
            System.out.println("Arithmetic exception");
        }
    }
}
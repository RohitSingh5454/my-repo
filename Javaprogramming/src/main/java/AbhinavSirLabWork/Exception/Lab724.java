package AbhinavSirLabWork.Exception;

public class Lab724 {
    public static void main(String[] args) {
       // int y=new GOP().Get();
        GOP obj1=new GOP();
        obj1.Get();
        //System.out.println(y);
        System.out.println("Main ends");
    }
}
class GOP{
    int Get(){
        int x=0;
        try {
            System.out.println("try block started : "+x);
            x=20;

            int res=x/0;
            System.out.println(x);
            return x;

        }catch (ArithmeticException e){
            x=30;

            System.out.println("Catch started : "+x);
            return x;
        }

        finally {
            x=40;
            System.out.println("finally block : "+x);
            return x;
        }

    }

}

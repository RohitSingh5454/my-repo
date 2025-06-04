package AbhinavSirLabWork.Exception;

public class Lab723 {
    public static void main(String[] args) {
        System.out.println("main started");
        //int res=new Hello().Show();
        Hello h1=new Hello();
        h1.Show();
       // System.out.println("main "+res);
        System.out.println("main completed");
    }
}
class Hello{
    int Show(){
        int a=0;
        try {
            System.out.println("Try block begins "+a);
            a=10/4;
            System.out.println("Try block ends "+a);
            return a;
        }catch (ArithmeticException e){
            a=20;
            System.out.println("Catch block "+a);
            return a;
        }finally {
            a=30;
            System.out.println("finally block "+a);
            return a;
        }

    }
}

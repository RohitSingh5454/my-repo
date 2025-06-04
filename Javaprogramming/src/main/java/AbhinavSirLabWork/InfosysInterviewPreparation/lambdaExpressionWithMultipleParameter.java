package AbhinavSirLabWork.InfosysInterviewPreparation;

public class lambdaExpressionWithMultipleParameter {

    interface func1{
        int twoNumber(int x,int y);
    }
    interface func2{
        void sayMessage(String message);
    }
    public int operation(int c,int y,func1 ob1){
        return ob1.twoNumber(c,y);
    }

    public static void main(String[] args) {
       func1 add=(k,v)-> k+v;
       func1 multiply=(k,v)->k*v;
       lambdaExpressionWithMultipleParameter lexp1=new lambdaExpressionWithMultipleParameter();
        System.out.println("Addition is "+lexp1.operation(23,34,add));
        System.out.println("Multiplication is "+lexp1.operation(12,21,multiply));
        func2 messag=(mess)-> System.out.println("Hello "+mess);
        messag.sayMessage("Hello world");
    }
}

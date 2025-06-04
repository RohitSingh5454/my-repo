package InterviewPreparation.FunctionalInterface;

public class ArithmeticOperation {
    public static void main(String[] args) {
        doOperation doOperation=(a,b)->a+b;
        System.out.println(doOperation.add(2,3));
        doOperation multiplyNumber=(a,b)->a*b;
        System.out.println(multiplyNumber.add(3,3));
    }
}
interface doOperation{
     int add(int a,int b);
}

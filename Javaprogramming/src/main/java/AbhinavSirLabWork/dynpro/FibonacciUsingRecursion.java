package AbhinavSirLabWork.dynpro;

public class FibonacciUsingRecursion {
    public static void main(String[] args) {
        System.out.print("0 1"+" ");
      fibonacci(0,1,4);
    }
    public static void fibonacci(int n1,int n2,int num){
        // when it hit the base condition
        if (num==0){
            return;
        }
        System.out.print(n1+n2+" ");

        fibonacci(n2,n1+n2,--num);
    }
}

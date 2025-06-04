package AbhinavSirLabWork.Recursion;

public class FibonacciSeries {
    static int a=0,b=1,c;
      public static void main(String[] args) {
        //System.out.print(a+" "+b);

        FibonacciSeries obj1=new FibonacciSeries();
        //obj1.Check(8);
          System.out.println(fibonacci(6));
    }
    static void Check(int i){
        if (i>=1){
            c=a+b;    // c=1 , c=2 ,c=3
           // System.out.print(" "+c);
            a=b;   // a=1 , a=1 , a=2
            b=c;   // b=1   b=2 ,b=3
            Check(i-1);
        }
    }
    // 1 more way
    static int fibonacci(int n){
          if (n==1 || n==2 ){
              return 1;
          }
          return fibonacci(n-1)+fibonacci(n-2);
    }
}

package AbhinavSirLabWork.Recursion;

public class FibonacciSeriesoptimize {
    private static long[] fibonacciCache;
    public static void main(String[] args) {
        int n=40;
        System.out.println (fibonacciNumber(n));
        fibonacciCache=new long[n+1];
    }
    public static long fibonacciNumber(int n){
        if (n<=1){
            return n;
        }
        long nthFionacciNumber=fibonacciNumber(n-1)+fibonacciNumber(n-2);
        fibonacciCache[n]=nthFionacciNumber;
        return nthFionacciNumber;
    }
}

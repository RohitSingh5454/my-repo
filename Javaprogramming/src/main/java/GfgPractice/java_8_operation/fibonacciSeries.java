package GfgPractice.java_8_operation;

public class fibonacciSeries {
    public static void main(String[] args) {
         int num=5;
         for (int i=0;i<num;i++){
             System.out.print(fibonacciSeriesm1(i)+" ");
         }
    }
    public static int fibonacciSeriesm1(int num){
        if (num<=1){
            return num;
        }
        return fibonacciSeriesm1(num-1)+fibonacciSeriesm1(num-2);
    }
}

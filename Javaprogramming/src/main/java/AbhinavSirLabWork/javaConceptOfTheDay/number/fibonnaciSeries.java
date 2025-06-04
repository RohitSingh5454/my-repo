package AbhinavSirLabWork.javaConceptOfTheDay.number;

public class fibonnaciSeries {
    public static void main(String[] args) {
      fibonacci(8);
    }
    public static void fibonacci(int x){
        int n1=0;
        int n2=1;
        int n3;
        System.out.print(n1+" "+n2);
        for (int n=2;n<x;n++){
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
    }

}

package InterviewPreparation.FunctionalInterface;

public interface Gopi {
    int m1(int a,int b);
}
class Xyz{
    public static void main(String[] args) {
       /* Gopi l1=(n,m)->{
            return n+m;
        };
        System.out.println(l1.m1(34,67));*/
       // Gopi g1=Xyz::m2;

    }

    static int m2(int a,int b,int c){
        return a+b+c;
    }
}
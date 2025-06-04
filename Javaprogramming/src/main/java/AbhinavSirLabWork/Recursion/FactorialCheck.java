package AbhinavSirLabWork.Recursion;

class FactorialCheck{
    public static void main(String[] args) {
       int fact=1;
       int num=5;
       for (int i=num;i>0;i--){
           fact=fact*i;
       }
        System.out.println(fact);
       int x=7;
        System.out.println("Using recursion "+factorial(x));
    }
    public static int factorial(int x){
        if (x==0 || x==1){
            return 1;
        }
        return x*factorial(x-1);
    }
}
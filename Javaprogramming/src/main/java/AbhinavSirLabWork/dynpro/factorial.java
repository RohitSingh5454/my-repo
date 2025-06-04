package AbhinavSirLabWork.dynpro;

public class factorial {
    public static void main(String[] args) {
        System.out.println(factorialFind(7));
    }
    public static int factorialFind(int num){
        int fact=1;
        for (int i=1;i<num;i++){
            fact=fact*i;
        }
        return fact;
    }
}

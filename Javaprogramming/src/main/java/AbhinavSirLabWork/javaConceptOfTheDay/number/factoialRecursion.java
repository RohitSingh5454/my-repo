package AbhinavSirLabWork.javaConceptOfTheDay.number;

public class factoialRecursion {
    public static void main(String[] args) {
        System.out.println( recursion(4));
    }
    public static int recursion(int x) {
        int fact;
        if (x>=1){
            return x*recursion(x-1);
        }
        else {
            return 1;
        }
    }
}

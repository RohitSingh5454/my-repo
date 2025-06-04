package AbhinavSirLabWork.Oops.abstractClassabstractMethods;

public abstract class Abc {
    abstract int getSum(int a,int b);
}
class Xyz extends Abc{
    public static void main(String[] args) {
        Xyz ob1 = new Xyz();
        System.out.println( ob1.getSum(12,23));
    }
    public int getSum(int a,int b){
        return a+b;
    }

}

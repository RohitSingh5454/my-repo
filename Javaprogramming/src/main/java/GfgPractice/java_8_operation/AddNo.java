package GfgPractice.java_8_operation;

public interface AddNo {
    int add(int a,int b);
}
class Implementation{
    public static void main(String[] args) {
        AddNo addNo=(a,b)->a+b;
       int sum= addNo.add(12,23);
        System.out.println(sum);
    }
}
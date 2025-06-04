package AbhinavSirLabWork.InterviewCoding.Nice;

public interface SumTwoNo {
    public int addNo(int a,int b);
}
class Implementation {
    public static void main(String[] args) {
        SumTwoNo ob=(a,b)->a+b;
        int sum=ob.addNo(12,23);
        System.out.println("Sum of two number "+sum);
    }
    }
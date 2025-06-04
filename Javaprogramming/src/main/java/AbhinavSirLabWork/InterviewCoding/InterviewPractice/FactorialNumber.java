package AbhinavSirLabWork.InterviewCoding.InterviewPractice;

public class FactorialNumber {
    public static void main(String[] args) {
        int num=5;
        System.out.println(factorialNum(num));
    }
   public static int factorialNum(int num){
        if (num<=1){
            return num;
        }
        return num*factorialNum(num-1);
   }
}

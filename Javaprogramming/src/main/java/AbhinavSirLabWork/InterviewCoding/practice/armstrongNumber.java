package AbhinavSirLabWork.InterviewCoding.practice;

import java.util.stream.IntStream;

public class armstrongNumber {
    public static void main(String[] args) {
        System.out.println(isArmstrong(153));
    }
    public static boolean isArmstrong(int num){
        return num==checkArmstrong(num);
    }
    public static int checkArmstrong(int num) {
    int len=String.valueOf(num).length();
          return IntStream.iterate(num,i->i/10).limit(len).map(i->(int)Math.pow(i%10,len)).sum();
    }
}

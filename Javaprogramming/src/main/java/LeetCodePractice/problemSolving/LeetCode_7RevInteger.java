package LeetCodePractice.problemSolving;

public class LeetCode_7RevInteger {
    public static void main(String[] args) {
       int num=reverseInt(-123);
        System.out.println(num);
    }
    public static int reverseInt(int x){
        int rev=0;
        int ld;
        while (x!=0){
            ld=x%10;
            rev=rev*10+ld;
            x/=10;
        }
        return (x<0)?-rev:rev;
    }
}

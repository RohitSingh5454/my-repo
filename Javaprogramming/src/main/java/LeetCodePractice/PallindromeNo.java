package LeetCodePractice;

public class PallindromeNo {
    public static void main(String[] args) {
        int num=-121;
        int temp=num;
        int sum=0;
        while (num!=0){
            int d=num%10;
            sum=sum*10+d;
            num=num/10;
            System.out.println(num);
        }
        if (temp==sum){
            System.out.println("Pallindrome no");
        }
        else {
            System.out.println("Not pallindrome");
        }
    }
}

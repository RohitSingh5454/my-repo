package InterviewPreparation;

public class ArmstrongNum {
    public static void main(String[] args) {
        int num=153;
        int rem;
        int temp=num;
        int res=0;
        while (temp!=0){
            rem=temp%10;

            res+=Math.pow(rem,3);
            temp=temp/10;

        }
        if (temp==res){
            System.out.println("It is armstrong number");
        }
        else {
            System.out.println("It is not armstrong number");
        }
    }
}

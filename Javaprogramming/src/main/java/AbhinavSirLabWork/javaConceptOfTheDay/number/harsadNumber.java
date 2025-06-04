package AbhinavSirLabWork.javaConceptOfTheDay.number;

public class harsadNumber {
    public static void main(String[] args) {
        int num=22;
        int temp=num;
        int sum=0;
        while (temp>0){
            int rem=temp%10;
            sum=sum+rem;
            temp/=10;
        }
        int check=num%sum;
        if (check==0){
            System.out.println("It is harshad number");
        }
        else {
            System.out.println("It is not harshad number");
        }
    }
}

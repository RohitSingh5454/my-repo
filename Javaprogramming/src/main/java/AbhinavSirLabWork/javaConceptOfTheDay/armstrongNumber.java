package AbhinavSirLabWork.javaConceptOfTheDay;

public class armstrongNumber {
    public static void main(String[] args) {
        int a=372;
        int temp=a;
        int sum=0;
        while (temp!=0){
            int rem=temp%10;
            int prod=rem*rem*rem;
            sum=sum+prod;
            temp=temp/10;
        }
        if (sum==a){
            System.out.println("Armstrong number");
        }
        else {
            System.out.println("Not armstrong number");
        }
    }
}

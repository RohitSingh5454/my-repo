package AbhinavSirLabWork.javaConceptOfTheDay.number;

public class addNumber {
    public static void main(String[] args) {

    int num=34567;
    int temp=num;
    int sum=0;
    while (temp!=0){
        int rem=temp%10;
         sum=sum+rem;
         temp=temp/10;
    }
        System.out.println("result is "+sum);
}
}

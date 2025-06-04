package AbhinavSirLabWork.javaConceptOfTheDay.number;

public class armstrongNumber {
    public static void main(String[] args) {
        int num=153;
        int temp=num;
        int sum=0;
        while (temp!=0){
            int rem=temp%10;
            int cube=rem*rem*rem;
            sum=sum+cube;
            temp=temp/10;
        }
        if (num==sum){
            System.out.println(num+" is armstrong number");
        }
        else {
            System.out.println(num+ " is not armstrong number");
        }
    }
}

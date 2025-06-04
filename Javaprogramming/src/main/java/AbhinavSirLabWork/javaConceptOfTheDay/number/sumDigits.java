package AbhinavSirLabWork.javaConceptOfTheDay.number;

public class sumDigits {
    public static void main(String[] args) {
        int num=475496215;
        int sum=0;
        int temp=num;
        while (temp>0){
            int d=temp%10;
            sum=sum+d;
            temp/=10;
        }
        System.out.println(sum);
    }
}

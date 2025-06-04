package InterviewPreparation;

public class PrimeCheck2 {
    public static void main(String[] args) {
        int m=67;
        CheckPrime(m);


    }
    public static void CheckPrime(int m){
        int count=0;

        if (m<2){
            System.out.println(m+ " is not prime number");
        }
        if (m==2){
            System.out.println(m+ " is prime number");
        }
        for (int i=1;i<=m;i++){

            if (m%i==0){
                count++;
            }
        }
        if (count>2){
            System.out.println(m+ " is not prime no");
        }
        else {
            System.out.println(m+ " is  prime no");
        }
    }

}



package InterviewPreparation;

public class primeNumberCheck {
    public static void main(String[] args) {
        System.out.println(isPrime(31));
    }
    public static boolean isPrime(int x){
        if (x==0 || x==1){
            return false;
        }
         if(x==2){
           return false;
        }
            for (int i=2;i<=x/2;i++){
                if (x%i==0){
                   return false;
                }
            }
            return true;
        }

    }


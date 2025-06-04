package AbhinavSirLabWork.dynpro;

public class primeSumCheck {
    public static void main(String[] args) {
        checkPrime(18);
    }
    public static int checkPrime(int num){
        int flag=0;
        for (int i=2;i<num/2;i++){
          if (num%i==0){
              flag=1;
              break;
          }
          flag=0;
        }
        if (flag==0){
            return 0;
        }
        return 1;
    }
    public static void sum(int num){
        for (int i=2;i<num/2;i++){
            if (checkPrime(i)==0 &&checkPrime(num-i)==0){
                System.out.println(num+"="+(num-i)+"+"+i);
            }
        }
    }
}

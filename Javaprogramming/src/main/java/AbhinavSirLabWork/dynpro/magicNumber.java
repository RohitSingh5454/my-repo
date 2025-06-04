package AbhinavSirLabWork.dynpro;

public class magicNumber {
    public static void main(String[] args) {
       magicCheck(163);
    }
    public static void magicCheck(int num){
        int sumOfDigits=0;
        while (num>0 || sumOfDigits>9){
              if (num==0){
                  num=sumOfDigits;
                  sumOfDigits=0;
              }
              sumOfDigits=sumOfDigits+num%10;
              num=num/10;
        }
        if (sumOfDigits==1){
            System.out.println("It is magic number");
        }
        else {
            System.out.println("It is not magic number");
        }
    }
}

package AbhinavSirLabWork.javaConceptOfTheDay.number;

public class pronicNumber {
    public static void main(String[] args) {
    checkPronicNo(42);
    }
    public static void checkPronicNo(int num){
        int num1=0,num2=0;
        boolean isPronic=false;
        for (int i=0;i<num;i++){
            if (i*(i+1)==num){
                num1=i;
                num2=i+1;
                isPronic=true;
                break;
            }
        }
        if (isPronic){
            System.out.println("It is pronic numbber");
            System.out.println(num1+"x"+num2+"="+num);
        }
        else {
            System.out.println("It is not pronic number");
        }
    }
}

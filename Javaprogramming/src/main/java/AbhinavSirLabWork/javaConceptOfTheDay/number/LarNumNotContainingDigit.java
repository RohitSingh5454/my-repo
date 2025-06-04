package AbhinavSirLabWork.javaConceptOfTheDay.number;

public class LarNumNotContainingDigit {
    public static void main(String[] args) {
        System.out.println(getNumber(123, 2));
    }

    public static int getNumber(int num, int digit) {
        Character ch=Integer.toString(digit).charAt(0);
        for (int i = num; i>= 0; i--) {
            if (Integer.toString(i).indexOf(ch)==-1){
                return i;
            }
        }
        return -1;
    }
}
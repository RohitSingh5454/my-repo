package AbhinavSirLabWork.javaConceptOfTheDay.number;

public class largestNumberNotContainDigit {
    public static void main(String[] args)
    {
        System.out.println( getLessThanN(432,3));
    }
    public static int getLessThanN(int number,int digit){
       char ch= Integer.toString(digit).charAt(0);
       for (int i=number;i>0;--i){
          if (Integer.toString(i).indexOf(ch)==-1){
              return i;
          }
       }
       return -1;
    }
}

package AbhinavSirLabWork.InterviewCoding.practice;

public class notContainingDigit {
    public static void main(String[] args) {
        System.out.println( maxLessThanDigit(121,2));
    }
    static int maxLessThanDigit(int num,int digit){
        char ch=Integer.toString(digit).charAt(0);
        for (int i=num;i>0;i--){
          if ( Integer.toString(i).indexOf(ch)==-1)
          {
              return i;
          }
        }
        return -1;
    }
}

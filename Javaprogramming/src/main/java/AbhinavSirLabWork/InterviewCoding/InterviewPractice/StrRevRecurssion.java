package AbhinavSirLabWork.InterviewCoding.InterviewPractice;

public class StrRevRecurssion {
    public static void main(String[] args) {
        char[] ch="Hello".toCharArray();
        reverseString(ch,0, ch.length-1);
    }
    public static void reverseString(char[] reverse,int start,int end){
       if (start>=end) {
           System.out.println(reverse);
           return;
       }
           char temp=reverse[start];
           reverse[start]=reverse[end];
           reverse[end]=temp;
           reverseString(reverse,start+1,end-1);
       }
    }


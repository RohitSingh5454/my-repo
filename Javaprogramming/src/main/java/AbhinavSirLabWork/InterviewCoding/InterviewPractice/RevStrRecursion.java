package AbhinavSirLabWork.InterviewCoding.InterviewPractice;

public class RevStrRecursion {
    public static void main(String[] args) {
        char[] str="Hello".toCharArray();
        revString(str,0, str.length-1);
    }
    public static void revString(char[] chars,int start,int end){
        if (start>end){
            System.out.println(chars);
            return;
        }
        char temp=chars[start];
        chars[start]=chars[end];
        chars[end]=temp;
        revString(chars,start+1,end-1);
    }
}

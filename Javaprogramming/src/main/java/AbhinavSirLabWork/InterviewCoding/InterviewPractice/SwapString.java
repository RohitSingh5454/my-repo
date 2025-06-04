package AbhinavSirLabWork.InterviewCoding.InterviewPractice;

public class SwapString {
    public static void main(String[] args) {
        String s1="rat";
        String s2="hello";
        String s3=s1+s2;
        s1=s3.substring(s1.length());//rathello
        s2=s3.substring(0,s3.length()-s1.length());
        System.out.println(s1);
        System.out.println(s2);
    }
}

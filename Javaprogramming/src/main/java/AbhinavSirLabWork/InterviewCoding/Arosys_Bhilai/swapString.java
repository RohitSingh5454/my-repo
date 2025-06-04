package AbhinavSirLabWork.InterviewCoding.Arosys_Bhilai;

public class swapString {
    public static void main(String[] args) {
        String s1="rat";
        String s2="hello";
        s1=s1+s2;
        s2=s1.substring(0,s1.length()-s2.length());
        s1=s1.substring(s2.length());
        System.out.println(s2);
        System.out.println(s1);
    }
}

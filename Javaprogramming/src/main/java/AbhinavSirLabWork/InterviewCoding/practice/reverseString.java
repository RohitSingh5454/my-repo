package AbhinavSirLabWork.InterviewCoding.practice;

public class reverseString {
    public static void main(String[] args) {
        String str="java is programming language";
        char[] ch=str.toCharArray();
        char[] ch1=new char[ch.length];
        for (int i=0;i<ch.length;i++){
            ch1[i]=ch[ch.length-i-1];
        }
        for (char i:ch1){
            System.out.print(i);
        }
        // another way

    }
}

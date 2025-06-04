package AbhinavSirLabWork.InterviewCoding.infosys;

public class reverseString {
    public static void main(String[] args) {
        String str="Hello";
        char[] chars=str.toCharArray();
        char[] ch=new char[str.length()];
        for (int i=0;i<str.length();i++){
            ch[i]=chars[str.length()-1-i];
        }
        System.out.println(ch);
    }
}

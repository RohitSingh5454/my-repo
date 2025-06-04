package InterviewPreparation;

public class ReverseString {
    public static void main(String[] args) {
        String str="My name is Rohit";
        String rev="";
        System.out.println(str.length());
        for (int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);

        }
        System.out.println(rev);

    }
}

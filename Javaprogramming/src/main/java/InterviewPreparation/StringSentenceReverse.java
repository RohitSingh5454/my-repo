package InterviewPreparation;

public class StringSentenceReverse {
    public static void main(String[] args) {
        String str="My name is Rohit";

        String word=" ";
        String rev=" ";
        rev=rev+" ";

        for (int i=0;i< str.length();i++){
            char ch=str.charAt(i);
            if (ch!=' '){
                word=word+ch;
            }
            else {
                rev=word+" "+rev;
                word="";
            }
        }
        System.out.println(rev);
    }
}

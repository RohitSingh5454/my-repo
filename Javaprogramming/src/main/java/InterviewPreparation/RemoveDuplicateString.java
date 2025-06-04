package InterviewPreparation;

public class RemoveDuplicateString {
    public static void main(String[] args) {
        String str = "aabbbcccc";
        System.out.println("Old string is : "+str);
        RemoveDuplicateString obj1=new RemoveDuplicateString();
        System.out.println("New string  is : "+obj1.removeDuplicate(str));
    }
    public  String removeDuplicate(String str){
        String newStr=" ";
        for (int i=0;i<str.length();i++){

            char ch=str.charAt(i);
           // System.out.println(ch);
            if (newStr.indexOf(ch)==-1){
                 newStr=newStr+ch;
            }

        }

        return newStr;
    }
}




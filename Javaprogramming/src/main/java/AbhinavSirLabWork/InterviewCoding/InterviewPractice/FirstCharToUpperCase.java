package AbhinavSirLabWork.InterviewCoding.InterviewPractice;


public class FirstCharToUpperCase {
    public static void main(String[] args) {
        String str = "java is programming language";
        String newStr="";
        boolean isSpace=true;
        for (int i=0;i<str.length();i++){
            if (i==0){
                newStr=newStr+str.toUpperCase().charAt(i);
            }
            else if (str.charAt(i)==' '){
               newStr=newStr+" "+ str.toUpperCase().charAt(i+1);
               i++;
            }
            else {
                newStr = newStr + str.charAt(i);
            }
        }
        System.out.println(newStr);
    }
}

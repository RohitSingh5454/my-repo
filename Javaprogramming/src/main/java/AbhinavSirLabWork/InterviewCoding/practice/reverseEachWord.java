package AbhinavSirLabWork.InterviewCoding.practice;

public class reverseEachWord {
    public static void main(String[] args) {
        String str="Java concept of the day";
        String[] str1=str.split(" ");
        String revString="";
        for (int i=0;i<str1.length;i++){
            String revWord="";
            String word=str1[i];
            for (int j=word.length()-1;j>=0;j--){
                revWord=revWord+word.charAt(j);
            }
            revString=revString+revWord+ " ";
        }
        System.out.println(revString);
    }
}

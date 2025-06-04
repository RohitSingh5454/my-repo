package AbhinavSirLabWork.javaConceptOfTheDay.string;

public class reverseStringWord {
    public static void main(String[] args) {
     reverseWord("Hello this is my world");
        //
        // reverseWordUsingStringBuffer("Hello this is my world");
    }
    // 1st way
   public static void reverseWord(String str){
        String[] strArray=str.split(" ");
        String revStringWord="";
        for (int i=0;i<strArray.length;i++){
            String strs=new String(strArray[i]);
            String revWord="";
            for (int j=0;j<strs.length();j++){
                revWord=revWord+strs.charAt(strs.length()-1-j);
            }
            revStringWord=revStringWord+revWord+" ";
        }
       System.out.println(revStringWord);
   }
}

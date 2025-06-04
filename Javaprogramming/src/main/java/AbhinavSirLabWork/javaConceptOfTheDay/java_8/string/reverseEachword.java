package AbhinavSirLabWork.javaConceptOfTheDay.java_8.string;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class reverseEachword {
    public static void main(String[] args) {
        String str = "Java Concept Of The Day";
        String revString = "";
        String[] strings = str.split(" ");
//        for (int i = strings.length - 1; i >= 0; i--) {
//            revString = revString + strings[i]+" ";
//        }
//        System.out.println(revString);
        for (int i=0;i<strings.length;i++){
            String word=strings[i];
            String revWord="";
            for (int j=word.length()-1;j>=0;j--){
                revWord=revWord+word.charAt(j);
            }
            revString=revString+revWord+" ";
        }
        System.out.println(revString);
    }
}

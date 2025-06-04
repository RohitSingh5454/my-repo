package AbhinavSirLabWork.InterviewCoding.InterviewPractice;

import java.util.Arrays;
import java.util.HashSet;

public class SortedString {
    public static void main(String[] args) {
        String str="tree";
        char[] charArray=str.toCharArray();
        System.out.println(Arrays.toString(charArray));
        Arrays.sort(charArray);
        int i=0;
        StringBuilder sb=new StringBuilder();
        HashSet<String> hs=new HashSet<>();
        for (char ch:charArray){
            sb.append(ch);
            hs.add(String.valueOf(sb));
        }
        System.out.println(hs);
//        for (int j=i+1;j< charArray.length;j++){
//            if (charArray[i]>charArray[j])
//            {
//                sb.append(charArray[j]);
//            }else {
//                sb.append(charArray[i]);
//            }
//            i++;
//        }
//        System.out.println(sb);
//        int i=0;
//        HashSet<String> hs=new HashSet<>();
//        for (int j=i;j<array.length;j++){
//            if (array[i].equals(array[j])){
//                hs.add(array[i]); //e
//            }
//            else {
//                hs.add(array[i]);
//            }
//            i++;
//        }
//        System.out.println(hs);
    }
}

package AbhinavSirLabWork.InterviewCoding.InterviewPractice;

import java.util.*;

public class PermutationString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        permutations(str.toCharArray(),0);
    }
    static void permutations(char[] array,int fi){
        if (fi==array.length){
            System.out.println(array);
            return;
        }
        for (int i=fi;i<array.length;i++){
            swap(array,i,fi);
            permutations(array,fi+1);
            swap(array,i,fi);
        }
    }
    public static void swap(char[] array,int i,int fi){
        char temp=array[i];
        array[i]=array[fi];
        array[fi]=temp;
    }
}

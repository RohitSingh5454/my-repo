package AbhinavSirLabWork.javaConceptOfTheDay.string;

import java.util.Scanner;

public class permutationCombination {
    static void permutations(char[] arr,int fi)
    {
        if (fi== arr.length-1){
            System.out.println(arr);
            return;
        }
        for (int i=fi;i< arr.length;i++){
            swap(arr,i,fi);
            permutations(arr,fi+1);
            swap(arr,i,fi);
        }
    }
    static void swap(char[] arr,int i,int fi){
        char temp=arr[i];
        arr[i]=arr[fi];
        arr[fi]=temp;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();
        permutations(st.toCharArray(),0);
    }
}

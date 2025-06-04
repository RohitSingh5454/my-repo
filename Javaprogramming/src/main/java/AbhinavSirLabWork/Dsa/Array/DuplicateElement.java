package AbhinavSirLabWork.Dsa.Array;

import java.util.Scanner;

public class DuplicateElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array=new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        duplicateArray(array,n);
    }
    public static void duplicateArray(int[] array,int n){
        for (int i=0;i<n;i++){
            boolean isPresent=false;
            for (int j=i+1;j<n;j++){
                if (array[i]==array[j]){
                    isPresent=true;
                }
            }
            if (isPresent){
                System.out.print(array[i]+" ");
            }
        }

    }
}

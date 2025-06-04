package InterviewPreparation;

import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args) {
        int a[]={0,1,2,0,1,2};
        for (int i=0;i< a.length;i++){
            for (int j=i+1;j<= a.length-1;j++){
                if (a[i]>a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
       // System.out.println(Arrays.toString(a));
        String str="";
        for (int i=0;i<a.length;i++){
           // str=str+a[i];
            System.out.print(a[i]+" ");
        }
       // System.out.println(str);
       // int x=Integer.parseInt(Arrays.toString(a));
       // System.out.println(x);
}}

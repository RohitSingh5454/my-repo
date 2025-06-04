package InterviewPreparation;

import java.util.Arrays;

public class FourLargElemSum {
    public static void main(String[] args) {
        int arr[]={34,22,12,67,54,88,96};
        for (int i=0;i<arr.length;i++){
        for (int j=i+1;j<arr.length;j++){
            if (arr[i]<arr[j]){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }}
       for (int i=0;i<arr.length;i++){
           System.out.print(arr[i]+" ");
           }
           int sum=arr[3]+arr[2]+arr[1]+arr[0];
        System.out.println();
           System.out.println(sum);

    }}


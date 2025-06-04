package InterviewPreparation.array;

public class rearrangeArray {
    public static void main(String[] args) {
       int[] arr={1,0,1,1,0,1,0,0,1};
       int countZero=0;
       int countOne=0;
       for (int i:arr){
           if (i==0){
               countZero++; // after executing countZero=4
           }
           else {
               countOne++; // similarly countOne=5
           }
       }
       int index=0;
       for (int j=0;j<countZero;j++){
           arr[index]=0;
           index++;
       }
       for (int k=index+1;k< arr.length;k++){
           arr[k]=1;
       }
        for (int m=0;m< arr.length;m++){
            System.out.print(arr[m]+" ");
        }
    }
}

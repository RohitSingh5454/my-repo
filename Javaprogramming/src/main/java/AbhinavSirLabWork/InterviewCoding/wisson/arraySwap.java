package AbhinavSirLabWork.InterviewCoding.wisson;

public class arraySwap {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5,7};
        for (int i=0;i<arr1.length-1;i++){
            int temp=arr1[i];
            arr1[i]=arr1[i+1];
            arr1[i+1]=temp;
            i++;
        }
        for (int i:arr1){
            System.out.print(i+" ");
        }
    }
}

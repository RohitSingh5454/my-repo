package AbhinavSirLabWork.InterviewCoding.InterviewPractice;

public class ArraySwap {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5,7};
        for (int i=0;i<arr1.length;i++){
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

package AbhinavSirLabWork.InterviewCoding.InterviewPractice;

public class MaxDifference1 {
    public static void main(String[] args) {
        int[] array = {9, 4, 7, 18, 8, 12, 13, 22, 14};
        int maxDiff=array[1]-array[0];
        int min=array[0];
        //
        // Arrays.sort(array);
        int max=array[array.length-1]-array[0];
        System.out.println("maximum element is "+max);
        for (int i=1;i<array.length;i++){
            if (array[i]-min>maxDiff){
                maxDiff=array[i]-min;
            }
            else if (array[i]<min){
                min=array[i];
            }
        }
        System.out.println(maxDiff);
    }
}

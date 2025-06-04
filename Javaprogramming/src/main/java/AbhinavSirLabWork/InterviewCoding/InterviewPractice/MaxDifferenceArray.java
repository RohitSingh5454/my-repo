package AbhinavSirLabWork.InterviewCoding.InterviewPractice;

public class MaxDifferenceArray {
    public static void main(String[] args) {
        int[] array={4,1,8,7,6,12,3,9};
        int maxDiff=maxDiffArray(array);
        System.out.println(maxDiff);
    }
    public static int maxDiffArray(int[] array){
        //Arrays.sort(array);
        int maxDiff=array[1]-array[0];
        int min=array[0];
        for (int i=0;i<array.length;i++){
            if (array[i]-min>maxDiff){
                maxDiff=array[i]-min;
            }
            else if (array[i]<min){
                min=array[i];
            }
        }
        return maxDiff;
    }
}

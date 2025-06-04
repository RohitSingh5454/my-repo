package AbhinavSirLabWork.InterviewCoding.InterviewPractice;

public class MaxDifference2 {
    public static void main(String[] args) {
        int[] array = {9, 4, 7, 18, 8, 12, 13, 22, 14};
        int maxDiff=maxDifference(array);
        System.out.println(maxDiff);
    }
    public static int maxDifference(int[] array){
        int max=array[1]-array[0];
        int min=array[0];
       // Arrays.sort(array);
        for (int i=0;i<array.length;i++){
            if (array[i]-min>max){
                max=array[i]-min;
            }else if (array[i]<min){
                min=array[i];
            }
        }
        return max;
    }
}

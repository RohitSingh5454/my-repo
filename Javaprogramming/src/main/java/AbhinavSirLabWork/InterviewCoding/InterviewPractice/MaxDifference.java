package AbhinavSirLabWork.InterviewCoding.InterviewPractice;

public class MaxDifference {
    public static void main(String[] args) {
        System.out.println(maxDiff(new int[]{3,1,2,18,8,12,13,22,14}));
    }
    public static int maxDiff(int[] array){
        int max=array[1]-array[0];
        int min=array[0];
        for (int i=1;i<array.length;i++){
            if(array[i]-min>max){
                max=array[i]-min;
            }else if (array[i]<min){
                min=array[i];
            }
        }
        return max;
    }
}

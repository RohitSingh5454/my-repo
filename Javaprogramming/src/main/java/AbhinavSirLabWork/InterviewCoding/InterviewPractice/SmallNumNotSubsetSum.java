package AbhinavSirLabWork.InterviewCoding.InterviewPractice;

public class SmallNumNotSubsetSum {
    public static void main(String[] args) { // int[] array1=new int[]{1,2,3,10};
        int[] array1=new int[]{1,2,3,10};
        int num=smallestNumber(array1);
        System.out.println(num);
    }
    public static int smallestNumber(int[] array){
        int min=1;
        for (int i=0;i<array.length;i++){
            if (array[i]>min){
                break;
            }
            min=min+array[i];
        }
        return min;
    }

}

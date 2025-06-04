package AbhinavSirLabWork.InterviewCoding.AccoliteDigital;

public class SmallestNumber {
    public static void main(String[] args) {
        int[] array1=new int[]{1,2,3,10};
        int min=1;
        for (int i=0;i<array1.length;i++){
            if (array1[i]>min){
                break;
            }
            min+=array1[i];
        }
        System.out.println("Minimum element is "+min);
    }
}


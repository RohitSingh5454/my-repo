package AbhinavSirLabWork.InterviewCoding.InterviewPractice;

public class SecLarInArray {
    public static void main(String[] args) {
        int[] array={2,1,6,4,9,7,12,13};
        int largest=array[1];
        int secondLargest=array[0];
        for (int i=0;i<array.length;i++){
            if (array[i]>largest){
                secondLargest=largest;
                largest=array[i];
            } else if (array[i]<largest && array[i]>secondLargest) {
                secondLargest=array[i];
            }
        }
        System.out.println(secondLargest);
    }
}

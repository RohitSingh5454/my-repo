package AbhinavSirLabWork.InterviewCoding;

public class SecondLargest {
    public static void main(String[] args) {
      int[] array={4,1,7,8,3,6,14,19,25,11};
        System.out.println(secLargest(array));
    }
    public static int secLargest(int[] array){
        int largest=array[0];
        int secondLargest=array[1];
        for (int i=2;i<array.length;i++){
            if (array[i]>largest){
                secondLargest=largest;
                largest=array[i];
            } else if (array[i]<largest && array[i]>secondLargest) {
                secondLargest=array[i];
            }
        }
        return secondLargest;
    }
}

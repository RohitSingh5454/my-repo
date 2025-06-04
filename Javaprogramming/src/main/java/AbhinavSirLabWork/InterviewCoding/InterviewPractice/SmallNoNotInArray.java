package AbhinavSirLabWork.InterviewCoding.InterviewPractice;
import java.util.Arrays;

public class SmallNoNotInArray {
    public static void main(String[] args) {
      int[] array={4,2,1,9,11,8};
      int smallNo=smallNoNotInArray(array);
        System.out.println(smallNo);
    }
    public static int smallNoNotInArray(int[] array){
        Arrays.sort(array);
        int smallNoNotInArray=array[0];
        for (int i=0;i<array.length;i++){
            if (array[i]==smallNoNotInArray){
                smallNoNotInArray++;
            } else if (array[i]>smallNoNotInArray) {
                break;
            }
        }
        return  smallNoNotInArray;
    }

}

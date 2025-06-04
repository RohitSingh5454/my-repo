package AbhinavSirLabWork.InterviewCoding.capgemini;
import java.util.Arrays;

public class smallestNumber {
    public static void main(String[] args) {
        int no=smallNo(new int[]{0,3,4,1,21});
        System.out.println("Smallest number "+no);
    }

    public static int smallNo(int[] array1) {
        int smallNo = 1;
        Arrays.sort(array1);
        for (int i=0;i<array1.length;i++){
            if (array1[i]>smallNo){
                break;
            }
            smallNo=smallNo+array1[i];
    }
        return smallNo;
}
}

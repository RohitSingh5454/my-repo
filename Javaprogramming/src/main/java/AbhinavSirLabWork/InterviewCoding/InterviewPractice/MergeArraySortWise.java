package AbhinavSirLabWork.InterviewCoding.InterviewPractice;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeArraySortWise {
    public static void main(String[] args) {
     int[] array1={1,2,3,0,0,0};
     int[] array2={2,5,6};
     sortarray1(array1,3,array2,3);
    }
    public static void sortarray1(int[] array1,int m,int[] array2,int n) {
        int p1 = m + n - 1;
        int p2 = m - 1;
        int p3 = n - 1;
        List<Integer> list=new ArrayList<>();
        while (p2 >= 0 && p3 >= 0) {
            if (array2[p3] > array1[p2]) {
                array1[p1] = array2[p3];
                p1--;
                p3--;
            } else {
                array1[p1]=array1[p2];
                p1--;
                p2--;
            }
        }
//        while (p3>=0){
//            array1[p1]=array2[p3];
//            p3--;
//            p1--;
//        }
        System.out.println(Arrays.toString(array1));
    }
}

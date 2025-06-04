package AbhinavSirLabWork.InterviewCoding.InterviewPractice;

import java.util.HashMap;
import java.util.HashSet;

public class ThreeSum {
    public static void main(String[] args) {
        int[] arr2 = {4, 5, 6, 7, 8, 2};
        int target = 12;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < arr2.length-2; i++) {
            HashSet<Integer> hs=new HashSet<>();
            int num = target - arr2[i];
            for (int j = i+1; j < arr2.length; j++) {
                int num1=num-arr2[j];
                if (hs.contains(num1)) {
                    System.out.println(arr2[i] + " " + arr2[j]+" "+num1);
                } else {
                    hs.add(arr2[j]);
                }
            }
        }
    }
}

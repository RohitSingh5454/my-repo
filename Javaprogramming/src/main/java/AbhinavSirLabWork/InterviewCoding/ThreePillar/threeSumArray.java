package AbhinavSirLabWork.InterviewCoding.ThreePillar;

import java.util.HashSet;

public class threeSumArray {
    public static void main(String[] args) {
        int[] arr2={4,5,6,7,8,2};
        int target=12;
        for (int i=0;i<arr2.length-2;i++){
            HashSet<Integer> hs=new HashSet<>();
           int sum=target-arr2[i];
            for (int j=i+1;j<arr2.length;j++){
                int req_Sum=sum-arr2[j];
                if (hs.contains(req_Sum)){
                    System.out.println("The elements are "+arr2[i]+" "+req_Sum+" "+arr2[j]);
                }
                hs.add(arr2[j]);
            }
        }
    }
}

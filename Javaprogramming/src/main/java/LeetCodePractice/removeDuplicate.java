package LeetCodePractice;

import java.util.Arrays;

public class removeDuplicate {
    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{7,4,2,3,4,3,5,6,2}));
    }
    public static int removeDuplicates(int[] nums){
        int i=0;
        Arrays.sort(nums);
        for (int j=1;j<nums.length;j++){
            if (nums[i]<nums[j]){ // 1<1 x  1<2 true
                int temp=nums[i+1]; // temp=1
                nums[i+1]=nums[j]; //nums[1]=2
                nums[j]=temp;  //nums[2]=1
                i++;
            }
        }
        return i+1;
    }
}

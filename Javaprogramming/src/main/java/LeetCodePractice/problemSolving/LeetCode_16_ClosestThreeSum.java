package LeetCodePractice.problemSolving;

import java.util.Arrays;

public class LeetCode_16_ClosestThreeSum {
    public static void main(String[] args) {
     int resSum=threeSumClosest(new int[]{0,1,2},3);
        System.out.println(resSum);
    }
    public static int threeSumClosest(int[] nums,int target){
        Arrays.sort(nums);
        int resultSum=nums[0]+nums[1]+nums[2];
        int minDiff=Integer.MAX_VALUE;
        int sum=0;
        for (int i=0;i<nums.length;i++){
            int left=i+1;
            int right=nums.length-1;
            while (left<right){
                sum=nums[left]+nums[right]+nums[i];
                if (sum==target) {
                    return sum;
                } else if (sum<target) {
                    left++;
                }else {
                    right--;
                }
                int absDiff=Math.abs(sum-target);
                if (absDiff<minDiff){
                    resultSum=sum;
                    minDiff=absDiff;
                }
            }
        }
        return resultSum;
    }
}

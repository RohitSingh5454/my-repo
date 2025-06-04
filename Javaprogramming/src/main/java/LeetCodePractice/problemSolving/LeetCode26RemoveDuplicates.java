package LeetCodePractice.problemSolving;

public class LeetCode26RemoveDuplicates {
    public static void main(String[] args) {
        System.out.println(RemoveDuplicate(new int[]{1,1,2}));
    }
    public static int RemoveDuplicate(int[] nums){
        int i=0;
        for (int j=1;j<nums.length;j++){
            if (nums[i]<nums[j]){
                int temp=nums[i+1];
                nums[i+1]=nums[j];
                nums[j]=temp;
                i++;
            }
        }
        return i+1;
    }
}

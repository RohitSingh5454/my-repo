package LeetCodePractice;

import java.util.Arrays;

public class ArrayProgram {

    public int[] twoSum(int[] nums, int target) {
        int a[] =new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    a[0]=i;
                    a[1]=j;
                    break;
                }
            }
        }
        return a;
    }
}
class A{
    public static void main(String[] args) {
       ArrayProgram obj1=new ArrayProgram();
       int[] nums={4,2,4,6};
       int target=6;
       int[] res=obj1.twoSum(nums,target);
        System.out.println("Result is : "+ Arrays.toString(res));
    }
}



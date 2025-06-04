package LeetCodePractice.problemSolving;

import java.util.Arrays;

public class LeetCode88_mergeSortedArray {
    public static void main(String[] args) {
       int[] nums1 = {1,2,3,0,0,0},nums2 = {2,5,6};
        int n = 3;
        int m = 3;
        int[] nums3= {1},  nums4 = {};
        int m1 = 1,n1 = 0;
        int[] nums5 = {0},nums6 = {1};
        int m2 = 0,n2 = 1;
        System.out.println(Arrays.toString(mergeSortedArray(nums1,m,nums2,n)));

        System.out.println(Arrays.toString(mergeSortedArray(nums3,m1,nums4,n1)));
        System.out.println(Arrays.toString(mergeSortedArray(nums5,m2,nums6,n2)));
    }
    public static int[] mergeSortedArray(int[] nums1,int m,int[] nums2,int n){
        int p=m+n-1;
        int p1=m-1;
        int p2=n-1;
        while (p1>=0 && p2>=0){
            if (nums1[p1]>nums2[p2]){
                nums1[p]=nums1[p1];
                p1--;
                p--;
            }
            else {
                nums1[p]=nums2[p2];
                p2--;
                p--;
            }
        }
      while (p2>=0){
          nums1[p]=nums2[p2];
          p--;
          p2--;
      }
        return nums1;
    }
}

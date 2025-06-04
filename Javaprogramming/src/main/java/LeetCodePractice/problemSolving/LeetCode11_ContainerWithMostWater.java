package LeetCodePractice.problemSolving;

import java.util.Scanner;
//1,8,6,2,5,4,8,3,7

public class LeetCode11_ContainerWithMostWater {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        for (int i=0;i<test;i++){
            int n=sc.nextInt();
            int[] array=new int[n];
            for (int j=0;j<n;j++){
                array[j]=sc.nextInt();
            }
           int maxAreas= maxArea2(array);
            System.out.println("Maximum area is "+maxAreas);
        }
    }
    public static int maxArea1(int[] height){
        int currArea=0;
        int maximumArea=0;
        int left=0;
        int right=height.length-1;
        while (left<=right){
            currArea=Math.min(height[left],height[right])*(right-left);
            maximumArea=Math.max(currArea,maximumArea);
            if (height[left]>height[right]){
                right--;
            }else {
                left++;
            }
        }
        return maximumArea;
    }
    public static int maxArea2(int[] height){
        int maximumArea2=0;
        int left=0;
        int right=height.length-1;
        while (left<=right){
            int leftH=height[left],rightH=height[right];
            int minH=(leftH<rightH)?leftH:rightH;
            int area=minH*(right-left);
            if (maximumArea2<area){
                maximumArea2=area;
            }
            if (rightH>leftH){
                left++;
            }
            else {
                right--;
            }
        }
        return maximumArea2;
    }
}

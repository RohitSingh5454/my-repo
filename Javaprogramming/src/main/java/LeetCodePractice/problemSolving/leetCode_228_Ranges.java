package LeetCodePractice.problemSolving;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class leetCode_228_Ranges {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        String[] parts = input.split("[,\\s]+");
        int[] array=new int[parts.length];
        for (int i=0;i<parts.length;i++){
            array[i]=Integer.parseInt(parts[i].trim());
        }

        System.out.println(rangeSummary(array));
    }
    public static List<String> rangeSummary(int[] nums){
        List<String> list=new ArrayList<>();
        for (int i=0;i< nums.length;i++){
            int start=nums[i];
            while (i+1<nums.length && nums[i+1]-nums[i]==1){
                i++;
            }
            if (start!=nums[i]){
                list.add(""+start+"->"+nums[i]);
            }
            else {
                list.add(""+start);
            }
        }
        return list;
    }
}

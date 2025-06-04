package LeetCodePractice;

public class searchInsertPosition {
    public int searchElement(int nums[],int target){
        int low=0;
        int high=nums.length-1;
        int mid;
        while (low<=high){
            mid=low+(high-low)/2;
            if (nums[mid]==target){
                return mid;
            }
            else if (nums[mid]<target){
                low=mid+1;
            }else {
                high=mid-1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        searchInsertPosition ob1=new searchInsertPosition();
        int index1=ob1.searchElement(new int[]{1,3,5,6},5);
        int index2=ob1.searchElement(new int[]{1,3,5,6},2);
        int index3=ob1.searchElement(new int[]{1,3,5,6},7);
        System.out.println(index1);
        System.out.println(index2);
        System.out.println(index3);
    }
}

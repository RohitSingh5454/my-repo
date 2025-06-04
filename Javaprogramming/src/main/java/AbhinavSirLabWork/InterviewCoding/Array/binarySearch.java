package AbhinavSirLabWork.InterviewCoding.Array;

public class binarySearch {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 10, 40 };
        int n = arr.length;
        int x = 3;
        int result = binarySearch(arr, 0, n - 1, x);
        System.out.println(result);
    }
    public static int binarySearch(int[] array1,int l,int r,int x) {
       while (l<=r){
        int mid=(l+r)/2;
        if (array1[mid]==x){
            return mid;
        }else if (array1[mid]>x){
            r=mid-1;
        }else {
            l=mid+1;
        }
       }
       return -1;
    }
}

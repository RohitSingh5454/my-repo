package AbhinavSirLabWork.dynpro;

public class missingNumber {
    public static void main(String[] args) {
        System.out.println(missingNum(new int[]{1,3,4,5,6,7}));
    }
    public static int missingNum(int[] arr1){
        int n=arr1.length+1;
        int sum=n*(n+1)/2;
        int actualSum=0;
        for (int i=0;i<arr1.length;i++){
            actualSum=actualSum+arr1[i];
        }
        return sum-actualSum;
    }
}

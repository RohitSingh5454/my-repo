package AbhinavSirLabWork;

public class secondHighest {
    public static void main(String[] args) {
        System.out.println( secondLargest(new int[]{1,4,23,43,12,56,78,78}));
    }
    public static int secondLargest(int[] arr1) {
        int secondLargest=arr1[0];
        int largest=arr1[1];
        for (int i=2;i<arr1.length;i++){
            if (arr1[i]>largest){
                secondLargest=largest;
                largest=arr1[i];
            }
            else if(arr1[i]<largest && arr1[i]>secondLargest){
                secondLargest=arr1[i];
            }
        }
        return secondLargest;

    }
}

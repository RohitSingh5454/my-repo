package InterviewPreparation;

public class ArrayLargest {
    public static void main(String[] args) {
        int arr[]={10,4,1,3,2};
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            }
            for (int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
           }
        System.out.println();
            if (arr[1]+arr[2]+arr[3]+arr[4]==arr[0]){
                System.out.println("true");
            }
            else {
                System.out.println("false");
            }

    }
}

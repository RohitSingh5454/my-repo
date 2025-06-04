package InterviewPreparation;

public class SecondLargestElemArray {
    public static void main(String[] args) {
        int arr[]={10,20,12,11,25,87,87};
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("second largest array is "+arr[arr.length-2]);
    }
}
